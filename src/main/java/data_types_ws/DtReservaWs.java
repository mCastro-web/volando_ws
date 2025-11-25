package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "DtReservaWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtReservaWs")
public class DtReservaWs {
    private String fecha;
    private String tipoAsiento;
    private int equipajeExtra;
    private float costo;
    private DtClienteWs cliente;
    private DtVueloWs vuelo;
    private DtPaqueteVueloWs paquete;
    private List<DtPasajeWs> pasajes;
    private String validez;
    private Boolean checkin;

    public DtReservaWs() {
    }

    public DtReservaWs(String fecha, String tipoAsiento, int equipajeExtra, float costo,
            DtClienteWs cliente, DtVueloWs vuelo, DtPaqueteVueloWs paquete,
            List<DtPasajeWs> pasajes, String validez, Boolean checkin) {
        this.fecha = fecha;
        this.tipoAsiento = tipoAsiento;
        this.equipajeExtra = equipajeExtra;
        this.costo = costo;
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.paquete = paquete;
        this.pasajes = pasajes;
        this.validez = validez;
        this.checkin = checkin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public int getEquipajeExtra() {
        return equipajeExtra;
    }

    public void setEquipajeExtra(int equipajeExtra) {
        this.equipajeExtra = equipajeExtra;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public DtClienteWs getCliente() {
        return cliente;
    }

    public void setCliente(DtClienteWs cliente) {
        this.cliente = cliente;
    }

    public DtVueloWs getVuelo() {
        return vuelo;
    }

    public void setVuelo(DtVueloWs vuelo) {
        this.vuelo = vuelo;
    }

    public DtPaqueteVueloWs getPaquete() {
        return paquete;
    }

    public void setPaquete(DtPaqueteVueloWs paquete) {
        this.paquete = paquete;
    }

    public List<DtPasajeWs> getPasajes() {
        return pasajes;
    }

    public void setPasajes(List<DtPasajeWs> pasajes) {
        this.pasajes = pasajes;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }

    public Boolean getCheckin() {
        return checkin;
    }

    public void setCheckin(Boolean checkin) {
        this.checkin = checkin;
    }
}
