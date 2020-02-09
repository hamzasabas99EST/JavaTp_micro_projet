
public class EntNat {
    private int num;
   
    public EntNat(int num) throws ErrConst{
        if(num<0) throw new ErrConst(num);
        this.num=num;
    }
    public int getInt(){return num;}
    
    static EntNat somme(EntNat x,EntNat y) throws ErrSom, ErrConst{
        
       int s=x.num+y.num;
       if(s>Integer.MAX_VALUE) throw new ErrSom(x.num,y.num);
        return new EntNat(s);
    }

static EntNat Diff(EntNat x,EntNat y) throws ErrDiff, ErrConst{
        
       int dif=x.num-y.num;
       if(dif<0) throw new ErrDiff(x.num,y.num);
        return new EntNat(dif);
    }

static EntNat Prod(EntNat x,EntNat y) throws ErrProd, ErrConst{
        
       int prod=x.num*y.num;
       if(prod>Integer.MAX_VALUE) throw new ErrProd(x.num,y.num);
        return new EntNat(prod);
    }

//fin de la class EntNat
}



class ErrConst extends Exception{
   private int n;
   
    public ErrConst(int n){
        this.n=n;
    }
}

class ErrSom extends Exception{
        private int a,b;
    public ErrSom(int a,int b){
        this.a=a;this.b=b;
    } 
}

class ErrDiff extends Exception{
        private int a,b;
    public ErrDiff(int a,int b){
        this.a=a;this.b=b;
    } 
}
class ErrProd extends Exception{
        private int a,b;
    public ErrProd(int a,int b){
        this.a=a;this.b=b;
    } 
}


