

Clase Práctica 2: Lista Simplemente Enlazada en Java

Estructura del proyecto

El proyecto está formado por tres archivos. El archivo Nodo.java contiene la clase que representa un nodo individual, con un dato de tipo String y una referencia al siguiente nodo. El archivo ListaSimple.java contiene la clase que representa la lista enlazada, con todos sus métodos y las tres operaciones pedidas. El archivo Main.java contiene los casos de prueba que verifican el correcto funcionamiento de cada operación. Finalmente, este archivo README.md documenta el funcionamiento general del proyecto.

La clase Nodo

La clase Nodo es la pieza fundamental de la lista enlazada. Cada nodo almacena un dato de tipo String en el atributo dato y guarda una referencia al siguiente nodo de la cadena en el atributo siguiente. Cuando un nodo no apunta a nadie, su atributo siguiente vale null, lo que indica que ese nodo es el último de la lista. La clase tiene un constructor que recibe el dato a guardar y coloca automáticamente el enlace en null, dejando el nodo listo para ser enlazado cuando la lista lo necesite.

La clase ListaSimple

La clase ListaSimple mantiene dos atributos. El atributo cabeza apunta al primer nodo de la cadena, o vale null si la lista está vacía. El atributo size lleva la cuenta de cuántos nodos hay en la lista. El constructor inicializa ambos atributos dejando la lista completamente vacía.

El método agregar recibe un String y crea un nuevo nodo. Si la lista está vacía, ese nodo se convierte en el primero. Si no, recorre la lista con un nodo auxiliar llamado actual hasta llegar al último nodo y enlaza el nuevo nodo al final asignando el siguiente del último nodo al nuevo. Después incrementa el tamaño. Este método se usa principalmente para armar las listas en las pruebas.

Primera operación: eliminar los elementos repetidos

El método eliminarRepetidos recorre la lista con un nodo actual y, para cada nodo, compara su dato con todos los nodos que vienen después. Para lograrlo usa dos punteros auxiliares: anterior y comparador. El puntero anterior apunta siempre al nodo justo antes de comparador. Si el dato del comparador es igual al dato del actual, se salta ese nodo repetido haciendo que anterior.siguiente apunte al siguiente del comparador. Si no son iguales, simplemente avanza anterior al comparador. En ambos casos, comparador avanza al siguiente nodo. Cuando se termina de comparar el nodo actual contra todos los siguientes, actual avanza al siguiente nodo y se repite el proceso.

De esta forma, cada vez que se encuentra un duplicado se elimina de la cadena sin romper la estructura, y el tamaño de la lista se decrementa. Al finalizar, la lista queda sin elementos repetidos conservando solo la primera aparición de cada valor.

Segunda operación: rotar una posición a la derecha

El método rotarDerecha mueve el último nodo de la lista al frente, de modo que el último pasa a ser el primero y los demás se corren una posición hacia la derecha. Primero se verifica si la lista está vacía o tiene un solo nodo, en cuyo caso no hay nada que rotar y el método termina. Si la lista tiene dos o más nodos, se recorre con un puntero llamado penultimo hasta llegar al nodo anterior al último. Esto se logra avanzando mientras penultimo.siguiente.siguiente no sea null.

Una vez ubicado el penúltimo nodo, se guarda el último en una variable llamada ultimo. Luego se desconecta el último asignando null al siguiente del penúltimo. Después se hace que el último apunte al antiguo primer nodo con ultimo.siguiente igual a cabeza. Finalmente se actualiza la cabeza de la lista para que apunte al nodo que antes era el último. Con estos tres cambios de punteros, la lista queda rotada una posición a la derecha sin necesidad de crear nodos nuevos ni de recorrer toda la lista.

Tercera operación: concatenar dos listas

El método concatenar es estático y recibe dos listas como parámetros. Crea una nueva lista vacía llamada resultado. Luego recorre la primera lista con un puntero auxiliar y, por cada nodo, agrega su dato a la lista resultado usando el método agregar. Después recorre la segunda lista de la misma forma y agrega todos sus datos al resultado. Finalmente devuelve la lista resultado con todos los elementos de la primera seguidos de todos los elementos de la segunda.

Esta implementación no modifica las listas originales, lo cual es útil porque conserva los datos originales intactos. La desventaja es que crea nodos nuevos en la lista resultado, lo cual consume más memoria que si se enlazara directamente el último nodo de la primera lista con la cabeza de la segunda.

Casos de prueba

El archivo Main.java contiene las pruebas que verifican el correcto funcionamiento de cada operación. Para la eliminación de repetidos se crea una lista con los valores A, B, A, C, B y D, se muestra antes de la operación, se llama al método eliminarRepetidos y se muestra el resultado. Se espera que la lista final sea A, B, C y D, conservando el orden de la primera aparición de cada valor.

Para la rotación se crea una lista con los valores A, B, C y D, se muestra antes, se llama a rotarDerecha y se muestra después. Se espera que la lista resultante sea D, A, B y C.

Para la concatenación se crean dos listas, la primera con A, B, C y D y la segunda con E, F, G y H. Se llama al método concatenar y se muestra el resultado. Se espera que la lista resultante sea A, B, C, D, E, F, G y H.

Además, se incluyen dos pruebas de error. La primera prueba intenta rotar una lista vacía, lo cual no debe producir ningún cambio ni lanzar excepciones. La segunda prueba intenta rotar una lista con un solo elemento, que tampoco debe cambiar porque ya está rotada. Estas pruebas demuestran que el código maneja correctamente los casos límite.

Adrian Jesus Pelaez Rodriguez
