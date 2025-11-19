package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.*;

@WebService
public class ControladorUsuarioPublish {

    private final Sistema sistema;

    public ControladorUsuarioPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public void eliminarSocial(String seguidor, String seguido) {
        sistema.eliminarSocial(seguidor, seguido);
    }

    @WebMethod
    public void guardarSocial(String seguidor, String seguido) {
        sistema.guardarSocial(seguidor, seguido);
    }

    @WebMethod
    public DtUsuario consultaUsuario(String nick) {
        return sistema.consultaUsuario(nick);
    }

    @WebMethod
    public DtUsuario dataUsuarioPorNick(String nick) {
        return sistema.dataUsuarioPorNick(nick);
    }

    @WebMethod
    public DtUsuario iniciarSesionUsuario(String id, String pass) {
        return sistema.iniciarSesionUsuario(id, pass);
    }

    @WebMethod
    public DtUsuario cerrarSesionUsuario(String nick) {
        return sistema.cerrarSesionUsuario(nick);
    }
}
