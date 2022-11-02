package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class ap_frgmenuaprendizaje extends Fragment {
    Button ap_mabtncategoria;
    Button ap_mabtneventos;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_ap_frgmenuaprendizaje, container, false);
        ap_mabtncategoria=vista.findViewById(R.id.ap_mabtncategoria);
        ap_mabtncategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_categoriaaprendizaje);
            }
        });
        ap_mabtneventos=vista.findViewById(R.id.ap_mabtneventos);
        ap_mabtneventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_eventosenvivo);
            }
        });
        return vista;
    }
}