package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class pub_frgpagaranuncio extends Fragment {
    Button pub_pabtnpagoefectivo;
    Button pub_pabtncancelarpago;
    Button pub_pabtnpagaranuncio;
    View auxview;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frgpagaranuncio, container, false);
        pub_pabtnpagoefectivo=vista.findViewById(R.id.pub_pabtnpagoefectivo);
        pub_pabtncancelarpago=vista.findViewById(R.id.pub_pabtncancelarpago);
        pub_pabtnpagaranuncio=vista.findViewById(R.id.pub_pabtnpagaranuncio);
        pub_pabtncancelarpago.setVisibility(View.INVISIBLE);
        pub_pabtnpagaranuncio.setVisibility(View.INVISIBLE);
        pub_pabtnpagoefectivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pub_pabtncancelarpago.setVisibility(View.VISIBLE);
                pub_pabtnpagaranuncio.setVisibility(View.VISIBLE);

            }
        });
        pub_pabtnpagaranuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auxview = view;
                showDialogoPagar();
            }
        });
        pub_pabtncancelarpago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auxview = view;
                showDialogoCancelar();
            }
        });

        return vista;
    }

    private void  showDialogoPagar(){
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.pub_lytmodelpagaranuncio);
        dialog.show();
        Button btnpagar = dialog.findViewById(R.id.pub_mpabtnaceptar);
        Button btncancelar = dialog.findViewById(R.id.pub_mpabtncancelar);
        btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(auxview).navigate(R.id.nav_codigopago);
                dialog.dismiss();
            }
        });
        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    private void  showDialogoCancelar(){
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.pub_lytmodelcancelaranuncio);
        dialog.show();
        Button btnpagar = dialog.findViewById(R.id.pub_mcabtnaceptar);
        Button btncancelar = dialog.findViewById(R.id.pub_mcabtncancelar);
        btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(auxview).navigate(R.id.nav_crearanuncio);
                dialog.dismiss();
            }
        });
        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }
}