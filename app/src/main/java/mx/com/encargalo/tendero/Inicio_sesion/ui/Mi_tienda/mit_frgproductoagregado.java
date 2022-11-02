package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class mit_frgproductoagregado extends Fragment {

    Button btn_tnhomevlvr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mit_frgproductoagregado, container, false);

        btn_tnhomevlvr = view.findViewById(R.id.btn_tnhomevlvr);

        btn_tnhomevlvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_productoagregado_to_nav_menuproductos);
            }
        });


    return view;
    }
}