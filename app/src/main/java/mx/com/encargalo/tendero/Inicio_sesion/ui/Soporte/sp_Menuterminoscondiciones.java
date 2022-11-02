package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import mx.com.encargalo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sp_Menuterminoscondiciones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sp_Menuterminoscondiciones extends Fragment implements View.OnClickListener {

    Button btnTermsConsUso, btnPolitPrivacidad, btnProducProhibidos;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_Menuterminoscondiciones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sp_frg04.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_Menuterminoscondiciones newInstance(String param1, String param2) {
        sp_Menuterminoscondiciones fragment = new sp_Menuterminoscondiciones();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sp_menuterminoscondiciones, container, false);

        btnTermsConsUso = view.findViewById(R.id.btn_so_04_terminos_condiciones);
        btnPolitPrivacidad = view.findViewById(R.id.btn_so_04_politica_privacidad);
        btnProducProhibidos = view.findViewById(R.id.btn_so_04_produc_prohibidos);

        btnTermsConsUso.setOnClickListener(this);
        btnPolitPrivacidad.setOnClickListener(this);
        btnProducProhibidos.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        switch (v.getId()){
            case R.id.btn_so_04_terminos_condiciones:{
                bundle.putString("tipo", "terminos_condiciones");
                sp_Terminoscondicionesdetalles dialogoDetalle = new sp_Terminoscondicionesdetalles();
                dialogoDetalle.setArguments(bundle);
                dialogoDetalle.show(getActivity().getSupportFragmentManager(), "terminos_condiciones");
                break;
            }
            case R.id.btn_so_04_politica_privacidad:{
                bundle.putString("tipo", "politica_privacidad");
                sp_Terminoscondicionesdetalles dialogoDetalle = new sp_Terminoscondicionesdetalles();
                dialogoDetalle.show(getActivity().getSupportFragmentManager(), "politica_privacidad");
                dialogoDetalle.setArguments(bundle);
                break;
            }
            case R.id.btn_so_04_produc_prohibidos:{
                bundle.putString("tipo", "productos_prohibidos");
                sp_Terminoscondicionesdetalles dialogoDetalle = new sp_Terminoscondicionesdetalles();
                dialogoDetalle.show(getActivity().getSupportFragmentManager(), "productos_prohibidos");
                dialogoDetalle.setArguments(bundle);
                break;
            }
        }
    }
}