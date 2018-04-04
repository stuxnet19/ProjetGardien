package IHM;

import IHM.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Constantes {
        /*
        public static final String GARDIEN_UP1_PATH="res/textures/gardien_up1.gif";
        public static final String GARDIEN_UP2_PATH="res/textures/gardien_up2.gif";
        public static final String GARDIEN_LEFT1_PATH="res/textures/gardien_left1.gif";
        public static final String GARDIEN_LEFT2_PATH="res/textures/gardien_left2.gif";
        public static final String GARDIEN_RIGHT1_PATH="res/textures/gardien_right1.gif";
        public static final String GARDIEN_RIGHT2_PATH="res/textures/gardien_right2.gif";
        public static final String GARDIEN_DOWN1_PATH="res/textures/gardien_down1.gif";
        public static final String GARDIEN_DOWN2_PATH="res/textures/gardien_down2.gif";
        */
        public static final String MAP_PATH="res/textures/veryBigMap.png";
        public static final String TITLE="Gardien";
        public static final String WATTER_BORDER_DOWN_PATH="res/textures/watter_border_down.png";
        public static final String WATTER_BORDER_LEFT_PATH="res/textures/watter_border_left.png";
        public static final String WATTER_BORDER_RIGHT_PATH="res/textures/watter_border_right.png";
        public static final String WATTER_BORDER_UP_PATH="res/textures/watter_border_up.png";
        public static final String WATTER_PATH="res/textures/watter.png";
        public static final String GHOST_DOWN_PATH = "res/textures/Grue_Down.png";
        public static final String GHOST_LEFT_PATH = "res/textures/Grue_Left.png";
        public static final String GHOST_RIGHT_PATH = "res/textures/Grue_Right.png";
        public static final String GHOST_UP_PATH = "res/textures/Grue_Up.png";
        public static final String PERS_PATH="res/textures/lidiaImage.png";
        public static final String GROUND_PATH="res/textures/ground7.png";
        public static final String TREE_PATH="res/textures/tree7.png";
        public static final String ROCK_PATH="res/textures/rocks_1.png";
        public static final String MOUNTAIN_ORZ_PATH="res/textures/mountain_horz_half.png";
        public static final String MOUNTAIN_PATH="res/textures/mountain_full.png";
        public static final String MOUNTAIN_VERT_PATH="res/textures/mountain_vert_half.png";
        public static final String MOUNTAIN_VERT2_PATH="res/textures/mountain_vert_half2.png";
        public static final String MOUNTAIN_ORZ2_PATH="res/textures/mountain_horz_half2.png";
        public static final String HOUS1_PATH="res/textures/human-city.png";
        public static final String HOUS2_PATH="res/textures/human-city2.png";
        public static final String HOUS3_PATH="res/textures/human-city3.png";
        public static final String HOUS4_PATH="res/textures/human-city4.png";
        public static final String HOUS5_PATH="res/textures/lighthouse.png";
        //-------------------------------------------------------------------------------
        public static final BufferedImage MAP = Assets.getImage(MAP_PATH);
        //-------------------------------------------------------------------------------
        public static final int WINDOW_WIDTH= Assets.getImageWidth(GROUND_PATH)*25 ;
        public static final int WINDOW_HEIGHT=Assets.getImageHeight(GROUND_PATH)*20 ;
        //--------------------------------------------------------------------------------
        public static final BufferedImage WATTER=Assets.getImage(WATTER_PATH);
        public static final BufferedImage WATTER_BORDER_DOWN=Assets.getImage(WATTER_BORDER_DOWN_PATH);
        public static final BufferedImage WATTER_BORDER_LEFT=Assets.getImage(WATTER_BORDER_LEFT_PATH);
        public static final BufferedImage WATTER_BORDER_RIGHT=Assets.getImage(WATTER_BORDER_RIGHT_PATH);
        public static final BufferedImage WATTER_BORDER_UP=Assets.getImage(WATTER_BORDER_UP_PATH);

        //--------------------------------------------------------------------------------
        public static final BufferedImage HOUS1=Assets.getImage(HOUS1_PATH);
        public static final BufferedImage HOUS2=Assets.getImage(HOUS2_PATH);
        public static final BufferedImage HOUS3=Assets.getImage(HOUS3_PATH);
        public static final BufferedImage HOUS4=Assets.getImage(HOUS4_PATH);
        public static final BufferedImage HOUS5=Assets.getImage(HOUS5_PATH);
        public static final BufferedImage ROCK=Assets.getImage(ROCK_PATH);
        public static final BufferedImage MOUNTAIN=Assets.getImage(MOUNTAIN_PATH);
        public static final BufferedImage MOUNTAIN_ORZ=Assets.getImage(MOUNTAIN_ORZ_PATH);
        public static final BufferedImage MOUNTAIN_VERT=Assets.getImage(MOUNTAIN_VERT_PATH);
        public static final BufferedImage MOUNTAIN_ORZ2=Assets.getImage(MOUNTAIN_ORZ2_PATH);
        public static final BufferedImage MOUNTAIN_VERT2=Assets.getImage(MOUNTAIN_VERT2_PATH);
        //---------------------------------------------------------------------------------
        public static final BufferedImage GHOST_DOWN=Assets.getImage(GHOST_DOWN_PATH);
        public static final BufferedImage GHOST_LEFT=Assets.getImage(GHOST_LEFT_PATH);
        public static final BufferedImage GHOST_RIGHT=Assets.getImage(GHOST_RIGHT_PATH);
        public static final BufferedImage GHOST_UP=Assets.getImage(GHOST_UP_PATH);
        //----------------------------------------------------------------------------------------
        public static final BufferedImage GROUND = Assets.getImage(GROUND_PATH);
        //----------------------------------------------------------------------------------------
        public static final BufferedImage TREE = Assets.getImage(TREE_PATH);
        //----------------------------------------------------------------------------------------
        public static final BufferedImage GARDIEN_DOWN1 = Assets.getImage(PERS_PATH).getSubimage(0,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN2 = Assets.getImage(PERS_PATH).getSubimage(64,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN3 = Assets.getImage(PERS_PATH).getSubimage(64*2,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN4 = Assets.getImage(PERS_PATH).getSubimage(64*3,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN5 = Assets.getImage(PERS_PATH).getSubimage(64*4,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN6 = Assets.getImage(PERS_PATH).getSubimage(64*5,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN7 = Assets.getImage(PERS_PATH).getSubimage(64*6,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN8 = Assets.getImage(PERS_PATH).getSubimage(64*7,64*2,64,64);
        public static final BufferedImage GARDIEN_DOWN9 =  Assets.getImage(PERS_PATH).getSubimage(64*8,64*2,64,64);
        public static final BufferedImage GARDIEN_LEFT1 =  Assets.getImage(PERS_PATH).getSubimage(0,64,64,64);
        public static final BufferedImage GARDIEN_LEFT2 = Assets.getImage(PERS_PATH).getSubimage(64,64,64,64);
        public static final BufferedImage GARDIEN_LEFT3 = Assets.getImage(PERS_PATH).getSubimage(64*2,64,64,64);
        public static final BufferedImage GARDIEN_LEFT4 = Assets.getImage(PERS_PATH).getSubimage(64*3,64,64,64);
        public static final BufferedImage GARDIEN_LEFT5 = Assets.getImage(PERS_PATH).getSubimage(64*4,64,64,64);
        public static final BufferedImage GARDIEN_LEFT6 = Assets.getImage(PERS_PATH).getSubimage(64*5,64,64,64);
        public static final BufferedImage GARDIEN_LEFT7 = Assets.getImage(PERS_PATH).getSubimage(64*6,64,64,64);
        public static final BufferedImage GARDIEN_LEFT8 = Assets.getImage(PERS_PATH).getSubimage(64*7,64,64,64);
        public static final BufferedImage GARDIEN_LEFT9 = Assets.getImage(PERS_PATH).getSubimage(64*8,64,64,64);
        public static final BufferedImage GARDIEN_RIGHT1 =Assets.getImage(PERS_PATH).getSubimage(0,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT2 =Assets.getImage(PERS_PATH).getSubimage(64,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT3 =Assets.getImage(PERS_PATH).getSubimage(64*2,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT4 =Assets.getImage(PERS_PATH).getSubimage(64*3,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT5 =Assets.getImage(PERS_PATH).getSubimage(64*4,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT6 =Assets.getImage(PERS_PATH).getSubimage(64*5,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT7 =Assets.getImage(PERS_PATH).getSubimage(64*6,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT8 =Assets.getImage(PERS_PATH).getSubimage(64*7,64*3,64,64);
        public static final BufferedImage GARDIEN_RIGHT9 =Assets.getImage(PERS_PATH).getSubimage(64*8,64*3,64,64);
        public static final BufferedImage GARDIEN_UP1 =Assets.getImage(PERS_PATH).getSubimage(0,0,64,64);
        public static final BufferedImage GARDIEN_UP2 = Assets.getImage(PERS_PATH).getSubimage(64,0,64,64);
        public static final BufferedImage GARDIEN_UP3 = Assets.getImage(PERS_PATH).getSubimage(64*2,0,64,64);
        public static final BufferedImage GARDIEN_UP4 = Assets.getImage(PERS_PATH).getSubimage(64*3,0,64,64);
        public static final BufferedImage GARDIEN_UP5 = Assets.getImage(PERS_PATH).getSubimage(64*4,0,64,64);
        public static final BufferedImage GARDIEN_UP6 = Assets.getImage(PERS_PATH).getSubimage(64*5,0,64,64);
        public static final BufferedImage GARDIEN_UP7 = Assets.getImage(PERS_PATH).getSubimage(64*6,0,64,64);
        public static final BufferedImage GARDIEN_UP8 = Assets.getImage(PERS_PATH).getSubimage(64*7,0,64,64);
        public static final BufferedImage GARDIEN_UP9 = Assets.getImage(PERS_PATH).getSubimage(64*8,0,64,64);

}
