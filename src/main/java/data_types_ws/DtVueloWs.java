package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtVueloWs")
@XmlRootElement(name = "DtVueloWs")
public class DtVueloWs {
    private String nombre;
    private String fecha;
    private String duracion;
    private int asientosTurista;
    private int asientosEjecutivo;
    private String fechaAlta;
    private String ruta;
    private String urlImagen;

    public DtVueloWs() {
    }

    public DtVueloWs(String nombre, String fecha, String duracion, int asientosTurista,
            int asientosEjecutivo, String fechaAlta, String ruta, String urlImagen) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.asientosTurista = asientosTurista;
        this.asientosEjecutivo = asientosEjecutivo;
        this.fechaAlta = fechaAlta;
        this.ruta = ruta;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getAsientosTurista() {
        return asientosTurista;
    }

    public void setAsientosTurista(int asientosTurista) {
        this.asientosTurista = asientosTurista;
    }

    public int getAsientosEjecutivo() {
        return asientosEjecutivo;
    }

    public void setAsientosEjecutivo(int asientosEjecutivo) {
        this.asientosEjecutivo = asientosEjecutivo;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
