package org.ieselcaminas.alu53787365w.elsol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alu53787365w on 18/11/16.
 */

class AdaptadorTitulares extends ArrayAdapter<Imagen> {

    public AdaptadorTitulares(Context context, ArrayList<Imagen> datos) {
        super(context, R.layout.layout1, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View item = convertView;
        ViewHolder holder;

        if(item == null)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            item = inflater.inflate(R.layout.list_item_layout1, null);

            holder = new ViewHolder();
            holder.imagen = (ImageView)item.findViewById(R.id.imagen);
            holder.titulo = (TextView)item.findViewById(R.id.titulo);
            holder.spin = (Spinner)item.findViewById(R.id.opciones);
            //holder.imagen.setLayoutParams(new GridView.LayoutParams(375, 384)); //ancho y alto
            //holder.imagen.setScaleType(ImageView.ScaleType.CENTER_CROP);

            item.setTag(holder);
        }
        else
        {
            holder = (ViewHolder)item.getTag();
        }

        final Imagen imagen = getItem(position);;
        holder.titulo.setText(imagen.getTitulo());
        holder.imagen.setImageResource(imagen.getImagen());
        /*final String [] datos = new String[]{"renombrar", "copiar", "cortar", "eliminar"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holder.spin.setAdapter(adaptador);*/

        return(item);
    }
}