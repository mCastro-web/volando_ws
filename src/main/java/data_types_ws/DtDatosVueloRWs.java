package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import data_types.*;


@XmlRootElement(name = "DtDatosVueloRWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtDatosVueloRWs")
public class DtDatosVueloRWs {

    private String nombre;
    private String fecha; // LocalDate -> String
    private String duracion; // LocalTime -> String
    private int asientosTurista;
    private int asientosEjecutivo;
    private String fechaAlta; // LocalDate -> String
    private String origen;
    private String destino;
    private float costoEjecutivo;
    private float costoTurista;
    private float costoEquipajeExtra;
    private String urlImagen;

    public DtDatosVueloRWs() {
    }

    // Constructor desde backend DTO
    public DtDatosVueloRWs(DtDatosVueloR dto) {
        this.nombre = dto.getNombre();
        this.fecha = dto.getFecha() != null ? dto.getFecha().toString() : null;
        this.duracion = dto.getDuracion() != null ? dto.getDuracion().toString() : null;
        this.asientosTurista = dto.getAsientosTurista();
        this.asientosEjecutivo = dto.getAsientosEjecutivo();
        this.fechaAlta = dto.getFechaAlta() != null ? dto.getFechaAlta().toString() : null;
        this.origen = dto.getOrigen();
        this.destino = dto.getDestino();
        this.costoEjecutivo = dto.getCostoEjecutivo();
        this.costoTurista = dto.getCostoTurista();
        this.costoEquipajeExtra = dto.getCostoEquipajeExtra();
        this.urlImagen = dto.getUrlImagen();
    }

    // Getters y setters
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getCostoEjecutivo() {
        return costoEjecutivo;
    }

    public void setCostoEjecutivo(float costoEjecutivo) {
        this.costoEjecutivo = costoEjecutivo;
    }

    public float getCostoTurista() {
        return costoTurista;
    }

    public void setCostoTurista(float costoTurista) {
        this.costoTurista = costoTurista;
    }

    public float getCostoEquipajeExtra() {
        return costoEquipajeExtra;
    }

    public void setCostoEquipajeExtra(float costoEquipajeExtra) {
        this.costoEquipajeExtra = costoEquipajeExtra;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
