package ressources;

public abstract class Obstacle {
    //ajout de deux attribut voir et passe
    // ces deux attribut sont commun dans toute les classes de package ressources
    public boolean voir;
    public boolean passe;

    public abstract void setPasse();
    public abstract void setVoir();
    public abstract boolean getPasse();
    public abstract boolean getVoir();

}
