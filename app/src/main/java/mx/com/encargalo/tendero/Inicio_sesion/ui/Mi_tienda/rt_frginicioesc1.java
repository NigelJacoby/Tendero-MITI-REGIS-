package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class rt_frginicioesc1 extends Fragment {

    Button rt_ie1btnpuntoventa;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View vista = inflater.inflate(R.layout.fragment_rt_frginicioesc1, container, false);
        rt_ie1btnpuntoventa=vista.findViewById(R.id.rt_ie1btnpuntoventa);
        rt_ie1btnpuntoventa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_inicioesc1_to_nav_categoriatienda);
            }
        });
        return vista;
        //actualizando cambios obed
    }


}

