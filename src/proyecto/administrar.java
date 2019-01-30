
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public  class administrar extends Base{
    double canti [] =new double[4];
@Override
 public Arreglos1 Scanner(){
        Arreglos1 cantida;
         try {
                     
            fileIn = new Scanner(new File("FilesII.csv"));                        
                while (fileIn.hasNext()) {                       
                     num = fileIn.next();             
                     String[] tokens = num.split(";");                       
                     canti[0]=Float.parseFloat(tokens[0].replace(",", ".")) ;
                     canti[1]=Float.parseFloat(tokens[1].replace(",", ".")) ; 
                     canti[3]=Float.parseFloat(tokens[2].replace(",", ".")) ;
                 }  
                         
            fileIn.close();
            cantida=new Arreglos1(canti);
            return cantida;
        } catch (FileNotFoundException ex) {
          
            System.err.println("Error de apertura de archivo "+ex);
        }
    return null;
      
    }
}
