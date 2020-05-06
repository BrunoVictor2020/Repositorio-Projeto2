package com.example.listagemdedados.adapter;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listagemdedados.ListaDeAssuntos;
import com.example.listagemdedados.R;
import com.example.listagemdedados.model.Lista;

import java.util.List;

public class ListaAdapter extends BaseAdapter{

    List<Lista> listaDeAssuntos;
    Context context;

    public ListaAdapter(List<Lista> listaDeAssuntos, Context context) {
        this.listaDeAssuntos = listaDeAssuntos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaDeAssuntos.size();
    }

    @Override
    public ListaDeAssuntos getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.layout_lista,parent,false);
        TextView txtAssunto = view.findViewById(R.id.textAssunto);
        ImageView imageAssunto = view.findViewById(R.id.imageAssunto);
        Lista lista= listaDeAssuntos.get(position);
        txtAssunto.setText(lista.getDescricao());
        imageAssunto.setImageResource(lista.getUrlFoto());




        return view;
    }
}
