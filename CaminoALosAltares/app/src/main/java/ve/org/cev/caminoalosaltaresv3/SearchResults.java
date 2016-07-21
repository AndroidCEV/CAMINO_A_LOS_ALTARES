package ve.org.cev.caminoalosaltaresv3;

/**
 * Created by Luis on 13/02/2016.
 */
public class SearchResults {

    private String nombre;
    private String descripcion;
    private int image;

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
