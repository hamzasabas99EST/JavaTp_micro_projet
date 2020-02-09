package Classes;


public class Client {
    private int id;
    private int version;
    private String titre;
    private String nom;
    private String prenom;
    
    public Client(int version,String titre,String nom, String prenom){
        this.titre=titre;
        this.nom=nom;
        this.prenom=prenom;
        this.version=version;
    } 
}
