package proyecto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class INTERFAZ_1 extends javax.swing.JFrame implements Runnable {
    Cooperativa op= new Cooperativa();
    
    Base sc1 =new listados();
    Arreglos1 a = sc1.Scanner();
    String shora, sminutos, ssegundos;
    Thread hilo;
    DefaultComboBoxModel modelo_Ruta,Modelo_Hora;
    double precio_adulto_Loja=10.45;
    double precio_niño_Loja=7.50;
    double precio_adulto_Quito=45.75;
    double precio_niño_Quito=30.50;
    double precio_adulto_Guayaquil=100.45;
    double precio_niño_Guayaquil=80.50; 
    /*
    String[]Guayaquil2=op.Guayaquil2;
    String[]Guayaquil1=op.Guayaquil1;    
    String[]Guayaquil3=op.Guayaquil3;
    String[]Loja1=op.Loja1; 
    String[]Loja2=op.Loja2;
    String[]Loja3=op.Loja3;        
    String[]Quito1=op.Quito1;
    String[]Quito2=op.Quito2;
    String[]Quito3=op.Quito3; 
    double[]cantidad=op.cantidad;*/
    String[]g1=new String [23];
    String[]g2=new String [23];
    String[]g3=new String [23];
    String[]l1=new String [23]; 
    String[]l2=new String [23];
    String[]l3=new String [23];        
    String[]q1=new String [23];
    String[]q2=new String [23];
    String[]q3=new String [23]; 
public INTERFAZ_1() {
        initComponents();
        cargar_rutas();
        this.setLocationRelativeTo(INTERFAZ_1.this);  
        tfecha.setText(fechaa());
        hilo = new Thread(this);
        hilo.start();
        //op.crear();
        aux();
    }

public void aux(){ 
   op.setCooperativa(a.Guayaquil1, a.Guayaquil2, a.Guayaquil3, a.Loja1, a.Loja2, a.Loja3, a.Quito1, a.Quito2, a.Quito3);
    System.out.println("INICIO");
    g1=op.Guayaquil1;
    g2=op.Guayaquil2;
    g3=op.Guayaquil3;
    l1=op.Loja1; 
    l2=op.Loja2;
    l3=op.Loja3;        
    q1=op.Quito1;
    q2=op.Quito2;
    q3=op.Quito3; 
System.out.println("de"+Arrays.toString(l1)); 
System.out.println("dees"+Arrays.toString(l2)); 
System.out.println("dees"+Arrays.toString(l3)); 
System.out.println("dess"+Arrays.toString(q1)); 
System.out.println("des"+Arrays.toString(q2)); 
System.out.println("de"+Arrays.toString(q3)); 
System.out.println("dees"+Arrays.toString(g1));
System.out.println("dess"+Arrays.toString(g2)); 
System.out.println("des"+Arrays.toString(g3)); 
}
public static String fechaa(){
        Date fechaa=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fechaa);
    }
public void hor() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        shora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        sminutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        ssegundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        
    }
