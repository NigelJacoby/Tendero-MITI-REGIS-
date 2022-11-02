package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;

import mx.com.encargalo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link sp_frgconfiguracionnotificaciones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class sp_frgconfiguracionnotificaciones extends Fragment {

    Button btn_guardarconnoti,btn_guardarconnot2;
    PendingIntent pendingIntent;

    Switch stch_mensajes;
    Switch stch_pedidos;
    Switch stch_actividad;
    Switch stch_actualizacion;

    private final static String Channel_ID1="Notificaciones mensajes";
    private final static int Notificaiones_ID1=0;

    private final static String Channel_ID2="Notificaciones Pedidos";
    private final static int Notificaiones_ID2=2;

    private final static String Channel_ID3="Notificaciones Actividad";
    private final static int Notificaiones_ID3=3;

    private final static String Channel_ID4="Notificaciones Actualizaciones";
    private final static int Notificaiones_ID4=4;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public sp_frgconfiguracionnotificaciones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sp_frgconfiguracionnotificaciones.
     */
    // TODO: Rename and change types and number of parameters
    public static sp_frgconfiguracionnotificaciones newInstance(String param1, String param2) {
        sp_frgconfiguracionnotificaciones fragment = new sp_frgconfiguracionnotificaciones();
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
        View view= inflater.inflate(R.layout.fragment_sp_frgconfiguracionnotificaciones, container, false);

        btn_guardarconnoti=view.findViewById(R.id.btn_guardarconfiguracionnotificaciones);

        stch_mensajes=view.findViewById(R.id.stch_confmensajes);
        stch_pedidos=view.findViewById(R.id.stch_confpedidos);
        stch_actividad=view.findViewById(R.id.stch_confactividad);
        stch_actualizacion=view.findViewById(R.id.stch_confactualizaciones);

        btn_guardarconnoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stch_mensajes.isChecked()){
                    Crearnotificaionmensaje();
                    CrearCanalNotificacionesmensajes();
                }

                if (stch_pedidos.isChecked()){
                    Crearnotificaionpedidos();
                    CrearCanalNotificacionesPedidos();
                }

                if (stch_actividad.isChecked()){
                    Crearnotificacionesactividad();
                    CrearCanalNotificacionesactividad();
                }

                if (stch_actualizacion.isChecked()){
                    Crearnotificaionactualizacion();
                    CrearCanalNotificacionesactualizacion();
                }

            }
        });

        return view;
    }

    private void CrearCanalNotificacionesmensajes() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name="Notificaicones mensaje";
            NotificationChannel notificationChannel=new NotificationChannel(Channel_ID1,name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager= (NotificationManager) requireActivity().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);

        }
    }

    private void Crearnotificaionmensaje(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getContext(),Channel_ID1);
        builder.setSmallIcon(R.drawable.ic_prueba);
        builder.setContentTitle("Nuevo mensaje");
        builder.setContentText("Prueba de mensaje");
        builder.setColor(Color.BLUE);
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setLights(Color.MAGENTA,1000,1000);
        builder.setVibrate(new long[]{1000,1000,1000,1000});
        builder.setDefaults(Notification.DEFAULT_SOUND);
        builder.setCategory(NotificationCompat.CATEGORY_MESSAGE);

        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(getContext());
        notificationManagerCompat.notify(Notificaiones_ID1,builder.build());

    }

    private void CrearCanalNotificacionesPedidos() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name="Notificaicones Pedidos";
            NotificationChannel notificationChannel2=new NotificationChannel(Channel_ID2,name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager2= (NotificationManager) requireActivity().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager2.createNotificationChannel(notificationChannel2);

        }
    }

    private void Crearnotificaionpedidos(){
        NotificationCompat.Builder builder2=new NotificationCompat.Builder(getContext(),Channel_ID2);
        builder2.setSmallIcon(R.drawable.ic_prueba);
        builder2.setContentTitle("Nuevo Pedidos");
        builder2.setContentText("Prueba de Pedidos");
        builder2.setColor(Color.RED);
        builder2.setPriority(2);
        builder2.setLights(Color.MAGENTA,1000,1000);
        builder2.setVibrate(new long[]{1000,1000,1000,1000});
        builder2.setDefaults(Notification.DEFAULT_SOUND);
        builder2.setCategory(NotificationCompat.CATEGORY_MESSAGE);

        NotificationManagerCompat notificationManagerCompat2=NotificationManagerCompat.from(getContext());
        notificationManagerCompat2.notify(Notificaiones_ID2,builder2.build());

    }

    private void CrearCanalNotificacionesactividad() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name="Notificaicones Actividad";
            NotificationChannel notificationChannel=new NotificationChannel(Channel_ID3,name, NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager= (NotificationManager) requireActivity().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);

        }
    }

    private void Crearnotificacionesactividad(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getContext(),Channel_ID3);
        builder.setSmallIcon(R.drawable.ic_prueba);
        builder.setContentTitle("Nuevo Activiad");
        builder.setContentText("Prueba de Actividad");
        builder.setColor(Color.GREEN);
        builder.setPriority(3);
        builder.setLights(Color.MAGENTA,1000,1000);
        builder.setVibrate(new long[]{1000,1000,1000,1000});
        builder.setDefaults(Notification.DEFAULT_SOUND);

        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(getContext());
        notificationManagerCompat.notify(Notificaiones_ID3,builder.build());

    }

    private void CrearCanalNotificacionesactualizacion() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name="Notificaicones Actualizaciones";
            NotificationChannel notificationChannel=new NotificationChannel(Channel_ID4,name, NotificationManager.IMPORTANCE_HIGH);
            NotificationManager notificationManager= (NotificationManager) requireActivity().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);

        }
    }

    private void Crearnotificaionactualizacion(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getContext(),Channel_ID4);
        builder.setSmallIcon(R.drawable.ic_prueba);
        builder.setContentTitle("Nuevo Actualizacion");
        builder.setContentText("Prueba de Actualizciones");
        builder.setColor(Color.YELLOW);
        builder.setPriority(4);
        builder.setLights(Color.MAGENTA,1000,1000);
        builder.setVibrate(new long[]{1000,1000,1000,1000});
        builder.setDefaults(Notification.DEFAULT_SOUND);

        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(getContext());
        notificationManagerCompat.notify(Notificaiones_ID4,builder.build());

    }
}