package ressources;

import plateforme.Case;
import plateforme.Grille;
import traitement.FieldOfView;

public class Herbe implements Visitor{
    private int ordonne;
    private int abscisse ;
    private boolean passe;
    private boolean voir;
    private Case[][] fieldOfView;

    public Herbe(int abscisse,int ordonne){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
       setPasse();
       setVoir();
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
    public void setPasse() {
        this.passe = true;
    }
    public void setVoir() {
        this.voir = true;
    }
    public boolean getPasse(){
        return passe;
    }
    public boolean getVoir(){
        return voir;
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
