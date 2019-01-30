
package proyecto;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import javax.swing.JOptionPane;
public  class Cooperativa {
 
    final int n=23;
     
    Arreglos1 d ;
    String es="libre";
    String [] Loja1= new String [n];
    String [] Guayaquil1= new String [n];
    String [] Quito1= new String [n];
    String [] Loja2= new String [n];
    String [] Guayaquil2= new String [n];
    String [] Quito2= new String [n];
    String [] Loja3= new String [n];
    String [] Guayaquil3= new String [n];
    String [] Quito3= new String [n];

    double cantidad [] =new double[4];
    public void setCooperativa(String[]Guayaquil1,String[]Guayaquil2,String[]Guayaquil3,String[]Loja1,String[]Loja2,String[]Loja3,String[]Quito1
    ,String[]Quito2,String[]Quito3){
    this.Guayaquil1=Guayaquil1;
    this.Guayaquil2=Guayaquil2;
    this.Guayaquil3=Guayaquil3;
    this.Loja1=Loja1; 
    this.Loja2=Loja2;
    this.Loja3=Loja3;        
    this.Quito1=Quito1;
    this.Quito2=Quito2;
    this.Quito3=Quito3;
        System.out.println("q pasa");
    System.out.println(Arrays.toString(this.Loja1));
}

