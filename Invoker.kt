class Invoker{
    fun <T:Any> data(){
        null?: return}
}

fun main(){
    val data: ()->Unit = { Invoker().data() }
    return data.invoke()
    println(data)
}