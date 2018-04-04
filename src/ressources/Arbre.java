package ressources;

import plateforme.Case;
import plateforme.Grille;
import traitement.FieldOfView;

public class Arbre extends Obstacle implements Visitor{
    private boolean passe;
    private boolean voir;
    private int ordonne;
    private int abscisse ;
    private Case[][] fieldOfView;

    public Arbre(int abscisse,int ordonne){
       this.abscisse=abscisse;
       this.ordonne=ordonne;
       setVoir();
        setPasse();
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
    public void setVoir() {
        this.voir=false;
    }
    @Override
    public void setPasse() {
        this.passe=true;
    }
    @Override
    public boolean getPasse(){
        return this.passe;
    }
    @Override
    public boolean getVoir(){
        return this.voir;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public void setFieldOfView(Case[][] g){
        fieldOfView = FieldOfView.getFieldOfView(this.abscisse,this.ordonne,g);
    }
    public Case[][] getFieldOfView(){
        return fieldOfView;
    }
    @Override
    public void visit(Grille grille) {
        setFieldOfView(grille.getGrille());
    }
}
