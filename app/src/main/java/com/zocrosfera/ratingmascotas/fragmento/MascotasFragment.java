package com.zocrosfera.ratingmascotas.fragmento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zocrosfera.ratingmascotas.R;
import com.zocrosfera.ratingmascotas.adaptador.MascotasAdaptador;
import com.zocrosfera.ratingmascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by rafaelocrin on 21/11/16.
 */

public class MascotasFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaContactos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);

        listaContactos = (RecyclerView)v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);
        inicializarListaContatos();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas, getActivity());
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContatos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Zion", "3", R.drawable.dog));
        mascotas.add(new Mascota("Zorrito", "5", R.drawable.foxy));
        mascotas.add(new Mascota("Brown", "4", R.drawable.lion));
        mascotas.add(new Mascota("NinjaX", "2", R.drawable.panda));
        mascotas.add(new Mascota("Pisquila", "5", R.drawable.tucano));
    }
}
