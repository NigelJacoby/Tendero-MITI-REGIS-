package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class rt_frgDatosTienda extends Fragment {

    Button btn_rt04ctnr;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_rt_frgdatostienda, container, false);
        btn_rt04ctnr=vista.findViewById(R.id.btn_rt04ctnr);
        btn_rt04ctnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_datostienda_to_nav_menutienda);
            }
        });
        return vista;
    }
}