package poo.aula1;

class RodarAplicacao {

    public static void main(String[] args){
    Carro carro1 = new Carro();

    carro1.setCor("vermelho");
    carro1.setModelo("Cross Fox");
    carro1.setCapacidadeTanque(59);

    System.out.println(carro1.getCor());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.totalValorTanque(6.39));


    Carro carro2 = new Carro("azul", "palio", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

}
}