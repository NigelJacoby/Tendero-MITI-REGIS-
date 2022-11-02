package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class rt_frgcrearpuntoventa extends Fragment {
    Button rt_cpvbtnubicacion;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_rt_frgcrearpuntoventa, container, false);

        rt_cpvbtnubicacion=vista.findViewById(R.id.rt_cpvbtnubicacion);



        rt_cpvbtnubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_crearpuntoventa_to_nav_ubicacion);
            }
        });

        return vista;
    }

}