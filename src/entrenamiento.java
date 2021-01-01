/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class entrenamiento implements ejercicio{
    
    private String nombre;
    private musculo musculo_trabajar[];
    private usuario Usuario;
    private int tiempo_maximo;
    private int calorias;

    public entrenamiento() {
    }

    public entrenamiento(String nombre, musculo[] musculo_trabajar, usuario Usuario) {
        this.nombre = nombre;
        this.musculo_trabajar = musculo_trabajar;
        this.Usuario = Usuario;
        this.tiempo_maximo = 0;
        this.calorias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public musculo[] getMusculo_trabajar() {
        return musculo_trabajar;
    }

    public void setMusculo_trabajar(musculo[] musculo_trabajar) {
        this.musculo_trabajar = musculo_trabajar;
    }

    public usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(usuario Usuario) {
        this.Usuario = Usuario;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    public void entrenamiento_por_edad(){
        
        int edad=Usuario.getEdad();
        if((edad>=20)&&(edad<=60)&&(Usuario.getPeso()<=150))
            this.tiempo_maximo=60;
        else
            if(((edad>60)&&(edad<=80))||(Usuario.getPeso()>150))
                this.tiempo_maximo=30;
                      
    }
    
    public void genera_entrenamiento_personalizado(Object ejercicio[]){
        
        
        int tiempo=0;
        this.entrenamiento_por_edad();
        for (int i = 0; i < ejercicio.length; i++) {

                for (musculo m:musculo_trabajar) {
                     if(ejercicio[i] instanceof estocada){
                        if((((estocada) ejercicio[i]).getPrincipal().equals(m.getNombre_musculo_principal()))&&((estocada) ejercicio[i]).getSecundario().equals(m.getNombre_musculo_secundario())){
                            if(tiempo<=this.tiempo_maximo){
                                this.calorias+=150;  
                                tiempo+=20;   
                            }   
                        }
                     }
                     if(ejercicio[i] instanceof apertura_de_pecho){
                         if((((apertura_de_pecho) ejercicio[i]).getPrincipal().equals(m.getNombre_musculo_principal()))&&((apertura_de_pecho) ejercicio[i]).getSecundario().equals(m.getNombre_musculo_secundario())){
                            if(tiempo<=this.tiempo_maximo){
                                this.calorias+=100;  
                                tiempo+=20;   
                            }   
                        }

                     }
                     if(ejercicio[i] instanceof Curl_de_biceps){

                         if((((Curl_de_biceps) ejercicio[i]).getPrincipal().equals(m.getNombre_musculo_principal()))&&((Curl_de_biceps) ejercicio[i]).getSecundario().equals(m.getNombre_musculo_secundario())){
                            if(tiempo<=this.tiempo_maximo){
                                this.calorias+=75;  
                                tiempo+=20;   
                            }   
                        }


                     }


                


              }

        }
    }

    @Override
    public String toString() {
        
        String a="";
        for(musculo m:musculo_trabajar){
            a+="\nmusculo a trabajar: "+m.getClass().getName()+m;  
        }
       a+="\nentrenamiento{" + "nombre=" + nombre + ",tiempo_maximo=" + tiempo_maximo + ", calorias=" + calorias + '}';
       return a;
    }

    
    
    
}
