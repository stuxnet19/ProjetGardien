package ressources;
import plateforme.Case;
import plateforme.Grille;
import traitement.Deplacement;
import traitement.FieldOfView;

import java.util.HashMap;
import java.util.Random;

public class Intru implements Visitor{
    private int ordonne;
    private int abscisse ;
    private int phase=0;
    private Case[][] fieldOfView ;
    private HashMap<String,Integer> positionList = new HashMap<>();
    private int position;
    private int stateOfMind;
    private HashMap<String,Integer> numberTypeDeplacement = new HashMap<String, Integer>();
    public Intru(int abscisse,int ordonne){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
        position=2;
        initDeplacementType();
        initPositionList();
    }
    public int nbrAleatoire(int valeurMin,int valeurMax) {
        Random rnd=new Random();
        return valeurMin + rnd.nextInt(valeurMax - valeurMin);
    }
    public void updateStateOfMind(int mode){
        stateOfMind=numberTypeDeplacement.get("aleatoir");
        for (int i=0;i<=4;i++){
                for (int j=0;j<=4;j++){
                    // 2 <=> gardien
                    if (fieldOfView[i][j].getNumberTypeListe().contains(2)){
                        stateOfMind=numberTypeDeplacement.get("alerte");
                    }
                }
            }
    }

    public int getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(int stateOfMind) {
        this.stateOfMind = stateOfMind;
    }
    public void initPositionList(){
        positionList.put("haut",1);
        positionList.put("bas",2);
        positionList.put("droite",3);
        positionList.put("gauche",4);
    }
    public void initDeplacementType(){
        numberTypeDeplacement.put("aleatoir",0);
        numberTypeDeplacement.put("guide",1);
        numberTypeDeplacement.put("alerte",2);
    }
    public void updatePosition(){
        switch (stateOfMind){
            case 0 : {
                int[] tmp = (new Deplacement()).deplacerAleatoir(abscisse,ordonne,fieldOfView,position,"intru");
                setAbscisse(tmp[0]);
                setOrdonne(tmp[1]);
                setPosition(tmp[2]);
            }
            break;
            case 1 : //Deplacement.deplacerGuide(abscisse,ordonne);
                break;
            case 2 : {
                int[] tmp = (new Deplacement()).deplacerAleatoir(abscisse,ordonne,fieldOfView,position,"intru");
                setAbscisse(tmp[0]);
                setOrdonne(tmp[1]);
                setPosition(tmp[2]);
                //Deplacement.deplacerAlert(abscisse,ordonne,fieldOfView);
            }
        }
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }
    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }
    public void setFieldOfView(Case[][] grille){
        fieldOfView = FieldOfView.getFieldOfView(this.abscisse,this.ordonne,grille);
    }
    public Case[][] getFieldOfView(){
        return fieldOfView;
    }
    public int getAbscisse() {
        return abscisse;
    }
    public int getOrdonne() {
        return ordonne;
    }
    @Override
    public void visit(Grille grille) {
        setFieldOfView(grille.getGrille());
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }
}
