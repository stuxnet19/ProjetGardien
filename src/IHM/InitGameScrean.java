package IHM;

import javax.swing.*;
import java.awt.*;

public class InitGameScrean extends JFrame{

    public int width ;
    public int height;
    public String title;
    public Canvas gameMap;
    public InitGameScrean(int width,int height,String title){
        this.title=title;
        this.width=width;
        this.height=height;
        this.setTitle(this.title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.width,this.height);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        displayGame();

    }
    public void displayGame(){
        gameMap = new Canvas();
        gameMap.setPreferredSize(new Dimension(width,height));
        gameMap.setMaximumSize(new Dimension(width,height));
        gameMap.setMinimumSize(new Dimension(width,height));
        gameMap.setPreferredSize(new Dimension(width,height));
        this.add(gameMap);
        this.pack();
    }
    public JFrame getFrame(){
        return this ;
    }
    public Canvas getCanvas(){
        return this.gameMap;
    }
}
