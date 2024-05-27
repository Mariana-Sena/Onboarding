import java.util.Objects;

class Aluno extends Pessoa {
	
    private String matricula;
    private String serie;

    public Aluno(String nome, int idade, String matricula, String serie) {
        super(nome, idade);
        this.matricula = matricula;
        this.serie = serie;
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

    @Override
    public String toString() {
        return "Aluno [nome=" + getnome() + ", idade=" + getidade() + ", matricula=" + this.matricula + ", série:" + this.serie + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj.getClass() != getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return matricula.equals(aluno.matricula);
    }
}
