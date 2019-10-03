int sizeX;
int dx, dy;
void setup()
{
  frameRate(1000);
  size(1000, 800); 
  sizeX = 10;
  dx = 0;
  dy = 0;
} // end (setup)

void draw()
{
  int los = (int)random(1, 101);
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
} // end (draw)
