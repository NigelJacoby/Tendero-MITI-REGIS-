package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class rt_frgcrearpuntoventaesc2 extends Fragment {


    Button rt_cpvebtncontinuar, rt_cpvebtncambiarubicacion;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_rt_frgcrearpuntoventaesc2, container, false);

        rt_cpvebtncambiarubicacion=vista.findViewById(R.id.rt_cpvebtncambiarubicacion);
        rt_cpvebtncontinuar=vista.findViewById(R.id.rt_cpvebtncontinuar);

        rt_cpvebtncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_rt_crearpuntoventaesc2_to_nav_puntoventacreado);
            }
        });

        rt_cpvebtncambiarubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_rt_crearpuntoventaesc2_to_nav_ubicacion);
            }
        });

        return vista;
    }
}