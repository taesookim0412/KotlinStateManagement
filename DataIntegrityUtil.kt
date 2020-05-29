import kotlin.reflect.KMutableProperty0

class Names{
    companion object{
        val data1 = 0
        val data2 = 1
        val data3 = 2
    }
}

class DataIntegrityUtil {
    var data = arrayOf(true, true, true)

    fun getState0(idx: Int): Boolean{
        if (!data[idx]) return false
        return data[idx].also{data[idx] = !it}
    }
}

fun main(){
    var time = System.currentTimeMillis()
    val util = DataIntegrityUtil()
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    util.getState0(Names.data1)
    println(System.currentTimeMillis() - time)


}

/*class DataIntegrityUtil(){
    var ST_INITIAL = true
    var ST_INITIAL_INTEGRITY = true
    var ST_INITIAL_INTEGRITY_DIALOG = true
    var getters = hashMapOf(this::ST_INITIAL to Pair(this::ST_INITIAL.getter, this::ST_INITIAL.setter),
        this::ST_INITIAL_INTEGRITY to Pair(this::ST_INITIAL_INTEGRITY.getter, this::ST_INITIAL_INTEGRITY.setter),
        this::ST_INITIAL_INTEGRITY_DIALOG to Pair(this::ST_INITIAL_INTEGRITY_DIALOG.getter, this::ST_INITIAL_INTEGRITY_DIALOG.setter))

    fun invokeUtility(
        prop: KMutableProperty0<Boolean>
    ): Boolean {
        val pair = getters.getValue(prop)
        val getter = pair.first
        val setter = pair.second
        if (!getter.call()) return false
        return getter.call().also{setter.call(!it)}
    }
    fun invokeUtility2(
        prop: KMutableProperty0<Boolean>
    ): Boolean {
        val getter = prop.getter
        val setter = prop.setter
        if (!getter.call()) return false
        return getter.call().also{setter.call(!it)}
    }
    fun invokeUtility0(
    ): Boolean {
        if (!ST_INITIAL) return false
        return ST_INITIAL.also{ST_INITIAL = !it}
    }
    fun invokeUtilityn1(
        valu: Boolean,
        prop: KMutableProperty0<Boolean>
    ): Boolean {
        if (!valu) return false
        return valu.also{prop.setter.call(!it)}
    }

    fun initialIntegrity(): Boolean{
        if (!ST_INITIAL_INTEGRITY) return false
        return ST_INITIAL_INTEGRITY.also { ST_INITIAL_INTEGRITY = !it}
    }

    fun dialogIntegrity(): Boolean {
        if (!ST_INITIAL_INTEGRITY_DIALOG) return false
        return ST_INITIAL_INTEGRITY_DIALOG.also { ST_INITIAL_INTEGRITY_DIALOG = !it}
    }

    fun setDialogIntegrity(){
        ST_INITIAL_INTEGRITY_DIALOG = true
    }

    init{
        //x10
        invoke0()



    }

    private fun invoke1() {
        var time = System.currentTimeMillis()
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        invokeUtility(this::ST_INITIAL)
        println("Time elapsed: " + (System.currentTimeMillis() - time))
    }

    private fun invoke2(){
        var time = System.currentTimeMillis()
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        invokeUtility2(this::ST_INITIAL_INTEGRITY)
        println("Time elapsed: " + (System.currentTimeMillis() - time))
    }

    private fun invoke0(){
        var time = System.currentTimeMillis()
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        invokeUtilityn1(ST_INITIAL, this::ST_INITIAL)
        println("Time elapsed: " + (System.currentTimeMillis() - time))
    }

}*/
