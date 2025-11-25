package data_types_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DtItemPaqueteWs")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtItemPaqueteWs")
public class DtItemPaqueteWs {
    private int cant;
    private String tipoAsiento;
    private String nombreRutaVuelo;

    public DtItemPaqueteWs() {
    }

    public DtItemPaqueteWs(int cant, String tipoAsiento, String nombreRutaVuelo) {
        this.cant = cant;
        this.tipoAsiento = tipoAsiento;
        this.nombreRutaVuelo = nombreRutaVuelo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String getNombreRutaVuelo() {
        return nombreRutaVuelo;
    }

    public void setNombreRutaVuelo(String nombreRutaVuelo) {
        this.nombreRutaVuelo = nombreRutaVuelo;
    }
}
