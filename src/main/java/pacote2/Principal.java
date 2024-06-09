package pacote2;
import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura dos valores para compromisso pessoal
            System.out.println("Insira os detalhes do compromisso pessoal:");
            System.out.print("Nome: ");
            String nomePessoal = scanner.nextLine();
            System.out.print("Data: ");
            String dataPessoal = scanner.nextLine();
            System.out.print("Hora: ");
            String horaPessoal = scanner.nextLine();

            // Cria uma instância de Pessoal
            Pessoal compromissoPessoal = new Pessoal(nomePessoal, dataPessoal, horaPessoal);

            // Exibe os compromissos
            System.out.println("\n--- Exibindo Compromissos ---");
            compromissoPessoal.exibeCompromisso();

            // Fecha o scanner
            scanner.close();
        }
    }

