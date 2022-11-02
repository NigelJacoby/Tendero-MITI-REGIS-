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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.Curso;

public class ap_adplistadofrgcategoria extends RecyclerView.Adapter<ap_adplistadofrgcategoria.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<Curso> model;

    private View.OnClickListener listener;

    public ap_adplistadofrgcategoria(Context context, ArrayList<Curso>model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ap_ccitemcardcurso, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ap_adplistadofrgcategoria.ViewHolder holder, int position) {
        String ap_varlocnombrecurso = model.get(position).getAp_varstrnombrecurso();
        holder.ap_varlocnombrecurso.setText(ap_varlocnombrecurso);
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
        TextView ap_varlocnombrecurso;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            ap_varlocnombrecurso = itemView.findViewById(R.id.ap_cctxtnombrecurso);
        }
    }
}
