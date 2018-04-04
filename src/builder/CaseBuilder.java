package builder;

import plateforme.Case;
import ressources.*;

public class CaseBuilder {
    private Arbre arbre ;
    private Eau eau ;
    private Gardien gardien ;
    private Herbe herbe ;
    private Intru intru ;
    private Mur mur ;

    public CaseBuilder setArbre(Arbre arbre) {
        this.arbre = arbre;
        return this ;
    }

    public CaseBuilder setEau(Eau eau) {
        this.eau = eau;
        return this ;
        //test
    }

    public CaseBuilder setGardien(Gardien gardien) {
        this.gardien = gardien;
        return this ;
    }

    public CaseBuilder setHerbe(Herbe herbe) {
        this.herbe = herbe;
        return this ;
    }

    public CaseBuilder setIntru(Intru intru) {
        this.intru = intru;
        return this ;
    }

    public CaseBuilder setMur(Mur mur) {
        this.mur = mur;
        return this ;
    }
    public CaseContent getCaseInstance(){
        return new CaseContent(arbre,eau,gardien,herbe,intru,mur);
    }
}
