int X =123;
int Y = 123;

PImage Creeper;     

//1. Start a new sketch with draw and setup methods

//2. Set your canvas size
void setup(){
size(500, 334); //in setup method

//3. Download a background image. Something with green where creeper can hide.
     //i) Save the image.
     //ii) Drop the file onto your sketch.
//iii) Load it as the background (it must be same size as your canvas)

PImage grass = loadImage("grass.jpeg");     //in setup method
grass.resize(500, 334);          //in setup method
background(grass);          //in setup method
//4. Load the creeper image into your sketch
    // i) Download this Creeper to your desktop (or choose another)
     //ii) Drop the image onto your sketch
     //iii) Use the code below to draw the image (make sure you put it in the right place)
//at the top of your program
Creeper=loadImage("Creeper.png");  
Creeper.resize(5,5);
    //in setup method
 }   
void draw (){
image(Creeper, X, Y);     //in draw method
//5. Resize the creeper image so that it is small and can hide, right after it’s loaded.  
 //in setup method

//6. Pick a place to hide your creeper. 
   //  i) Use two variables to store the location (x and y) of the creeper, and initialize them (at the top of your sketch).
//ii) Change your code so that the creeper image is drawn at this location.

//7. In the draw method, draw a small red ellipse where the mouse clicks.
if(mousePressed){
fill(#FF0004);
ellipse(mouseX,mouseY,10,10);
}
//8.When mouseX and mouseY are the top left corner, draw a green ellipse instead of a red one.
if(mouseX < 100&& mouseY < 100){
fill(#37FC26);
ellipse(mouseX,mouseY,10,10);
}


//9. If mouseX and mouseY are near the location of your creeper, make the circle green. 
if(isNear(X, mouseX)){
if(isNear(Y, mouseY)){
  fill(#37FC26);
  ellipse(mouseX, mouseY, 10, 10);
}
}
//Note: you will need to check the x and y values separately if you use the code below.



//10. Let the user know that they found the creeper.
if( mouseX==123&&mouseY==123){
  JOptionpane.ShowInputDialog(null, "you found the creeper");
//11. Add lots more creepers… or move the creeper when they find it
}
}


boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}