package java.com;

public class Funcionario {

	
	
	
	public class Funcion�rio {

	    String Cargo;
	    String Empresa;
	    int sal�rio;



	    void trabalhar () {
	        System.out.println("Entrar no Servi�o");

	    }

	    void entrarDeF�rias() {
	        System.out.println("Trabalhou 1 ano completo, pode entrar de f�rias");

	    }
	public class TesteFuncion�rio {

	    public static void main(String[] args) {
	        Funcion�rio f1 = new Funcion�rio();
	        Funcion�rio f2 = new Funcion�rio();

	        f1.Cargo = "Product Owner";
	        f1.Empresa = "mercado livre";
	        f1.sal�rio = 2600;

	        System.out.println(f1.Cargo);
	        System.out.println(f1.Empresa);
	        System.out.println(f1.sal�rio);
	        System.out.println();
	        f1.trabalhar();
	        f1.entrarDeF�rias();
	        System.out.println();

	        f2.Cargo = "Product Manager";
	        f2.Empresa = "Itau";
	        f2.sal�rio = 5000;

	        System.out.println(f2.Cargo);
	        System.out.println(f2.Empresa);
	        System.out.println(f2.sal�rio);
	        System.out.println();
	        f2.trabalhar();
	        f2.entrarDeF�rias();
	        System.out.println();
}
}
	}
}