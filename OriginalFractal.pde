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
     rect(x, y, wid*1.3, wid*1.3);
   }
 }