package com.example.android.taller_claselist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.content.res.Resources;

import java.util.ArrayList;

public class listar_celular extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celulars;
    private Resources resources;
    private String marca[];


    private String sistema[];
    private String color[];





    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_celular);
        tabla=(TableLayout)findViewById(R.id.tblCelular);
        celulars=Datos.Obtener();
        resources=this.getResources();
        Log.d("Cel", celulars.toString());
        color= resources.getStringArray(R.array.color);
        sistema= resources.getStringArray(R.array.sistema);
        marca= resources.getStringArray(R.array.marca);




        for (int i = 0; i <celulars.size() ; i++) {
            TableRow fila = new TableRow(this);

            TextView c1= new TextView(this);
            TextView c2= new TextView(this);
            TextView c3= new TextView(this);
            TextView c4= new TextView(this);
            TextView c5= new TextView(this);

            c1.setText(""+celulars.get(i).getPrecio());
            c2.setText(""+celulars.get(i).getCapacidad());
            c3.setText(color[celulars.get(i).getColor()]);
            c4.setText(sistema[celulars.get(i).getSistema()]);
            c5.setText(marca[celulars.get(i).getMarca()]);




            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            tabla.addView(fila);
        }
    }
}


