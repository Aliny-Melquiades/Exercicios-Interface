package pacote2;

    public class Pessoal extends Compromisso implements Acesso {

        public Pessoal(String nome, String data, String hora) {
            super(nome, data, hora);
        }

        @Override
        public void exibeCompromisso() {
            System.out.println("Compromisso Pessoal:");
            System.out.println("Nome: " + getNome());
            System.out.println("Data: " + getData());
            System.out.println("Hora: " + getHora());
        }
    }


