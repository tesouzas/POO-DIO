package polimorf;

class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - o java dá erro, pq o que se sobresai na classe filha fica sem função
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
