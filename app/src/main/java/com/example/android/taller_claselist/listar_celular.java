package com.example.android.taller_claselist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        for (int i = 0; i <celulars.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1= new TextView(this);
            TextView c2= new TextView(this);
            TextView c3= new TextView(this);
            TextView c4= new TextView(this);
            TextView c5= new TextView(this);
            c1.setText(""+(i+1));
            c2.setText(""+celulars.get(i).getPrecio());
            c3.setText(""+color[celulars.get(i).getColor()]);
            c4.setText(""+marca[celulars.get(i).getMarca()]);
            c5.setText(""+sistema[celulars.get(i).getSistema()]);



            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c4);

            tabla.addView(fila);
        }
    }
}


