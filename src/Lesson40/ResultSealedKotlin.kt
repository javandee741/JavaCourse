package Lesson40

sealed class ResultSealedKotlin {
    data class Success(val info: String): ResultSealedKotlin()
    object Loading: ResultSealedKotlin()
    data class Error(val msg: String): ResultSealedKotlin()
}