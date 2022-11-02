package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class rt_frgubicacion extends Fragment {

    Button rt_ubtnagregarubicacion, rt_ubtncancelar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_rt_frgubicacion, container, false);



        rt_ubtnagregarubicacion = view.findViewById(R.id.rt_ubtnagregarubicacion);
        rt_ubtncancelar = view.findViewById(R.id.rt_ubtncancelar);

        rt_ubtnagregarubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_ubicacion_to_rt_crearpuntoventaesc2);
            }
        });

        rt_ubtncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_ubicacion_to_nav_crearpuntoventa);

            }
        });


        return view;
    }
}