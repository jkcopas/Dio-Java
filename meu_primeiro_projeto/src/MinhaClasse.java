public class MinhaClasse {
    //Método main (principal)
    public static void main (String [] args) {
        //declaração de variaveis
        String meuNome = "Patrick";
        int anoNascimento = 1996;
        boolean verdadeiro = true; 
        
        String primeiroNome = "Patrick";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
//declaração de metodos
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        //return primeiroNome.concat(" ").concat(segundoNome);

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
