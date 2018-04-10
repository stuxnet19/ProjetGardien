package IHM;

import plateforme.Grille;
import traitement.DrawComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.concurrent.TimeUnit ;
import javax.swing.*;

public class Game extends JPanel implements Runnable,KeyListener{
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
    public int direction=2;
    private int gameMode;
    //Constructeur
    public Game(int width,int height,String title,int nbrGardien,int nbrIntru,int nbrArbre,int gameMode){
        this.width=width;
        this.height = height;
        this.title = title;
        setGameMode(gameMode);
        grille=new Grille(height/31,width/31,gameMode,nbrGardien,nbrIntru,nbrArbre);
        //esseyer de la mttre dans la méthode updateData si ya un probléme
    }
    public void setGameMode(int gameMode){
        this.gameMode=gameMode;
    }
    public void initialisation(){
        init = new InitGameScrean(width,height,title);
        init.gameMap.addKeyListener(this);
        init.gameMap.setFocusable(true);
        init.gameMap.setFocusTraversalKeysEnabled(false);
    }
    public void updateData(int direction){
        grille = grille.getUpdatedInstance(direction);
        grille.changePhase();
    }
    public void paintComponent(Graphics g,int countGardien,int countIntru,int shift){
        //-------------------------------------------------------
        buffer = init.gameMap.getBufferStrategy();
        if (buffer==null){
            init.gameMap.createBufferStrategy(3);
            return;
        }
        g = buffer.getDrawGraphics();
        DrawComponent.drawMap(g,grille,countGardien,countIntru,shift);
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
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'z':{
                direction=1;
                System.out.println("haut");
            }
                break;
            case 'q':{
                direction=3;
                System.out.println("gauche");
            }
                break;
            case 's':{
                direction=2;
                System.out.println("bas");
            }
                break;
            case 'd':{
                direction=4;
                System.out.println("droit");
            }
                break;
        }
    }
    // ------------------------------boucle initiale-------------------------------
    public void run(){
        initialisation();
        int countGardien = 0;
        int countIntru = 0;
        int shift;
        while (runing){
            if (grille.gardienBlocked==true)shift=31-countGardien;
            else shift=0;
            paintComponent(graphics,countGardien,countIntru,shift);
            try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            if ((countGardien==31)&(countIntru==31)){
                countGardien=0;
                countIntru=0;
                updateData(direction);
            }
            countGardien++;
            countIntru++;
        }
        stop();
    }
    //-------------------------------------------------------------------------------

    public InitGameScrean getGameScrean() {
        return init;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
