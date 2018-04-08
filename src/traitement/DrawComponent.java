package traitement;

import IHM.Constantes;
import plateforme.Case;
import plateforme.Grille;
import java.util.Random;
import java.awt.*;
import ressources.*;
public class DrawComponent{

    public static Graphics graphics ;
    public static Grille grille ;
    
    public static void drawArbre(int ordonne,int abscisse){
        graphics.drawImage(Constantes.TREE.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawBorderEauDown(int ordonne,int abscisse){
        graphics.drawImage(Constantes.WATTER_BORDER_DOWN.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawBorderEauLeft(int ordonne,int abscisse){
        graphics.drawImage(Constantes.WATTER_BORDER_LEFT.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawBorderEauRight(int ordonne,int abscisse){
        graphics.drawImage(Constantes.WATTER_BORDER_RIGHT.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawBorderEauUp(int ordonne,int abscisse){
        graphics.drawImage(Constantes.WATTER_BORDER_UP.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawEau(int ordonne,int abscisse){
        graphics.drawImage(Constantes.WATTER.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    //-----------------------------------------------------------------------------
    public static void drawGardienRight1(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT1.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight2(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight3(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT3.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight4(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT4.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight5(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT5.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight6(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT6.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawGardienRight7(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse+(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_RIGHT7.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    //-----------------------------------------------------------------------------
    public static void drawGardienLeft1(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT1.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft2(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft3(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT3.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft4(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT4.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft5(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT5.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft6(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT6.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawGardienLeft7(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-(-31+count)-31*2,ordonne-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_LEFT7.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    //-----------------------------------------------------------------------------
    public static void drawGardienUp1(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP1.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp2(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp3(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP3.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp4(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP4.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp5(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP5.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp6(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP6.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawGardienUp7(int ordonne, int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne-(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_UP7.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    //----------------------------------------------------------------------------
    public static void drawGardienDown1(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN1.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown2(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown3(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN3.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown4(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN4.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown5(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN5.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown6(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN6.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawGardienDown7(int ordonne,int abscisse,int count){
        graphics.setColor(new Color(1.f,1.f,1.f,.3f));
        graphics.fillOval(abscisse-31*2,ordonne+(-31+count)-31*2,31*5,31*5);
        graphics.drawImage(Constantes.GARDIEN_DOWN7.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    //-------------------------------------------------------------------------
    public static void drawHerbe(int ordonne,int abscisse){
        graphics.drawImage(Constantes.GROUND.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawIntruRight(int ordonne,int abscisse,int count){
        graphics.drawImage(Constantes.GHOST_RIGHT.getScaledInstance(17,17,Image.SCALE_SMOOTH),abscisse+(-31+count),ordonne,null);
    }
    public static void drawIntruLeft(int ordonne,int abscisse,int count){
        graphics.drawImage(Constantes.GHOST_LEFT.getScaledInstance(17,17,Image.SCALE_SMOOTH),abscisse-(-31+count),ordonne,null);
    }
    public static void drawIntruUp(int ordonne,int abscisse,int count){
        graphics.drawImage(Constantes.GHOST_UP.getScaledInstance(17,17,Image.SCALE_SMOOTH),abscisse,ordonne-(-31+count),null);
    }
    public static void drawIntruDown(int ordonne,int abscisse,int count){
        graphics.drawImage(Constantes.GHOST_DOWN.getScaledInstance(17,17,Image.SCALE_SMOOTH),abscisse,ordonne+(-31+count),null);
    }
    public static void drawMur(int ordonne,int abscisse){
        graphics.drawImage(Constantes.ROCK.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawMountainBorder1(int ordonne,int abscisse){
        graphics.drawImage(Constantes.MOUNTAIN_ORZ.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawMountainBorder2(int ordonne,int abscisse){
        graphics.drawImage(Constantes.MOUNTAIN_VERT.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawMountainBorder3(int ordonne,int abscisse){
        graphics.drawImage(Constantes.MOUNTAIN_ORZ2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawMountainBorder4(int ordonne,int abscisse){
        graphics.drawImage(Constantes.MOUNTAIN_VERT2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawHous1(int ordonne,int abscisse){
        graphics.drawImage(Constantes.HOUS1.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawHous2(int ordonne,int abscisse){
        graphics.drawImage(Constantes.HOUS2.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawHous3(int ordonne,int abscisse){
        graphics.drawImage(Constantes.HOUS3.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawHous4(int ordonne,int abscisse){
        graphics.drawImage(Constantes.HOUS4.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawHous5(int ordonne,int abscisse){
        graphics.drawImage(Constantes.HOUS5.getScaledInstance(31,31,Image.SCALE_SMOOTH),abscisse,ordonne,null);
    }
    public static void drawBigMap(){
        graphics.drawImage(Constantes.MAP,0,0,null);
    }
    public static boolean gardienIsNier(Case[][] field) {
        boolean contain = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (field!=null){
                    if (field[i][j].getNumberTypeListe().contains(2))contain = true;
                }
            }
        }
        return contain;
    }
    public static void drawMap(Graphics g,Grille gr,int countGardien,int countIntru,int shift){
        graphics=g;
        grille=gr;
        /*
            0 : arbre
            1 : eau
            2 : gardien
            3 : herbe
            4 : intru
            5 : mur
             */
        drawBigMap();
        graphics.setColor(new Color(0.f,0.f,0.f,.5f));
        graphics.fillRect(0,0,31*41,31*21);
        for (int i = 0; i<grille.getNbrLine();i++){
            for (int j=0; j<grille.getNbrCol();j++){
                if( grille.getGrille()[i][j].getNumberTypeListe().contains(0)) {
                    if (grille.getGrille()[i][j].getAbscisse() >= 32) {
                        drawArbre(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31);
                    }
                }
                if( grille.getGrille()[i][j].getNumberTypeListe().contains(2)) {
                    switch (grille.getGrille()[i][j].getType().getGardien().getPosition()) {
                        //haut
                        case 1: {
                            switch (grille.getGrille()[i][j].getType().getGardien().getMouvementPhase()){
                                case 1 : drawGardienUp1(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 2 : drawGardienUp2(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 3 : drawGardienUp3(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 4 :drawGardienUp4(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 5 : drawGardienUp5(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 6 :drawGardienUp6(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 7 :drawGardienUp7(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                            }
                        }
                            break;
                        //bas
                        case 2:{
                            switch (grille.getGrille()[i][j].getType().getGardien().getMouvementPhase()){
                                case 1 :drawGardienDown1(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 2 : drawGardienDown2(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 3 : drawGardienDown3(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 4 : drawGardienDown4(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 5 : drawGardienDown5(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 6 : drawGardienDown6(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 7 :drawGardienDown7(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                            }
                        }
                            break;
                        //droit
                        case 3:{
                            switch (grille.getGrille()[i][j].getType().getGardien().getMouvementPhase()){
                                case 1 :drawGardienRight1(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 2 :drawGardienRight2(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 3 :drawGardienRight3(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 4 :drawGardienRight4(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 5 :drawGardienRight5(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 6 :drawGardienRight6(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 7 :drawGardienRight7(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                            }
                        }
                            break;
                        //gauche
                        case 4:{
                            switch (grille.getGrille()[i][j].getType().getGardien().getMouvementPhase()){
                                case 1 :drawGardienLeft1(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 2 :drawGardienLeft2(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 3 :drawGardienLeft3(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 4 :drawGardienLeft4(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 5 :drawGardienLeft5(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 6 :drawGardienLeft6(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                                case 7 :drawGardienLeft7(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countGardien+shift);
                                    break;
                            }
                        }
                            break;
                    }
                }
                if(grille.getGrille()[i][j].getNumberTypeListe().contains(4)) {
                    if(((grille.getGrille()[i][j].getType().getIntru().getStateOfMind()==2)&(gr.getGameMode()==1))||(gr.getGameMode()==0)){
                        switch (grille.getGrille()[i][j].getType().getIntru().getPosition()){
                            case 1: drawIntruUp(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countIntru);
                                break;
                            case 2: drawIntruDown(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countIntru);
                                break;
                            case 3: drawIntruRight(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countIntru);
                                break;
                            case 4: drawIntruLeft(grille.getGrille()[i][j].getOrdonne() * 31, grille.getGrille()[i][j].getAbscisse() * 31,countIntru);
                                break;
                        }
                    }
                }
            }
        }
        g.setFont(new Font("TimesRoman",Font.BOLD,20));
    g.drawString("nombre d'intrus réstant: "+grille.getNbrIntrus(),20,20);
    }
    public static Graphics getGraphics() {
        return graphics;
    }
}