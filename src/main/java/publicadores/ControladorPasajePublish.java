package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;

import java.util.List;

@WebService
public class ControladorPasajePublish {

    private final Sistema sistema;

    public ControladorPasajePublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public List<String> listarPasajesReservasDeVuelo(String nombreReserva) {
        return sistema.listarPasajesReservasDeVuelo(nombreReserva);
    }
}
