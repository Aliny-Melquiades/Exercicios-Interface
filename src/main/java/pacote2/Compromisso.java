package pacote2;

    public class Compromisso {
        protected String nome;
        protected String data;
        protected String hora;

        public Compromisso(String nome, String data, String hora) {
            this.nome = nome;
            this.data = data;
            this.hora = hora;
        }

        public String getNome() {
            return nome;
        }

        public String getData() {
            return data;
        }

        public String getHora() {
            return hora;
        }
    }


