package org.example;

public class Incrementador extends Thread {
    private VariableCompartida variableCompartida;

    public Incrementador(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            variableCompartida.inc();
        }
    }
}
