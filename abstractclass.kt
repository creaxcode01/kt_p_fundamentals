// abstract classes n'ont pas de body

//               ne peuvent pas être instanciées mais seulement hérités

// les classes abstraites ne peuvent pas être héritées








abstract class ShapeDrawer {      // comme une ébauche (esquisse), les méthodes ne sont pas écrites
    fun drawSquare() { 
        drawLine() 
    } 

    fun drawRectangle() { 
        drawLine() 
    }
     


    internal abstract fun drawLine()  // abstract fonction = non défini =  pas de { body } 
} 




class AndroidShapeDrawer():ShapeDrawer(){     // une classe qui hérite d'une autre classe,  la classe AndroidShapeDrawer hérite de l'abstract classe Shape Drawer

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