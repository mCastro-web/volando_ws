package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DtPaqueteVueloWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtPaqueteVueloWs")
public class DtPaqueteVueloWs {
    private String nombre;
    private String descripcion;
    private int diasValidez;
    private float descuento;
    private float costo;
    private String altaFecha;
    private List<DtItemPaqueteWs> items;
    private List<String> reservas; // Nombres de reservas para evitar ciclos o simplificar

    public DtPaqueteVueloWs() {
    }

    public DtPaqueteVueloWs(String nombre, String descripcion, int diasValidez, float descuento,
            float costo, String altaFecha, List<DtItemPaqueteWs> items, List<String> reservas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.diasValidez = diasValidez;
        this.descuento = descuento;
        this.costo = costo;
        this.altaFecha = altaFecha;
        this.items = items;
        this.reservas = reservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDiasValidez() {
        return diasValidez;
    }

    public void setDiasValidez(int diasValidez) {
        this.diasValidez = diasValidez;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getAltaFecha() {
        return altaFecha;
    }

    public void setAltaFecha(String altaFecha) {
        this.altaFecha = altaFecha;
    }

    public List<DtItemPaqueteWs> getItems() {
        return items;
    }

    public void setItems(List<DtItemPaqueteWs> items) {
        this.items = items;
    }

    public List<String> getReservas() {
        return reservas;
    }

    public void setReservas(List<String> reservas) {
        this.reservas = reservas;
    }
}
