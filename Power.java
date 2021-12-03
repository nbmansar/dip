import java.io.*;
import java.lang.*;
import java.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class Power
{
public static void main(String args[])throws IOException
{
BufferedImage= null;
File f=null;
try
{
f=new File("rose.jpg");
img =ImageIO.read(f);
}
catch(IOException e)
{
System.out.println(e);
}
int width=img.getWidth();
int height= img.getHeight();
for(int y=0;y<height;y++)
{
for(int x=0;x<width;x++)
{
int p=img.getRGB(x,y);
int a=(p>>24)&0xff;
int r=(p>>16)&0xff;
int g=(p>>8)&0xff;
int b=p&0xff;
int s=(int)Math.round(10.0*Math.pow((double)r,2.5));
p=(a<<24) | (s<<16) | (s<<8) | s;
img.setRGB(x,y,p);
}
}
try
{
f=new File("power.jpg");
ImageIO.write(img,"jpg",f);
}
catch(IOException e)
{
System.out.println(e);
}
}
}