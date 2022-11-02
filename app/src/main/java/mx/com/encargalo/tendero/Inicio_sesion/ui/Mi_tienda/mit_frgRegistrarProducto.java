package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_tienda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;



import com.google.android.material.textfield.TextInputEditText;

import mx.com.encargalo.R;

public class mit_frgRegistrarProducto extends Fragment {

    TextInputEditText txtFld_tn03dscrp, txtFld_tn03ctgr;
    Button btn_tn03agrgprdt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_mit_frgregistrarproducto, container, false);

        btn_tn03agrgprdt = view.findViewById(R.id.btn_tn03agrgprdt);
        txtFld_tn03dscrp = view.findViewById(R.id.txtFld_tn03dscrp);
        txtFld_tn03ctgr = view.findViewById(R.id.txtFld_tn03ctgr);

        btn_tn03agrgprdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_registrarproducto_to_nav_productoagregado);
            }
        });
        txtFld_tn03dscrp.setEnabled(false);
        txtFld_tn03ctgr.setEnabled(false);



        return view;
    }
}