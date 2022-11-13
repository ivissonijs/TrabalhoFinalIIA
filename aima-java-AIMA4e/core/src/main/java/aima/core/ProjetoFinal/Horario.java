package aima.core.ProjetoFinal;

/*
 * Classe de suporte que cria uma representa��o da posi��o 
 * da tabela de hor�rio
 */

public class Horario {
	private double horas;//Tempo dispon�vel no dia
	private final String[] materia =  new String[1];//Mat�rias que ocupam aquele hor�rio
	
	public Horario(double horas) {
		this.horas = horas;
        this.materia[0] = null;
    }
	
	public void setMateria(int i, String materia) {
		this.materia[i] = materia;
	}
	
	public double getHoras() {
		return horas;
	}
	public String getMateria() {
		return materia[0];
		
	}
	public void setHoras(double d) {
			this.horas = d;
	}
	
	//To string que retorna as mat�rias daquele hor�rio como String
	public String MateriaToString() {
	    String es = new String();
	    for (int i = 0; i< 2; i++) {
	    	if (materia[i] != null) {
	    		if (i != 0) {
	    			if (materia[1].equals(materia[0])) break;
	    			es += "|";
	    		}
	    		es += materia[i];
	    	}
	    }
	    return es;
	}

}
