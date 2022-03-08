package java.com;

public class Funcionario {

	
	
	
	public class Funcionário {

	    String Cargo;
	    String Empresa;
	    int salário;



	    void trabalhar () {
	        System.out.println("Entrar no Serviço");

	    }

	    void entrarDeFérias() {
	        System.out.println("Trabalhou 1 ano completo, pode entrar de férias");

	    }
	public class TesteFuncionário {

	    public static void main(String[] args) {
	        Funcionário f1 = new Funcionário();
	        Funcionário f2 = new Funcionário();

	        f1.Cargo = "Product Owner";
	        f1.Empresa = "mercado livre";
	        f1.salário = 2600;

	        System.out.println(f1.Cargo);
	        System.out.println(f1.Empresa);
	        System.out.println(f1.salário);
	        System.out.println();
	        f1.trabalhar();
	        f1.entrarDeFérias();
	        System.out.println();

	        f2.Cargo = "Product Manager";
	        f2.Empresa = "Itau";
	        f2.salário = 5000;

	        System.out.println(f2.Cargo);
	        System.out.println(f2.Empresa);
	        System.out.println(f2.salário);
	        System.out.println();
	        f2.trabalhar();
	        f2.entrarDeFérias();
	        System.out.println();
}
}
	}
}