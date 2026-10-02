public class Main {
    public static void main(String[] args) {

        ListaSimple lista1 = new ListaSimple();
        lista1.agregar("A");
        lista1.agregar("B");
        lista1.agregar("A");
        lista1.agregar("C");
        lista1.agregar("B");
        lista1.agregar("D");
        System.out.print("Antes: ");
        lista1.mostrar();
        lista1.eliminarRepetidos();
        System.out.print("Despues: ");
        lista1.mostrar();

        ListaSimple lista2 = new ListaSimple();
        lista2.agregar("A");
        lista2.agregar("B");
        lista2.agregar("C");
        lista2.agregar("D");
        System.out.print("Antes: ");
        lista2.mostrar();
        lista2.rotarDerecha();
        System.out.print("Despues: ");
        lista2.mostrar();

        ListaSimple l1 = new ListaSimple();
        l1.agregar("A");
        l1.agregar("B");
        l1.agregar("C");
        l1.agregar("D");

        ListaSimple l2 = new ListaSimple();
        l2.agregar("E");
        l2.agregar("F");
        l2.agregar("G");
        l2.agregar("H");

        System.out.print("Lista1: ");
        l1.mostrar();
        System.out.print("Lista2: ");
        l2.mostrar();

        ListaSimple concatenada = ListaSimple.concatenar(l1, l2);
        System.out.print("Resultado: ");
        concatenada.mostrar();

        ListaSimple vacia = new ListaSimple();
        System.out.print("Rotar lista vacia: ");
        vacia.rotarDerecha();
        vacia.mostrar();

        ListaSimple unElemento = new ListaSimple();
        unElemento.agregar("X");
        System.out.print("Rotar lista de 1 elemento: ");
        unElemento.rotarDerecha();
        unElemento.mostrar();
    }
          }
