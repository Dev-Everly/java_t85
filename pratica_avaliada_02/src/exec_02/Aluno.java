package exec_02;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;
	private double notaFinal;
	
	List<Aluno> alunos = new ArrayList<>();
	
	public Aluno(String nome, int idade, double notaFinal) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.notaFinal = notaFinal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	// métodos
	
 
	
	
	
 }
