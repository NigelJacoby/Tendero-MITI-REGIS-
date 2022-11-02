package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class rt_frgpuntoventacreado extends Fragment {

    Button btn_pvcbtnvolverinicio;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_rt_frgpuntoventacreado, container, false);
        btn_pvcbtnvolverinicio=vista.findViewById(R.id.btn_pvcbtnvolverinicio);
        btn_pvcbtnvolverinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_puntoventacreado_to_nav_inicioesc3);
            }
        });
        return vista;
    }
}