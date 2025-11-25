package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DtUsuarioWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtUsuarioWs")
public class DtUsuarioWs {
    protected String nickname;
    protected String nombre;
    protected String email;
    protected String urlImagen;
    protected String tipo;

    public DtUsuarioWs() {
    }

    public DtUsuarioWs(String nickname, String nombre, String email, String urlImagen, String tipo) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.email = email;
        this.urlImagen = urlImagen;
        this.tipo = tipo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
