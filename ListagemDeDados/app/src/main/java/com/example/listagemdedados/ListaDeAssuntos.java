package com.example.listagemdedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listagemdedados.adapter.ListaAdapter;
import com.example.listagemdedados.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAssuntos extends AppCompatActivity {

    ListView listaAssuntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_assuntos);
        listaAssuntos=findViewById(R.id.listAssuntos);
        List<Lista> lista= new ArrayList<Lista>();
        lista.add(new Lista("Corrente elétrica",R.drawable.corrente_eletrica));
        lista.add(new Lista("Resistores",R.drawable.resistores));
        lista.add(new Lista("Baterias",R.drawable.baterias));
        lista.add(new Lista("Capacitores",R.drawable.capacitores));
        ListaAdapter adapter = new ListaAdapter(lista, this);
        listaAssuntos.setAdapter(adapter);
    }
}
