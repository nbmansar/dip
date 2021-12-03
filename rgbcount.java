import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class rgbcount
{
  public static void main(String args[])throws IOException
{
    BufferedImage img = null;
    File f = null;
    f = new File("pw1.jpg");
    img = ImageIO.read(f);
    

    //get image width and height
    int width = img.getWidth();
    int height = img.getHeight();

     int rc=0,gc=0,bc=0;

    //convert to grayscale
    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        int p = img.getRGB(x,y);

        int a = (p>>24)&0xff;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;

        
	rc=rc+r;
	gc=gc+g;
	bc=bc+b;

      }
    }

    System.out.println("\n *********RGB COUNT***********\n");

    System.out.println("\nIMAGE RED Count:"+rc);


    System.out.println("\n GREEN COUNT:"+gc);


    System.out.println("\n BLUE COUNT:"+bc);
	int tot=rc+gc+bc;


    System.out.println("\n TOTAL RGB COUNT IN IMAGE IS: "+tot);

  }
}