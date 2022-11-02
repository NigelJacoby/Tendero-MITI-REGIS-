package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgultimos;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.LastFavoritos;

public class ap_frgcategoriaaprendizaje extends Fragment {
    Button ap_cabtnvermas;
    Button ap_cabtncursosvender;
    Button ap_cabtncursosautoaprendizaje;
    Button ap_cabtncursosoperiones;

    ap_adplistadofrgultimos adpultimos;
    RecyclerView recyclerViewUltimos;
    ArrayList<LastFavoritos> listaUltimos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgcategoriaaprendizaje, container, false);

        //Recycler

        recyclerViewUltimos=vista.findViewById(R.id.ap_carclvcursosfavrecientes);
        listaUltimos = new ArrayList<>();

        cargaLista();

        mostrarData();


        ap_cabtnvermas=vista.findViewById(R.id.ap_cabtnvermas);
        ap_cabtnvermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misfavoritos);
            }
        });
        ap_cabtncursosvender=vista.findViewById(R.id.ap_cabtncursosvender);
        ap_cabtncursosvender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        ap_cabtncursosautoaprendizaje=vista.findViewById(R.id.ap_cabtncursosautoaprendizaje);
        ap_cabtncursosautoaprendizaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        ap_cabtncursosoperiones=vista.findViewById(R.id.ap_cabtncursosoperiones);
        ap_cabtncursosoperiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_cursoscategoria);
            }
        });
        return vista;
    }

    private void cargaLista() {
        listaUltimos.add(new LastFavoritos("Favorito 1"));
        listaUltimos.add(new LastFavoritos("Favorito 2"));
        listaUltimos.add(new LastFavoritos("Favorito 3"));
    }

    private void mostrarData() {
        recyclerViewUltimos.setLayoutManager(new LinearLayoutManager(getContext()));
        adpultimos = new ap_adplistadofrgultimos(getContext(),listaUltimos);
        recyclerViewUltimos.setAdapter(adpultimos);

        adpultimos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = listaUltimos.get(recyclerViewUltimos.getChildAdapterPosition(view)).getTitulo();
                Toast.makeText(getContext(), "Seleccionó: " + titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}