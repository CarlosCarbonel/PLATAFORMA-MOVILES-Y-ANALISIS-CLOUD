package com.ccarbonel.trabajofinal.entidades;

public class Tiendas {
    private int id;
    private String nombres;
    private String apellidos;
    private int celular;
    private String direccion;
    private String distrito;
    private String rubrotienda_id;

    public Tiendas(int id, String nombres, String apellidos, int celular, String direccion, String distrito, String rubrotienda_id) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.distrito = distrito;
        this.rubrotienda_id = rubrotienda_id;
    }

    public Tiendas(String nombres, String apellidos, int celular, String direccion, String distrito, String rubrotienda_id) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.distrito = distrito;
        this.rubrotienda_id = rubrotienda_id;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getRubrotienda_id() {
        return rubrotienda_id;
    }

    public void setRubrotienda_id(String rubrotienda_id) {
        this.rubrotienda_id = rubrotienda_id;
    }
}
