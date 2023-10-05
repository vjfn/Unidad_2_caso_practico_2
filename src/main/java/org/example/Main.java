package org.example;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        VariableCompartida variable = new VariableCompartida();
        Incrementador hilo1 = new Incrementador(variable);
        Incrementador hilo2 = new Incrementador(variable);

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        int valorFinal = variable.get();
        System.out.println("El valor final es: " + valorFinal);
    }
}