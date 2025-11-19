package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.*;

import java.time.LocalDate;
import java.util.List;

@WebService
public class ControladorClientePublish {

    private final Sistema sistema;

    public ControladorClientePublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public DtUsuario altaCliente(String nickname, String nombre, String email,
                                 String contrasenia, String urlImagen,
                                 String apellido, String nacimiento,
                                 String nacionalidad, String tipoDoc,
                                 String numeroDoc) {

        return sistema.altaCliente(
                nickname,
                nombre,
                email,
                contrasenia,
                urlImagen,
                apellido,
                LocalDate.parse(nacimiento),
                nacionalidad,
                TipoDoc.valueOf(tipoDoc),
                numeroDoc
        );
    }

    @WebMethod
    public DtUsuario buscarPorNick(String nickname) {
        return sistema.buscarPorNick(nickname);
    }

    @WebMethod
    public List<String> listarNicknames() {
        return sistema.listarNicknames();
    }

    @WebMethod
    public List<String> listarReservasDeCliente(String nickname) {
        return sistema.listarReservasDeCliente(nickname);
    }

    @WebMethod
    public List<String> listarPaquetesDeCliente(String nickname) {
        return sistema.listarPaquetesDeCliente(nickname);
    }

    @WebMethod
    public void modificarCliente(String nickname, String nombre, String email,
                                 String contrasenia, String urlImagen, String apellido,
                                 String nacimiento, String nacionalidad,
                                 String tipoDoc, String numeroDoc, String nick) {

        sistema.modificarCliente(
                nickname,
                nombre,
                email,
                contrasenia,
                urlImagen,
                apellido,
                LocalDate.parse(nacimiento),
                nacionalidad,
                TipoDoc.valueOf(tipoDoc),
                numeroDoc,
                nick
        );
    }
}
