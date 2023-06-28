package jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class UsuarioDAO {
	
	private Connection conexao;

	public UsuarioDAO(Connection conexao) {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	//insert
	public void insert(Usuario usuario) {
		String sql = "insert into usuario (nome, senha, data) values (?,?,?)";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			//complemento da query
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setDate(3, usuario.getDataCadastro());
			//executar a query
			stmt.execute();
			//fechar a operação
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
