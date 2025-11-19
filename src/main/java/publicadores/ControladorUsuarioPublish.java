package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import data_types.TipoDoc;
import sistema.Sistema;
import sistema.ISistema;
import data_types.DtUsuario;

import java.time.LocalDate;

@WebService
public class ControladorUsuarioPublish {

    private final ISistema sistema;

    public ControladorUsuarioPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public DtUsuario iniciarSesion(String nick, String pass) {
        return sistema.iniciarSesionUsuario(nick, pass);
    }

    @WebMethod
    public DtUsuario cerrarSesion(String nick) {
        return sistema.cerrarSesionUsuario(nick);
    }

    @WebMethod
    public DtUsuario altaCliente(String nickname, String nombre, String email, String contrasenia,
                                 String urlImagen, String apellido, String nacimiento, String nacionalidad,
                                 String tipoDoc, String numeroDoc) {
        // Parsear tipos de datos, por ejemplo LocalDate desde String
        return sistema.altaCliente(
                nickname, nombre, email, contrasenia, urlImagen, apellido,
                LocalDate.parse(nacimiento), nacionalidad,
                Enum.valueOf(TipoDoc.class, tipoDoc), numeroDoc
        );
    }

    @WebMethod
    public DtUsuario consultaUsuario(String nick) {
        return sistema.consultaUsuario(nick);
    }
}
