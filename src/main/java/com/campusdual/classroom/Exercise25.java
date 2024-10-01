package com.campusdual.classroom;

import java.util.Stack;

/**
 * La clase {@code Exercise25} proporciona métodos para crear, manipular y mostrar
 * una colección de tipo {@code Stack}.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar una pila con elementos específicos.</li>
 *     <li>Recorrer y vaciar la pila mostrando cada elemento.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise25 {

    /**
     * Crea y retorna una pila de tipo {@code Stack} poblada con los elementos especificados.
     * <p>
     * Los elementos añadidos son:
     * <ul>
     *     <li>"Smith"</li>
     *     <li>"Montessori"</li>
     *     <li>"Peralta"</li>
     *     <li>"House"</li>
     * </ul>
     * </p>
     *
     * @return Una pila {@code Stack<String>} poblada con los elementos especificados.
     */
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    /**
     * Recorre la pila especificada, muestra cada elemento por pantalla y lo elimina de la pila.
     * <p>
     * Este método procesa cada elemento de la pila en orden LIFO (Last-In-First-Out),
     * mostrando su valor y eliminándolo simultáneamente.
     * </p>
     *
     * @param stack La pila {@code Stack<String>} que se desea recorrer y vaciar.
     */
    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            String element = stack.peek(); // Obtiene el elemento en la cima de la pila sin eliminarlo
            System.out.println(element);
            stack.pop(); // Elimina el elemento en la cima de la pila
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación, manipulación y visualización
     * de una pila de elementos de tipo {@code String}.
     * <p>
     * El flujo del programa es el siguiente:
     * <ol>
     *     <li>Crear y poblar una pila con los elementos especificados.</li>
     *     <li>Mostrar el elemento en la cima de la pila.</li>
     *     <li>Recorrer y vaciar la pila mostrando cada elemento.</li>
     * </ol>
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar la pila
        Stack<String> stack = createStack();
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
        System.out.println("===================");

        // Recorrer y vaciar la pila mostrando cada elemento
        System.out.println("Recorriendo y vaciando la pila:");
        printAndEmptyStack(stack);
    }
}
