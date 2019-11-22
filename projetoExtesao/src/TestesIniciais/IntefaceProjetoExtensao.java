package TestesIniciais;

import java.io.File;

public interface IntefaceProjetoExtensao {
		
	void cadastroAluno (Long matricula, String Senha, String nome, String periodo, File foto, File historico);
	
	void excluirCadastro (Long matricula,String senha, String nome);
	
}
