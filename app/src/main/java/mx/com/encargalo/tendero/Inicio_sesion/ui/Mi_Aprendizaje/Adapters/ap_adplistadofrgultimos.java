package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.LastFavoritos;

public class ap_adplistadofrgultimos extends RecyclerView.Adapter<ap_adplistadofrgultimos.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<LastFavoritos> model;

    private View.OnClickListener listener;

    public ap_adplistadofrgultimos(Context context, ArrayList<LastFavoritos> model){
        this.inflater=LayoutInflater.from(context);
        this.model=model;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ap_mfitemcardultimos, parent, false);
        view.setOnClickListener(this);
        return new ap_adplistadofrgultimos.ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ap_adplistadofrgultimos.ViewHolder holder, int position) {
        String titulo = model.get(position).getTitulo();
        holder.titulo.setText(titulo);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.ap_catxtnombrecurso);
        }
    }
}
