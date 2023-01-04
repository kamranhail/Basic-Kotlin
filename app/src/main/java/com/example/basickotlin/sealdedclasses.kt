package com.example.basickotlin

fun main ()
{
    val success = Result. Success ("SUCCESS!")
    val progress = Result. Progress ("PROGRESS")
    getData(progress)
//////////////////////////////////////////////
    val result :CheckStatus =CheckStatus.Fail()

   when(result) {
       is CheckStatus.Suc -> println("kamran")
       is CheckStatus.Fail -> println("fali")
   }

////////////////////////////////////
    val resultt = process()
    val text: String = when(resultt) {
        is Results.Success -> resultt.value
        is  Results.Failure -> resultt.errorMessage
        is  Results.Pending -> "no attributes are available"
    }
    println(text)


}

fun getData(result: Result) {
    when (result) {
        is Result. Progress->result.showMessage()
        is Result. Success->result.showMessage()
        is Result.Error. NonRecoverableError->result.showMessage()
        is Result.Error. RecoverableError->result.showMessage()
    }
}
sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }
    class Success (message: String): Result (message)
    sealed class Error (message: String ):Result (message){
    class RecoverableError( exception: Exception, message: String): Error (message)
    class NonRecoverableError (exception: Exception, message: String): Error (message)
}
class Progress (message: String): Result (message)

}

sealed class CheckStatus()
{
    class Suc(): CheckStatus()

    class Fail(): CheckStatus()

}




sealed class Results{
data class Success(val value: String) : Results()
data class Failure(val errorMessage: String) : Results()
object Pending : Results()
}
private fun process(): Results {

    val ss:Results=Results.Failure("dsf")

    return ss
}

