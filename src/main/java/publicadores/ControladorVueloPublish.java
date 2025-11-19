package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@WebService
public class ControladorVueloPublish {

    private final Sistema sistema;

    public ControladorVueloPublish() {
        this.sistema = Sistema.getInstance();
    }

    // === ALTA VUELO ===
    @WebMethod
    public void altaVuelo(String nombre, String fecha, String duracion,
                          int asientosTurista, int asientosEjecutivo,
                          String fechaAlta, String nombreRuta, String urlImagen) {

        sistema.altaVuelo(
                nombre,
                LocalDate.parse(fecha),
                LocalTime.parse(duracion),
                asientosTurista,
                asientosEjecutivo,
                LocalDate.parse(fechaAlta),
                nombreRuta,
                urlImagen
        );
    }

    // === LISTAR VUELOS DE UNA RUTA ===
    @WebMethod
    public List<DtDatosVueloR> listarVuelosDeRuta(String nombreRuta) {
        return sistema.listarVuelosDeRuta(nombreRuta);
    }

    // === OBTENER DTO DE VUELO POR NOMBRE ===
    @WebMethod
    public DtVuelo obtenerDtVueloPorNombre(String nombreVuelo) {
        return sistema.obtenerDtVueloPorNombre(nombreVuelo);
    }

    // === LISTAR NOMBRES DE VUELOS DE UNA RUTA ===
    @WebMethod
    public List<String> listarNombresVuelosPorRuta(String nombreRuta) {
        return sistema.listarNombresVuelosPorRuta(nombreRuta);
    }

    // === RESERVAR VUELO ===
    @WebMethod
    public void reservarVuelo(String nickCliente, String nombreVuelo, String tipoAsiento,
                              int cantEquipaje, String fechaReserva,
                              int cantPasajes, List<String> nombresPasajeros,
                              List<String> apellidosPasajeros) {

        sistema.reservarVuelo(
                nickCliente,
                nombreVuelo,
                TipoAsiento.valueOf(tipoAsiento),
                cantEquipaje,
                LocalDate.parse(fechaReserva),
                cantPasajes,
                nombresPasajeros,
                apellidosPasajeros
        );
    }

    // === LISTAR RESERVAS DE UN VUELO ===
    @WebMethod
    public List<String> listarReservasDeVuelo(String nombreVuelo) {
        return sistema.listarReservasDeVuelo(nombreVuelo);
    }
}
