import java.util.Objects;

class Pessoa {
	
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}
	
	@Override
    public String toString() {
        return "Pessoa [nome=" + this.nome + ", idade=" + this.idade + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }
}
