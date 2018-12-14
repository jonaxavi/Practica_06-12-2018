package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {
    
    static String meses[]= {"enero","febrero","marzo","abril",
        "mayo","junio","julio","agosto","septiembre",
        "octubre","noviembre","diciembre"};
    static String dias[]={"lunes","martes","miercoles","jueves","viernes","sábado","domingo"};
    
    public static String[] mesesAnio(){
       return meses;
    } 
    
    public static String[] diasSemana(){
        return dias;
    }
    
    public static String[] numeros;

    public static String[] randomicos(){
        asignar();
        return numeros;
    }
    
    public static void asignar(){
        String array[]= new String[Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos randómicos"))];
        for (int i = 0; i < array.length; i++) {
            array[i]=String.valueOf(Math.random()*100);
        }
        numeros=array;
    }
    public static float suma(String[] ar){
        float acu=0;
        for(int i = 0; i <ar.length; i++) {
            acu +=Float.parseFloat(ar[i]);
        }
        return acu;
    }
    
    public static float promedio(String ar[]){
        float acu=0;
        for(int i=0;i<ar.length;i++){
            acu += Float.parseFloat(ar[i]);
        }
        return acu/ar.length;
    }
    
    public static float maximo(String ar[]){
        //Arrays.sort(ar);
        //float max = Float.parseFloat(ar[(ar.length-1)]);
        float maxi = Float.parseFloat(ar[0]);
        for (int i = 0; i < ar.length; i++) {
            if (maxi<Float.parseFloat(ar[i])) {
               maxi = Float.parseFloat(ar[i]);
            }
        }
        return maxi;    
    }
    
    public static float minimo(String ar[]){
        //Arrays.sort(ar);
        //float min = Float.parseFloat(ar[0]);
        float mini = Float.parseFloat(ar[0]);
        for (int i = 0; i < ar.length; i++) {
            if (mini>Float.parseFloat(ar[i])) {
               mini = Float.parseFloat(ar[i]);
            }
        }
        return mini;
    }
}