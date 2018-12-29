 import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true; 
boolean playSound1 = false; 
//at the top of your sketch
  //1. Start a new sketch.

//2. Find a picture of a donkey and a separate picture of a tail (tail needs a transparent background). 
//     i) Save the images to your Desktop.
//     ii) Drag and drop each file onto your sketch.
//3. Load the pictures into variables as follows.

//i) First create (declare) variables to hold the images at the top of the sketch.

PImage donkey;
PImage tail;

//ii) Now add a setup() method. This is where we put the code that will run ONCE at the start of the program. In this method, set the variables to hold the images.
void setup(){
  donkey = loadImage("eeyore.jpg");      //change the file name if you need to
  tail = loadImage("Tail.jpg");      //change the file name if you need to

//4. In the setup() method, set your canvas size to EXACTLY match the size of the donkey image. You can get the size of the image from the file information on the Desktop.
  tail.resize(50, 140);
  size(247, 204); 
Minim minim = new Minim(this);     

  woohooSound = minim.loadSample("wohoo.wav"); 

  
     //replace width, height with your picture's dimensions
}


//5. Add a draw() method to your sketch. This is where we put the code that will repeat while your program is running. 
//     Draw the donkey and tail in this method. The tail should move around with the mouse. Try it!                                                                   
void draw(){
  
  background(donkey);


//6. If you need to, resize the tail to fit onto the donkey. Since this is done ONCE, put this code into the setup() method.
//     Note: if you leave height or width as zero, the image will scale proportionally.

     //replace width, height with your tail's dimensions

//7. If the top of the tail is not in the top left corner of your image, you will have to adjust the x and y values so that the top of the tail is drawn where you click the mouse. To do this, you would need to adjust the x and y values to make your image work as shown below. 
image(tail, mouseX-10, mouseY-20);

//8. Now we are going to start adding bounding boxes! These should go in the draw() method, AFTER the background is drawn!

//     i. First draw a bounding box (rectangle) in the top left corner of the sketch.
fill(#060606);
rect(200, 50, 30, 30);


//     ii. Now we need to draw another bounding box where the tail should go. You can use mousePressed to help you figure out the x and y coordinates of the corner of this rectangle (see the picture at the top of this page for an idea of what this will look like). Example:

rect(0, 0, 40, 40);

//9. Now, change your code so the donkey is only shown when the mouse is inside the corner bounding box. Hint: use the dist() command:
if(dist(0, 0, mouseX, mouseY) < 30){
  background(#040200);
playSound=true;
}



if (playSound) {
    woohooSound.trigger();
     playSound = false;

}
if (playSound1) {
    woohooSound.trigger();
     playSound1 = false;

}
   

//When the mouse is outside the corner box, you should show a solid color background.

//10. Now, adjust your code so the tail sticks when you click the mouse (this means it will no longer move when the mouse moves). Hint: you will need to save the x and y values in variables at the top of your sketch.

//11. When the tail has been pinned, write code to check if the tail was pinned inside the target bounding box. You can use dist() like you did earlier, or you can write your own code to check it another way. Show the donkey so the user knows where they pinned the tail.
if(dist(200, 50, mouseX, mouseY) < 30){
  background(#040200);
playSound1 = false;  
}
//12. If the tail is in the right place, the player wins and you play a sound. To play a sound, drag and drop the .wav file onto your sketch, and add the following code to your program.

//NOTE: You may need to add the minim library to your sketch. Ask your teacher if you do not know how to do this.

//In the setup method

  //In setup. Change the file name if you need to

// put these lines where you want the sound to play

}
//13. When you have tested that your program works, remove the line of code that draws the tail target bounding box and see if you can pin the tail on the donkey.

//14. OPTION: Add some text to give the user instructions on how to play the game.