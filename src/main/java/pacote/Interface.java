package pacote;
import java.util.Scanner;

// Classe Mensagem
abstract class Mensagem {
    public abstract void exibeMensagem();
    public abstract void exibeMensagemB();
}

// Classe Principal que herda de Mensagem
class Principal extends Mensagem {
    private String mensagemA;
    private String mensagemB;

    // Construtor
    public Principal(String mensagemB) {
        this.mensagemA = "Cuide bem dos animais";
        this.mensagemB = mensagemB;
    }

    // Implementação do método exibeMensagem
    @Override
    public void exibeMensagem() {
        System.out.println(mensagemA);
    }

    // Implementação do método exibeMensagemB
    @Override
    public void exibeMensagemB() {
        System.out.println(mensagemB);
    }

    public static void main(String[] args) {
        // Solicita ao usuário que digite uma mensagem para a preservação do planeta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma mensagem para a preservação do planeta: ");
        String mensagemB_usuario = scanner.nextLine();

        // Cria uma instância da classe Principal com a mensagem do usuário
        Principal principal = new Principal(mensagemB_usuario);

        // Exibe as mensagens
        principal.exibeMensagem();
        principal.exibeMensagemB();

        // Fecha o scanner
        scanner.close();
    }
}
