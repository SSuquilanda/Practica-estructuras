/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurau2linkedlistclase;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ListaEnlazadaGenerico <T> {
    private NodoGenerico <T> cabeza;
    private int tamaño;
    
    //Agregar
    public void agregar(T elemento) {
        NodoGenerico<T> nuevo = new NodoGenerico (elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        }else{
            NodoGenerico<T> ultimoNodo = obtenerUltimo() ;
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public NodoGenerico<T> obtenerUltimo() {
        NodoGenerico <T> actual = cabeza;
        while (actual.getSiguiente() != null){
            actual = actual.getSiguiente();
            
        }
        return actual;
    }
    public T getElementByIndice(int indice) {
        NodoGenerico <T> actual = cabeza;
        for(int i =0; i< indice; i++) {
            actual = actual.getSiguiente();
            
        }
        return actual.getElemento();
    }
    public NodoGenerico<T> obtenerNodoByIndice(int indice){
        NodoGenerico<T> nodoActual = cabeza;
        for(int i =0; i< indice; i++) {
            nodoActual = nodoActual.getSiguiente();
            
        }
        return nodoActual;
    }
    
        
    
    public void deleteByIndice(int indice) {
        if(indice == 0) {
            cabeza = cabeza.getSiguiente();
        }else{
            NodoGenerico<T> anterior = obtenerNodoByIndice(indice-1);
            NodoGenerico<T> nodoActual = anterior.getSiguiente();
            anterior.setSiguiente(nodoActual.getSiguiente());
        }
        tamaño--;
    }
    
    
    
}
