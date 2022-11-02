package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class mit_frgMenuProductos extends Fragment {

    Button btn_tn02_rgstprdct, btn_tn02ctgr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_mit_frgmenuproductos, container, false);

        btn_tn02_rgstprdct = view.findViewById(R.id.btn_tn02_rgstprdct);
        btn_tn02ctgr = view.findViewById(R.id.btn_tn02ctgr);

        btn_tn02_rgstprdct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menuproductos_to_nav_registrarproducto);
            }
        });

        btn_tn02ctgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menuproductos_to_nav_reporteproductos);
            }
        });



        return view;
    }
}