package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.DtReserva;

import java.util.List;

@WebService
public class ControladorReservaPublish {

    private final Sistema sistema;

    public ControladorReservaPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public List<String> listarReservasDeVuelo(String nombreVuelo) {
        return sistema.listarReservasDeVuelo(nombreVuelo);
    }

    @WebMethod
    public List<DtReserva> listarDtReservasDeVuelo(String nombreVuelo) {
        return sistema.listarDtReservasDeVuelo(nombreVuelo);
    }

    @WebMethod
    public List<String> obtenerReservasPorClienteVuelo(String vuelo, String cliente) {
        return sistema.obtenerReservasPorClienteVuelo(vuelo, cliente);
    }

    @WebMethod
    public DtReserva obtenerDtReservaPorClienteVuelo(String vuelo, String cliente) {
        return sistema.obtenerDtReservaPorClienteVuelo(vuelo, cliente);
    }
}
