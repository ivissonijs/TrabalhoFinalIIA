package aima.core.ProjetoFinal;

public class Variavel {
	
	// Atributos da classe Variavel.
	// nome guarda o nome da mat�ria
	// horas guarda a quantidade de horas que deve se dedicar durante a semana para matéria
	private final String nome;
	private final int horasFixas;
	
	// Construtor da classe.
	public Variavel(String nome, int horasFixas) {
        this.nome = nome;
        this.horasFixas = horasFixas;
    }

	public int getHorasFixas() {
		return horasFixas;
	}

	public String getNome() {
		return nome;
	}

}
