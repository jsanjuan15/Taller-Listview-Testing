package com.example.android.taller_claselist;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class Principal extends AppCompatActivity {


    private ListView lv;
    private String op[];
    private Intent i;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        resources = this.getResources();
        lv=(ListView)findViewById(R.id.opciones);
        resources=this.getResources();
        op=resources.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op);
        lv.setAdapter(adapter);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i = new Intent(Principal.this,agregar_celulares.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this,listar_celular.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(Principal.this,reportes.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

