package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DtAerolineaWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtAerolineaWs")
public class DtAerolineaWs extends DtUsuarioWs {
    private String descripcion;
    private String sitioWeb;

    public DtAerolineaWs() {
    }

    public DtAerolineaWs(String nickname, String nombre, String email, String urlImagen,
            String descripcion, String sitioWeb) {
        super(nickname, nombre, email, urlImagen, "AEROLINEA");
        this.descripcion = descripcion;
        this.sitioWeb = sitioWeb;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
}
