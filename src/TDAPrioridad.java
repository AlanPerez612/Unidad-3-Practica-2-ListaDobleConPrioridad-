/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class TDAPrioridad {
    public char dato;
    public int prio;
    
    public TDAPrioridad(char dato,int prio){
        
    }
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public String toString() {
        return "char : " + dato + ". Prioridad: " + prio;
    }

}


