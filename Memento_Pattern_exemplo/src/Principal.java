public class Principal {
	
	public static void main(String[] args) {
		Pessoa original = new Pessoa();
		Zelador zelador = new Zelador();
		original.setNome("Neide");
		original.setNome("Fátima");
		zelador.add(original.salvarMemento());
		original.setNome("Gisele");
		zelador.add(original.salvarMemento());
		original.setNome("Oswaldo");
		
		System.out.println("Pessoa corrente: " + original.getNome());
		original.getMemento(zelador.get(0));
		System.out.println("Primeira pessoa salva: " + original.getNome());
		original.getMemento(zelador.get(1));
		System.out.println("Segunda pessoa salva: " + original.getNome());
	}
	
}