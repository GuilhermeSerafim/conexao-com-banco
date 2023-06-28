package jdbcConnection;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO(null);
		Usuario emerson = new Usuario("Emerson", "ABC123");
		Usuario adriane = new Usuario("Adriane", "ABC123");
		
		dao.insert(emerson);
		dao.insert(adriane);

	}

}
