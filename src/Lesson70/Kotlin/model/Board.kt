package Lesson70.Kotlin.model

class Board {
    private val content = Array(MAX_ROW) { arrayOfNulls<Symbol>(MAX_COLUMN) }

    fun setCell(row: Int, col: Int, symbol: Symbol) {
        require(row in 0 until MAX_ROW && col in 0 until MAX_COLUMN) {
            "Некорректные координаты: row=$row, col=$col"
        }
        require(content[row][col] == null) {
            "Клетка уже занята"
        }

        content[row][col] = symbol
    }

    fun showCurrentState() {
        println("-------------")
        for (i in 0 until MAX_ROW) {
            for (j in 0 until MAX_COLUMN) {
                print(content[i][j] ?: " ")
                if (j < MAX_COLUMN - 1) print(" | ")
            }
            println()
            if (i < MAX_ROW - 1) println("-------------")
        }
        println("-------------")
    }

    fun isCellEmpty(row: Int, col: Int): Boolean {
        require(row in 0 until MAX_ROW && col in 0 until MAX_COLUMN) {
            "Некорректные координаты: row=$row, col=$col"
        }
        return content[row][col] == null
    }

    fun isWinner(symbol: Symbol): Boolean {
        for (i in 0 until MAX_ROW) {
            if (content[i][0] == symbol && content[i][1] == symbol && content[i][2] == symbol) return true
        }

        for (i in 0 until MAX_COLUMN) {
            if (content[0][i] == symbol && content[1][i] == symbol && content[2][i] == symbol) return true
        }

        if (content[0][0] == symbol && content[1][1] == symbol && content[2][2] == symbol) return true
        if (content[0][2] == symbol && content[1][1] == symbol && content[2][0] == symbol) return true

        return false
    }

    fun isFull(): Boolean {
        for (i in 0 until MAX_ROW) {
            for (j in 0 until MAX_COLUMN) {
                if (content[i][j] == null) return false
            }
        }
        return true
    }

    companion object {
        const val MAX_ROW = 3
        const val MAX_COLUMN = 3
    }
}