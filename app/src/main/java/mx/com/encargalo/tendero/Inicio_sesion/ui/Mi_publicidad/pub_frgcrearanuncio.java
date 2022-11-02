package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

public class pub_frgcrearanuncio extends Fragment {
    Button pub_cabtncontinuar;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_pub_frgcrearanuncio, container, false);
        pub_cabtncontinuar=vista.findViewById(R.id.pub_cabtncontinuar);
        pub_cabtncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.nav_pagaranuncios);
            }
        });
        return vista;
    }
}