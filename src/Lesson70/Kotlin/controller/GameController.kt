package Lesson70.Kotlin.controller

import Lesson70.Kotlin.model.Board
import Lesson70.Kotlin.model.Player
import Lesson70.Kotlin.model.Symbol

class GameController {
    private lateinit var player1: Player
    private lateinit var player2: Player

    private val board = Board()

    init {
        initPlayer()
    }

    fun playGame() {
        var currentPlayer = player1

        while (true) {
            board.showCurrentState()
            println("Ход игрока ${currentPlayer.name} (${currentPlayer.symbol})")
            println("Введите строку и столбец от 1 до 3 через пробел:")

            var row: Int
            var column: Int

            while (true) {
                val input = readln().trim().split(" ")

                if (input.size != 2) {
                    println("Нужно ввести 2 числа, например: 2 3")
                    continue
                }

                row = input[0].toIntOrNull()?.minus(1) ?: -1
                column = input[1].toIntOrNull()?.minus(1) ?: -1

                if (row !in 0..2 || column !in 0..2) {
                    println("Координаты должны быть от 1 до 3. Попробуй снова.")
                    continue
                }

                if (!board.isCellEmpty(row, column)) {
                    println("Клетка уже занята. Выбери другую.")
                    continue
                }

                break
            }

            board.setCell(row, column, currentPlayer.symbol)

            if (board.isWinner(currentPlayer.symbol)) {
                board.showCurrentState()
                println("Игрок ${currentPlayer.name} победил! GAME OVER!")
                break
            }

            if (board.isFull()) {
                board.showCurrentState()
                println("Ничья! GAME OVER!")
                break
            }

            currentPlayer = if (currentPlayer == player1) player2 else player1
        }
    }

    private fun initPlayer() {
        println("Введите имя игрока 1:")
        val namePlayer1 = readln()

        println("Выберите символ для игрока 1 (X или O):")
        val symbolFromConsole = readln().trim().uppercase()

        val symbol = when (symbolFromConsole) {
            "X", "Х" -> Symbol.X
            "O", "О" -> Symbol.O
            else -> {
                println("Некорректный ввод. По умолчанию выбран X.")
                Symbol.X
            }
        }

        player1 = Player(namePlayer1, symbol)

        println("Введите имя игрока 2:")
        val namePlayer2 = readln()

        player2 = Player(
            namePlayer2,
            if (player1.symbol == Symbol.X) Symbol.O else Symbol.X
        )
    }
}