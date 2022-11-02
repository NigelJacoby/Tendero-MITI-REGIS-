package mx.com.encargalo.tendero.Inicio_sesion.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Entidades.sp_EntidadPreguntasFrecuentes;

public class sp_AdapterPreguntasFrecuentes extends RecyclerView.Adapter<sp_AdapterPreguntasFrecuentes.PreguntasFrecuentesHolder> {

    List<sp_EntidadPreguntasFrecuentes> listapregfrec;
    public sp_AdapterPreguntasFrecuentes(List<sp_EntidadPreguntasFrecuentes> listaIndicadores){
        this.listapregfrec = listaIndicadores;
    }
    @NonNull
    @Override
    public sp_AdapterPreguntasFrecuentes.PreguntasFrecuentesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.sp_itempreguntasfrecuentes,parent,false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new sp_AdapterPreguntasFrecuentes.PreguntasFrecuentesHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull sp_AdapterPreguntasFrecuentes.PreguntasFrecuentesHolder holder, int position) {
        holder.txt_so_02_pregunta.setText(String.valueOf(listapregfrec.get(position).getPregunta()));
        holder.txt_so_02_respuesta.setText(String.valueOf(listapregfrec.get(position).getRespuesta()));
        holder.txt_so_02_urlvideo.setText(String.valueOf(listapregfrec.get(position).getURL_video()));
        holder.txt_so_02_urlimg.setText(String.valueOf(listapregfrec.get(position).getURL_img()));
    }

    @Override
    public int getItemCount() {
        return  listapregfrec.size();
    }

    public class PreguntasFrecuentesHolder extends RecyclerView.ViewHolder {
        TextView txt_so_02_pregunta, txt_so_02_respuesta, txt_so_02_urlvideo,txt_so_02_urlimg;

        public PreguntasFrecuentesHolder(@NonNull View itemView) {
            super(itemView);
            txt_so_02_pregunta=itemView.findViewById(R.id.txt_so_02_pregunta);
            txt_so_02_respuesta=itemView.findViewById(R.id.txt_so_02_respuesta);
            txt_so_02_urlvideo=itemView.findViewById(R.id.txt_so_02_urlvideo);
            txt_so_02_urlimg=itemView.findViewById(R.id.txt_so_02_urlimg);
        }
    }
}
