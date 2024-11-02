package modelo;

import java.sql.Time;
import java.util.Date;

public class Actividad {
    private int id_actividad;
    private String descripcion;
    private Date fecha;
    private Time lugar;
    private TipoActividad tipoActividad;

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getLugar() {
        return lugar;
    }

    public void setLugar(Time lugar) {
        this.lugar = lugar;
    }

    public TipoActividad getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
