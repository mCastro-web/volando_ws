package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.*;

import java.time.LocalDate;
import java.util.List;

@WebService
public class ControladorPaquetePublish {

    private final Sistema sistema;

    public ControladorPaquetePublish() {
        this.sistema = Sistema.getInstance();
    }

    // === ALTA PAQUETE ===
    @WebMethod
    public void altaPaquete(String nombre, String descripcion,
                            Integer diasValidez, Float descuento,
                            String fechaAlta) {

        sistema.altaPaqueteRV(
                nombre,
                descripcion,
                diasValidez,
                descuento,
                LocalDate.parse(fechaAlta)
        );
    }

    // === AGREGAR RUTA A PAQUETE ===
    @WebMethod
    public void agregarRutaPaquete(String nombrePaquete,
                                   String nickAerolinea,
                                   String nombreRuta,
                                   Integer cantidad,
                                   String tipoAsiento) {

        sistema.agregarRutaPaquete(
                nombrePaquete,
                nickAerolinea,
                nombreRuta,
                cantidad,
                TipoAsiento.valueOf(tipoAsiento)
        );
    }

    // === LISTAR PAQUETES === (DTO)
    @WebMethod
    public List<DtPaqueteVuelo> listarDTPaquetes() {
        return sistema.listarDTPaquetes();
    }

    // === LISTAR NOMBRES ===
    @WebMethod
    public List<String> listarNombresPaquetes() {
        return sistema.listarNombresPaquetes();
    }

    // === OBTENER DT PAQUETE POR NOMBRE ===
    @WebMethod
    public DtPaqueteVuelo obtenerDtPaquetePorNombre(String nombre) {
        return sistema.obtenerDtPaquetePorNombre(nombre);
    }

    // === CONSULTA PAQUETE (alias con otro nombre) ===
    @WebMethod
    public DtPaqueteVuelo consultaPaquete(String nombrePaquete) {
        return sistema.consultaPaquete(nombrePaquete);
    }

    // === LISTAR ITEMS DE PAQUETE POR ID ===
    @WebMethod
    public List<DtItemPaquete> listarItemsDePaquete(Long idPaquete) {
        return sistema.listarItemsDePaquete(idPaquete);
    }

    // === COMPRA DE PAQUETE ===
    @WebMethod
    public void comprarPaquete(String nickCliente,
                               String nombrePaquete,
                               String fechaCompra) {

        sistema.comprarPaquete(
                nickCliente,
                nombrePaquete,
                LocalDate.parse(fechaCompra)
        );
    }

    // === LISTAR PAQUETES COMPRADOS DE CLIENTE ===
    @WebMethod
    public List<DtReserva> listarPaquetesCompradosPorCliente(String nickCliente) {
        return sistema.listarPaquetesCompradosPorCliente(nickCliente);
    }

    // === LISTAR PAQUETES QUE TIENEN RUTAS ===
    @WebMethod
    public List<String> listarNombresPaquetesConRutas() {
        return sistema.listarNombresPaquetesConRutas();
    }

    // === RUTAS CONTENIDAS EN UN PAQUETE ===
    @WebMethod
    public List<String> obtenerListaNombresRutasPorPaquete(String nombrePaquete) {
        return sistema.obtenerListaNombresRutasPorPaquete(nombrePaquete);
    }

}
