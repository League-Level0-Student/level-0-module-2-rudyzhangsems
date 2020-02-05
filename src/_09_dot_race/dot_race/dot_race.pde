//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.
int xcoor= 50;
void setup() {
    size(1600, 800);
}

void draw() {
    //3. make the ellipse a nice color
    color(#0C25F2);
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
         if(mousePressed){
           xcoor++;
         }
    //5. Make your dot move faster
    //  (you have to figure out what part of your code to change)

    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
    background(#B3B4B7);
    fill(#000000);
    rect(1575, 0, 10, 800);
    fill(#0C25F2);
     ellipse(xcoor, 400, 10, 10);
    //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
