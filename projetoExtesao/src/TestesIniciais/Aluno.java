package TestesIniciais;

import java.io.File;

public class Aluno implements IntefaceProjetoExtensao{

	private Long matricula;
	
	private String senha;
	
	private String nome;
	
	private String periodo;
	
	private File foto;
	
	private File historico;


	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public File getFoto() {
		return foto;
	}
	public void setFoto(File foto) {
		this.foto = foto;
	}
	
	public File getHistorico() {
		return historico;
	}
	public void setHistorico(File historico) {
		this.historico = historico;
	}
	
	@Override
	public void cadastroAluno(Long matricula, String Senha, String nome, String periodo, File foto, File historico) {
		Aluno a = new Aluno();
		a.setMatricula(matricula);
		a.setSenha(Senha);
		a.setNome(nome);
		a.setPeriodo(periodo);
		a.setFoto(foto);
		a.setHistorico(historico);
		
	}
	
	@Override
	public void excluirCadastro(Long matricula, String senha, String nome) {
		
	}


}
