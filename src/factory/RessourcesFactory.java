package factory;

import builder.CaseBuilder;
import builder.CaseContent;
import plateforme.*;
import ressources.*;

import java.util.ArrayList;

public class RessourcesFactory {
    private int abscisse,ordonne;
    private ArrayList<Integer> caseTypeList;
    private CaseContent type ;
    public RessourcesFactory(ArrayList<Integer> caseTypeList,int ordonne,int abscisse){
        this.caseTypeList=caseTypeList;
        this.abscisse=abscisse;
        this.ordonne=ordonne ;
    }
    //first push
    public CaseContent getCaseType() {
        CaseBuilder builder = new CaseBuilder();
        for (int i=0;i<caseTypeList.size();i++) {
            switch (caseTypeList.get(i)) {
                case 0:
                    type = builder.setArbre(new Arbre(abscisse, ordonne)).getCaseInstance();
                    break;
                case 1:
                    type = builder.setEau(new Eau(abscisse, ordonne)).getCaseInstance();
                    break;
                case 2:
                    type = builder.setGardien(new Gardien(abscisse, ordonne)).getCaseInstance();
                    break;
                case 3:
                    type = builder.setHerbe(new Herbe(abscisse, ordonne)).getCaseInstance();
                    break;
                case 4:
                    type = builder.setIntru(new Intru(abscisse, ordonne)).getCaseInstance();
                    break;
                case 5:
                    type = builder.setMur(new Mur(abscisse, ordonne)).getCaseInstance();
                    break;
                default:
                    type = null;
            }
        }
        return type;
    }
}
