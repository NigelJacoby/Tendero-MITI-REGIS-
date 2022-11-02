package mx.com.encargalo.tendero.Inicio_sesion.ui.Mis_ordenes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class mio_frgmisordenesprincipal extends Fragment {
    TextView txtdetalle, txtchat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_mio_frgmisordenesprincipal, container, false);
        txtdetalle= vista.findViewById(R.id.mio_moptxtdetalle);
        txtdetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misordenesdetallepedido);
            }
        });
        txtchat=vista.findViewById(R.id.mio_moptxtchat);
        txtchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_misordenesconversacion);
            }
        });
        return vista;
    }
}