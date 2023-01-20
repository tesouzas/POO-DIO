public class Main {
    public static void main(String[] args) {

        Endereco enderecoRestaurante1 = new Endereco("51.345-350", "100");

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setId(1L);
        restaurante1.setCnpj("0001-0000.0000");
        restaurante1.setNomeFantasia("Restaurante e cia");
        restaurante1.setEndereco(enderecoRestaurante1);
        System.out.println(restaurante1);

        Endereco enderecoRestaurante2 = new Endereco("51.345-000", "500");

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setCnpj("2222-0000.0000");
        restaurante2.setNomeFantasia("Restaurante Fulana");
        restaurante2.setEndereco(enderecoRestaurante1);
        System.out.println(restaurante2);

    }
}