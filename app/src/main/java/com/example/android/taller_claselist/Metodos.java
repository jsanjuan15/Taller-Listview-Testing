package com.example.android.taller_claselist;

import java.util.ArrayList;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {







    public static double celularesPrecioNokia(ArrayList<Celular> celulars)
    {
        double suma = 0;
        double sw =0 ;
        for(int i = 0 ; i< celulars.size();i++){
            if (celulars.get(i).getMarca()==2){
                suma = suma + celulars.get(i).getPrecio();
                sw = sw+1;
            }
        }
        if (sw<1){
            return 0;
        }else {
            return suma/sw;
        }
    }

    public static int ObtenerMarcaApple(ArrayList<Celular> celulars)


    {
        int sw =0 ;
        for(int i = 0 ; i< celulars.size();i++){
            if (celulars.get(i).getMarca()==3 && celulars.get(i).getColor()==0){
                sw = sw+1;
            }
        }
        return  sw;
    }



    public static double ObtenerPrecioCapacidad(ArrayList<Celular> celulars)
    {
        int sw =0 ;
        double resultado = 0;
        for(int i = 0 ; i< celulars.size();i++){
            if (celulars.get(i).getMarca()==1 && celulars.get(i).getColor()==0 && celulars.get(i).getSistema()==0){

                sw = 1;
            }
        }
        if (sw ==0){
            return 0;
        }
        return resultado;
    }
}





