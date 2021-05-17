/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trix
 */
public class ListaDoble {

    private NodoDoble ini, fin;

    public ListaDoble() {
        ini = fin = null;
    }

    public boolean insertar(char dato, int prio) {
        NodoDoble nuevo = new NodoDoble(dato, prio);
        NodoDoble aux = ini;
        //Cuando nuevo no contiene información.
        if (nuevo == null) {
            return false;
        }
        //Cuando tenemos lista vacía.
        if (hayListaDobleVacia()) {
            ini = fin = nuevo;
            return true;
        }
        //Método de ordenamiento.
        if (ini == fin) {
            //elementos con el mismo número de prioridad.
            if(ini.getPrio()==nuevo.getPrio()){
                ini.setSig(nuevo);
                nuevo.setAnt(ini);
                fin=nuevo;
                return true;
            }
            //Insertar con prioridad máxima.
            if (nuevo.getPrio() > ini.getPrio()) {
                nuevo.setSig(ini);
                ini = nuevo;
                return true;
            } else {
                //Ingresar más de un nodo.
                if (nuevo.getPrio() < ini.getPrio()) {
                    fin.setSig(nuevo);
                    nuevo.setAnt(fin);
                    fin = nuevo;
                    return true;
                }
            }
        } else {
            for (; aux != fin; aux = aux.getSig()) {

                if (nuevo.getPrio() > ini.getPrio()) {
                    ini.setAnt(nuevo);
                    nuevo.setSig(ini);
                    ini = nuevo;
                    return true;
                }
                if (nuevo.getPrio() > aux.getSig().getPrio()) {
                    nuevo.setSig(aux.getSig());
                    nuevo.setAnt(aux);
                    aux.getSig().setAnt(nuevo);
                    aux.setSig(nuevo);
                    return true;
                }
            }//for
            if (aux == fin) {
                fin.setSig(nuevo);
                nuevo.setAnt(fin);
                fin = nuevo;
                return true;
            }
        }//else
        return false;
    }
    
    public boolean eliminar() {
        if (hayListaDobleVacia()) {
            return false;
        }
        if (hayUnSoloNodo()) {
            ini = fin = null;
            return true;
        }
        NodoDoble temp = ini;
        ini = temp.getSig();
        ini.setAnt(null);
        temp.setSig(null);
        temp = null;
        return true;
    }

    public boolean hayListaDobleVacia() {
        return ini == null && fin == null;
    }

    public boolean hayUnSoloNodo() {
        return ini == fin;
    }

    public NodoDoble getIni() {
        return ini;
    }

}
