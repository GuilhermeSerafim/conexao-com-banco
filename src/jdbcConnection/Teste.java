package jdbcConnection;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO(null);
		Usuario emerson = new Usuario(1, "Emerson", "ABC123");
		
		dao.insert(emerson);

	}

}
