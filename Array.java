package co.edu.uniquindio.poo;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private int[] arreglo;

    public Array(int[] arreglo){
        this.arreglo = arreglo;
    }

    public Array(){
    }

    public int asignarTamanioArray(){
        // Solicita al usuario que ingrese el tamaño del array.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array");
        int tamanio = sc.nextInt();
        return tamanio;
        
    }

    public  void crearArray(int tamanio){
        // Solicita al usuario que ingrese los elementos del array.
        arreglo = new int[tamanio];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arreglo.length;i++){
            System.out.println("Ingrese el elemento" +  i + "de la lista que tiene un tamaño de" + tamanio);
            int numero = sc.nextInt();
            arreglo[i] = numero;
        }
    sc.close();
    }

    public void ordenarArrayMetodoBurbuja(){
        // Ordena el array utilizando el algoritmo de ordenamiento de burbuja.
        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length-1;j++){
                int elementoActual = arreglo[j];
                int elementoSiguiente = arreglo[j+1];

                if(elementoActual>elementoSiguiente){
                    arreglo[j]= elementoSiguiente;
                    arreglo[j+1]= elementoActual;
                }
            }
        }
    }

    public String generarMensaje(){
        // Genera un mensaje que indica que el array se ha ordenado.
        String mensaje ="La arreglo organizado numéricamente por el método " +  Arrays.toString(arreglo);
        return mensaje;
    }

    public void mostrarMensaje(String mensaje){
        // Muestra el mensaje al usuario.
        System.out.println(mensaje);
    }
}
