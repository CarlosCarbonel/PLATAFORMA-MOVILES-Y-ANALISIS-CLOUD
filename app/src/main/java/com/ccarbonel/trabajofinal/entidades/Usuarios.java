package com.ccarbonel.trabajofinal.entidades;

public class Usuarios {
    private int id;
    private String nombres;
    private String apellidos;
    private int tipousuario_id;
    private int dni;
    private String distrito;
    private String direccion;

    public Usuarios(int id, String nombres, String apellidos, int tipousuario_id, int dni, String distrito, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipousuario_id = tipousuario_id;
        this.dni = dni;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public Usuarios(String nombres, String apellidos, int tipousuario_id, int dni, String distrito, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipousuario_id = tipousuario_id;
        this.dni = dni;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUsuario_id() {
        return tipousuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.tipousuario_id = usuario_id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
