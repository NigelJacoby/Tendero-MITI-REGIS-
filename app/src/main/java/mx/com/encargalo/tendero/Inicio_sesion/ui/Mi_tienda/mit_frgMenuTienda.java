package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class mit_frgMenuTienda extends Fragment {

    Button rt_EdtDtsbtnEdtDts, rt_CmbrtndbtnCmbrtn, rt_AgrgtndbtnAgrgtnd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_mit_frgmenutienda, container, false);

        rt_EdtDtsbtnEdtDts = view.findViewById(R.id.rt_EdtDtsbtnEdtDts);
        rt_CmbrtndbtnCmbrtn = view.findViewById(R.id.rt_CmbrtndbtnCmbrtn);
        rt_AgrgtndbtnAgrgtnd = view.findViewById(R.id.rt_AgrgtndbtnAgrgtnd);

        rt_EdtDtsbtnEdtDts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menutienda_to_nav_datostienda);
            }
        });

        rt_CmbrtndbtnCmbrtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menutienda_to_nav_inicioesc3);
            }
        });

        rt_AgrgtndbtnAgrgtnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menutienda_to_nav_categoriatienda);
            }
        });

        return view;
    }
}