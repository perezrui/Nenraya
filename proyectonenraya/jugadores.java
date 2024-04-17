/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonenraya;

/**
 *
 * @author Juan Pablo
 */
public class jugadores {
    char ficha;
    String Nombre;
    Boolean turno;

    private char getFicha() {
        return ficha;
    }

    private void setFicha(char ficha) {
        this.ficha = ficha;
    }

    private String getNombre() {
        return Nombre;
    }

    private void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private Boolean getTurno() {
        return turno;
    }

    private void setTurno(Boolean turno) {
        this.turno = turno;
    }
    
}



