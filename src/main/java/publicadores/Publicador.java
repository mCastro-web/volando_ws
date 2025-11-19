package publicadores;

import jakarta.xml.ws.Endpoint;

public class Publicador {

    private Endpoint epUsuario;
    private Endpoint epVuelo;
    private Endpoint epRuta;

    public void publicar() {
        System.out.println(">>> Publicando Web Services...");

        epUsuario = Endpoint.publish(
                "http://localhost:8081/ws/usuario",
                new ControladorUsuarioPublish()
        );

        epVuelo = Endpoint.publish(
                "http://localhost:8080/ws/vuelo",
                new ControladorVueloPublish()
        );

       /* epRuta = Endpoint.publish(
                "http://localhost:8080/ws/ruta",
                new ControladorRutaPublish()
        );*/

        System.out.println(">>> WS publicados correctamente.");
    }

    public static void main(String[] args) {
        new Publicador().publicar();
    }
}
