package org.ieselcaminas.alu53787365w.elsol;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alu53787365w on 18/11/16.
 */
public class Layout2 extends AppCompatActivity {
    TextView nombre, diametro, distancia, densidad;
    TextView nombre2, diametro2, distancia2, densidad2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(toolbar);


        final ArrayList <Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(new Planeta("Mercurio", 0.382, 0.387, 5400));
        planetas.add(new Planeta("Venus", 0.949, 0.723, 5250));
        planetas.add(new Planeta("Tierra", 1, 1, 5520));

        Spinner spin1 = (Spinner)findViewById(R.id.spin1);
        Spinner spin2 = (Spinner)findViewById(R.id.spin2);

        String [] datos = new String[planetas.size()];
        for(int i=0; i<datos.length; i++){
            datos[i] = planetas.get(i).getNombre();
        }
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adaptador);
        spin2.setAdapter(adaptador);

        nombre = (TextView)findViewById(R.id.nombre);
        diametro = (TextView)findViewById(R.id.diametro);
        distancia = (TextView)findViewById(R.id.distancia);
        densidad = (TextView)findViewById(R.id.densidad);
        nombre2 = (TextView)findViewById(R.id.nombre2);
        diametro2 = (TextView)findViewById(R.id.diametro2);
        distancia2 = (TextView)findViewById(R.id.distancia2);
        densidad2 = (TextView)findViewById(R.id.densidad2);
        spin1.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {
                        nombre.setText("Seleccionado: " +
                                parent.getItemAtPosition(position));
                        if(planetas.get(position).getNombre() == parent.getItemAtPosition(position)){
                            diametro.setText("Diametro: " + String.valueOf(planetas.get(position).getDiametro()));
                            distancia.setText("Distancia: " + String.valueOf(planetas.get(position).getDistancia()));
                            densidad.setText("Densidad " + String.valueOf(planetas.get(position).getDensidad()));
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        nombre.setText("");
                    }
                });
        spin2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {
                        nombre2.setText("Seleccionado: " +
                                parent.getItemAtPosition(position));
                        if(planetas.get(position).getNombre() == parent.getItemAtPosition(position)){
                            diametro2.setText("Diametro " + String.valueOf(planetas.get(position).getDiametro()));
                            distancia2.setText("Distancia " + String.valueOf(planetas.get(position).getDistancia()));
                            densidad2.setText("Densidad " + String.valueOf(planetas.get(position).getDensidad()));
                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        nombre.setText("");
                    }
                });
        /*final String[] datos =
                new String[]{"renombrar", "copiar", "cortar", "eliminar"};

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        Spinner cmbOpciones = (Spinner)findViewById(R.id.opciones);

        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        cmbOpciones.setAdapter(adaptador);*/
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