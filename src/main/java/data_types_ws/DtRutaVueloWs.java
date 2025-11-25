package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DtRutaVueloWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtRutaVueloWs")
public class DtRutaVueloWs {

    private String nombre;
    private String descripcion;
    private String fechaAlta; // LocalDate -> String
    private float costoBaseTurista;
    private float costoBaseEjecutivo;
    private float costoEquipajeExtra;
    private String origen;
    private String destino;
    private String aerolinea;
    private String categoria;

    @XmlElementWrapper(name = "vuelos")
    @XmlElement(name = "vuelo")
    private java.util.List<String> vuelos;

    private String urlImagen;
    private String urlVideo;
    private String descripcionCorta;
    private String estado; // Enum -> String

    // Constructor vacío obligatorio para JAXB
    public DtRutaVueloWs() {}

    // Constructor de conveniencia para mapear desde DtRutaVuelo
    public DtRutaVueloWs(data_types.DtRutaVuelo dt) {
        this.nombre = dt.getNombre();
        this.descripcion = dt.getDescripcion();
        this.fechaAlta = dt.getFechaAlta().toString();
        this.costoBaseTurista = dt.getCostoBaseTurista();
        this.costoBaseEjecutivo = dt.getCostoBaseEjecutivo();
        this.costoEquipajeExtra = dt.getCostoEquipajeExtra();
        this.origen = dt.getOrigen();
        this.destino = dt.getDestino();
        this.aerolinea = dt.getAerolinea();
        this.categoria = dt.getCategoria();
        this.vuelos = dt.getVuelos();
        this.urlImagen = dt.getUrlImagen();
        this.urlVideo = dt.getUrlVideo();
        this.descripcionCorta = dt.getDescripcionCorta();
        this.estado = dt.getEstado().name(); // Enum -> String
    }

    // Getters y setters (JAXB los necesita)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(String fechaAlta) { this.fechaAlta = fechaAlta; }

    public float getCostoBaseTurista() { return costoBaseTurista; }
    public void setCostoBaseTurista(float costoBaseTurista) { this.costoBaseTurista = costoBaseTurista; }

    public float getCostoBaseEjecutivo() { return costoBaseEjecutivo; }
    public void setCostoBaseEjecutivo(float costoBaseEjecutivo) { this.costoBaseEjecutivo = costoBaseEjecutivo; }

    public float getCostoEquipajeExtra() { return costoEquipajeExtra; }
    public void setCostoEquipajeExtra(float costoEquipajeExtra) { this.costoEquipajeExtra = costoEquipajeExtra; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getAerolinea() { return aerolinea; }
    public void setAerolinea(String aerolinea) { this.aerolinea = aerolinea; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public java.util.List<String> getVuelos() { return vuelos; }
    public void setVuelos(java.util.List<String> vuelos) { this.vuelos = vuelos; }

    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }

    public String getUrlVideo() { return urlVideo; }
    public void setUrlVideo(String urlVideo) { this.urlVideo = urlVideo; }

    public String getDescripcionCorta() { return descripcionCorta; }
    public void setDescripcionCorta(String descripcionCorta) { this.descripcionCorta = descripcionCorta; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
