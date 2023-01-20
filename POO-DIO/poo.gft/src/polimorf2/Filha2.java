package polimorf2;

class Filha2 extends Mae {

    @Override
    void metodo1() {
        System.out.println("Método 1 da classe filha 2");
    }

    @Override //sobrescrever
    void metodo2() {
        System.out.println("Método 2 da classe filha 2");
    }
}
