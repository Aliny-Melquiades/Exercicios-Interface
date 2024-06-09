package pacote2;

    public class Profissional extends Compromisso implements Acesso {

        public Profissional(String nome, String data, String hora) {
            super(nome, data, hora);
        }

        @Override
        public void exibeCompromisso() {
            System.out.println("Compromisso Profissional:");
            System.out.println("Nome: " + getNome());
            System.out.println("Data: " + getData());
            System.out.println("Hora: " + getHora());
        }

        public void exibeCompromissoPessoal() {
            // Lógica específica para exibir compromissos pessoais, se necessário.
            System.out.println("Método específico para compromisso pessoal dentro da classe Profissional.");
        }
    }


