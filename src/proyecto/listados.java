
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class  listados extends Base{ 
    String[]gu1=new String [23];
    String[]gu2=new String [23];
    String[]gu3=new String [23];
    String[]lo1=new String [23]; 
    String[]lo2=new String [23];
    String[]lo3=new String [23];        
    String[]qu1=new String [23];
    String[]qu2=new String [23];
    String[]qu3=new String [23];  
    @Override
    public Arreglos1 Scanner(){  
        Arreglos1 llenado;
         try {  
             
            fileIn = new Scanner(new File("Loja.csv"));
                 int cont =0;                
                while (fileIn.hasNext()) {                       
                     num = fileIn.next();             
                     String[] tokens = num.split(";");                                              
                         lo1[cont]=tokens[0];
                         lo2[cont]=tokens[1];
                         lo3[cont]=tokens[2];
                         cont=cont+1;                              
                 }  
                 
            fileIn.close();
         cont =0; 
            fileIn = new Scanner(new File("Quito.csv"));
                 int cont1 =0;
                 
                while (fileIn.hasNext()) {                       
                     num = fileIn.nextLine();             
                     String[] tokens1 = num.split(";");                                  
                        qu1[cont1]=tokens1[0];
                        qu2[cont1]=tokens1[1];
                        qu3[cont1]=tokens1[2];
                        cont1=cont1+1;                                                                                  
                 }                                  
            fileIn.close();
            cont1 =0;
            fileIn = new Scanner(new File("Guayaquil.csv"));
                 int cont2 =0;
                while (fileIn.hasNext()) {                       
                     num = fileIn.nextLine();             
                     String[] tokens1 = num.split(";");                                 
                         gu1[cont2]=tokens1[0];
                         gu2[cont2]=tokens1[1];
                         gu3[cont2]=tokens1[2];
                         cont2=cont2+1;                                                                                  
                 }                                  
            fileIn.close();
            cont2 =0;
            llenado = new Arreglos1(gu1, gu2, gu3, lo1, lo2, lo3, qu1, qu2, qu3);
            System.out.println(Arrays.toString(lo1));
            return llenado;
                     
        } catch (FileNotFoundException ex) {
          
            System.err.println("Error de apertura de archivo "+ex);
        }
        return null;
        
    }
}
