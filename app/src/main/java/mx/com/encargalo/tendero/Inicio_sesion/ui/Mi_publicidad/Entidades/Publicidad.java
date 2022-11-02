package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_publicidad.Entidades;

public class Publicidad {
    private String titulo;
    private String fecha;
    private String duracion;
    private String vistas;
    private String conversion;
    private int imagenid;

    public Publicidad() {}

    public Publicidad(String titulo, String fecha, String duracion, String vistas, String conversion, int imagenid) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.duracion = duracion;
        this.vistas = vistas;
        this.conversion = conversion;
        this.imagenid = imagenid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getVistas() {
        return vistas;
    }

    public void setVistas(String vistas) {
        this.vistas = vistas;
    }

    public String getConversion() {
        return conversion;
    }

    public void setConversion(String conversion) {
        this.conversion = conversion;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}


