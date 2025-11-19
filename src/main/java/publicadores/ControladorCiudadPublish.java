package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;

import java.time.LocalDate;
import java.util.List;

@WebService
public class ControladorCiudadPublish {

    private final Sistema sistema;

    public ControladorCiudadPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public void altaCiudad(String nombre, String pais, String nombreAeropuerto,
                           String descripcionAeropuerto, String sitioWeb,
                           String fechaAlta) throws Exception {

        sistema.altaCiudad(
                nombre,
                pais,
                nombreAeropuerto,
                descripcionAeropuerto,
                sitioWeb,
                LocalDate.parse(fechaAlta)
        );
    }

    @WebMethod
    public List<String> listarNombresCiudades() {
        return sistema.listarNombresCiudades();
    }
}
