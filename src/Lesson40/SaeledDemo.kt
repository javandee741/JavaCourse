package Lesson40

class SaeledDemo {
    fun main(args: Array<String>) {

        val loadingResult:ResultSealedKotlin= ResultSealedKotlin.Loading
        val successResult:ResultSealedKotlin= ResultSealedKotlin.Success("Downloaded 99 percent.")
        val errorResult:ResultSealedKotlin= ResultSealedKotlin.Error("404")
    }

    fun handleResult(result:ResultSealedKotlin){
        when (result) {
            is ResultSealedKotlin.Success -> {TODO()}
            is ResultSealedKotlin.Error -> println("ERROR: " + result.msg)
            ResultSealedKotlin.Loading -> TODO()
        }
    }
}