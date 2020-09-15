fun main() {
    var app=App("click")
    app.getEvent()
    var app1=App("swap")
    app1.getEvent()

}

interface Events {
     fun clicEvent();
    fun swapEvent();

}
interface AppEvent:Events{
    fun getEvent();

}
class App(chossenEvent:String):AppEvent{
    var choice=""
    init {
        choice=chossenEvent
    }
    override fun getEvent() {
        when(choice){
            "click"-> clicEvent()
            "swap"->swapEvent()



        }
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun clicEvent() {
        println("click event") //To change body of created functions use File | Settings | File Templates.
    }

    override fun swapEvent() {
        println("swap event") //To change body of created functions use File | Settings | File Templates.
    }
}