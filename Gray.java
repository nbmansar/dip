import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Gray {

   BufferedImage  image;
   int width;
   int height;
   
   public Gray() {
   
      try {
         File input = new File("E:\\Ansar\\rose.jpg");
         image = ImageIO.read(input);
         width = image.getWidth();
         height = image.getHeight();
         
         for(int i=0; i<height; i++){
         
            for(int j=0; j<width; j++){
            
               Color c = new Color(image.getRGB(j, i));
               int red = (int)(c.getRed() * 0.299);
               int green = (int)(c.getGreen() * 0.587);
               int blue = (int)(c.getBlue() *0.114);
               Color newColor = new Color(red+green+blue,
               
               red+green+blue,red+green+blue);
               
               image.setRGB(j,i,newColor.getRGB());
            }
         }
         
         File ouptut = new File("E:\\Ansar\\Grr.jpg");
         ImageIO.write(image, "jpg", ouptut);
         
      } catch (Exception e) {}
   }
   
   public static void main(String args[]) throws Exception 
   {
      Gray obj = new Gray();
   }
}