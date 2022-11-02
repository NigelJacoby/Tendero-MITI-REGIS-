package mx.com.encargalo.tendero.Inicio_sesion.Entidades;

public class sp_EntidadPreguntasFrecuentes {
    private int idpregunta;
    private String pregunta;
    private String respuesta;
    private String URL_video;
    private String URL_img;

    public sp_EntidadPreguntasFrecuentes() {
    }

    public sp_EntidadPreguntasFrecuentes(int idpregunta, String pregunta, String respuesta, String URL_video, String URL_img) {
        this.idpregunta = idpregunta;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.URL_video = URL_video;
        this.URL_img = URL_img;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getURL_video() {
        return URL_video;
    }

    public void setURL_video(String URL_video) {
        this.URL_video = URL_video;
    }

    public String getURL_img() {
        return URL_img;
    }

    public void setURL_img(String URL_img) {
        this.URL_img = URL_img;
    }
}
