package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;

import java.util.List;

@WebService
public class ControladorCategoriaPublish {

    private final Sistema sistema;

    public ControladorCategoriaPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public void altaCategoria(String nombreCategoria) throws Exception {
        sistema.altaCategoria(nombreCategoria);
    }

    @WebMethod
    public List<String> listarNombresCategorias() {
        return sistema.listarNombresCategorias();
    }
}
