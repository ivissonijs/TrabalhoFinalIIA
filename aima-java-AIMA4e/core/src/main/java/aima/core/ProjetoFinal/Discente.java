package aima.core.ProjetoFinal;

public class Discente {
    private int [] horasDisponiveis_Periodo;

    public Discente(int ... horasDisponiveis_Periodo){
        this.horasDisponiveis_Periodo = horasDisponiveis_Periodo;
    }

    public int[] getHorasDisponiveis_Periodo() {
        return horasDisponiveis_Periodo;
    }
}
