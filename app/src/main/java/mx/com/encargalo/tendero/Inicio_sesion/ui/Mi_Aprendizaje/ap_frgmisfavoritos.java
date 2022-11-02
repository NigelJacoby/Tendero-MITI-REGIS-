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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgmisfavoritos;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Favorito;

public class ap_frgmisfavoritos extends Fragment {

    ap_adplistadofrgmisfavoritos adpfavoritos;
    RecyclerView recyclerViewFavoritos;
    ArrayList<Favorito> listaFavoritos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgmisfavoritos, container, false);
        recyclerViewFavoritos = vista.findViewById(R.id.ap_mfrclvmisfavoritos);
        listaFavoritos = new ArrayList<>();

        cargarLista();

        mostrarData();

        return vista;
    }

    private void cargarLista() {
        listaFavoritos.add(new Favorito("Favorito 1"));
        listaFavoritos.add(new Favorito("Favorito 2"));
        listaFavoritos.add(new Favorito("Favorito 3"));
    }

    private void mostrarData() {
        recyclerViewFavoritos.setLayoutManager(new LinearLayoutManager(getContext()));
        adpfavoritos = new ap_adplistadofrgmisfavoritos(getContext(),listaFavoritos);
        recyclerViewFavoritos.setAdapter(adpfavoritos);

        adpfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = listaFavoritos.get(recyclerViewFavoritos.getChildAdapterPosition(view)).getTitulo();
                Toast.makeText(getContext(), "Seleccionó: " + titulo, Toast.LENGTH_SHORT).show();
            }
        });
    }
}