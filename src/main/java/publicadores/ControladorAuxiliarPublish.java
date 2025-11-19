package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;

@WebService
public class ControladorAuxiliarPublish {

    private final Sistema sistema;

    public ControladorAuxiliarPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public boolean validarCedulaUruguaya(String cedula) {
        return sistema.validarCedulaUruguaya(cedula);
    }

    @WebMethod
    public boolean validarPasaporte(String pasaporte) {
        return sistema.validarPasaporte(pasaporte);
    }
}
