package com.example.android.taller_claselist;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */


public class Datos {



    private static ArrayList<Celular> cel = new ArrayList<>();
    public static void Guardarcelulares(Celular p){
        cel.add(p);
    }
    public static ArrayList<Celular> Obtener(){
        return cel;
    }




        public static String ObtenerPrecioCapacidad()
    {
           int sw =0 ;
        String resultado = "";
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==1 && cel.get(i).getColor()==0 && cel.get(i).getSistema()==0){
                resultado = resultado + "" + (i+1) + ":\n= " + cel.get(i).getPrecio() + ", \n= " + cel.get(i).getCapacidad() + "\n\n";
                sw = 1;
            }
        }
        if (sw ==0){
            return "ERROR Sin Resultados";
        }
        return resultado;
       }


         public static String ObtenerMarcaApple()


         {
        int sw =0 ;
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==3 && cel.get(i).getColor()==0){
                sw = sw+1;
            }
        }
        return "" + sw;
    }



             public static String celularesPrecioNokia()
         {
        double suma = 0;
          int sw =0 ;
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==0){
                suma = suma + cel.get(i).getPrecio();
                sw = sw+1;
            }
        }
            if (sw<1){
            return "error sin celular";
        }
        return "" + (suma/sw);
    }

}