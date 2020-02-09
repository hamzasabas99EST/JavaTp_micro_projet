package Classes;


public class Doctor {
    private int id;
    private int version;
    private String titre;
    private String nom;
    private String prenom;
    
    public Doctor(int version,String titre,String nom, String prenom){
        this.titre=titre;
        this.nom=nom;
        this.prenom=prenom;
        this.version=version;
    }
}
