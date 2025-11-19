package publicadores;

import jakarta.xml.ws.Endpoint;

public class Publicador {

    private Endpoint epCiudad;
    private Endpoint epCliente;
    private Endpoint epAerolinea;
    private Endpoint epUsuario;
    private Endpoint epCategoria;
    private Endpoint epRuta;
    private Endpoint epVuelo;
    private Endpoint epPaquete;
    private Endpoint epItemPaquete;
    private Endpoint epReserva;
    private Endpoint epPasaje;
    private Endpoint epAuxiliar;

    public void publicar() {
        System.out.println(">>> Publicando Web Services...");

        epCiudad = Endpoint.publish("http://localhost:8080/ws/ciudad", new ControladorCiudadPublish());
        epCliente = Endpoint.publish("http://localhost:8081/ws/cliente", new ControladorClientePublish());
        epAerolinea = Endpoint.publish("http://localhost:8082/ws/aerolinea", new ControladorAerolineaPublish());
        epUsuario = Endpoint.publish("http://localhost:8083/ws/usuario", new ControladorUsuarioPublish());
        epCategoria = Endpoint.publish("http://localhost:8084/ws/categoria", new ControladorCategoriaPublish());
        epVuelo = Endpoint.publish("http://localhost:8086/ws/vuelo", new ControladorVueloPublish());
        epPaquete = Endpoint.publish("http://localhost:8087/ws/paquete", new ControladorPaquetePublish());
        epItemPaquete = Endpoint.publish("http://localhost:8088/ws/itempaquete", new ControladorItemPaquetePublish());
        epReserva = Endpoint.publish("http://localhost:8089/ws/reserva", new ControladorReservaPublish());
        epPasaje = Endpoint.publish("http://localhost:8090/ws/pasaje", new ControladorPasajePublish());
        epAuxiliar = Endpoint.publish("http://localhost:8091/ws/auxiliar", new ControladorAuxiliarPublish());

        System.out.println(">>> WS PUBLICADOS COMPLETAMENTE");
    }

    public static void main(String[] args) {
        new Publicador().publicar();
    }
}
