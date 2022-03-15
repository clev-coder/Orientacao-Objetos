package java.com;

public class TesteAviao {

	public static void main(String[] args) {
      aviao a1 = new aviao();
		
		a1.setMarca("Gol");
		a1.setModelo("A360");
		a1.setnumPassageiros(853);
		
		System.out.println("Marca: " + a1.getMarca());
		System.out.println("Modelo: " + a1.getModelo());
		System.out.println("Quantidade de passageiros: " + a1.getnumPassageiros());
		
		

	}


	}


