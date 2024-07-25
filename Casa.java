package Encapsulamento;

public class Casa {

	public static void main(String[] args) {
	Pet c1 = new Pet();
	c1.setDononome("jujuba");
	System.out.println(c1.getDononome());
	c1.setCor("branca");
	System.out.println(c1.getCor());
	c1.setDononome("Raissa");
	System.out.println(c1.getDononome());
	c1.setIdade(3);
	System.out.println(c1.getIdade());
	c1.setPadrinho("Aldemir");
	System.out.println(c1.getPadrinho());
	
	}
}
