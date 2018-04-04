package traitement;
import plateforme.Case;
public class FieldOfView{
    public static Case[][] field =new Case[5][5];
    public static Case[][] map=new  Case[21][41];
    public static int abscisse;
    public static int ordonne;
    public static Case[][] getFieldOfView(int abscisse, int ordonne, Case[][] grille){
        map =  grille;
        int o=0;
        for (int i=(ordonne-2);i<=(ordonne+2);i++){
            int a=0;
            for (int j=(abscisse-2);j<=(abscisse+2);j++){
                if((i>=0)&(j>=0)&(i<=20)&(j<=40)){
                    field[o][a]=map[i][j];
                }
                else{
                    field[o][a]=new Case();
                    a++;
                    continue;
                }
                a++;
            }
            o++;
        }
        return field;
    }
}