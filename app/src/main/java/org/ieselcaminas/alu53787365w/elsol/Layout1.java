package org.ieselcaminas.alu53787365w.elsol;


import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Layout1 extends AppCompatActivity {
    ArrayList <Imagen> imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        Toolbar toolbar = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "angrybirdregular.ttf"));

        imagen = new ArrayList<Imagen>();
        imagen.add(new Imagen(R.drawable.corona_solar, "corona"));
        imagen.add(new Imagen(R.drawable.erupcionsolar, "erupcion"));
        imagen.add(new Imagen(R.drawable.espiculas, "espicula"));
        imagen.add(new Imagen(R.drawable.filamentos, "fragmentos"));
        imagen.add(new Imagen(R.drawable.magnetosfera, "magnetosfera"));
        imagen.add(new Imagen(R.drawable.manchasolar, "mancha"));

        AdaptadorTitulares adapter = new AdaptadorTitulares(this, imagen);
        GridView grid = (GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        ;
        final String[] datos =
                new String[]{"renombrar", "copiar", "cortar", "eliminar"};

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        Spinner cmbOpciones = (Spinner)findViewById(R.id.opciones);

        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);


    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_buscar:
                return true;
            case R.id.action_add:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
