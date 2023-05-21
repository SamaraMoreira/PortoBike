package pessoa;

public class Pessoa {
        private String nome;
        private int idade;
        private int cpf;
        private int telefone;

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public int getCpf() {
            return cpf;
        }

        public int getTelefone() {
            return telefone;
        }



        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }


        public Pessoa(String nome, int idade, int cpf, int telefone, String cidade, String bairro) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.telefone = telefone;
        }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                ", telefone=" + telefone +
                '}';
    }
}
