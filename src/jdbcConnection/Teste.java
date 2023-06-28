package jdbcConnection;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO(null);
		Usuario emerson = new Usuario("Emerson", "ABC123");
		Usuario adriane = new Usuario("Adriane", "ABC123");
		
		dao.insert(emerson);
		dao.insert(adriane);
		List<Usuario> usuarios = dao.selectAll();
		
		for (Usuario usuario : usuarios) {
			System.out.println("ID: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
		}

	}

}
