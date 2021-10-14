package com.generation;



public class Main {

    public static void main(String[] args) {
	// write your code here
       /* String mensaje = saludar("Diana Marlene");
        System.out.println(mensaje);
        int resultado = suma(5,3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");*/
        System.out.println(Math.PI);
        double n1 = 13.75;
        double n2 = 23.12;
        System.out.println(Math.ceil(n1));
        String mensaje1 =""

    }
    public static String saludar(String nombre){

        return "Hola como estas "+ nombre;

    }

    public static int suma(int numero1,int numero2){
        return numero1 +numero2;
    }
    public void alerta(String mensaje){
        System.out.println(mensaje);
    }
}
