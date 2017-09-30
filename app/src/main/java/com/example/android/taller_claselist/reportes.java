package com.example.android.taller_claselist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class reportes extends AppCompatActivity {


    private EditText res;
    private Resources resources;
    private Spinner spinerReporte;
    private String reporte[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        resources=this.getResources();
        spinerReporte=(Spinner) findViewById(R.id.cbxreporte);
        reporte=resources.getStringArray(R.array.reporte);
        ArrayAdapter<String> adapter_reporte = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,reporte);
        spinerReporte.setAdapter(adapter_reporte);
        res=(EditText)findViewById(R.id.txtresultado);

    }





         public void GenerarReporte(View v){
        int sel_reporte = spinerReporte.getSelectedItemPosition();
        if (sel_reporte==0){

            res.setText(Datos.ObtenerPrecioCapacidad());
        }else if(sel_reporte==1){

            res.setText(Datos.ObtenerMarcaApple());
        }else{
            res.setText(Datos.celularesPrecioNokia());
        }
    }
}