    public Cooperativa() {
    }
    
public void in1(){
    try {
        System.out.println("1111");
        Formatter fileOut;
        int ac=0;
            fileOut = new Formatter("Loja.csv");     
            
                fileOut.format("%s;%s;%s","hora-1","hora-2","hora-3");
                fileOut.format("\r\n");
                Loja1[0]="hora1"; 
                Loja2[0]="hora2";
                Loja3[0]="hora3"; 
               // for (int i =0;i<23;i++){
               while(ac<=22){
                Loja1[ac]=es; 
                Loja2[ac]=es;
                Loja3[ac]=es;        
                fileOut.format("%s;%s;%s",Loja1[ac],Loja2[ac],Loja3[ac]);
                fileOut.format("\r\n");
                ac++;
                   
                }
                    
            fileOut.close(); 
               
                System.out.println("despues"+Arrays.toString(Loja1));
          
                
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        }
}
public void in2(){
    try {
           
            Formatter fileOut;    
            fileOut = new Formatter("Quito.csv");
            
                fileOut.format("%s;%s;%s","hora. 1","hora .2","hora. 3");
                fileOut.format("\r\n");
                Quito1[0]="hora1"; 
                Quito2[0]="hora2";
                Quito3[0]="hora3"; 
                for (int i =0;i<23;i++){
                Quito1[i]=es;
                Quito2[i]=es;
                Quito3[i]=es;    
                fileOut.format("%s;%s;%s",Quito1[i],Quito2[i],Quito3[i]);
                fileOut.format("\r\n");
                }
                      
            fileOut.close(); 
                
            
            System.out.println("despues"+Arrays.toString(Loja1));    
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        } 
}
public void in3(){
    try {   
        Formatter fileOut;
            fileOut = new Formatter("Guayaquil.csv");
            
                fileOut.format("%s;%s;%s","hora ,1","hora ,2","hora, 3");
                fileOut.format("\r\n");
                Guayaquil1[0]="hora1"; 
                Guayaquil2[0]="hora2";
                Guayaquil3[0]="hora3"; 
                for (int i =0;i<23;i++){
                Guayaquil1[i]=es;
                Guayaquil2[i]=es;
                Guayaquil3[i]=es;    
                fileOut.format("%s;%s;%s",Guayaquil1[i],Guayaquil2[i],Guayaquil3[i]);
                fileOut.format("\r\n");
                }
                      
            fileOut.close(); 
            System.out.println("despues"+Arrays.toString(Loja1));    
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        }
}    
public void Cantidad(double numero,int i){
    
       switch (i) {
                case 1:
                    cantidad[1]=cantidad[1]+numero;
                    
                    break;
                case 2:
                    cantidad[2]=cantidad[2]+numero;
                    System.out.println(cantidad[2]);
                    break;
                case 3:
                    cantidad[3]=cantidad[3]+numero;
                    System.out.println(cantidad[2]);
                    break;
                default:
                    break;
                    
            }
       llenar();
   }
public void iniciar(){ 
         
    }
public void guardar(int i,int r,int num){  
    
        String a="libre";
        String b="ocupado";
        System.out.println(num);

        if(i==1&&r==1){  
            System.out.println("corr"+num);
            if(Loja1[num].equals(a)){
                Loja1[num]=b;   
                  System.out.println("cammbio");
            }else if(Loja1[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==1&&r==2){
            if(Loja2[num].equals(a)){
                Loja2[num]=b;                 
            }else if(d.Loja2[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==1&&r==3){
            if(Loja3[num].equals(a)){
                Loja3[num]=b;                 
            }else if(Loja3[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==2&&r==1){
            if(Quito1[num].equals(a)){
                Quito1[num]=b;                 
            }else if(Quito1[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==2&&r==2){
            if(Quito2[num].equals(a)){
                Quito2[num]=b;                 
            }else if(Quito2[num]==b){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==2&&r==3){
            if(Quito3[num].equals(a)){
                Quito3[num]=b;                 
            }else if(Quito3[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==3&&r==1){
            if(Guayaquil1[num].equals(a)){
                Guayaquil1[num]=b;                 
            }else if(Guayaquil1[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==3&&r==2){
            if(Guayaquil2[num].equals(a)){
                Guayaquil2[num]=b;                 
            }else if(d.Guayaquil2[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }else if(i==3&&r==3){
            if(Guayaquil3[num].equals(a)){
                Guayaquil3[num]=b;                 
            }else if(Guayaquil3[num].equals(b)){
               JOptionPane.showMessageDialog(null," El asiento esta ocupado, elija otro!!!");
            }
        }
        
    System.out.println("antes"+Arrays.toString(Loja1));    
    llenar2();
    }
public void llenar(){
 Formatter fileOut;
        try {
            fileOut = new Formatter("FilesII.csv");
            
                fileOut.format("%.1f;%.1f;%.1f",cantidad[1],cantidad[2],cantidad[3]);
                fileOut.format("\r\n");
                      
            fileOut.close();           
    
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        }

    }  
public void llenar2(){
    System.out.println("ola");
    System.out.println("despues"+Arrays.toString(Loja1)); 
    Formatter fileOut;
        try {
            fileOut = new Formatter("Loja.csv");                            
                for (int i =0;i<23;i++){
                    
                fileOut.format("%s;%s;%s",Loja1[i],Loja2[i],Loja3[i]);
                fileOut.format("\r\n");
                }
                      
                fileOut.close(); 
                
            fileOut = new Formatter("Quito.csv");
            
                
                for (int i =0;i<23;i++){
                    
                fileOut.format("%s;%s;%s",Quito1[i],Quito2[i],Quito3[i]);
                fileOut.format("\r\n");
                }
                      
                fileOut.close(); 

                fileOut = new Formatter("Guayaquil.csv");
            
                
                for (int i =0;i<23;i++){
                    
                fileOut.format("%s;%s;%s",Guayaquil1[i],Guayaquil2[i],Guayaquil3[i]);
                fileOut.format("\r\n");
                }
                      
            fileOut.close(); 
               
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        }

    }/*
public void crear(){
    Formatter fileOut;
        try {
            fileOut = new Formatter("Loja.csv");
            
                fileOut.format("%s;%s;%s","hora+1","hora+2","hora+3");
                fileOut.format("\r\n");
                for (int i =0;i<22;i++){
                    
                fileOut.format("%s;%s;%s",Loja1[i],Loja2[i],Loja3[i]);
                fileOut.format("\r\n");
                }
                      
                fileOut.close(); 
                
            fileOut = new Formatter("Quito.csv");
            
                fileOut.format("%s;%s;%s","hora* 1","hora *2","hora *3");
                fileOut.format("\r\n");
                for (int i =0;i<22;i++){
                    
                fileOut.format("%s;%s;%s",Quito1[i],Quito2[i],Quito3[i]);
                fileOut.format("\r\n");
                }
                      
                fileOut.close(); 

                fileOut = new Formatter("Guayaquil.csv");
            
                fileOut.format("%s;%s;%s","hora/ 1","hora /2","hora /3");
                fileOut.format("\r\n");
                for (int i =0;i<22;i++){
                    
                fileOut.format("%s;%s;%s",Guayaquil1[i],Guayaquil2[i],Guayaquil3[i]);
                fileOut.format("\r\n");
                }
                      
            fileOut.close(); 
               
        } catch (FileNotFoundException ex) {
            
            System.err.println("Error de apertura de archivo "+ex);
        }
}*/
 }





  