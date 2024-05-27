import java.util.Objects;

class Admin extends Funcionario {
	
    private String setor;

    public Admin(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
    public String toString() {
        return "Admin [nome=" + getnome() + ", idade=" + getidade() + ", salario=" + getsalario() + ", setor=" + this.setor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), setor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj.getClass() != getClass()) return false;
        Admin admin = (Admin) obj;
        return Objects.equals(setor, admin.setor);
    }
}