import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

 public void setup()
 {
   background(0);
   size(450,450);
 }
 public void draw()
 {
 boop(0,0,300);
 }
 public void mouseDragged()
 {
 }
 public void boop(int x, int y, int wid)
 {
 	
   if(wid>=5)
   {
   	boop(x,y+(wid),wid/3);
   	boop(x,y+(wid/2),wid/3);
     boop(x,y,wid/3);
     boop(x+(wid/2),y,wid/3);
     boop(x+(wid/2),y+wid,wid/3);
     boop(x+wid,y,wid/3);
     boop(x+wid,(y+wid/2),wid/3);
     boop(x+wid,(y+wid),wid/3);
   }
   else 
   {
   	int b =(int)(Math.random()*255);
   	fill(b,b,b);
     rect(x, y, wid*1.3f, wid*1.3f);
   }
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
