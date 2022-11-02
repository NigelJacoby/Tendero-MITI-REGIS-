package mx.com.encargalo.tendero.Inicio_sesion.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Entidades.sp_Entidadvideodemo;

public class sp_Adaptervideodemo extends RecyclerView.Adapter<sp_Adaptervideodemo.VideosDemotrativoHolder> {
    List<sp_Entidadvideodemo> listavideodemo;

    public sp_Adaptervideodemo(List<sp_Entidadvideodemo> listavideodemo){
        this.listavideodemo = listavideodemo;
    }

    @NonNull
    @Override
    public VideosDemotrativoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.sp_itemdetallevideosdemo,parent,false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new sp_Adaptervideodemo.VideosDemotrativoHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull VideosDemotrativoHolder holder, int position) {
        holder.txttitulovideodemo.setText(String.valueOf(listavideodemo.get(position).getVideotitulo()));
        holder.txtdescripvideodemo.setText(String.valueOf(listavideodemo.get(position).getVideodescri()));
        holder.txturlvideodemo.setText(String.valueOf(listavideodemo.get(position).getVideoURL()));

    }

    @Override
    public int getItemCount() {
        return listavideodemo.size();
    }

    public class VideosDemotrativoHolder extends RecyclerView.ViewHolder {
        TextView txttitulovideodemo, txtdescripvideodemo, txturlvideodemo;

        public VideosDemotrativoHolder(@NonNull View itemView) {
            super(itemView);
            txttitulovideodemo=itemView.findViewById(R.id.txt_titulovideodemo);
            txtdescripvideodemo=itemView.findViewById(R.id.txt_descvideodemo);
            txturlvideodemo=itemView.findViewById(R.id.txt_urlvideodemo);
        }
    }
}
