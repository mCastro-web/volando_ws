package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DtClienteWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtClienteWs")
public class DtClienteWs extends DtUsuarioWs {
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String tipoDoc;
    private String numeroDoc;

    public DtClienteWs() {
    }

    public DtClienteWs(String nickname, String nombre, String email, String urlImagen,
            String apellido, String fechaNacimiento, String nacionalidad,
            String tipoDoc, String numeroDoc) {
        super(nickname, nombre, email, urlImagen, "CLIENTE");
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.tipoDoc = tipoDoc;
        this.numeroDoc = numeroDoc;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }
}
