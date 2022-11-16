package aima.core.ProjetoFinal;
import java.util.ArrayList;

public class Aluno {

    //Classe Aluno, temos o nome do aluno e a quantidade de horas que ele tem disponivel para estudo.

        //Nome do Aluno
        private String nome;

        //Quantidade de horas que ele deve estudar
        private Double horas;



        //private ArrayList<String> funcionariosPrioritarios;
        //Construtores

        // Construtor da variante normal
        public Aluno(String nome, Double horas) {
            super();
            this.nome = nome;
            this.horas = horas;
        }

        //Métodos Públicos
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getHoras() {
            return horas;
        }

        public void setHoras(Double horas) {
            this.horas = horas;
        }



        @Override
        public String toString() {
            return "Aluno [nome=" + nome + ", horas=" + horas + "]";
        }




}
