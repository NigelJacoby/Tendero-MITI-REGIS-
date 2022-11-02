package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import mx.com.encargalo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sp_menucentroayuda#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sp_menucentroayuda extends Fragment {

    Button btnvideodemo,btnprefre;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_menucentroayuda() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sp_frg02_1.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_menucentroayuda newInstance(String param1, String param2) {
        sp_menucentroayuda fragment = new sp_menucentroayuda();
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
        View view= inflater.inflate(R.layout.fragment_sp_menucentroayuda, container, false);
        btnvideodemo=view.findViewById(R.id.btn_so_02_VideosDem);
        btnprefre=view.findViewById(R.id.btn_so_02_PregFrecuentes);

        btnvideodemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_detallevideodemo);
            }
        });

        btnprefre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_detallepregfre);
            }
        });

        return view;
    }
}