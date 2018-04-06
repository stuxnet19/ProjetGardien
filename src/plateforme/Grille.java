package plateforme;
import traitement.UpdateGrille;
import java.util.HashMap;
import java.util.Random;
public class Grille {
    private int nbrLine ;
    private int nbrCol ;
    private int nbrDeGardien;
    private int nbrIntrus;
    private int gameMode ;
    public int curentPhase=0;
    private HashMap<String,Integer> gameModeTypes=new HashMap();
    private Case[][] grille;
    private HashMap<String,Integer> objectsType = new HashMap<String, Integer>();
    public Grille(int nbrLine,int nbrCol,int gameMode){
        if (gameMode==1)setNbrDeGardien(1);
        else setNbrDeGardien(3);
        setGameMode(gameMode);
        setNbrCol(nbrCol);
        setNbrLine(nbrLine);
        grille=new Case[nbrLine][nbrCol];
        initObjectType();
        initGrille();
        initGameModeTypes();
    }
    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }
    public void initGameModeTypes(){
        gameModeTypes.put("ia",1);
        gameModeTypes.put("control",2);
    }
    public void initObjectType(){
        objectsType.put("arbre",0);
        objectsType.put("eau",1);
        objectsType.put("gardien",2);
        objectsType.put("herbe",3);
        objectsType.put("intru",4);
        objectsType.put("mur",5);
    }
    //initalisation de Grille
    public void initGrille(){
        initHerbe();
        initEau();
        initMur();
        initArbre();
        initGardien();
        initIntru();
    }
    public void initHerbe() {
        for (int i = 0; i < nbrLine; i++) {
            for (int j=0; j < nbrCol; j++) {
                grille[i][j] =(new Case(i,j,objectsType.get("herbe")));
            }
        }
    }
    public void initEau(){
        for (int i=5;i<14;i++){
            for (int j=3;j<11;j++) {
                grille[i][j].addType(objectsType.get("eau"));
            }
        }
        grille[4][3].addType(objectsType.get("eau"));
        grille[4][8].addType(objectsType.get("eau"));
        grille[11][3].addType(objectsType.get("eau"));
        grille[11][4].addType(objectsType.get("eau"));
        grille[11][7].addType(objectsType.get("eau"));
        grille[11][8].addType(objectsType.get("eau"));

    }
    public void initMur(){
        for (int i=0;i<getNbrLine();i++){
            for (int j=0;j<getNbrCol();j++){
                if(((i==0)||(i==1))||((j==0)||(j==1))){
                    grille[i][j].addType(objectsType.get("mur"));
                }
                if(((i>=17)&(i<=19)&(j<=32))||((j==32)||(j==31))&(i<=18)){
                    grille[i][j].addType(objectsType.get("mur"));
                }
            }
        }
        //maison
        for (int i=3;i<=7;i++){
            for (int j=20;j<=27;j++){
                grille[i][j].addType(objectsType.get("mur"));
            }
        }
    }
    //mettre le Gadien a la case(1,1) au depart
    public void initGardien() {
        int x,y;
        System.out.println(getNbrDeGardien());
        Random random = new Random();
        for (int i=0;i<getNbrDeGardien();i++){
            x = nbrAleatoire(2,getNbrLine());
            y = nbrAleatoire(2,getNbrCol());
            while((grille[x][y].getNumberTypeListe().contains(objectsType.get("eau")))||(grille[x][y].getNumberTypeListe().contains(objectsType.get("gardien")))||(grille[x][y].getNumberTypeListe().contains(objectsType.get("mur")))){
                x = nbrAleatoire(2,getNbrLine());
                y = nbrAleatoire(2,getNbrCol());
            }
            grille[x][y].addType(objectsType.get("gardien"));

        }
        setNbrDeGardien(2);
    }
    public int nbrAleatoire(int valeurMin,int valeurMax) {
        Random rnd=new Random();
        return valeurMin + rnd.nextInt(valeurMax - valeurMin);
    }
    public void initArbre(){
        int x,y;
        Random random = new Random();
        for (int i=0;i<=5;i++){
            x = nbrAleatoire(0,getNbrLine());
            y = nbrAleatoire(33,getNbrCol());
            if ((!grille[x][y].getNumberTypeListe().contains(objectsType.get("eau")))&(!grille[x][y].getNumberTypeListe().contains(objectsType.get("gardien")))&(!grille[x][y].getNumberTypeListe().contains(objectsType.get("mur")))){
                grille[x][y].addType(objectsType.get("arbre"));
            }
        }
    }
    public void initIntru(){
        int x,y;
        Random random = new Random();
       for (int i=0;i<10;i++){
           x = nbrAleatoire(10,getNbrLine());
           y = nbrAleatoire(20,getNbrCol());
           while((grille[x][y].getNumberTypeListe().contains(objectsType.get("eau")))||(grille[x][y].getNumberTypeListe().contains(objectsType.get("intru")))||(grille[x][y].getNumberTypeListe().contains(objectsType.get("mur")))){
               x = nbrAleatoire(10,getNbrLine());
               y = nbrAleatoire(20,getNbrCol());
           }
           grille[x][y].addType(objectsType.get("intru"));
       }
       setNbrIntrus(5);
    }
    public int getNbrCol() {
        return nbrCol;
    }

    public void setNbrCol(int nbrCol) {
        this.nbrCol = nbrCol;
    }

    public int getNbrLine() {
        return nbrLine;
    }

    public void setNbrLine(int nbrLine) {
        this.nbrLine = nbrLine;
    }

    public int getNbrDeGardien() {
        return nbrDeGardien;
    }
    public Grille getUpdatedInstance(){
        update();
        return this;
    }

    public void setGrille(Case[][] grille) {
        this.grille = grille;
    }
    public void setNbrDeGardien(int nbrDeGardien) {
        this.nbrDeGardien = nbrDeGardien;
    }
    public void setNbrIntrus(int nbrIntrus) {
        this.nbrIntrus = nbrIntrus;
    }
    public int getNbrIntrus() {
        return nbrIntrus;
    }
    public Case[][] getGrille() {
        return grille;
    }
    public int getGameMode(){
        return this.gameMode;
    }
    public void update(){
        setGrille(UpdateGrille.updateCaractersBehaviors(this));
    }
    public void changePhase(){
        if (curentPhase == 0)curentPhase=1;
        else curentPhase = 0 ;
    }
}