package traitement;
import plateforme.Case;
import plateforme.Grille;

public class UpdateGrille {
    public static int nextPhase(int phase){
        if (phase==0)return 1;
        else return 0;
    }
    public static Case[][] updateCaractersBehaviors(Grille gr,int direction) {
        int curentPhase = gr.curentPhase;
        boolean intrueChanged = false ;
        int nbrLine = gr.getNbrLine();
        int nbrCol=gr.getNbrCol();
        int gameMode = gr.getGameMode();
        int nbrGardienChanged=0;
        Case[][] grille = gr.getGrille();
        for (int i=0;i<nbrLine;i++){
            for (int j=0;j<nbrCol;j++){
                if ((grille[i][j].getNumberTypeListe().contains(2))&(grille[i][j].getNumberTypeListe().contains(4))){
                    grille[i][j].removeType(4);
                }
                if(grille[i][j].getNumberTypeListe().contains(0)){
                    grille[i][j].getType().getArbre().visit(gr);
                }
                if(grille[i][j].getNumberTypeListe().contains(1)){
                    grille[i][j].getType().getEau().visit(gr);
                }
                if(grille[i][j].getNumberTypeListe().contains(2)){
                       if (grille[i][j].getType().getGardien().getPhase()==curentPhase){
                           int absBeforUpdate=grille[i][j].getType().getGardien().getAbscisse();
                           int ordBeforUpdate=grille[i][j].getType().getGardien().getOrdonne();
                           int posBeforUpdate=grille[i][j].getType().getGardien().getPosition();
                           grille[i][j].getType().getGardien().visit(gr);
                           grille[i][j].getType().getGardien().updateStateOfMind(gameMode);
                           // mise a jour de la position du gardien
                            grille[i][j].getType().getGardien().updatePosition(direction);
                            //mise a jour de la porsition dde la case
                            //faire en sorte de passer en  paramétre grille[i][j]
                            if ((grille[i][j].getType().getGardien().getAbscisse()!=absBeforUpdate)||(grille[i][j].getType().getGardien().getOrdonne()!=ordBeforUpdate)){
                                grille[grille[i][j].getType().getGardien().getOrdonne()][grille[i][j].getType().getGardien().getAbscisse()].addType(2);
                                grille[grille[i][j].getType().getGardien().getOrdonne()][grille[i][j].getType().getGardien().getAbscisse()].getType().getGardien().setPosition(grille[i][j].getType().getGardien().getPosition());
                                grille[grille[i][j].getType().getGardien().getOrdonne()][grille[i][j].getType().getGardien().getAbscisse()].getType().getGardien().setPhase(nextPhase(curentPhase));
                                grille[i][j].removeType(2);
                                gr.setGardienBlocked(false);
                            }
                            else{
                                grille[i][j].getType().getGardien().setPosition(posBeforUpdate);
                                grille[i][j].getType().getGardien().setPhase(nextPhase(curentPhase));
                                gr.setGardienBlocked(true);
                            }
                       }
                }
                if(grille[i][j].getNumberTypeListe().contains(3)){
                    grille[i][j].getType().getHerbe().visit(gr);
                }
                if(grille[i][j].getNumberTypeListe().contains(4)){
                    if (grille[i][j].getType().getIntru().getPhase()==curentPhase){
                        grille[i][j].getType().getIntru().visit(gr);
                        grille[i][j].getType().getIntru().updateStateOfMind(gameMode);
                        grille[i][j].getType().getIntru().updatePosition();
                        grille[grille[i][j].getType().getIntru().getOrdonne()][grille[i][j].getType().getIntru().getAbscisse()].addType(4);
                        grille[grille[i][j].getType().getIntru().getOrdonne()][grille[i][j].getType().getIntru().getAbscisse()].getType().getIntru().setPosition(grille[i][j].getType().getIntru().getPosition());
                        grille[grille[i][j].getType().getIntru().getOrdonne()][grille[i][j].getType().getIntru().getAbscisse()].getType().getIntru().setPhase(nextPhase(curentPhase));
                        grille[grille[i][j].getType().getIntru().getOrdonne()][grille[i][j].getType().getIntru().getAbscisse()].getType().getIntru().setStateOfMind(grille[i][j].getType().getIntru().getStateOfMind());
                        grille[i][j].removeType(4);
                    }
                }
                if(grille[i][j].getNumberTypeListe().contains(5)){
                    grille[i][j].getType().getMur().visit(gr);
                }
            }
        }
        return grille;
    }
}