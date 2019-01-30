
package proyecto;


public class Arreglos1 {
    Cooperativa op= new Cooperativa();
    String[]Guayaquil1=new String [22];
    String[]Guayaquil2=new String [22];
    String[]Guayaquil3=new String [22];
    String[]Loja1=new String [22]; 
    String[]Loja2=new String [22];
    String[]Loja3=new String [22];        
    String[]Quito1=new String [22];
    String[]Quito2=new String [22];
    String[]Quito3=new String [22];  
double canti [] =new double[4];
 
    public Arreglos1(String[]Guayaquil1,String[]Guayaquil2,String[]Guayaquil3,String[]Loja1,String[]Loja2,String[]Loja3,String[]Quito1
    ,String[]Quito2,String[]Quito3) {       
        this.Loja1=Loja1;
        this.Loja2=Loja2;
        this.Loja3=Loja3;
        this.Quito1=Quito1;
        this.Quito2=Quito2;
        this.Quito3=Quito3;
        this.Guayaquil1=Guayaquil1;
        this.Guayaquil2=Guayaquil2;
        this.Guayaquil3=Guayaquil3;
    }

    public Arreglos1(double[]can) {
        this.canti=can;
    }
    
}
