package builder;
import ressources.*;

public class CaseContent {
    private Arbre arbre ;
    private Eau eau ;
    private Gardien gardien ;
    private Herbe herbe ;
    private Intru intru ;
    private Mur mur ;

    public CaseContent(Arbre arbre, Eau eau, Gardien gardien, Herbe herbe, Intru intru, Mur mur){
        this.arbre=arbre;
        this.eau=eau;
        this.gardien=gardien;
        this.herbe=herbe;
        this.intru=intru;
        this.mur=mur;
    }

    public Arbre getArbre() {
        return arbre;
    }

    public Eau getEau() {
        return eau;
    }

    public Gardien getGardien() {
        return gardien;
    }

    public Herbe getHerbe() {
        return herbe;
    }

    public Intru getIntru() {
        return intru;
    }

    public Mur getMur() {
        return mur;
    }
    public CaseContent removeElement(int numberType){
        switch (numberType){
            case 0 :this.arbre=null;
            break;
            case 1 :this.eau=null;
                break;
            case 2 :this.gardien=null;
                break;
            case 3 :this.herbe=null;
                break;
            case 4 :this.intru=null;
                break;
            case 5 :this.mur=null;
                break;
        }
        return this;
    }
}
