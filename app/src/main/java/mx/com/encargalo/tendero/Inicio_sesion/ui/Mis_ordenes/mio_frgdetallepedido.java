package mx.com.encargalo.tendero.Inicio_sesion.ui.Mis_ordenes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class mio_frgdetallepedido extends Fragment {
    Button dpbtndetalle,dpbtnchat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_mio_frgdetallepedido, container, false);
        dpbtndetalle= vista.findViewById(R.id.mio_dpbtndetalle);
        dpbtndetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misordenesdetalleproducto);
            }
        });
        dpbtnchat=vista.findViewById(R.id.mio_dpbtnchat);
        dpbtnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misordenesconversacion);
            }
        });

        return vista;
    }
}