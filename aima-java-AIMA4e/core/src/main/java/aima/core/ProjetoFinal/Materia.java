package aima.core.ProjetoFinal;

import java.util.Arrays;

public class Materia {

    public Materia(String nome, Materia[] preRequisito, int cargaHoraria, int periodoOfertado) {
        this.nome = nome;
        this.preRequisito = preRequisito;
        this.cargaHoraria = cargaHoraria;
        this.periodoOfertado = periodoOfertado;
    }

    public Materia(String nome, int cargaHoraria, int periodoOfertado) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.periodoOfertado = periodoOfertado;
    }

    @Override
    public String toString() {
        return nome ;
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

    private int posicao_grade;

    public int getPosicao_grade() {
        return posicao_grade;
    }

    public void setPosicao_grade(int posicao_grade) {
        this.posicao_grade = posicao_grade;
    }
}
