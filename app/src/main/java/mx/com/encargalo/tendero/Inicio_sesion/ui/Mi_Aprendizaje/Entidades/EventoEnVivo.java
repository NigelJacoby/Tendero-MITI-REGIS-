package mx.com.encargalo.tendero.Inicio_sesion.ui.Mi_Aprendizaje.Entidades;

public class EventoEnVivo {
    String charla;
    String fecha;

    public EventoEnVivo() {
    }

    public EventoEnVivo(String charla, String fecha) {
        this.charla = charla;
        this.fecha = fecha;
    }

    public String getCharla() {
        return charla;
    }

    public void setCharla(String charla) {
        this.charla = charla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
