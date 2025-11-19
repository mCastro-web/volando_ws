package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.DtItemPaquete;

import java.util.List;

@WebService
public class ControladorItemPaquetePublish {

    private final Sistema sistema;

    public ControladorItemPaquetePublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public List<DtItemPaquete> listarItemsDePaquete(Long idPaquete) {
        return sistema.listarItemsDePaquete(idPaquete);
    }
}
