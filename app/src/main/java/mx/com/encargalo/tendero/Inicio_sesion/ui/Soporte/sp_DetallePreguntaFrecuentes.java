package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Adapters.sp_AdapterPreguntasFrecuentes;
import mx.com.encargalo.tendero.Inicio_sesion.Entidades.sp_EntidadPreguntasFrecuentes;

public class sp_DetallePreguntaFrecuentes extends Fragment {

    RecyclerView rclvprefrec;
    ArrayList<sp_EntidadPreguntasFrecuentes> listapregfrec;
    ProgressDialog progress;
    RequestQueue request;
    JsonObjectRequest jsonObjectRequest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sp__detalle_pregunta_frecuentes, container, false);
        listapregfrec=new ArrayList<>();
        rclvprefrec = view.findViewById(R.id.rclv_detallepregfrec);

        rclvprefrec.setLayoutManager(new LinearLayoutManager(this.getContext()));
        rclvprefrec.setHasFixedSize(true);
        request = Volley.newRequestQueue(getContext());

        Mostrarlistapreguntafrecuentes();
        return view;
    }

    private void Mostrarlistapreguntafrecuentes() {

        progress= new ProgressDialog(getContext());
        progress.setMessage("Consulta datos");
        progress.show();
        String url= "http://192.168.0.6/ApisPT2/c_ConsultarPregFrecuente.php";
        url=url.replace(" ","%20");
        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                sp_EntidadPreguntasFrecuentes miusuario=null;
                JSONArray json=response.optJSONArray("preguntafrec");

                try{
                    listapregfrec.clear();
                    for(int i=0; i<json.length();i++){
                        miusuario=new sp_EntidadPreguntasFrecuentes();
                        JSONObject jsonObject=null;
                        jsonObject=json.getJSONObject(i);
                        miusuario.setPregunta(jsonObject.optString("prfrPregunta"));
                        miusuario.setRespuesta(jsonObject.optString("prfrRespuesta"));
                        miusuario.setURL_video(jsonObject.optString("prfrURLVideo"));
                        miusuario.setURL_img(jsonObject.optString("prfrImagen"));
                        listapregfrec.add(miusuario);
                    }
                    progress.hide();
                    sp_AdapterPreguntasFrecuentes adapterpregfre=new sp_AdapterPreguntasFrecuentes(listapregfrec);
                    rclvprefrec.setAdapter(adapterpregfre);
                }catch (JSONException e){
                    e.printStackTrace();
                    progress.hide();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Error al consultar"+ error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        request.add(jsonObjectRequest);
    }
}