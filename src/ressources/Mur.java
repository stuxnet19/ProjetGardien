package ressources;

import plateforme.Case;
import plateforme.Grille;
import traitement.FieldOfView;

import java.util.Random;

public class Mur extends Obstacle implements Visitor {
    private int ordonne;
    private int abscisse ;
    private boolean passe;
    private boolean voir;
    private Case[][] fieldOfView;

    public Mur(int abscisse,int ordonne){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonne() {
        return ordonne;
    }

    @Override
    public void setPasse() {
        this.passe=false;
    }
    @Override
    public void setVoir() {
        this.voir=false;
    }

    @Override
    public boolean getPasse() {
        return false;
    }

    @Override
    public boolean getVoir() {
        return false;
    }

    public void setFieldOfView(Case[][] g){
        fieldOfView = FieldOfView.getFieldOfView(this.abscisse,this.ordonne,g);
    }
    public Case[][] getFieldOfView(){
        return fieldOfView;
    }
    public void visit(Grille grille) {
        setFieldOfView(grille.getGrille());
    }
}
