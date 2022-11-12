package aima.core.projetoNovo;

public class Variavel {
	
	// Atributos da classe Variavel.
	// nome guarda o nome da mat�ria
	// bloco guarda o tempo que ela guardar�(em 0,5 horas)
	private final String nome;
	private final int bloco;
	
	// Construtor da classe.
	public Variavel(String nome, int bloco) {
        this.nome = nome;
        this.bloco = bloco;
    }

	// Get do atributo bloco.
	public int getBloco() {
		return bloco;
	}

	// Get do atributo nome.
	public String getNome() {
		return nome;
	}
	
	// Retorna o tempo que a materia ir� precisar,
	// Em horas
	public double Horas_Pedidas() {
		return this.bloco * 0.5;
	}
}
