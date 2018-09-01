package jp.restaurantes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context context;
    List<Datos> ListaObjetos;

    public Adaptador(Context context, List<Datos> listaObjetos) {
        this.context = context;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); // retorna la cantidad de objetos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position); // retorna la posicion de un objeto en especifico de la lista
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId(); // retorna el id del obejto en esa posicion
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;

        LayoutInflater inflate = LayoutInflater.from(context);
        vista = inflate.inflate(R.layout.itemlistview,null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);
        TextView titulo = (TextView) vista.findViewById(R.id.textTitulo);
        TextView descripcion = (TextView) vista.findViewById(R.id.textDetalle);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        descripcion.setText(ListaObjetos.get(position).getDetalle().toString());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());

        return  vista;
    }
}
