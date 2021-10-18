package domain;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	
	@Override
	public String toString() {
		return String.format(
			"O usuário %s (%s)" +
			"foi cadastrado com a senha %s",
			nome,
			email,
			senha
		);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
