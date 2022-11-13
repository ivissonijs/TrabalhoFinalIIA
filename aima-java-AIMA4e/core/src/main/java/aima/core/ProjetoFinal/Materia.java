package aima.core.ProjetoFinal;

import java.util.Arrays;

public class Materia {

    public Materia(String nome, Materia[] preRequisito, int cargaHoraria, int periodoOfertado) {
        this.nome = nome;
        this.preRequisito = preRequisito;
        this.cargaHoraria = cargaHoraria;
        this.periodoOfertado = periodoOfertado;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", preRequisito=" + Arrays.toString(preRequisito) +
                ", cargaHoraria=" + cargaHoraria +
                ", periodoOfertado=" + periodoOfertado +
                ", periodoRealizado=" + periodoRealizado +
                '}';
    }

    private  String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia[] getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(Materia[] preRequisito) {
        this.preRequisito = preRequisito;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getPeriodoOfertado() {
        return periodoOfertado;
    }

    public void setPeriodoOfertado(int periodoOfertado) {
        this.periodoOfertado = periodoOfertado;
    }

    public int getPeriodoRealizado() {
        return periodoRealizado;
    }

    public void setPeriodoRealizado(int periodoRealizado) {
        this.periodoRealizado = periodoRealizado;
    }

    private  Materia[] preRequisito;
    private int cargaHoraria;
    private int periodoOfertado;
    private int periodoRealizado;


}
