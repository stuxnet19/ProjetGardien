package plateforme;
import factory.*;
import builder.*;
import ressources.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Case {
    private int abscisse;
    private int ordonne;
    private ArrayList<Integer> numberTypeListe = new ArrayList<>();
    private int imageType ;
    private CaseContent type ;
    public Case(){
        abscisse= -1;
        ordonne=-1;
        type=null;
        numberTypeListe=(new ArrayList<Integer>(Arrays.asList(-1)));
        imageType=-1;
    }
    public Case(int ordonne,int abscisse,int numberType){
        this.abscisse=abscisse;
        this.ordonne=ordonne;
        setImageType();
        addType(numberType);
    }
    public void updatePosition(int abscisse,int ordonne){
        setAbscisse(abscisse);
        setOrdonne(ordonne);
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
    public CaseContent getType() {
        return type;
    }
    public void setNumberTypeListe(ArrayList<Integer> list) {
        this.numberTypeListe = list;
    }
    public ArrayList<Integer> getNumberTypeListe(){
        return this.numberTypeListe;
    }
    public void addNumberTypeListElement(int element){
        this.numberTypeListe.add(element);
    }
    public void setImageType() {
        Random random = new Random();
        this.imageType = random.nextInt(4);
    }
    public int getImageType(){
        return this.imageType;
    }
    public void addType(int numberType) {
        addNumberTypeListElement(numberType);
        type = new RessourcesFactory(getNumberTypeListe(),this.ordonne,this.abscisse).getCaseType();
    }
    public void setType(CaseContent type){
        this.type=type;
    }
    public void removeType(int numberType){
        int tmpIndex = 0;
        for (int i=0;i<getNumberTypeListe().size();i++){
            if(getNumberTypeListe().get(i) ==numberType){
                tmpIndex=i;
            }
        }
         this.numberTypeListe.remove(tmpIndex);
        setType(getType().removeElement(numberType));
    }
}