package Composição;



public class Principalivro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro ("Pequeno Principe", "George");
		Autor nomeautor = new Autor ( "George");
		
		System.out.println("Livro:"+livro.getTitulo()+ "\nAutor:" +nomeautor.getAutor());
		}


}
