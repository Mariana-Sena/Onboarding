import java.util.Objects;

class Funcionario extends Pessoa {
	
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

	public double getsalario() {
		return salario;
	}

	public void setsalario(double salario) {
		this.salario = salario;
	}
	@Override
    public String toString() {
        return super.toString() + "Funcionario" + this.salario + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj.getClass() != getClass()) return false;
        Funcionario funcionario = (Funcionario) obj;
        return Double.compare(funcionario.salario, salario) == 0;
    }
}
