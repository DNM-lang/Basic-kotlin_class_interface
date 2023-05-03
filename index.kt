// implementation of polymorphism by use of interface
interface Animal{
    val name:String
    val breed:String
    fun pet()// what we can do with the animals in Animal pet them and see there response.
}
class Cat ( override val name:String, override val breed:String):Animal{
    override fun pet() {
        println("Meow")
    }
}
class Dog ( override val name:String, override val breed:String):Animal{
    override fun pet() {
        println("Woof")
    }
}
fun pet(animal:Animal){
    animal.pet()
}

// introduction to use of abstract class example.

abstract class ShapeDrawer{
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer():ShapeDrawer(){
    override fun drawLine(){
        //code that will draw line for the android platform
        println("Test code -Draw line for android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine(){
        //code that will draw lines for desktop platforms:IOS
        println("Teat code  -Draw line for desktop platform")
    }
}


fun main(){
    pet(Cat("Jessy", "Munchkin",))
    pet(Dog("Bo-sco", "Cancaso"))

    //calling the abstract classes elements. Note that you can not create an object or instance of an abstract class

    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()
    val kotlin = "🙂"
    println(kotlin)

}

/* bellow are the differences between an instance and an abstract
INSTANCE:                                                ABSTRACT:
---------                                                ---------
A. All methods are open                                   A. Methods cn be open or ni=on open
b. Methods and members are abstract by default            b.  methods and members can be abstract or non-abstract
C. A class can implement one or more classes              c. A class can only implement from one class.

 */


