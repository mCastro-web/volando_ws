package publicadores;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import sistema.Sistema;
import data_types.*;
import model.Aerolinea;

import java.util.List;

@WebService
public class ControladorAerolineaPublish {

    private final Sistema sistema;

    public ControladorAerolineaPublish() {
        this.sistema = Sistema.getInstance();
    }

    @WebMethod
    public DtUsuario altaAerolinea(String nickname, String nombre, String email,
                                   String contrasenia, String urlImagen,
                                   String descripcion, String sitioWeb) {

        return sistema.altaAerolinea(
                nickname,
                nombre,
                email,
                contrasenia,
                urlImagen,
                descripcion,
                sitioWeb
        );
    }

    @WebMethod
    public void modificarAerolinea(String nickname, String nombre, String email,
                                   String contrasenia, String urlImagen,
                                   String descripcion, String sitioWeb,
                                   String nick) {

        sistema.modificarAerolinea(
                nickname, nombre, email, contrasenia,
                urlImagen, descripcion, sitioWeb, nick
        );
    }

    @WebMethod
    public List<String> listarNicknamesAerolineas() {
        return sistema.listarNicknamesAerolineas();
    }

    @WebMethod
    public List<Aerolinea> listarAerolineas() {
        return sistema.listarAerolineas();
    }
}

