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
    
     public void SetNom(String nom){
        this.nom=nom;
    }
    public String GetNom(){
        return this.nom;
    }
     public void SetPrenom(String prenom){
        this.prenom=prenom;
    }
     public String GetPrenom(){
        return this.prenom;
    }
      public void SetTitre(String titre){
        this.titre=titre;
    }
      public String GetTitre(){
        return this.titre;
    }
}
