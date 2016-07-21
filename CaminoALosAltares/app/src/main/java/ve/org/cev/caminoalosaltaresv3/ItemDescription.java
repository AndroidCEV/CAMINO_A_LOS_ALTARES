package ve.org.cev.caminoalosaltaresv3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Opciones.OpcionBiografia;
import Opciones.OpcionContacto;
import Opciones.OpcionDonativos;
import Opciones.OpcionOracion;
import Opciones.OpcionPensamiento;
import Opciones.OpcionProceso;
import Opciones.OpcionTestimonios;

/**
 * Created by Luis on 29/02/2016.
 */
public class ItemDescription extends Activity {
    private TextView tv1;
    private TextView tv2;
    private ImageView iv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Util.infoSeleccionada.equalsIgnoreCase("Biografía")) {
            setContentView(R.layout.info_person_imgcen);
            tv1 = (TextView) findViewById(R.id.textViewcen);
            tv2 = (TextView) findViewById(R.id.textViewcen2);
            iv1 = (ImageView) findViewById(R.id.imageViewcen);
        }
        else
        {
            setContentView(R.layout.info_person_noimg);
            tv1 = (TextView) findViewById(R.id.textView);
            tv1.setText(Util.infoSeleccionada);
            tv2 = (TextView) findViewById(R.id.textView2);
        }

        switch (Util.infoSeleccionada)
        {
            case "Biografía":
                tv1.setText("BIOGRAFÍA");
                tv2.setText(OpcionBiografia.biografiaPersonaje(Util.personajeSeleccionado));
                iv1.setImageResource(OpcionBiografia.imagenPersonaje(Util.personajeSeleccionado));
                break;

            case "Proceso":
                tv1.setText("PROCESO");
                tv2.setText(OpcionProceso.procesoPersonaje(Util.personajeSeleccionado));
                break;

            case "Oración":
                tv1.setText("ORACIÓN");
                tv2.setText(OpcionOracion.oracionPersonaje(Util.personajeSeleccionado));
                break;

            case "Imágenes":
                tv1.setText("IMÁGENES");
                break;

            case "Pensamiento":
                tv1.setText("PENSAMIENTO");
                tv2.setText(OpcionPensamiento.contactoPersonaje(Util.personajeSeleccionado));
                break;

            case "Testimonios":
                tv1.setText("TESTIMONIOS");
                tv2.setText(OpcionTestimonios.testimoniosPersonaje(Util.personajeSeleccionado));
                break;

            case "Contacto":
                tv1.setText("CONTACTO");
                tv1.setText(OpcionContacto.contactoPersonaje(Util.personajeSeleccionado));
                break;

            case "Donativos":
                tv1.setText("DONATIVOS");
                tv2.setText(OpcionDonativos.donativosPersonaje(Util.personajeSeleccionado));
                break;
        }
    }
}
