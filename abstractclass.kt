// abstract classes have no body
//               can't be instantiated but can be herited
// abstract can be only herited

abstract class ShapeDrawer { // comme une ébauche(esquisse) les méthodes ne sont pas écrites
    fun drawSquare() { 
drawLine() 
    } 

    fun drawRectangle() { 
        drawLine() 
    } 


    internal abstract fun drawLine()  // abstract fonction = non défini = pas de  { body } 
} 




class AndroidShapeDrawer():ShapeDrawer(){ // hérite de l'abstract class Shape Drawer

    override fun drawLine() {  // réécriture de la fonction
        //code that draw lines for android platform 
        println("Test code -Draw line for  android platform") 
    } 
} 



class DesktopShapeDrawer():ShapeDrawer(){ // hérite de l'abstract class Shape Drawer
    override fun drawLine() {  // réécriture de la fonction
                               //code that draw lines for android platform 
        println("Test code -Draw line for  desktop platform") 
    } 
} 




fun main(){ 
    val androidDrawer :ShapeDrawer = AndroidShapeDrawer() 
    androidDrawer.drawSquare() 
    val desktopDrawer :ShapeDrawer = DesktopShapeDrawer() 
    desktopDrawer.drawSquare() 
} 