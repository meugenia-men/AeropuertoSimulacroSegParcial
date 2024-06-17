
import java.io.Serializable;
import java.security.PrivateKey;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Aeropuerto implements Serializable {
    private String _id;
    private Boolean activo;
    private String balance;
    private String imagen;
    private Integer capacidad;
    private String nombre;
    private String email;
    private String phone;
    private String direccion;
    private String acerca;
    private String fecha_inicio;
    private Double latitud;
    private Double longitud;
    private List<String> etiquetas;
    private List<Avion> aviones =new ArrayList<>();

    public Aeropuerto() {
    }

    public Aeropuerto(String _id, Boolean activo, String balance, String imagen, Integer capacidad, String nombre, String email, String phone, String direccion, String acerca, String fecha_inicio, Double latitud, Double longitud, List<String> etiquetas, List<Avion> aviones) {
        this._id = _id;
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.direccion = direccion;
        this.acerca = acerca;
        this.fecha_inicio = fecha_inicio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.etiquetas = etiquetas;
        this.aviones = aviones;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "_id='" + _id + '\'' +
                ", activo=" + activo +
                ", balance='" + balance + '\'' +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acerca='" + acerca + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", etiquetas=" + etiquetas +
                ", aviones=" + aviones +
                '}';
    }
}
