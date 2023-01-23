package OrientacaoObjeto.herança;

class app {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /* não fazer upcast
        Vendedor vendedor = (Vendedor) new Funcionario();
        */
    }
    
}
