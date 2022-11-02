package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;


public class sp_frgmenusoporte extends Fragment {

    Button btnconfNotificaciones,btncentroayuda,btnTerminosyCondiciones,btncompartir, btnacercade;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sp_frgmenusoporte, container, false);
        btnconfNotificaciones=view.findViewById(R.id.btn_Notificaciones);
        btncentroayuda=view.findViewById(R.id.btn_centroayuda);
        btnTerminosyCondiciones=view.findViewById(R.id.btn_terminois_condiciones);
        btncompartir=view.findViewById(R.id.btn_compartir);
        btnacercade=view.findViewById(R.id.btn_acerca_de);


        btnconfNotificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_configuracionnotificaiones);

            }
        });

        btncentroayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_centroayuda);
            }
        });
        btnTerminosyCondiciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_terminosYcondiciones);
            }
        });

        btncompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Descarga la aplicacion URL");
                startActivity(Intent.createChooser(intent,"Compartir App con"));

            }
        });

        btnacercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_acercade);
            }
        });


        return view;
    }
}