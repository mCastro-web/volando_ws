package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtPasajeWs {
    private Long identificador;
    private String nombre;
    private String apellido;

    public DtPasajeWs() {
    }

    public DtPasajeWs(Long identificador, String nombre, String apellido) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
