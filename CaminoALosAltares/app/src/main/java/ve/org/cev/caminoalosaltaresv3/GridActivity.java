package ve.org.cev.caminoalosaltaresv3;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridActivity extends Activity{
    GridView gv;
    Context context;
    ArrayList prgmName;
    public String[] prgmNameList={getString(R.string.OpcionBiografia), getString(R.string.OpcionProceso), getString(R.string.OpcionOracion),
                                  getString(R.string.OpcionMultimedia), getString(R.string.OpcionPensamiento),getString(R.string.OpcionSantuario),
                                  getString(R.string.OpcionContacto), getString(R.string.OpcionUbicacion), getString(R.string.OpcionDonativo)};
    public int[] prgmImages={R.drawable.biografia,R.drawable.proceso,R.drawable.oracion,R.drawable.imagenes,R.drawable.pensamiento,
                             R.drawable.testimonio,R.drawable.contacto,R.drawable.donativo, R.drawable.plant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menumain);
        Util.contextoGrid = this;
        gv=(GridView) findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
