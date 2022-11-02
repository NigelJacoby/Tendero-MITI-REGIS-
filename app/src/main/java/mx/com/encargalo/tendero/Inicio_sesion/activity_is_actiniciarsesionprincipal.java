package mx.com.encargalo.tendero.Inicio_sesion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import mx.com.encargalo.R;

public class activity_is_actiniciarsesionprincipal extends AppCompatActivity {
    Button btniniciarfb;
    Button btniniciargmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_actiniciarsesionprincipal);

        btniniciarfb=(Button)findViewById(R.id.is_ispbtnfacebook);
        btniniciarfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent loguearfb = new Intent(activity_is_actiniciarsesionprincipal.this, activity_is_actcrearunacuenta.class);
                startActivity(loguearfb);
            }
        });
        btniniciargmail=(Button)findViewById(R.id.is_ispbtngoogle);
        btniniciargmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent logueargmail = new Intent(activity_is_actiniciarsesionprincipal.this, activity_is_actcrearunacuenta.class);
                startActivity(logueargmail);
            }
        });
}
}