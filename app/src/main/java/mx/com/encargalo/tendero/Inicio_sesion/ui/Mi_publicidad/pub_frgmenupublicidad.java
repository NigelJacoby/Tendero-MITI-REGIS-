package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class pub_frgmenupublicidad extends Fragment {
    Button pub_mpbtncrearanuncio;
    Button pub_mpbtnmisanuncios;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frgmenupublicidad, container, false);
        pub_mpbtncrearanuncio=vista.findViewById(R.id.pub_mpbtncrearanuncio);
        pub_mpbtncrearanuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_crearanuncio);
            }
        });
        pub_mpbtnmisanuncios=vista.findViewById(R.id.pub_mpbtnmisanuncios);
        pub_mpbtnmisanuncios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_listadomisanuncios);
            }
        });
        return vista;
    }
}