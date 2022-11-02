package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class rt_frgCategoriaTienda extends Fragment {

    Button rt_ctbtncontinuar;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_rt_frgcategoriatienda, container, false);
        rt_ctbtncontinuar=vista.findViewById(R.id.rt_ctbtncontinuar);
        rt_ctbtncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_categoriatienda_to_nav_crearpuntoventa);
            }
        });
        return vista;
    }


}