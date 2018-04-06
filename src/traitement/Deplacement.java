package traitement;

import plateforme.Case;

import java.util.*;

public class Deplacement{
    private HashMap<String,Integer> objectsType = new HashMap<String, Integer>();
    public HashMap<String,Integer> directions=new HashMap<String, Integer>();
    public int[] newPosition;
    public static int lastPosition ;
    public Deplacement(){
        objectsType.put("arbre",0);
        objectsType.put("eau",1);
        objectsType.put("gardien",2);
        objectsType.put("herbe",3);
        objectsType.put("intru",4);
        objectsType.put("mur",5);
    }
    //fonctione qui returne une valeur aleatoire entre deux nbr donner
    public int nbrAleatoire(int valeurMin,int valeurMax) {
        Random rnd=new Random();
        return valeurMin + rnd.nextInt(valeurMax - valeurMin);
    }
    public int[] deplacerAleatoir(int abscisse, int ordonne, Case[][] fieldOfView, int position,String perssonageName) {
        directions.put("nord", 1);
        directions.put("sud", 1);
        directions.put("east", 1);
        directions.put("west", 1);
        int pourcentage;
        int direction;
        boolean changed = false ;
        int[] tabPosition = new int[4];
        pourcentage = nbrAleatoire(0,100);
        do {
            switch (position){
                case 1 :tabPosition=new int[]{40,10,25,25} ;
                    break ;
                case 2 : tabPosition=new int[]{10,40,25,25};
                    break;
                case 3 : tabPosition=new int[]{25,25,40,10};
                    break;
                case 4 : tabPosition=new int[]{25,25,10,40};
                    break;
            }
            if (pourcentage<=tabPosition[0]) {
                    if ((!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[1][2].getType()==null))){
                        
                        newPosition = deplacerNord(abscisse,ordonne);
                        changed = true;
                    }
                    else {
                        pourcentage = nbrAleatoire(0,100);
                        position = 2 ;
                        directions.put("nord",0);
                    }
                }
                else if (pourcentage<=tabPosition[0]+tabPosition[1]){
                    if ((!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[3][2].getType()==null))) {
                        
                        newPosition = deplacerSud(abscisse,ordonne);
                        changed = true;
                    }
                    else {
                        pourcentage = nbrAleatoire(0,100);
                        position = 1 ;
                        directions.put("sud",0);
                    }
                }
                else if(pourcentage<=tabPosition[0]+tabPosition[1]+tabPosition[2]) {
                    if ((!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[2][3].getType()==null))){
                        
                        newPosition = deplacerEast(abscisse, ordonne);
                        changed=true;
                    }
                    else {
                        pourcentage = nbrAleatoire(0,100);
                        position = 4 ;
                        directions.put("east",0);
                    }
               }
                else if(pourcentage<=tabPosition[0]+tabPosition[1]+tabPosition[2]+tabPosition[3]) {
                    if ((!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[2][1].getType()==null))){
                        
                        newPosition = deplacerWest(abscisse, ordonne);
                        changed=true;
                    }
                    else {
                        pourcentage = nbrAleatoire(0,100);
                        position = 3 ;
                        directions.put("west",0);
                    }
                }
        }while ((changed==false)&(directions.get("nord")+directions.get("sud")+directions.get("east")+directions.get("west")!=0));
        if (changed==true)return newPosition;
        else return new int[]{abscisse,ordonne};
    }
    public static int[] deplacerNord(int abscisse,int ordonne){
        return new int[]{abscisse, ordonne-1,1};
    }
    public static int[] deplacerSud(int abscisse,int ordonne){
        return new int[]{abscisse,ordonne+1,2};
    }
    public static int[] deplacerEast(int abscisse,int ordonne){
        return new int[]{abscisse+1,ordonne,3};
    }
    public static int[] deplacerWest(int abscisse,int ordonne){
        return new int[]{abscisse-1,ordonne,4};
    }
    public int[] deplacerGuide(int abscisse, int ordonne, Case[][] fieldOfView, int direction, String perssonageName){
        switch (direction) {
            case 1: {
                if ((!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get("eau"))) & (!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get(perssonageName))) & (!fieldOfView[1][2].getNumberTypeListe().contains(objectsType.get("mur"))) & (!(fieldOfView[1][2].getType() == null))) {
                    return new int[]{deplacerNord(abscisse, ordonne)[0], deplacerNord(abscisse, ordonne)[1], deplacerNord(abscisse,ordonne)[2]};
                } else return new int[]{abscisse, ordonne, 1};
            }
            case 2 :{
                if ((!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[3][2].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[3][2].getType()==null))){
                    return new int[] {deplacerSud(abscisse,ordonne)[0],deplacerSud(abscisse,ordonne)[1],deplacerSud(abscisse,ordonne)[2]};
                }
                else return new int[]{abscisse,ordonne,2};
            }
            case  3:{
                if((!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[2][1].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[2][1].getType()==null))){
                    return new int[] {deplacerWest(abscisse,ordonne)[0],deplacerWest(abscisse,ordonne)[1],deplacerWest(abscisse,ordonne)[2]};
                }
                else return new int[]{abscisse,ordonne,4};
            }
            case 4 :{
                if((!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get("eau")))&(!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get(perssonageName)))&(!fieldOfView[2][3].getNumberTypeListe().contains(objectsType.get("mur")))&(!(fieldOfView[2][3].getType()==null))){
                    return new int[] {deplacerEast(abscisse,ordonne)[0],deplacerEast(abscisse,ordonne)[1],deplacerEast(abscisse,ordonne)[2]};
                }
                else return new int[]{abscisse,ordonne,3};
            }
        }
        System.out.println("probléme avec le déplacement guide");
        return new int[]{abscisse,ordonne,2};
    }
    public static void deplacerAlert(int abscisse, int ordonne, Case[][] fieldOfView){

    }
}
