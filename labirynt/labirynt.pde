int sizeX;
int dx, dy;
void setup()
{
  background(150);
  frameRate(50);
  size(800, 800); 
  sizeX = 30;
  dx = 0;
  dy = 0;
} // end (setup)

void draw()
{
  int los = (int)random(1, 101);
  stroke(random(256), random(256), random(256));
  strokeWeight(random(1, 10));
  if (los>50) 
  {
    line( 0+dx, 0+dy, sizeX+dx, sizeX+dy);
  } else
  {
    line(sizeX+dx, 0+dy, 0+dx, sizeX+dy);
  }
  dx = dx + sizeX;
  if (dx >= width)
  {
    dx=0;
    dy=dy+sizeX;
  }
  if (dy>=height)
  {
    dx = 0;
    dy = 0;
    background(150);
  }
} // end (draw)
