package IHM;

import plateforme.Grille;
import traitement.DrawComponent;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.concurrent.TimeUnit ;
import javax.swing.*;

public class Game extends JPanel implements Runnable {
    public String title;
    public int width;
    public int height;
    // game state
    public boolean runing = false;
    public Graphics graphics;
    public Thread thread;
    public InitGameScrean init;
    public BufferStrategy buffer;
    public Grille grille;
    private int gameMode;
    //Constructeur
    public Game(int width,int height,String title){
        this.width=width;
        this.height = height;
        this.title = title;
        grille=new Grille(height/31,width/31);
        //esseyer de la mttre dans la méthode updateData si ya un probléme
    }
    public void setGameMode(int gameMode){
        this.gameMode=gameMode;
    }
    public void initialisation(){
        init = new InitGameScrean(width,height,title);
    }
    public void updateData(){
        grille = grille.getUpdatedInstance();
        grille.changePhase();
    }
    public void paintComponent(Graphics g,int count){
        //-------------------------------------------------------
        buffer = init.gameMap.getBufferStrategy();
        if (buffer==null){
            init.gameMap.createBufferStrategy(3);
            return;
        }
        g = buffer.getDrawGraphics();
        DrawComponent.drawMap(g,grille,count);
        buffer.show();
        DrawComponent.getGraphics().dispose();
    //---------------------------------------------------------
    }
    // synchronized ----> pour stpper la methode stop()
    public  void start(){
        if (runing){
            return;// pour sortir de la methode
        }
        runing = true ;
        thread = new Thread(this);
        thread.start();// call run methode
    }
    //synchronized ---> pour stoper la methode start
    public void stop(){
        if (!runing){
            return;// pour sortir de la methode
        }
        runing = false ;
        try {
            thread.join();//terminating the thread with  InterruptedException
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    // ------------------------------boucle initiale-------------------------------
    public void run(){
        initialisation();
        int count = 0;
        while (runing){
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if (count==31){
                updateData();
                count=0;
            }
            paintComponent(graphics,count);
            count++;
        }
        stop();
    }
    //-------------------------------------------------------------------------------
    public InitGameScrean getGameScrean() {
        return init;
    }
}
