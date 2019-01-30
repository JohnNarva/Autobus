package proyecto;


import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;


public class PANTALLA_CLIENTE extends javax.swing.JFrame {
DefaultComboBoxModel modelo_Ruta,Modelo_Hora;
Cooperativa op=new Cooperativa();
  Base sc= new administrar();
    Base sc1 =new listados();
    Arreglos1 a = sc1.Scanner();
    String shora, sminutos, ssegundos;

    String[]Guayaquil1=a.Guayaquil1;
    String[]Guayaquil2=a.Guayaquil2;
    String[]Guayaquil3=a.Guayaquil3;
    String[]Loja1=a.Loja1; 
    String[]Loja2=a.Loja2;
    String[]Loja3=a.Loja3;        
    String[]Quito1=a.Quito1;
    String[]Quito2=a.Quito2;
    String[]Quito3=a.Quito3; 



public PANTALLA_CLIENTE() {
        initComponents();
        cargar_rutas();
        
        
    }
public final void cargar_rutas(){
    String [] rutas={"SELECCIONAR:","Loja","Quito","Guayaquil"};
    modelo_Ruta=new DefaultComboBoxModel(rutas);
    boxdestino.setModel(modelo_Ruta);
}

public void cargar_horas(){
String [] Loja={"SELECCIONAR:","9:00 AM","1:00 PM","5:00 PM"};    
    String [] Quito={"SELECCIONAR:","8:30 AM","12:30 PM","4:30 PM"};    
    String [] Guayaquil={"SELECCIONAR:","6:00 AM","2:00 PM","10:00 PM"};   
String destinos=boxdestino.getSelectedItem().toString();
if(destinos.equals("Loja")){
    Modelo_Hora=new DefaultComboBoxModel(Loja);
    boxhora.setModel(Modelo_Hora);
}else if(destinos.equals("Quito")){
    Modelo_Hora=new DefaultComboBoxModel(Quito);
    boxhora.setModel(Modelo_Hora);   
        
}else if(destinos.equals("Guayaquil")){
    Modelo_Hora=new DefaultComboBoxModel(Guayaquil);
    boxhora.setModel(Modelo_Hora);
    }

    }
public  void ponerColor(int i,int r){ 

String a="libre";
String b="ocupado";
if(i==1&&r==1){    
    if(Loja1[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Loja1[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Loja1[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Loja1[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Loja1[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Loja1[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Loja1[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Loja1[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Loja1[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Loja1[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Loja1[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Loja1[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Loja1[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Loja1[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Loja1[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Loja1[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Loja1[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Loja1[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Loja1[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Loja1[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Loja1[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Loja1[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Loja1[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Loja1[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Loja1[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Loja1[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Loja1[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Loja1[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Loja1[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Loja1[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Loja1[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Loja1[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Loja1[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Loja1[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Loja1[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Loja1[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Loja1[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Loja1[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Loja1[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Loja1[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Loja1[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Loja1[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Loja1[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Loja1[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}else if(i==1&&r==2){
    if(Loja2[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Loja2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Loja2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Loja2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Loja2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Loja2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Loja2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Loja2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Loja2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Loja2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Loja2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Loja2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Loja2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Loja2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Loja2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Loja2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Loja2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Loja2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Loja2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Loja2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Loja2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Loja2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Loja2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Loja2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Loja2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Loja2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Loja2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Loja2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Loja2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Loja2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Loja2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Loja2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Loja2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Loja2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Loja2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Loja2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Loja2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Loja2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Loja2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Loja2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Loja2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Loja2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Loja2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Loja2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}else if(i==1&&r==3){
if(Loja3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Loja3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Loja3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Loja3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Loja3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Loja3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Loja3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Loja3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Loja3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Loja3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Loja3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Loja3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Loja3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Loja3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Loja3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Loja3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Loja3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Loja3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Loja3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Loja3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Loja3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Loja3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Loja3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Loja3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Loja3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Loja3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Loja3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Loja3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Loja3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Loja3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Loja3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Loja3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Loja3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Loja3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Loja3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Loja3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Loja3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Loja3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Loja3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Loja3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Loja3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Loja3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Loja3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Loja3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}
else if(i==2&&r==1){        
          if(Quito1[1].equals(a)){
        lugar_1.setBackground(Color.green);
        
    } if(Quito1[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Quito1[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Quito1[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Quito1[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Quito1[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Quito1[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Quito1[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Quito1[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Quito1[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Quito1[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Quito1[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Quito1[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Quito1[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Quito1[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Quito1[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Quito1[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Quito1[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Quito1[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Quito1[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Quito1[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Quito1[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Quito1[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Quito1[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Quito1[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Quito1[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Quito1[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Quito1[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Quito1[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Quito1[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Quito1[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Quito1[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Quito1[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Quito1[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Quito1[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Quito1[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Quito1[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Quito1[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Quito1[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Quito1[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Quito1[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Quito1[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Quito1[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Quito1[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }
     }//aqui acaba el autobus de san juan de las 8:30
else if(i==2&&r==2){
       if(Quito2[1].equals(a)){
        lugar_1.setBackground(Color.green);
        
    } if(Quito2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Quito2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Quito2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Quito2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Quito2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Quito2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Quito2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Quito2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Quito2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Quito2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Quito2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Quito2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Quito2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Quito2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Quito2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Quito2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Quito2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Quito2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Quito2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Quito2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Quito2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Quito2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Quito2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Quito2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Quito2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Quito2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Quito2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Quito2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Quito2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Quito2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Quito2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Quito2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Quito2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Quito2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Quito2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Quito2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Quito2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Quito2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Quito2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Quito2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Quito2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Quito2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Quito2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }

}else if(i==2&&r==3){
    
 if(Quito3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Quito3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Quito3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Quito3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Quito3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Quito3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Quito3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Quito3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Quito3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Quito3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Quito3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Quito3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Quito3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Quito3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Quito3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Quito3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Quito3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Quito3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Quito3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Quito3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Quito3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Quito3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Quito3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Quito3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Quito3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Quito3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Quito3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Quito3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Quito3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Quito3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Quito3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Quito3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Quito3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Quito3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Quito3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Quito3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Quito3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Quito3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Quito3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Quito3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Quito3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Quito3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Quito3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Quito3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }

}else if(i==3&&r==1){
    if(Guayaquil2[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Guayaquil2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Guayaquil2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Guayaquil2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Guayaquil2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Guayaquil2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Guayaquil2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Guayaquil2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Guayaquil2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Guayaquil2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Guayaquil2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Guayaquil2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Guayaquil2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Guayaquil2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Guayaquil2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Guayaquil2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Guayaquil2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Guayaquil2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Guayaquil2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Guayaquil2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Guayaquil2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Guayaquil2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Guayaquil2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Guayaquil2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Guayaquil2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Guayaquil2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Guayaquil2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Guayaquil2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Guayaquil2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Guayaquil2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Guayaquil2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Guayaquil2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Guayaquil2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Guayaquil2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Guayaquil2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Guayaquil2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Guayaquil2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Guayaquil2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Guayaquil2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Guayaquil2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Guayaquil2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Guayaquil2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Guayaquil2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Guayaquil2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }          
}else if(i==3&&r==2){
    if(Guayaquil2[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Guayaquil2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Guayaquil2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Guayaquil2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Guayaquil2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Guayaquil2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Guayaquil2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Guayaquil2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Guayaquil2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Guayaquil2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Guayaquil2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Guayaquil2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Guayaquil2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Guayaquil2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Guayaquil2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Guayaquil2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Guayaquil2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Guayaquil2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Guayaquil2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Guayaquil2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Guayaquil2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Guayaquil2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Guayaquil2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Guayaquil2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Guayaquil2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Guayaquil2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Guayaquil2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Guayaquil2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Guayaquil2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Guayaquil2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Guayaquil2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Guayaquil2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Guayaquil2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Guayaquil2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Guayaquil2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Guayaquil2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Guayaquil2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Guayaquil2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Guayaquil2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Guayaquil2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Guayaquil2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Guayaquil2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Guayaquil2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Guayaquil2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }
 
}else if(i==3&&r==3){
if(Guayaquil3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(Guayaquil3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(Guayaquil3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(Guayaquil3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(Guayaquil3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(Guayaquil3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(Guayaquil3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(Guayaquil3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(Guayaquil3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(Guayaquil3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(Guayaquil3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(Guayaquil3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(Guayaquil3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(Guayaquil3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(Guayaquil3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(Guayaquil3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(Guayaquil3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(Guayaquil3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(Guayaquil3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(Guayaquil3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(Guayaquil3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(Guayaquil3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(Guayaquil3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(Guayaquil3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(Guayaquil3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(Guayaquil3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(Guayaquil3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(Guayaquil3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(Guayaquil3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(Guayaquil3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(Guayaquil3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(Guayaquil3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(Guayaquil3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(Guayaquil3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(Guayaquil3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(Guayaquil3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(Guayaquil3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(Guayaquil3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(Guayaquil3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(Guayaquil3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(Guayaquil3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(Guayaquil3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(Guayaquil3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(Guayaquil3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxhora = new javax.swing.JComboBox<>();
        boxdestino = new javax.swing.JComboBox<>();
        lugar_7 = new javax.swing.JTextField();
        lugar_21 = new javax.swing.JTextField();
        lugar_18 = new javax.swing.JTextField();
        lugar_11 = new javax.swing.JTextField();
        lugar_4 = new javax.swing.JTextField();
        lugar_1 = new javax.swing.JTextField();
        lugar_5 = new javax.swing.JTextField();
        lugar_6 = new javax.swing.JTextField();
        lugar_20 = new javax.swing.JTextField();
        lugar_17 = new javax.swing.JTextField();
        lugar_3 = new javax.swing.JTextField();
        lugar_15 = new javax.swing.JTextField();
        lugar_16 = new javax.swing.JTextField();
        lugar_22 = new javax.swing.JTextField();
        lugar_2 = new javax.swing.JTextField();
        lugar_10 = new javax.swing.JTextField();
        lugar_9 = new javax.swing.JTextField();
        lugar_13 = new javax.swing.JTextField();
        lugar_12 = new javax.swing.JTextField();
        lugar_14 = new javax.swing.JTextField();
        lugar_8 = new javax.swing.JTextField();
        lugar_19 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(570, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel2.setText("HORA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setText("RUTA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jButton1.setText("REGRESAR A LA VENTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 90, 30));

        boxhora.setBackground(new java.awt.Color(102, 0, 51));
        boxhora.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        boxhora.setForeground(new java.awt.Color(0, 102, 153));
        boxhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxhoraActionPerformed(evt);
            }
        });
        getContentPane().add(boxhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, -1));

        boxdestino.setBackground(new java.awt.Color(102, 0, 51));
        boxdestino.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        boxdestino.setForeground(new java.awt.Color(0, 153, 153));
        boxdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdestinoActionPerformed(evt);
            }
        });
        getContentPane().add(boxdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));

        lugar_7.setEditable(false);
        lugar_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 40, 30));

        lugar_21.setEditable(false);
        lugar_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 40, 30));

        lugar_18.setEditable(false);
        lugar_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 40, 30));

        lugar_11.setEditable(false);
        lugar_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 40, 30));

        lugar_4.setEditable(false);
        lugar_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_4ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 40, 30));

        lugar_1.setEditable(false);
        lugar_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 40, 30));

        lugar_5.setEditable(false);
        lugar_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 40, 30));

        lugar_6.setEditable(false);
        lugar_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 40, 30));

        lugar_20.setEditable(false);
        lugar_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 40, 30));

        lugar_17.setEditable(false);
        lugar_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 40, 30));

        lugar_3.setEditable(false);
        lugar_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_3ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 30));

        lugar_15.setEditable(false);
        lugar_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 40, 30));

        lugar_16.setEditable(false);
        lugar_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 40, 30));

        lugar_22.setEditable(false);
        lugar_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 40, 30));

        lugar_2.setEditable(false);
        lugar_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 40, 30));

        lugar_10.setEditable(false);
        lugar_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, 30));

        lugar_9.setEditable(false);
        lugar_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 30));

        lugar_13.setEditable(false);
        lugar_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 40, 30));

        lugar_12.setEditable(false);
        lugar_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 40, 30));

        lugar_14.setEditable(false);
        lugar_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 40, 30));

        lugar_8.setEditable(false);
        lugar_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 40, 30));

        lugar_19.setEditable(false);
        lugar_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 40, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("PASILLO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdestinoActionPerformed
cargar_horas();

    }//GEN-LAST:event_boxdestinoActionPerformed

    private void boxhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxhoraActionPerformed
 
        try {
            int i=boxdestino.getSelectedIndex();
            int r=boxhora.getSelectedIndex();                
            
            ponerColor(i, r);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_boxhoraActionPerformed

    private void lugar_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_4ActionPerformed

    private void lugar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PANTALLA_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PANTALLA_CLIENTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxdestino;
    private javax.swing.JComboBox<String> boxhora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lugar_1;
    private javax.swing.JTextField lugar_10;
    private javax.swing.JTextField lugar_11;
    private javax.swing.JTextField lugar_12;
    private javax.swing.JTextField lugar_13;
    private javax.swing.JTextField lugar_14;
    private javax.swing.JTextField lugar_15;
    private javax.swing.JTextField lugar_16;
    private javax.swing.JTextField lugar_17;
    private javax.swing.JTextField lugar_18;
    private javax.swing.JTextField lugar_19;
    private javax.swing.JTextField lugar_2;
    private javax.swing.JTextField lugar_20;
    private javax.swing.JTextField lugar_21;
    private javax.swing.JTextField lugar_22;
    private javax.swing.JTextField lugar_3;
    private javax.swing.JTextField lugar_4;
    private javax.swing.JTextField lugar_5;
    private javax.swing.JTextField lugar_6;
    private javax.swing.JTextField lugar_7;
    private javax.swing.JTextField lugar_8;
    private javax.swing.JTextField lugar_9;
    // End of variables declaration//GEN-END:variables
}
