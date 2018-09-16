/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexrodriguezmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class AlexRodriguezMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        double precio;
        String codigo;
        boolean salir = false;

        while (!salir) {
            System.out.println("Elija una opción:");
            System.out.println("1. Introducir producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduce el códido del producto:");
                    codigo = entrada.next();
                    System.out.println("Introduce el precio del producto:");
                    precio = entrada.nextDouble();
                    introducir(codigo, precio, productos);
                    break;
                case 2:
                    System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
                    codigo = entrada.next();
                    modificar(codigo, productos);
                    break;
                case 3:
                    mostrar(productos);
                    break;
                case 4:
                    System.out.println("Introduce el códido del producto que quieres eliminar:");
                    codigo = entrada.next();
                    eliminar(codigo, productos);
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        }
    }

    //Método utilizado para introducir nuevos productos en la colección.
    public static void introducir(String codigo, double precio, HashMap<String, Double> productos) {
        if (!productos.containsKey(codigo)) {
            productos.put(codigo, precio);
        }
        else {
            System.out.println("El producto ya existe.");
        }
    }

    //Método utilizado para modificar el precio de algún producto de la colección.
    public static void modificar(String codigo, HashMap<String, Double> productos) {
        Scanner entrada = new Scanner(System.in);
        if (!productos.containsKey(codigo)) {
            System.out.println("El código introducido no se corresponde con ningún producto existente.");
        }
        else {
            System.out.println("Introduzca el nuevo precio del artículo: ");
            productos.put(codigo, entrada.nextDouble());
        }
    }

    
    //Método utilizado para mostrar todos los productos de la colección.
    public static void mostrar(HashMap<String, Double> productos) {
        String codigo;
        Iterator<String> it = productos.keySet().iterator();
        
        while (it.hasNext()) {
            codigo = it.next();
            System.out.println("Código " + codigo + " - Precio: " + productos.get(codigo) + " euros.");
        }
    }
    
    
    //Método utilizado para eliminar algún producto de la colección.
    public static void eliminar(String codigo, HashMap<String,Double> productos) {
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
        } else {
            System.out.println("El producto que intenta eliminar no existe.");
        }
    }
    
}
