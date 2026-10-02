public class ListaSimple {

    private Nodo cabeza;
    private int size;

    public ListaSimple() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public void eliminarRepetidos() {
        Nodo actual = cabeza;

        while (actual != null) {
            Nodo anterior = actual;
            Nodo comparador = actual.siguiente;

            while (comparador != null) {
                if (comparador.dato.equals(actual.dato)) {
                    anterior.siguiente = comparador.siguiente;
                    size--;
                } else {
                    anterior = comparador;
                }
                comparador = comparador.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    public void rotarDerecha() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        Nodo penultimo = cabeza;
        while (penultimo.siguiente.siguiente != null) {
            penultimo = penultimo.siguiente;
        }

        Nodo ultimo = penultimo.siguiente;
        penultimo.siguiente = null;
        ultimo.siguiente = cabeza;
        cabeza = ultimo;
    }

    public static ListaSimple concatenar(ListaSimple l1, ListaSimple l2) {
        ListaSimple resultado = new ListaSimple();

        Nodo actual = l1.cabeza;
        while (actual != null) {
            resultado.agregar(actual.dato);
            actual = actual.siguiente;
        }

        actual = l2.cabeza;
        while (actual != null) {
            resultado.agregar(actual.dato);
            actual = actual.siguiente;
        }

        return resultado;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print("-");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public int size() { 
      return size;
    }
}
