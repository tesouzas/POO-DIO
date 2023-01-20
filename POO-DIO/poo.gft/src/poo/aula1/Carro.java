package poo.aula1;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //Método Construtor (vazio e com sobrecarga)

    Carro(){
    }

    Carro(String cor, String modelo, int capacidadetanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadetanque;
    }

    //Getters e Setters
    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo(){
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    //Método de $ para encher tanque

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }


}
