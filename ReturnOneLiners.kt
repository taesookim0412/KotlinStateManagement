import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty0

class ReturnOneLiners {
    var ST_VALID = true
    var prop2 = false
    var prop3 = false

    fun getState(
        getter: KProperty0.Getter<Boolean>,
        setter: KMutableProperty0.Setter<Boolean>
    ): Boolean{
        println(getter.name)
        if (!getter.call()) println("Falsey")
        return getter.call().also{setter.call(!it)}
    }
}

fun main(){
    val subject = ReturnOneLiners().let{
        {println(it.getState(it::ST_VALID.getter, it::ST_VALID.setter))}
    }
    subject.invoke()
    subject.invoke()

    val subjectTwoThatsNotSetInStone = ReturnOneLiners().let{
        {println(it.getState(it::prop2.getter, it::prop2.setter))}
    }
    subjectTwoThatsNotSetInStone.invoke()
    subjectTwoThatsNotSetInStone.invoke()
    //subject spotted
    /*var initial = subject.invoke()
    subject.invoke()
    subject.invoke()
    subject.invoke()


    println(({subject}.invoke().invoke().equals(initial)))
    subject.invoke()*/


}