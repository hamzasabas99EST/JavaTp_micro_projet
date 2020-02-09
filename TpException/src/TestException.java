
public class TestException {
   public static void main(String args[]){
       try{
       EntNat n=new EntNat(3);
       System.out.println("Votre nombre est : "+n.getInt());
       n=new EntNat(-3);
       System.out.println("Votre nombre est : "+n.getInt());
       
       }catch(ErrConst e){
           System.out.println("Error");
       }
       
   } 
}
