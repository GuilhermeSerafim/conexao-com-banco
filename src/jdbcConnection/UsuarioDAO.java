package jdbcConnection;

import java.sql.Connection;
import java.util.List;

public class UsuarioDAO {
	
	private Connection conexao;

	public UsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	//insert
	public void insert(Usuario usuario) {
		
	}
	
	//selectAll
	public List<Usuario> selectAll() {
		return null;
	}
	
	//selectById
	public Usuario selectById(long id) {
		return null;
	}
	
	//update
	public void update(Usuario usuario) {
		
	}
	
	//delete
	public void delete(long id) {
		
	}
	
}
