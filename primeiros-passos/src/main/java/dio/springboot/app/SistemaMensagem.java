package dio.springboot.app;

/* import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;
   public void enviarConfirmacaoCadastro(){
       System.out.println(noreply);
       System.out.println("Seu cadastro foi aprovado");
   }
    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
    } */
    
   /*  import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.stereotype.Component;
    
    @Component
    public class SistemaMensagem implements CommandLineRunner {
        @Value("${name:NoReply-DIO}")
        private String nome;
        @Value("${email}")
        private String email;
        @Value("${telefones}")
        private List<Long> telefones =
                new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));
    
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Mensagem enviada por: " + nome
                    + "\nE-mail:" + email
                    + "\nCom telefones para contato: " + telefones);
            System.out.println("Seu cadastro foi aprovado");
        } */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
	@Autowired
	private Remetente remetente;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + remetente.getNome()
				+ "\nE-mail:" + remetente.getEmail() + "\nCom telefones para contato: "
				+ remetente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");
	}
    }