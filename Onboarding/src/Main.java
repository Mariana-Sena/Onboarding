public class Main {
    public static void main(String[] args) {
    	
        Pessoa pessoa = new Pessoa("Alice", 25);
        Funcionario funcionario = new Funcionario("Bob", 30, 5000);
        Aluno aluno = new Aluno("Mariana", 17, "SP3065677", "3º ano");
        Professor professor = new Professor("David", 40, 8000, "Matemática", "313");
        Admin admin = new Admin("Evelyn", 35, 6000, "RH");

        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(admin);

        System.out.println(funcionario.equals(admin)); // false as a result
    }
}