import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class pix {
   BufferedImage  image;
   int width;
   int height;
   public pix() {
      try {
         File input = new File("E:\\Ansar\\rose.jpg");
         image = ImageIO.read(input);
         width = 10;
         height = 10;
System.out.println("hai");
         int count = 0;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
               count++;
               Color c = new Color(image.getRGB(j, i));

               System.out.println("S.No: " + count + " Red: " + c.getRed()+ " Green: " + c.getGreen());
               }
            }
      } catch (Exception e) {}
   }
   public static void main(String args[]) throws Exception 
   {
      pix obj = new pix();
   }
}