public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            hor();
            thora.setText(shora + " :" + sminutos + " :" + ssegundos);
        }
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
    System.out.println("color"+Arrays.toString(l1));
    if(i==1&&r==1){    
    if(l1[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(l1[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(l1[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(l1[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(l1[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(l1[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(l1[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(l1[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(l1[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(l1[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(l1[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(l1[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(l1[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(l1[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(l1[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(l1[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(l1[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(l1[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(l1[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(l1[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(l1[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(l1[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(l1[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(l1[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(l1[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(l1[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(l1[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(l1[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(l1[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(l1[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(l1[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(l1[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(l1[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(l1[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(l1[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(l1[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(l1[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(l1[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(l1[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(l1[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(l1[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(l1[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(l1[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(l1[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}else if(i==1&&r==2){
    if(l2[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(l2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(l2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(l2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(l2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(l2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(l2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(l2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(l2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(l2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(l2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(l2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(l2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(l2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(l2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(l2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(l2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(l2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(l2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(l2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(l2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(l2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(l2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(l2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(l2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(l2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(l2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(l2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(l2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(l2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(l2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(l2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(l2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(l2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(l2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(l2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(l2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(l2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(l2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(l2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(l2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(l2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(l2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(l2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}else if(i==1&&r==3){
if(l3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(l3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(l3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(l3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(l3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(l3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(l3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(l3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(l3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(l3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(l3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(l3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(l3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(l3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(l3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(l3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(l3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(l3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(l3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(l3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(l3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(l3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(l3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(l3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(l3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(l3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(l3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(l3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(l3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(l3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(l3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(l3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(l3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(l3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(l3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(l3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(l3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(l3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(l3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(l3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(l3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(l3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(l3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(l3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}
else if(i==2&&r==1){        
          if(q1[1].equals(a)){
        lugar_1.setBackground(Color.green);
        
    } if(q1[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(q1[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(q1[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(q1[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(q1[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(q1[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(q1[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(q1[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(q1[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(q1[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(q1[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(q1[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(q1[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(q1[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(q1[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(q1[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(q1[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(q1[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(q1[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(q1[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(q1[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(q1[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(q1[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(q1[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(q1[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(q1[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(q1[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(q1[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(q1[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(q1[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(q1[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(q1[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(q1[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(q1[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(q1[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(q1[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(q1[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(q1[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(q1[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(q1[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(q1[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(q1[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(q1[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }
     }//aqui acaba el autobus de san juan de las 8:30
else if(i==2&&r==2){
       if(q2[1].equals(a)){
        lugar_1.setBackground(Color.green);
        
    } if(q2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(q2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(q2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(q2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(q2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(q2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(q2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(q2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(q2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(q2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(q2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(q2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(q2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(q2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(q2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(q2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(q2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(q2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(q2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(q2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(q2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(q2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(q2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(q2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(q2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(q2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(q2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(q2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(q2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(q2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(q2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(q2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(q2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(q2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(q2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(q2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(q2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(q2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(q2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(q2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(q2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(q2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(q2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }

}else if(i==2&&r==3){
    
 if(q3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(q3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(q3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(q3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(q3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(q3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(q3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(q3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(q3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(q3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(q3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(q3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(q3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(q3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(q3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(q3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(q3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(q3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(q3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(q3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(q3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(q3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(q3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(q3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(q3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(q3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(q3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(q3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(q3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(q3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(q3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(q3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(q3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(q3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(q3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(q3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(q3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(q3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(q3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(q3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(q3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(q3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(q3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(q3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }

}else if(i==3&&r==1){
    if(g1[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(g1[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(g1[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(g1[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(g1[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(g1[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(g1[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(g1[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(g1[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(g1[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(g1[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(g1[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(g1[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(g1[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(g1[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(g1[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(g1[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(g1[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(g1[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(g1[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(g1[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(g1[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(g1[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(g1[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(g1[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(g1[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(g1[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(g1[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(g1[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(g1[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(g1[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(g1[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(g1[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(g1[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(g1[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(g1[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(g1[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(g1[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(g1[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(g1[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(g1[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(g1[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(g1[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(g1[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }          
}else if(i==3&&r==2){
    if(g2[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(g2[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(g2[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(g2[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(g2[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(g2[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(g2[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(g2[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(g2[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(g2[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(g2[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(g2[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(g2[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(g2[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(g2[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(g2[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(g2[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(g2[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(g2[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(g2[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(g2[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(g2[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(g2[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(g2[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(g2[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(g2[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(g2[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(g2[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(g2[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(g2[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(g2[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(g2[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(g2[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(g2[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(g2[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(g2[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(g2[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(g2[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(g2[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(g2[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(g2[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(g2[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(g2[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(g2[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }
 
}else if(i==3&&r==3){
if(g3[1].equals(a)){
        lugar_1.setBackground(Color.green);
    } if(g3[1].equals(b)){
        lugar_1.setBackground(Color.red);
    } if(g3[2].equals(a)){
        lugar_2.setBackground(Color.green);
    } if(g3[2].equals(b)){
        lugar_2.setBackground(Color.red);
    
 
    } if(g3[3].equals(a)){
        lugar_3.setBackground(Color.green);
    } if(g3[3].equals(b)){
        lugar_3.setBackground(Color.red);
    
 
    } 
    if(g3[4].equals(a)){
        lugar_4.setBackground(Color.green);
    } if(g3[4].equals(b)){
        lugar_4.setBackground(Color.red);
    }
 
     if(g3[5].equals(a)){
        lugar_5.setBackground(Color.green);
    } if(g3[5].equals(b)){
        lugar_5.setBackground(Color.red);
    }
    
    if(g3[6].equals(a)){
        lugar_6.setBackground(Color.green);
    } if(g3[6].equals(b)){
        lugar_6.setBackground(Color.red);
    }
        
        if(g3[7].equals(a)){
        lugar_7.setBackground(Color.green);
    } if(g3[7].equals(b)){
        lugar_7.setBackground(Color.red);
    }
    
    if(g3[8].equals(a)){
        lugar_8.setBackground(Color.green);
    } if(g3[8].equals(b)){
        lugar_8.setBackground(Color.red);
    }
    
    if(g3[9].equals(a)){
        lugar_9.setBackground(Color.green);
    } if(g3[9].equals(b)){
        lugar_9.setBackground(Color.red);
    }
    
    if(g3[10].equals(a)){
        lugar_10.setBackground(Color.green);
    } if(g3[10].equals(b)){
        lugar_10.setBackground(Color.red);
    }
    
    if(g3[11].equals(a)){
        lugar_11.setBackground(Color.green);
    } if(g3[11].equals(b)){
        lugar_11.setBackground(Color.red);
    }

    if(g3[12].equals(a)){
        lugar_12.setBackground(Color.green);
    } if(g3[12].equals(b)){
        lugar_12.setBackground(Color.red);
    }
    
    if(g3[13].equals(a)){
        lugar_13.setBackground(Color.green);
    } if(g3[13].equals(b)){
        lugar_13.setBackground(Color.red);
    }
    
     if(g3[14].equals(a)){
        lugar_14.setBackground(Color.green);
    } if(g3[14].equals(b)){
        lugar_14.setBackground(Color.red);
    }
    
     if(g3[15].equals(a)){
        lugar_15.setBackground(Color.green);
    } if(g3[15].equals(b)){
        lugar_15.setBackground(Color.red);
    }
    
     if(g3[16].equals(a)){
        lugar_16.setBackground(Color.green);
    } if(g3[16].equals(b)){
        lugar_16.setBackground(Color.red);
    }
    
     if(g3[17].equals(a)){
        lugar_17.setBackground(Color.green);
    } if(g3[17].equals(b)){
        lugar_17.setBackground(Color.red);
    }
    
     if(g3[18].equals(a)){
        lugar_18.setBackground(Color.green);
    } if(g3[18].equals(b)){
        lugar_18.setBackground(Color.red);
    }
    
     if(g3[19].equals(a)){
        lugar_19.setBackground(Color.green);
    } if(g3[19].equals(b)){
        lugar_19.setBackground(Color.red);
    }
    
     if(g3[20].equals(a)){
        lugar_20.setBackground(Color.green);
    } if(g3[20].equals(b)){
        lugar_20.setBackground(Color.red);
    }
    
     if(g3[21].equals(a)){
        lugar_21.setBackground(Color.green);
    } if(g3[21].equals(b)){
        lugar_21.setBackground(Color.red);
    }
    
     if(g3[22].equals(a)){
        lugar_22.setBackground(Color.green);
    } if(g3[22].equals(b)){
        lugar_22.setBackground(Color.red);
    }   
}
    }
public void desdeo(){
    for(int i =0;i< 22;i++){
        g1[i]=null;
    g2[i]=null;
    g3[i]=null;
    l1[i]=null; 
    l2[i]=null;
    l3[i]=null;        
    q1[i]=null;
    q2[i]=null;
    q3[i]=null; 
    }
}
public void borrar(){
box_tipo_boleto.setSelectedIndex(0);
boxdestino.setSelectedIndex(0);
boxhora.setSelectedIndex(0);
boxasiento.setSelectedIndex(0);
cambio.setText("");
importe.setText("");
pago.setText("");
precio_adulto.setText("");
precio_niño.setText("");
nombre_cliente.setText("");
lugar_1.setBackground(Color.white);
lugar_2.setBackground(Color.white);
lugar_3.setBackground(Color.white);
lugar_4.setBackground(Color.white);
lugar_5.setBackground(Color.white);
lugar_6.setBackground(Color.white);
lugar_7.setBackground(Color.white);
lugar_8.setBackground(Color.white);
lugar_9.setBackground(Color.white);
lugar_10.setBackground(Color.white);
lugar_11.setBackground(Color.white);
lugar_12.setBackground(Color.white);
lugar_13.setBackground(Color.white);
lugar_14.setBackground(Color.white);
lugar_15.setBackground(Color.white);
lugar_16.setBackground(Color.white);
lugar_17.setBackground(Color.white);
lugar_18.setBackground(Color.white);
lugar_19.setBackground(Color.white);
lugar_20.setBackground(Color.white);
lugar_21.setBackground(Color.white);
lugar_22.setBackground(Color.white);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxdestino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxhora = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        precio_niño = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        precio_adulto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        box_tipo_boleto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        importe = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cambio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boxasiento = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tfecha = new javax.swing.JTextField();
        thora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lugar_2 = new javax.swing.JTextField();
        lugar_1 = new javax.swing.JTextField();
        lugar_4 = new javax.swing.JTextField();
        lugar_3 = new javax.swing.JTextField();
        lugar_5 = new javax.swing.JTextField();
        lugar_6 = new javax.swing.JTextField();
        lugar_7 = new javax.swing.JTextField();
        lugar_8 = new javax.swing.JTextField();
        lugar_11 = new javax.swing.JTextField();
        lugar_12 = new javax.swing.JTextField();
        lugar_9 = new javax.swing.JTextField();
        lugar_10 = new javax.swing.JTextField();
        lugar_16 = new javax.swing.JTextField();
        lugar_15 = new javax.swing.JTextField();
        lugar_14 = new javax.swing.JTextField();
        lugar_13 = new javax.swing.JTextField();
        lugar_22 = new javax.swing.JTextField();
        lugar_17 = new javax.swing.JTextField();
        lugar_18 = new javax.swing.JTextField();
        lugar_21 = new javax.swing.JTextField();
        lugar_20 = new javax.swing.JTextField();
        lugar_19 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        vender = new javax.swing.JButton();
        vista_cliente = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        vaciar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        lugar_23 = new javax.swing.JTextField();
        lugar_24 = new javax.swing.JTextField();
        lugar_25 = new javax.swing.JTextField();
        lugar_26 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(946, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA DE BOLETOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 406, 34));

        boxdestino.setBackground(new java.awt.Color(0, 153, 153));
        boxdestino.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        boxdestino.setForeground(new java.awt.Color(0, 153, 153));
        boxdestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdestinoActionPerformed(evt);
            }
        });
        getContentPane().add(boxdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 141, 41));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("DESTINO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 71, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Centaur", 3, 14)); // NOI18N
        jLabel2.setText("CALCULO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel4.setText("SALIDA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 51, -1));

        boxhora.setBackground(new java.awt.Color(0, 153, 153));
        boxhora.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        boxhora.setForeground(new java.awt.Color(0, 153, 153));
        boxhora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxhoraActionPerformed(evt);
            }
        });
        getContentPane().add(boxhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 141, 41));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setText("HORA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        precio_niño.setEditable(false);
        precio_niño.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        precio_niño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(precio_niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 124, 32));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel5.setText("PRECIO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 68, -1));

        precio_adulto.setEditable(false);
        precio_adulto.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        precio_adulto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(precio_adulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 124, 32));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel8.setText("ADULTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 68, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel9.setText("NIÑO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 68, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel10.setText("NOMBRE DEL CLIENTE:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        nombre_cliente.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        getContentPane().add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 306, 41));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel11.setText("BOLETO TIPO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        box_tipo_boleto.setBackground(new java.awt.Color(0, 153, 153));
        box_tipo_boleto.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        box_tipo_boleto.setForeground(new java.awt.Color(0, 102, 102));
        box_tipo_boleto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR:", "ADULTO", "NIÑO" }));
        box_tipo_boleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_tipo_boleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_tipo_boletoActionPerformed(evt);
            }
        });
        getContentPane().add(box_tipo_boleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 141, 41));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel12.setText("IMPORTE:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        importe.setEditable(false);
        importe.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        importe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 106, 37));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel13.setText("CAMBIO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        pago.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        pago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagoKeyPressed(evt);
            }
        });
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 106, 37));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel15.setText("$");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, -1, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel18.setText("PAGO:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, -1));

        cambio.setEditable(false);
        cambio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        cambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        getContentPane().add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 106, 37));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel19.setText("$");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel16.setText("ASIENTO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));

        boxasiento.setBackground(new java.awt.Color(0, 153, 153));
        boxasiento.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        boxasiento.setForeground(new java.awt.Color(0, 102, 153));
        boxasiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22" }));
        boxasiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxasientoActionPerformed(evt);
            }
        });
        getContentPane().add(boxasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 141, 41));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel17.setText("HORA:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel20.setText("FECHA:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        tfecha.setEditable(false);
        tfecha.setBackground(new java.awt.Color(0, 0, 0));
        tfecha.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tfecha.setForeground(new java.awt.Color(51, 255, 51));
        tfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 144, 33));

        thora.setEditable(false);
        thora.setBackground(new java.awt.Color(0, 0, 0));
        thora.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        thora.setForeground(new java.awt.Color(51, 255, 51));
        thora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(thora, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 144, 33));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 740, 40, 30));

        lugar_2.setEditable(false);
        lugar_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 40, 30));

        lugar_1.setEditable(false);
        lugar_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 40, 30));

        lugar_4.setEditable(false);
        lugar_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_4ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 40, 30));

        lugar_3.setEditable(false);
        lugar_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_3ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 40, 30));

        lugar_5.setEditable(false);
        lugar_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 40, 30));

        lugar_6.setEditable(false);
        lugar_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 40, 30));

        lugar_7.setEditable(false);
        lugar_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 40, 30));

        lugar_8.setEditable(false);
        lugar_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 40, 30));

        lugar_11.setEditable(false);
        lugar_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 40, 30));

        lugar_12.setEditable(false);
        lugar_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        lugar_9.setEditable(false);
        lugar_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 30));

        lugar_10.setEditable(false);
        lugar_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 40, 30));

        lugar_16.setEditable(false);
        lugar_16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 40, 30));

        lugar_15.setEditable(false);
        lugar_15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 40, 30));

        lugar_14.setEditable(false);
        lugar_14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 40, 30));

        lugar_13.setEditable(false);
        lugar_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 40, 30));

        lugar_22.setEditable(false);
        lugar_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 40, 30));

        lugar_17.setEditable(false);
        lugar_17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 40, 30));

        lugar_18.setEditable(false);
        lugar_18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 40, 30));

        lugar_21.setEditable(false);
        lugar_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 40, 30));

        lugar_20.setEditable(false);
        lugar_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 40, 30));

        lugar_19.setEditable(false);
        lugar_19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 40, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel21.setText("PASILLO AUTOBUS");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel22.setText("1");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 77, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setText("2");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 117, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel24.setText("4");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel25.setText("3");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel26.setText("8");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 10, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel27.setText("7");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 10, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel28.setText("6");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 10, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel29.setText("5");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 10, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel30.setText("10");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 20, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel31.setText("11");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 20, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel32.setText("12");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 20, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel33.setText("9");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 10, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel34.setText("15");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 20, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel35.setText("14");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 20, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel36.setText("16");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 20, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel37.setText("13");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 20, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel38.setText("21");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 20, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel39.setText("22");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 20, 20));

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel40.setText("17");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 20, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel41.setText("18");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 20, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel42.setText("20");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 20, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel43.setText("19");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 20, 30));

        vender.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        vender.setText("VENDER ");
        vender.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });
        getContentPane().add(vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 130, 50));

        vista_cliente.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        vista_cliente.setText("VISTA CLIENTE");
        vista_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        vista_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vista_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(vista_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 150, 40));

        admin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        admin.setText("ADMINISTRADOR");
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 150, 40));

        vaciar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        vaciar.setText("vaciar");
        vaciar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });
        getContentPane().add(vaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 130, 50));

        borrar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        borrar.setText("borrar");
        borrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 130, 50));

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel44.setText("$");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        lugar_23.setEditable(false);
        lugar_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 40, 30));

        lugar_24.setEditable(false);
        lugar_24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lugar_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 40, 30));

        lugar_25.setEditable(false);
        lugar_25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_25ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 40, 30));

        lugar_26.setEditable(false);
        lugar_26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lugar_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lugar_26ActionPerformed(evt);
            }
        });
        getContentPane().add(lugar_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void boxdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdestinoActionPerformed
cargar_horas();
 int i=boxdestino.getSelectedIndex();
 int p=box_tipo_boleto.getSelectedIndex();
if(i==0){
    //JOptionPane.showInputDialog(null,"NO SE HA SELECCIONADO NADA");
    
}else if(i==1){ 
    precio_adulto.setText("$ "+precio_adulto_Loja);
    precio_niño.setText("$ "+precio_niño_Loja);
    }
        
else if(i==2){    
    precio_adulto.setText("$ "+precio_adulto_Quito);
    precio_niño.setText("$ "+precio_niño_Quito);    
}        
else if(i==3){    
    precio_adulto.setText("$ "+precio_adulto_Guayaquil);
    precio_niño.setText("$ "+precio_niño_Guayaquil);    
}      

    }//GEN-LAST:event_boxdestinoActionPerformed

    private void boxhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxhoraActionPerformed

    int i=boxdestino.getSelectedIndex();
    int r=boxhora.getSelectedIndex();       
    ponerColor(i, r);   
    }//GEN-LAST:event_boxhoraActionPerformed

    private void box_tipo_boletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_tipo_boletoActionPerformed
int i=boxdestino.getSelectedIndex();
 int p=box_tipo_boleto.getSelectedIndex();
 if(i==1&&p==1){
     importe.setText(""+precio_adulto_Loja);       
 }else if(i==1&&p==2){
       importe.setText(""+precio_niño_Loja);
 }else if(i==2&p==1){
       importe.setText(""+precio_adulto_Quito);
 }else if(i==2&p==2){
       importe.setText(""+precio_niño_Quito);
 }else if(i==3&p==1){
       importe.setText(""+precio_adulto_Guayaquil);
 }else if(i==3&p==2){
       importe.setText(""+precio_niño_Guayaquil);
 }
    }//GEN-LAST:event_box_tipo_boletoActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        String impor=importe.getText();
        String pagos=pago.getText();
        double importes=Double.parseDouble(impor);
        double pagado=Double.parseDouble(pagos);
        double cambia=0;
        cambia=pagado-importes;
        cambio.setText(""+cambia);
        // TODO add your handling code here:
    }//GEN-LAST:event_pagoActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioActionPerformed

    private void pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagoKeyPressed

    }//GEN-LAST:event_pagoKeyPressed

    private void boxasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxasientoActionPerformed

        try {          
            int i=boxdestino.getSelectedIndex();
            int r=boxhora.getSelectedIndex();
            int n=boxasiento.getSelectedIndex();
            System.out.println(""+i+""+r+""+n);
            op.guardar(i, r, n);   
            System.out.println("fun");
            ponerColor(i, r);

        } catch (Exception e) {
            System.out.println("error es"+e);
        }       
    }//GEN-LAST:event_boxasientoActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        try{
            if(importe.getText().equals("")){
                JOptionPane.showMessageDialog(null,"NOSE PUEDE HACER LA ACCION");
            }else{
                int i=boxdestino.getSelectedIndex();
                String str=importe.getText();
                double numero=Double.parseDouble(str);
                op.Cantidad(numero, i);
                JOptionPane.showMessageDialog(null," BOLETO VENDIDO CON EXITO !!!");             
                borrar();
            }
            
        } catch (HeadlessException e) {
            System.out.println("ERROR"+e);
        }

    }//GEN-LAST:event_venderActionPerformed

    private void vista_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vista_clienteActionPerformed

new PANTALLA_CLIENTE().setVisible(true);

    }//GEN-LAST:event_vista_clienteActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
new ADMINISTRADOR().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void lugar_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_4ActionPerformed

    private void lugar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_3ActionPerformed

    private void lugar_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_25ActionPerformed

    private void lugar_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lugar_26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lugar_26ActionPerformed

    private void vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarActionPerformed
        // TODO add your handling code here:
         
        
        try {
            System.out.println("no");
        op.in1();
        System.out.println("listo1");
       op.in2();
        op.in3();
             System.out.println("listo");
        aux();
        System.out.println("suerte"+Arrays.toString(l1));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_vaciarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       
       borrar();
     //op.llenar2();
    }//GEN-LAST:event_borrarActionPerformed
  
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFAZ_1().setVisible(true);
                
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton borrar;
    private javax.swing.JComboBox<String> box_tipo_boleto;
    private javax.swing.JComboBox<String> boxasiento;
    private javax.swing.JComboBox<String> boxdestino;
    private javax.swing.JComboBox<String> boxhora;
    private javax.swing.JTextField cambio;
    private javax.swing.JTextField importe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField lugar_23;
    private javax.swing.JTextField lugar_24;
    private javax.swing.JTextField lugar_25;
    private javax.swing.JTextField lugar_26;
    private javax.swing.JTextField lugar_3;
    private javax.swing.JTextField lugar_4;
    private javax.swing.JTextField lugar_5;
    private javax.swing.JTextField lugar_6;
    private javax.swing.JTextField lugar_7;
    private javax.swing.JTextField lugar_8;
    private javax.swing.JTextField lugar_9;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField pago;
    private javax.swing.JTextField precio_adulto;
    private javax.swing.JTextField precio_niño;
    private javax.swing.JTextField tfecha;
    private javax.swing.JTextField thora;
    private javax.swing.JButton vaciar;
    private javax.swing.JButton vender;
    private javax.swing.JButton vista_cliente;
    // End of variables declaration//GEN-END:variables
}
