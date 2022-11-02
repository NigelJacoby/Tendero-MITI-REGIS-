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
import mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades.EventoEnVivo;

public class ap_adplistadofrgeventosenvivo extends RecyclerView.Adapter<ap_adplistadofrgeventosenvivo.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    ArrayList<EventoEnVivo> model;

    private View.OnClickListener listener;

    public ap_adplistadofrgeventosenvivo(Context context, ArrayList<EventoEnVivo> model){
        this.inflater=LayoutInflater.from(context);
        this.model=model;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ap_eevitemcardevento, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ap_adplistadofrgeventosenvivo.ViewHolder holder, int position) {
        String charla = model.get(position).getCharla();
        String fecha = model.get(position).getFecha();
        holder.charla.setText(charla);
        holder.fecha.setText(fecha);

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
        TextView charla,fecha;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            charla = itemView.findViewById(R.id.ap_eevtxtnombreevento);
            fecha = itemView.findViewById(R.id.ap_eevtxtfechahora);
        }
    }
}
