package mx.com.encargalo.tendero.Inicio_sesion.ui.Mis_ordenes;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import mx.com.encargalo.R;

public class mio_frgdetalleproducto extends Fragment {
    Button dpbtncancelarorden;
    Dialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_mio_frgdetalleproducto, container, false);
//        dpbtncancelarorden = vista.findViewById(R.id.mio_dpbtncancelarorden);
//        dpbtncancelarorden.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popupMenu = new PopupMenu(getContext(),dpbtncancelarorden);
//                popupMenu.getMenuInflater().inflate(R.menu.mio_lytcancelarorden,popupMenu.getMenu());
//            }
//        });

        return vista;
    }
}