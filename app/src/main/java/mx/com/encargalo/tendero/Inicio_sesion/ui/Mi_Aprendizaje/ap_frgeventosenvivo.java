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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters.ap_adplistadofrgeventosenvivo;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.EventoEnVivo;

public class ap_frgeventosenvivo extends Fragment {

    ap_adplistadofrgeventosenvivo adpeventosenvivo;
    RecyclerView recyclerViewEvento;
    ArrayList<EventoEnVivo> listaEventoEnVivo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgeventosenvivo, container, false);
        recyclerViewEvento=vista.findViewById(R.id.ap_eevrclveventos);
        listaEventoEnVivo = new ArrayList<>();

        cargaLista();

        mostrarData();

        return vista;
    }

    private void cargaLista() {
        listaEventoEnVivo.add(new EventoEnVivo("Conoce sobre el programa Ventas top","5 sept 2022 07:00 p.m. Lima"));
        listaEventoEnVivo.add(new EventoEnVivo("Conoce sobre el programa Ventas top","5 sept 2022 07:00 p.m. Lima"));
    }

    private void mostrarData() {
        recyclerViewEvento.setLayoutManager(new LinearLayoutManager(getContext()));
        adpeventosenvivo = new ap_adplistadofrgeventosenvivo(getContext(),listaEventoEnVivo);
        recyclerViewEvento.setAdapter(adpeventosenvivo);

        adpeventosenvivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String charla = listaEventoEnVivo.get(recyclerViewEvento.getChildAdapterPosition(view)).getCharla();
                Toast.makeText(getContext(), "Seleccionó: " + charla, Toast.LENGTH_SHORT).show();
            }
        });
    }
}