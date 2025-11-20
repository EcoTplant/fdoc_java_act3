package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }
//ejercicio1
    public static void ejercicio1() {
        
        List<String> frutas = new ArrayList<>();
        
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        frutas.add(2,"Uva");
        frutas.set(3,"Kiwi");

        String primera = frutas.get(0);
        System.out.println("La primera fruta es: " + primera);
        System.out.println("El tamaño de la lista de frutas es: " + frutas.size());
        System.out.println("Toda la lista de frutas es: ");

        for (String f : frutas) {
            System.out.println(f);
        }
    }
 //ejercicio2
    public static void ejercicio2() {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(20);

        numeros.remove(2);
        numeros.remove(1);

        boolean contiene40 = numeros.contains(40);
        System.out.println("La lista contiene 40?" + contiene40);

        System.out.println("El tamaño final de la lista es: " + numeros.size());
        System.out.println("La lista resultante es: " + numeros);
    }

    //ejercicio3
    
    public static void ejercicio3() {
        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Carlos");
        nombres.add("Elena");

        int contador= 0;
        
        for (int i = 0; i < nombres.size();i++) {
            String nombre  = nombres.get(i);
            System.out.println("Posicion [" + i + "]: " + nombre);

        if (nombre.length() >4 ) {
            contador++;
        }
    }
        System.out.println("Cantidad de nombres con mas de 4 caracteres: " + contador);
}
    //ejercicio4
    public static void ejercicio4() {
        List<Double> valores = new ArrayList<>();

        valores.add(15.5);
        valores.add(23.8);
        valores.add(9.2);
        valores.add(31.7);
        valores.add(12.4);

      // Variables para cálculos
        double suma = 0;
        double maximo = Double.NEGATIVE_INFINITY;
        double minimo = Double.POSITIVE_INFINITY;

        //Recorrer la lista usando for-each
        for (double valor : valores) {
            // Acumular suma
            suma += valor;

            // Comparar para máximo
            if (valor > maximo) {
                maximo = valor;
            }

            // Comparar para mínimo
            if (valor < minimo) {
                minimo = valor;
            }
        }

        // Calcular el promedio
        double promedio = suma / valores.size();

        // Mostrar todos los resultados
        System.out.println("Valores: " + valores);
        System.out.println("Suma total: " + suma);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
    //ejercicio5
    public static void ejercicio5() {
        // 1) Crear un ArrayList con números del 1 al 10
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        // Mostrar lista antes de eliminar
        System.out.println("Lista original: " + numeros);

        // Usar Iterator para recorrer la lista
        Iterator<Integer> it = numeros.iterator();

        int eliminados = 0; // contador de elementos eliminados

        while (it.hasNext()) {
            Integer num = it.next();

            // Eliminar todos los números pares
            if (num % 2 == 0) {
                it.remove(); // eliminación segura
                eliminados++;
            }
        }

        // Mostrar lista después de la eliminación
        System.out.println("Lista después de eliminar pares: " + numeros);
        // Mostrar cuántos fueron eliminados
        System.out.println("Cantidad de elementos eliminados: " + eliminados);
    }
    //ejercicio6
    public static void ejercicio6() {
        // 1) Crear el ArrayList con los valores dados
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        lenguajes.add("JavaScript");
        lenguajes.add("Python");
        lenguajes.add("Go");

        // Mostrar lista inicial
        System.out.println("Lista original: " + lenguajes);

        //Primera aparición de "Python"
        int primeraPython = lenguajes.indexOf("Python");

        //Última aparición de "Python"
        int ultimaPython = lenguajes.lastIndexOf("Python");

        //Verificar si la lista contiene "Ruby"
        boolean contieneRuby = lenguajes.contains("Ruby");

        //Crear una sublista desde índice 1 hasta 4 (sin incluir el 4)
        List<String> subLista = lenguajes.subList(1, 4);

        //Mostrar resultados
        System.out.println("Índice de la primera aparición de 'Python': " + primeraPython);
        System.out.println("Índice de la última aparición de 'Python': " + ultimaPython);
        System.out.println("¿La lista contiene 'Ruby'? " + contieneRuby);
        System.out.println("Sublista (índices 1 a 4 sin incluir): " + subLista);
    }
    //ejercicio7
    public static void ejercicio7() {

        //Crear un ArrayList de Integer
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 45, 12, 78, 23, 67, 34, 89, 56);

        System.out.println("Lista original: " + numeros);

        //Orden ascendente usando sort()
        Collections.sort(numeros);
        System.out.println("Orden ascendente: " + numeros);

        //Orden descendente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Orden descendente: " + numeros);

        //Crear un ArrayList de String con nombres
        List<String> nombres = new ArrayList<>();
        Collections.addAll(nombres, "Ana", "Miguel", "Luis", "Carolina", "Jose", "Beatriz");

        System.out.println("Nombres originales: " + nombres);

        //Orden alfabético
        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + nombres);

        //Orden por longitud (del más corto al más largo)
        Collections.sort(nombres, Comparator.comparingInt(String::length));
        System.out.println("Nombres ordenados por longitud: " + nombres);
    }
    //ejercicio 8
    public static void ejercicio8() {

    //Lista String
    ArrayList<String> palabras = new ArrayList<>();
    palabras.add("casa");
    palabras.add("auto");
    palabras.add("bicicleta");
    palabras.add("avión");
    palabras.add("barco");
    palabras.add("tren");

    // Eliminar palabras con menos de 5 caracteres
    palabras.removeIf(p -> p.length() < 5);

    // Mostrar resultado
    System.out.println("Palabras con 5 o más caracteres:");
    System.out.println(palabras);

    //Lista integer

    ArrayList<Integer> numeros = new ArrayList<>();

    // Llenar con números del 1 al 20
    for (int i = 1; i <= 20; i++) {
        numeros.add(i);
    }

    // Eliminar números divisibles por 3
    numeros.removeIf(n -> n % 3 == 0);

    // Mostrar resultado
    System.out.println("\nNúmeros NO divisibles por 3:");
    System.out.println(numeros);
}

    //ejercicio 9
    public static void ejercicio9() {

        //ArrayList de String
        List<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");

        System.out.println("ArrayList original: " + dias);

        //Convertir lista a arreglo de Object con toArray()
        Object[] arregloObject = dias.toArray();

        //Convertir lista a arreglo de String
        String[] arregloString = dias.toArray(new String[0]);

        //Mostrar la longitud de ambos arreglos
        System.out.println("\nLongitud del arreglo Object: " + arregloObject.length);
        System.out.println("Longitud del arreglo String: " + arregloString.length);

        //Recorrer e imprimir ambos arreglos
        System.out.println("\nElementos del arreglo Object:");
        for (Object o : arregloObject) {
            System.out.println(o);
        }

        System.out.println("\nElementos del arreglo String:");
        for (String s : arregloString) {
            System.out.println(s);
        }

        //Crear un ArrayList desde un arreglo usando Arrays.asList()
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril"};
        List<String> listaMeses = new ArrayList<>(Arrays.asList(meses));

        System.out.println("\nArrayList creado desde el arreglo meses: " + listaMeses);
    }
    //ejercicio10
    static List<String> nombres = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    public static void ejercicio10() {

        // --- Datos de prueba ---
        agregarEstudiante("Ana", 4.5);
        agregarEstudiante("Luis", 2.8);
        agregarEstudiante("María", 3.7);
        agregarEstudiante("Carlos", 4.2);
        agregarEstudiante("Elena", 2.5);

        System.out.println("=== Lista de Estudiantes Inicial ===");
        listarEstudiantes();

        System.out.println("\nPromedio general: " + calcularPromedio());

        System.out.println("\n=== Estudiantes Aprobados ===");
        estudiantesAprobados();

        System.out.println("\nEliminando estudiante en índice 1...");
        eliminarEstudiante(1);

        System.out.println("\nBuscando a 'María'...");
        int indiceMaria = buscarEstudiante("María");
        System.out.println("Posición de María: " + indiceMaria);

        System.out.println("\n=== Lista Final de Estudiantes ===");
        listarEstudiantes();
    }

    // Métodos para gestionar estudiantes y calificaciones

    public static void agregarEstudiante(String nombre, Double calificacion) {
        nombres.add(nombre);
        calificaciones.add(calificacion);
    }

    public static void eliminarEstudiante(int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            nombres.remove(indice);
            calificaciones.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public static int buscarEstudiante(String nombre) {
        return nombres.indexOf(nombre);
    }

    public static double calcularPromedio() {
        if (calificaciones.isEmpty()) return 0;

        double suma = 0;
        for (double c : calificaciones) {
            suma += c;
        }
        return suma / calificaciones.size();
    }

    public static void listarEstudiantes() {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("[" + i + "] " + nombres.get(i) +
                    " - Calificación: " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados() {
        for (int i = 0; i < nombres.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(nombres.get(i) + " - " + calificaciones.get(i));
            }
        }
    }

}