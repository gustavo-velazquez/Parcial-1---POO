/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class musculo {
    
    private String nombre_musculo_principal;
    private String nombre_musculo_secundario;

    public musculo() {
    }

    public musculo(String nombre_musculo_principal, String nombre_musculo_secundario) {
        this.nombre_musculo_principal = nombre_musculo_principal;
        this.nombre_musculo_secundario = nombre_musculo_secundario;
    }

    public String getNombre_musculo_principal() {
        return nombre_musculo_principal;
    }

    public void setNombre_musculo_principal(String nombre_musculo_principal) {
        this.nombre_musculo_principal = nombre_musculo_principal;
    }

    public String getNombre_musculo_secundario() {
        return nombre_musculo_secundario;
    }

    public void setNombre_musculo_secundario(String nombre_musculo_secundario) {
        this.nombre_musculo_secundario = nombre_musculo_secundario;
    }

    @Override
    public String toString() {
        return "{" + "nombre_musculo_principal=" + nombre_musculo_principal + ", nombre_musculo_secundario=" + nombre_musculo_secundario + '}';
    }
    
    
    
    
}
