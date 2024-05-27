import java.util.Objects;

class Professor extends Funcionario {
	
    private String disciplina;
    private String turma;

    public Professor(String nome, int idade, double salario, String disciplina, String turma) {
        super(nome, idade, salario);
        this.disciplina = disciplina;
        this.turma = turma;
    }

	public String getdisciplina() {
		return disciplina;
	}

	public void setdisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	@Override
    public String toString() {
        return "Professor [nome=" + getnome() + ", idade=" + getidade() + ", salario=" + getsalario() + ", disciplina=" + this.disciplina + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), disciplina);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj.getClass() != getClass()) return false;
        Professor professor = (Professor) obj;
        return Objects.equals(disciplina, professor.disciplina);
    }
}

