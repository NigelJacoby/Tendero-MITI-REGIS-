package mx.com.encargalo.tendero.Inicio_sesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import mx.com.encargalo.R;

public class activity_is_actverificacioncodigo extends AppCompatActivity {
    Button btnvalidar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_actverificacioncodigo);
btnvalidar=(Button)findViewById(R.id.is_vcbtncontinuar);
//VALIDAR Y ENVIAR A MIS ORDENES PRINCIPAL
btnvalidar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent verif = new Intent(activity_is_actverificacioncodigo.this, MainActivity.class);
        startActivity(verif);
    }
});

    }
}

