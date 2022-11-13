package aima.core.ProjetoFinal;

import aima.core.ProjetoFinal.Horario;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Classe de Suporte para cria��o do Caso 1 exemplificado
 * pelo professor.
 */

public class CasoTeste {

	//matrix do Caso de teste 1
	private final Horario[][] horario= new Horario[8][10]; //8 linhas(máterias), 10 colunas (Períodos)

	// Cria��o da matrix do Caso de teste 1
	// Foi posto o valor 0 no tempo dos
	// horarios com as mat�rias do caso de teste.
	// 1 para as livres.
	public CasoTeste(){
		for (int i = 0; i<8;i++) {
			for(int j = 0;j<10;j++) {
				this.horario[i][j] = new Horario(1);
			}
		}
		
		//5 MATÉRIAS OBRIGATÓRIAS PRIMEIRO PERÍODO

		horario[0][0].setMateria( 0, "SEMINÁRIOS EM COMPUTAÇÃO" );
		horario[1][0].setMateria(0,  "CALCULO A" );
		horario[2][0].setMateria(0,  "VETORES E GEOMETRIA ANÁLITICA" );
		horario[3][0].setMateria(0,  "PROGRAMAÇÃO FUNCIONAL" );
		horario[4][0].setMateria(0,  "INTRODUÇÃO A ADMINISTRAÇÃO" );
		horario[5][0].setMateria(0,  "TRABALHO" );
		horario[6][0].setMateria(0,  "TRABALHO" );
		horario[0][2].setMateria(0,  "TRABALHO" );
		horario[1][2].setMateria(0,  "TRABALHO" );
		horario[2][2].setMateria(0,  "TRABALHO" );
		horario[3][2].setMateria(0,  "TRABALHO" );
		horario[4][2].setMateria(0,  "TRABALHO" );
		horario[5][2].setMateria(0,  "TRABALHO" );
		horario[6][2].setMateria(0,  "TRABALHO" );
		horario[0][4].setMateria(0,  "TRABALHO" );
		horario[1][4].setMateria(0,  "TRABALHO" );
		horario[2][4].setMateria(0,  "TRABALHO" );
		horario[3][4].setMateria(0,  "TRABALHO" );
		horario[4][4].setMateria(0,  "TRABALHO" );
		horario[5][4].setMateria(0,  "TRABALHO" );
		horario[6][4].setMateria(0,  "TRABALHO" );
		horario[7][4].setMateria(0,  "TRABALHO" );

		horario[0][0].setHoras(0);
		horario[1][0].setHoras(0);
		horario[2][0].setHoras(0);
		horario[3][0].setHoras(0);
		horario[4][0].setHoras(0);
		horario[5][0].setHoras(0);
		horario[6][0].setHoras(0);
		horario[0][2].setHoras(0);
		horario[1][2].setHoras(0);
		horario[2][2].setHoras(0);
		horario[3][2].setHoras(0);
		horario[4][2].setHoras(0);
		horario[5][2].setHoras(0);
		horario[6][2].setHoras(0);
		horario[0][4].setHoras(0);
		horario[1][4].setHoras(0);
		horario[2][4].setHoras(0);
		horario[3][4].setHoras(0);
		horario[4][4].setHoras(0);
		horario[5][4].setHoras(0);
		horario[6][4].setHoras(0);
		horario[7][4].setHoras(0);
		
		//Linha 2, 4
		horario[2][1].setMateria(0,  "COMP0455");
		horario[3][1].setMateria(0,  "COMP0455");
		horario[2][3].setMateria(0,  "COMP0455");
		horario[3][3].setMateria(0,  "COMP0455");
		
		horario[2][1].setHoras(0);
		horario[3][1].setHoras(0);
		horario[2][3].setHoras(0);
		horario[3][3].setHoras(0);
		
		horario[6][3].setMateria(0,  "COMP0481");
		horario[7][3].setMateria(0,  "COMP0481");
		
		horario[6][3].setHoras(0);
		horario[7][3].setHoras(0);
		
		//Linha 1, 3
		horario[8][0].setMateria(0, "COMP0408");
		horario[9][0].setMateria(0, "COMP0408");
		horario[8][2].setMateria(0, "COMP0408");
		horario[9][2].setMateria(0, "COMP0408");
		
		horario[8][0].setHoras(0);
		horario[9][0].setHoras(0);
		horario[8][2].setHoras(0);
		horario[9][2].setHoras(0);
	}
	
	
	// Get da Matrix.
	public Horario[][] getHorario() {
		return this.horario;
	}
	
	//Atribui a mat�ria a posi��o fornecida.
	public void setMateria(int linha, int  coluna, String nome, int posicao) {
		horario[linha][coluna].setMateria(posicao, nome);
	}
	
	// Transforma a Matrix para string
	// Baseado na materia em cada horario.
	public String toString()
	{
	    String es = new String();
	    ArrayList<String> dia_semana = new ArrayList<String>();
	    es += Cores.ANSI_BLACK + "     [ Segunda][  Terca ][ Quarta ][ Quinta ][ Sexta  ][ Sabado ]\n" + Cores.ANSI_RESET;
	    dia_semana.add(Cores.ANSI_BLACK + "13:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "14:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "15:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "16:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "17:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "18:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "19:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "20:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "21:00" + Cores.ANSI_RESET);
	    dia_semana.add(Cores.ANSI_BLACK + "22:00" + Cores.ANSI_RESET);
	    
	    for(int i = 0; i < 10; i++)
	        {
	    		es += dia_semana.get(i);
	            for(int j = 0; j < 6; j++)
	                {
	                    es += "[";
	                    if (horario[i][j].getMateria() == null){
	                    	es += Cores.ANSI_BLACK + "--------" + Cores.ANSI_RESET;
	                    }else {
	                    	es += horario[i][j].MateriaToString();
	                    }
	                    es += "]";
	                }
	            es += '\n';
	        }
	    
	    System.out.println();
	    System.out.println("Seu Hor�rio �: ");
	    return es;
	}
	
	// Retorna as horas vagas de cada dia da semana
	// Segunda at� S�bado
	public ArrayList<Double> horasVagas() {
		
		ArrayList<Double> vagas = new ArrayList<Double>();
		
		double vago = 0;
		
		for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 10; j++)
                {
            		
                    if (horario[j][i].getMateria() == null){
                    	vago ++;
                    }else {
                    	vago += horario[j][i].getHoras();
                    	if(vago > 0)    vagas.add(vago);
                    	vago = 0;
                    }
                }
            if(vago > 0)    vagas.add(vago);
            vago = 0;
        }
		Collections.sort(vagas);
		return vagas;
	}
	
}
