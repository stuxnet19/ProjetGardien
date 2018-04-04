package IHM;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Assets {
    public static BufferedImage getImage(String path){
        try {
            return ImageIO.read(new FileInputStream(path));

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static int getImageWidth(String path){
        try {
            BufferedImage image= ImageIO.read(new FileInputStream(path));
            return image.getWidth() ;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static int getImageHeight(String path){
        try {
            BufferedImage image=ImageIO.read(new FileInputStream(path));
            return image.getHeight() ;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
