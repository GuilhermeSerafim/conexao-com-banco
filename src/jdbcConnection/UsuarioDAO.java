package jdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuario order by nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) { //enquanto tiver dados na tabela
				Usuario usuario = new Usuario();
				usuario.setId(rs.getLong("ID"));
				usuario.setNome(rs.getString("NOME"));
				usuario.setSenha(rs.getString("SENHA"));
				usuario.setDataCadastro(rs.getDate("DATACADASTRO"));
				usuarios.add(usuario); //cada objeto usuário adicionado a lista de usuários
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}
	
	//selectById
	public Usuario selectById(long id) {
		Usuario usuario = null;
		String sql = "select * from usuario where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("ID"));
				usuario.setNome(rs.getString("NOME"));
				usuario.setSenha(rs.getString("SENHA"));
				usuario.setDataCadastro(rs.getDate("DATACADASTRO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	//update
	public void update(Usuario usuario) {
		
	}
	
	//delete
	public void delete(long id) {
		
	}
	
}
