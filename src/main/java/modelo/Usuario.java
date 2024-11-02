package modelo;

import java.util.Date;
import java.util.List;

public class Usuario {
    private String id_user;
    private String nombres;
    private String apellidos;
    private String documento;
    private Date fechaNacimiento;
    private int numeroPuerta;
    private List<String> telefono;
    private String email;
    private String contraseña;
    private TipoUsuario tipoUsuario; // Cambiado a privado
    private CategoriaSocio categoriaSocio;
    private Boolean dificultadAuditiva;
    private Boolean manejaLenguajeDeSeñas;
    private SubComision subComision;

    // Constructor que incluye tipoUsuario
    public Usuario(String id_user, String nombres, String apellidos, String documento, Date fechaNacimiento, int numeroPuerta,
                   List<String> telefono, String email, String contraseña, TipoUsuario tipoUsuario) {
        this.id_user = id_user;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroPuerta = numeroPuerta;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario; // Asignación del tipo de usuario
    }

    // Método para verificar si el usuario tiene un permiso específico
    public boolean puedeRealizarAccion(String permiso) {
        return tipoUsuario.tienePermiso(permiso); // Llama al método en TipoUsuario
    }

    // Getters y setters

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public CategoriaSocio getCategoriaSocio() {
        return categoriaSocio;
    }

    public void setCategoriaSocio(CategoriaSocio categoriaSocio) {
        this.categoriaSocio = categoriaSocio;
    }

    public Boolean getDificultadAuditiva() {
        return dificultadAuditiva;
    }

    public void setDificultadAuditiva(Boolean dificultadAuditiva) {
        this.dificultadAuditiva = dificultadAuditiva;
    }

    public Boolean getManejaLenguajeDeSeñas() {
        return manejaLenguajeDeSeñas;
    }

    public void setManejaLenguajeDeSeñas(Boolean manejaLenguajeDeSeñas) {
        this.manejaLenguajeDeSeñas = manejaLenguajeDeSeñas;
    }

    public SubComision getSubComision() {
        return subComision;
    }

    public void setSubComision(SubComision subComision) {
        this.subComision = subComision;
    }
}
