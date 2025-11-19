package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.ISistema;
import sistema.Sistema;
import data_types.DtRutaVuelo;
import data_types.DtDatosVueloR;

import java.time.LocalDate;
import java.util.List;

@WebService
public class ControladorRutaVueloPublish {

    private final ISistema sistema;

    public ControladorRutaVueloPublish() {
        this.sistema = Sistema.getInstance();
    }

    // === ALTA RUTA DE VUELO ===
    @WebMethod
    public void altaRutaVuelo(String nombre, String descripcion, String fechaAltaStr,
                              float costoBaseTurista, float costoBaseEjecutivo, float costoEquipajeExtra,
                              String nickAerolinea, String origenNombre, String destinoNombre,
                              String nombreCategoria, String urlImagen, String urlVideo,
                              String descripcionCorta) {

        LocalDate fechaAlta = LocalDate.parse(fechaAltaStr);

        sistema.altaRutaVuelo(
                nombre,
                descripcion,
                fechaAlta,
                costoBaseTurista,
                costoBaseEjecutivo,
                costoEquipajeExtra,
                nickAerolinea,
                origenNombre,
                destinoNombre,
                nombreCategoria,
                urlImagen,
                urlVideo,
                descripcionCorta
        );
    }

    // === LISTAR CATEGORÍAS ===
    @WebMethod
    public List<String> listarNombresCategorias() {
        return sistema.listarNombresCategorias();
    }

    // === LISTAR CIUDADES ===
    @WebMethod
    public List<String> listarNombresCiudades() {
        return sistema.listarNombresCiudades();
    }

    // === LISTAR AEROLÍNEAS ===
    @WebMethod
    public List<String> listarNicknamesAerolineas() {
        return sistema.listarNicknamesAerolineas();
    }

    // === LISTAR RUTAS POR AEROLÍNEA ===
    @WebMethod
    public List<String> listarRutasPorAerolinea(String nombre) {
        return sistema.listarRutasPorAerolinea(nombre);
    }

    // === OBTENER DATOS DE RUTA ===
    @WebMethod
    public DtRutaVuelo obtenerDtRutaPorNombre(String nombreRuta) {
        return sistema.obtenerDtRutaPorNombre(nombreRuta);
    }

    // === LISTAR VUELOS DE UNA RUTA ===
    @WebMethod
    public List<DtDatosVueloR> listarVuelosDeRuta(String nombreRuta) {
        return sistema.listarVuelosDeRuta(nombreRuta);
    }
}
