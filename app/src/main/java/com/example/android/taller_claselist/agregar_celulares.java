package com.example.android.taller_claselist;

        import android.content.Intent;
        import android.content.res.Resources;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Spinner;
        import android.widget.Toast;
public class agregar_celulares extends AppCompatActivity {

    private ListView lv;
    private EditText precio;

    private EditText capacidad;
    private Resources resources;
    private String marca[];
    private String color[];
    private String sistema[];

    private Spinner spiner_marca;
    private Spinner spiner_sistema;
    private Spinner spiner_color;
    private Intent in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crear_celular2);

        spiner_marca=(Spinner) findViewById(R.id.cbxmarca);
        spiner_sistema=(Spinner) findViewById(R.id.cbxsistema);
        spiner_color=(Spinner) findViewById(R.id.cbxcolor);
        resources=this.getResources();

        marca=resources.getStringArray(R.array.marca);
        sistema=resources.getStringArray(R.array.sistema);
        color=resources.getStringArray(R.array.color);



        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,color);
        spiner_color.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sistema);
        spiner_sistema.setAdapter(adapter2);
        ArrayAdapter<String> adapter3= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,marca);
        spiner_marca.setAdapter(adapter3);
        precio=(EditText)findViewById(R.id.txtprecio);
        capacidad=(EditText)findViewById(R.id.txtcapacidad);

    }
    public void Guardar(View v){


        if (precio.getText().toString().length()==0 || capacidad.getText().toString().length()==0){
            Toast.makeText(this,resources.getString(R.string.error),Toast.LENGTH_SHORT).show();
        }else {


            int sel_marca = spiner_marca.getSelectedItemPosition();
            int sel_sistema = spiner_sistema.getSelectedItemPosition();
            int sel_color = spiner_color.getSelectedItemPosition();
            double precio_sele = Double.parseDouble(precio.getText().toString());
            double capacidad_Sele = Double.parseDouble(capacidad.getText().toString());
            Celular c = new Celular(precio_sele, capacidad_Sele, sel_marca, sel_color, sel_sistema);
            c.Guardar();
            Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
        }
    }
}