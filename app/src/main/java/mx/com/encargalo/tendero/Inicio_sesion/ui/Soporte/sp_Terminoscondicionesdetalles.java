package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Entidades.sp_Entidadtermsconsuso;


public class sp_Terminoscondicionesdetalles extends DialogFragment{

    Button btnCerrarTermsConsDetalle;
    Activity actividad;

    ProgressDialog progress;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    TextView txtDetalleTitulo, txtDetalleContenido;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_Terminoscondicionesdetalles() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment so_Terminoscondicionesdetalles.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_Terminoscondicionesdetalles newInstance(String param1, String param2) {
        sp_Terminoscondicionesdetalles fragment = new sp_Terminoscondicionesdetalles();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_so__terminoscondicionesdetalles, container, false);
//    }

    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return crearDialogoTermsConsDetalle();
        //super.onCreateDialog(savedInstanceState);
    }

    private AlertDialog crearDialogoTermsConsDetalle() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.fragment_sp__terminoscondicionesdetalles, null);
        builder.setView(v);

        btnCerrarTermsConsDetalle = v.findViewById(R.id.btnCerrarTermsConsDetalle);
        txtDetalleTitulo = v.findViewById(R.id.txt_so_04_detalle_titulo);
        txtDetalleContenido = v.findViewById(R.id.txt_so_04_detalle_contenido);

        btnCerrarTermsConsDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        request= Volley.newRequestQueue(getContext());
        mostrarTermsConsDetalle();

        return builder.create();
    }

    private void mostrarTermsConsDetalle() {
        Bundle tipo = getArguments();
        String jsonArrayName = "";

        String tipoDetalle = tipo.getString("tipo");
        String url = null;
        progress= new ProgressDialog(getContext());
        progress.setMessage("Detalles");
        progress.show();
        switch (tipoDetalle){
            case "terminos_condiciones":{
                url= "http://192.168.0.6/ApisPT2/c_ConsultarTermsCondicionesUso.php";
                jsonArrayName = "termscondicionesuso";
                break;
            }
            case "politica_privacidad":{
                url= "http://192.168.0.6/ApisPT2/c_ConsultarPoliticasPrivacidad.php";
                jsonArrayName = "politicasprivacidad";
                break;
            }
            case "productos_prohibidos":{
                url= "http://192.168.0.6/ApisPT2/c_ConsultarProducProhibido.php";
                jsonArrayName = "producprohibido";
                break;
            }
        }

        url = url.replace(" ","%20");

        final String finalJsonArrayName = jsonArrayName;
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                sp_Entidadtermsconsuso detalles = null;
                JSONArray json=response.optJSONArray(finalJsonArrayName);

                try {
                    detalles = new sp_Entidadtermsconsuso();
                    JSONObject jsonObject = null;
                    jsonObject=json.getJSONObject(0);

                    detalles.setTermsConsUsoTitulo(jsonObject.optString("tecoTitulo"));
                    detalles.setTermsConsUsoContenido(jsonObject.optString("tecoContenido"));
                    progress.hide();
                    txtDetalleTitulo.setText(detalles.getTermsConsUsoTitulo());
                    txtDetalleContenido.setText(detalles.getTermsConsUsoContenido());
                } catch (JSONException e) {
                    e.printStackTrace();
                    progress.hide();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.toString());
                Toast.makeText(getContext(), "Error al consultar"+ error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        request.add(jsonObjectRequest);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity){
            this.actividad = (Activity) context;
        }else{
            throw new RuntimeException(context.toString() + "Debe implementar OnFragmentInteractionListener");
        }
    }
}