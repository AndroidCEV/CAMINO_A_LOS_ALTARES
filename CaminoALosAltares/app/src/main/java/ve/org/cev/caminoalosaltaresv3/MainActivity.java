package ve.org.cev.caminoalosaltaresv3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    private ListView lv1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SearchResults> searchResults = GetSearchResults();

        lv1 = (ListView) findViewById(R.id.ListView01);
        lv1.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        lv1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> a, View v, int position, long id) {
        Object o = lv1.getItemAtPosition(position);
        SearchResults fullObject = (SearchResults) o;
        Toast.makeText(getApplicationContext(), "You have chosen: " + " " + fullObject.getNombre(), Toast.LENGTH_LONG).show();

        Util.personajeSeleccionado = fullObject.getNombre().toString();

        Intent intent = new Intent(this,GridActivity.class);
        startActivity(intent);
    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();
        int imagen;

        SearchResults sr1 = new SearchResults();
        sr1.setNombre("Venerable Madre Emilia de San José");
        sr1.setDescripcion("Religiosa, Fundadora");
        imagen = R.drawable.plant;
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Venerable Madre Carmen Rendiles");
        sr1.setDescripcion("Religiosa, Fundadora");
        imagen = R.drawable.plant;
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Mons. Salvador Montes de Oca");
        sr1.setDescripcion("Obispo");
        imagen = R.drawable.plant;
        sr1.setImage(imagen);
        results.add(sr1);

        imagen = R.drawable.plant;

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Mons. Sixto Sosa");
        sr1.setDescripcion("Obispo");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Sierva de Dios, Georgina Josefa Febres Cordero");
        sr1.setDescripcion("Fundadora de las Hermanas Dominicas de 'Santa Rosa de Lima' en Mérida'");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Mons. Arturo Celestino Álvarez");
        sr1.setDescripcion("Segundo Obispo del Zulia");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Sierva de Dios, Madre Marcelina de San José Aveledo Ostos");
        sr1.setDescripcion("Fundadora de las hermanas de los pobres de San Pedro Claver, en Colombia");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Sierva de Dios, Maria Geralda Guerrero García de Piñeiro");
        sr1.setDescripcion("Laica");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Tomás Antonio Sanmiguel Díaz");
        sr1.setDescripcion("Obispo");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Arístides Calvani Silva");
        sr1.setDescripcion("Laico");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Sierva de Dios, Adelia Abbo Fontana de Calvani");
        sr1.setDescripcion("Laica");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Luis Rafael Tinoco Yépez");
        sr1.setDescripcion("Sacerdote");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Sierva de Dios, Hna. María Israel Bogotá Baquero");
        sr1.setDescripcion("Religiosa, Martir asesinada por defender su virginidad");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Siervo de Dios, Tomás Morales Pérez");
        sr1.setDescripcion("Sacerdote Jesuita");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Justo Vicente López Aveledo");
        sr1.setDescripcion("");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Jesús María Pellín");
        sr1.setDescripcion("Obispo");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Marcos Sergio Godoy");
        sr1.setDescripcion("Obispo");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Domingo Roa Perez");
        sr1.setDescripcion("Obispo");
        sr1.setImage(imagen);
        results.add(sr1);

        sr1 = new SearchResults();
        sr1.setNombre("Mons. Eduardo Boza Masdival");
        sr1.setDescripcion("Obispo exiliado en Los Teques");
        sr1.setImage(imagen);
        results.add(sr1);

        return results;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
