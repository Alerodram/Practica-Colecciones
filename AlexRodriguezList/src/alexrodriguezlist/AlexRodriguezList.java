/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexrodriguezlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Alex
 */
public class AlexRodriguezList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> miLista = new ArrayList<>();

        //Añadimos los elementos indicados en el apartado A.
        miLista.add("Elemento1");
        miLista.add("Elemento2");
        miLista.add("Elemento3");
        miLista.add("Elemento4");

        //Añadimos el elemento "Elemento0" en las posiciones 0 y 4, tal como pide el apartado B.
        miLista.add(0, "Elemento0");
        miLista.add(4, "Elemento0");

        //Visualizamos el número de elementos de la lista, como se indica en el apartado C
        System.out.println(miLista.size() + "\n");

        //Visualizamos el valor del elemento de la segunda posición (apartado D).
        System.out.println(miLista.get(1) + "\n");

        //Recorrer la lista con un for (apartado E).
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }

        System.out.println();

        //Saber si la lista contiene el valor "Elemento0" (apartado F).
        miLista.contains("Elemento0");
        System.out.println(miLista.contains("Elemento0") + "\n");

        //Averiguar la posición donde está almacenado el valor Elemento3 (apartado G).
        System.out.println(miLista.indexOf("Elemento3") + "\n");

        //Eliminar la posición 1 (apartado H).
        miLista.remove(1);

        //Recorrer la lista con un for (apartado I).
        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }

        System.out.println();

        //Copiar la lista en otra lista copiaLista (apartado J).
        ArrayList<String> copiaLista = (ArrayList<String>) miLista.clone();

        //Eliminar la lista original (apartado K).
        miLista.clear();

        //Averiguar si está vacía (apartado L).
        System.out.println(miLista.isEmpty() + "\n");

        //Recorrer la copia de la lista con un for (apartado M).
        for (int i = 0; i < copiaLista.size(); i++) {
            System.out.println(copiaLista.get(i));
        }

        System.out.println();

        //Convertir la copia de la lista en un array arrayLista (apartado N).
        String[] arrayLista = new String[copiaLista.size()];
        arrayLista = copiaLista.toArray(arrayLista);

        //Recorrer arrayLista (apartado O).
        for (String s : arrayLista) {
            System.out.println(s);
        }

        System.out.println();

        //Eliminar todos los elementos de valor Elemento0 (apartado P).
        copiaLista.removeIf(lista -> lista.contains("Elemento0"));

        //Recorrer copiaLista con un Iterator dentro de un for (apartado Q).
        Iterator it = copiaLista.iterator();
        for (int i = 0; i < copiaLista.size(); i++) {
            if (it.hasNext()) {
                System.out.println(copiaLista.get(i));
            }
        }

        System.out.println();

        //Recorrer copiaLista hacia delante con ListIterator (apartado R).
        ListIterator iterator = copiaLista.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        //Recorrer copiaLista hacia atrás con ListIterator (apartado S).
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println();

        //Obtener una sublista de copialista (apartado T).
        System.out.println(copiaLista.subList(0, 2));

    }

}
