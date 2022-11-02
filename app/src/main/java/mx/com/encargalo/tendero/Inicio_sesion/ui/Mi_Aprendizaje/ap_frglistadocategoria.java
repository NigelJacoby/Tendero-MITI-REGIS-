package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgcategoria;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Curso;

public class ap_frglistadocategoria extends Fragment {

    ap_adplistadofrgcategoria adpcategoria;
    RecyclerView recyclerViewCategoria;
    ArrayList<Curso> listaCategoria;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frglistadocategoria, container, false);
        recyclerViewCategoria = vista.findViewById(R.id.ap_ccrclvlistadocurso);
        listaCategoria = new ArrayList<>();

        cargaLista();

        mostrarData();

        return vista;
    }

    private void cargaLista() {
        listaCategoria.add(new Curso("Estrategias de ventas web"));
        listaCategoria.add(new Curso("Manejo de clientes dificiles"));
        listaCategoria.add(new Curso("20 formas de vender y no morir en el intento"));
    }

    private void mostrarData() {
        recyclerViewCategoria.setLayoutManager(new LinearLayoutManager(getContext()));
        adpcategoria = new ap_adplistadofrgcategoria(getContext(), listaCategoria);
        recyclerViewCategoria.setAdapter(adpcategoria);

        adpcategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ap_varlocnombrecurso = listaCategoria.get(recyclerViewCategoria.getChildAdapterPosition(view)).getAp_varstrnombrecurso();
                Toast.makeText(getContext(), "Seleccionó: " + ap_varlocnombrecurso, Toast.LENGTH_SHORT).show();
            }
        });
    }
}