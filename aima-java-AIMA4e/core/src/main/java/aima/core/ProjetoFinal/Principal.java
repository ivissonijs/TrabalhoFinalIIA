package aima.core.ProjetoFinal;

import aima.core.logic.basic.firstorder.domain.DomainFactory;
import aima.core.search.api.Assignment;
import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.api.Domain;
import aima.core.search.basic.csp.AC3;
import aima.core.search.basic.csp.BacktrackingSearch;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
//import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class Principal{
    public static void main(String[] args) {

//1° periodo
        Materia materia1 = new Materia("COMP0480", 30, 1);
        Materia materia2= new Materia("MAT0151",  60, 1);
        Materia materia3 = new Materia("MAT0150",  60, 1);
        Materia materia4 = new Materia("COMP0393",  60, 1);
        Materia materia5 = new Materia("ADM0219", 60, 1);
//2° periodo
        Materia materia6 = new Materia("MAT0152", new Materia[]{materia2, materia3}, 60, 2);
        Materia materia7 = new Materia("MAT0057",  60, 2);
        Materia materia8 = new Materia("ADM0221", new Materia[]{materia5}, 60, 2);
        Materia materia9 = new Materia("COMP0334",  60, 2);
        Materia materia10 = new Materia("COMP0478",  60, 2);
//3° periodo
        Materia materia11 = new Materia("COMP0415", new Materia[]{materia9}, 60, 3);
        Materia materia12 = new Materia("COMP0410", new Materia[]{materia7}, 60, 3);
        Materia materia13 = new Materia("COMP0406", new Materia[]{materia6, materia4}, 60, 3);
        Materia materia14 = new Materia("ESTAT0011",  60, 3);
        Materia materia15 = new Materia("COMP0395", new Materia[]{materia9}, 60, 3);
//4° periodo
        Materia materia16 = new Materia("COMP0481", new Materia[]{materia1}, 30, 4);
        Materia materia17 = new Materia("COMP0472", new Materia[]{materia11}, 60, 4);
        Materia materia18 = new Materia("COMP0397", new Materia[]{materia7, materia13}, 60, 4);
        Materia materia19 = new Materia("COMP0408", new Materia[]{materia13, materia12}, 60, 4);
        Materia materia20 = new Materia("ADM0177", new Materia[]{materia5}, 60, 4);
//5°
        Materia materia21 = new Materia("COMP0461", new Materia[]{materia11}, 60, 5);
        Materia materia22 = new Materia("COMP0409", new Materia[]{materia12, materia4}, 60, 5);
        Materia materia23 = new Materia("COMP0455", new Materia[]{materia13}, 60, 5);
        Materia materia24 = new Materia("COMP0453", new Materia[]{materia8}, 60, 5);
        Materia materia25 = new Materia("COMP0438", new Materia[]{materia15}, 60, 5);
//6°
        Materia materia26 = new Materia("COMP0463", new Materia[]{materia21}, 30, 6);
        Materia materia27 = new Materia("COMP0470", new Materia[]{materia21, materia17, materia15}, 4, 6);
        Materia materia28 = new Materia("COMP0451", new Materia[]{materia23, materia25}, 60, 6);
        Materia materia29 = new Materia("COMP0427", new Materia[]{materia19, materia14}, 60, 6);
        Materia materia30 = new Materia("COMP0439", new Materia[]{materia25}, 60, 6);
//7°
        Materia materia31 = new Materia("ADM0193", new Materia[]{materia8}, 60, 7);
        Materia materia32 = new Materia("ADM0193", new Materia[]{materia24}, 60, 7);
        Materia materia33 = new Materia("COMP0444", new Materia[]{materia30}, 60, 7);
//8°
        Materia materia34 = new Materia("COMP0442", new Materia[]{materia23}, 60, 8);
        Materia materia35 = new Materia("COMP0284", new Materia[]{materia30}, 60, 8);
        Materia materia36 = new Materia("COMP0441", new Materia[]{materia30}, 60, 8);
//9°
        Materia materia37 = new Materia("COMP0483", new Materia[]{materia21, materia23, materia25}, 180, 9);
        Materia materia38 = new Materia("COMP0485", new Materia[]{materia23, materia16, materia21, materia25}, 60, 9);

        //10°
        Materia materia39 = new Materia("Estagio", new Materia[]{materia23, materia21, materia25}, 210, 10);
        Materia materia40 = new Materia("COMP0486", new Materia[]{materia38}, 120, 10);
        Materia materia41 = new Materia("COMP0484", new Materia[]{materia37}, 60, 10);
//PIBIT, PIBIC e Atividades Complementares
        Materia materia42 = new Materia("PIBIC",  120, 0);
        Materia materia43 = new Materia("PIBIT",  120, 0);
        Materia materia44 = new Materia("AtividadesExtras", new Materia[]{}, 120, 0);


        //Array com as variaveis do CSP

        String[] variaveis1= new String[]{
                materia1.getNome(),materia2.getNome(),materia3.getNome(),materia4.getNome(),materia5.getNome(),materia6.getNome(),
                materia7.getNome(),materia8.getNome(),materia9.getNome(),materia10.getNome(),materia11.getNome(),materia12.getNome(),
                materia13.getNome(),materia14.getNome(),materia15.getNome(),materia16.getNome(),materia17.getNome(),materia18.getNome(),
                materia19.getNome(),materia20.getNome(),materia21.getNome(),materia22.getNome(),materia23.getNome(),
                materia24.getNome(),materia25.getNome(),materia26.getNome(),materia27.getNome(),materia28.getNome(),
                materia29.getNome(),materia30.getNome(),materia31.getNome(),materia32.getNome(),materia33.getNome(),
                materia34.getNome(),materia35.getNome(),materia36.getNome(),materia37.getNome(),materia38.getNome(),
                materia39.getNome(),materia40.getNome(),materia41.getNome(),materia42.getNome(),materia43.getNome(),
                materia44.getNome()};

        //Array de materias oferecidas no curso de SI
        Materia[] variaveis2= new Materia[]{
                materia1,materia2,materia3,materia4,materia5,materia6,
                materia7,materia8,materia9,materia10,materia11,materia12,
                materia13,materia14,materia15,materia16,materia17,materia18,
                materia19,materia20,materia21,materia22,materia23,
                materia24,materia25,materia26,materia27,materia28,
                materia29,materia30,materia31,materia32,materia33,
                materia34,materia35,materia36,materia37,materia38,
                materia39,materia40,materia41,materia42,materia43,
                materia44};


        //Numero Max de periodos que um aluno pode ter antes de ser jubilado
        Object[] dominioMaterias = new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10,11,12,13,14,15
        };

        //Matriz que armazena os arrays com os dominios
        Object[][] domain = new Object[][] { dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias,
                dominioMaterias, dominioMaterias, dominioMaterias, dominioMaterias
        };


        //Constraint constraints1;

        Constraint[] constraints = new  Constraint[134]; // Array que armazena as restricoes

        //Restrição 1 - Primeiras 5 materias sendo obrigatórias do 1° periodo
        //values[0](valores do dominio da variavel de posicao 0 no parametro) recebe Integer, pois seus dominios sao do tipo inteiros

        constraints[0] = new BasicConstraint(new String[]{materia1.getNome()}, values -> (((Integer) values[0])) == 1);
        constraints[1] = new BasicConstraint(new String[]{materia2.getNome()}, values -> (((Integer) values[0])) == 1);
        constraints[2] = new BasicConstraint(new String[]{materia3.getNome()}, values -> (((Integer) values[0])) == 1);
        constraints[3] = new BasicConstraint(new String[]{materia4.getNome()}, values -> (((Integer) values[0])) == 1);
        constraints[4] = new BasicConstraint(new String[]{materia5.getNome()}, values -> (((Integer) values[0])) == 1);

        //Restricao que impede Estagio, Pibic e Pibit sejam pegos no mesmo periodo.
        constraints[5] = new BasicConstraint(new String[]{"PIBIC", "PIBIT", "Estagio"}, values -> (!((Integer) values[0]).equals(((Integer)
                values[1]))) && !((Integer) values[2]).equals(((Integer) values[1])) && !((Integer) values[0]).equals(((Integer) values[2])));


        //Restrição 2 - Restricao que impede que outras materias caiam no primeiro periodo, alem das 5 primeiras já impostas pelo curso
        int aux1 = 6;
        int contador =1;
        for(Materia materia : variaveis2){
            if(materia.getPeriodoOfertado() != 1){
                constraints[aux1] = new BasicConstraint(new String[]{materia.getNome()}, values -> (((Integer) values[0])) != 1);
               aux1++;
            }
        }
        //Restrição 3 - Garante que a matéria com pré requisito seja pega somente depois de seu pre requisito ja ter sido concluido

        for(Materia materia : variaveis2){
            if(materia.getPreRequisito() != null){
                for(Materia preReq : materia.getPreRequisito()){
                    //   System.out.println(materia.getNome() +" "+ preReq.getNome());
                    constraints[aux1] = new BasicConstraint(new String[] { materia.getNome(), preReq.getNome() },
                            values -> (((Integer) values[0] > (Integer) values[1])));
                    aux1 ++;
                }
            }
        }

        //Restricao 4 - Garante que uma materia nao seja pega em um periodo em que nao é ofertada

        for(Materia materia : variaveis2){
            if(materia.getPeriodoOfertado() != 0){
                constraints[aux1] = new BasicConstraint(new String[]{materia.getNome()}, values -> (((Integer) values[0])) >= materia.getPeriodoOfertado());
                //System.out.println(contador++);
                aux1 ++;
            }
        }


        //Criacao da CSP

        CSP csp3 = new BasicCSP( variaveis1, domain , constraints);

        // Uso do Algoritmo BackTrackingSearch
        BacktrackingSearch bs = new BacktrackingSearch();
        Assignment asn = bs.apply(csp3);
        //passando todas as variaveis e dominios
        //System.out.println(asn.getAssignments());


        //passando as atribuicoes de dominios restringidos da materia, para suas posicoes na grade
        for(Materia materia : variaveis2){
            materia.setPosicao_grade((int) asn.getAssignments().get(materia.getNome()));
            //System.out.println("Nome da Materia:" + materia.getNome() + " Posicao na grade :" + materia.getPosicao_grade());
        }

        String [][] nomeMateria = new String[8][15];
        int [] chPeriodos = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int [] qtMaterias = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //vetor que vai armazenar as horas totais de cada periodo

        //funcao que vai calcular as horas totais de tais periodos
        for(Materia materia : variaveis2){

            switch (materia.getPosicao_grade()){
                case 1:

                    chPeriodos[0] = chPeriodos[0] + materia.getCargaHoraria();
                    qtMaterias[0]++;
                    break;

                case 2:

                    chPeriodos[1] = chPeriodos[1] + materia.getCargaHoraria();
                    qtMaterias[1]++;
                    break;

                case 3:

                    chPeriodos[2] = chPeriodos[2] + materia.getCargaHoraria();
                    qtMaterias[2]++;
                    break;

                case 4:

                    chPeriodos[3] = chPeriodos[3] + materia.getCargaHoraria();
                    qtMaterias[3]++;
                    break;

                case 5:

                    chPeriodos[4] = chPeriodos[4] + materia.getCargaHoraria();
                    qtMaterias[4]++;
                    break;

                case 6:

                    chPeriodos[5] = chPeriodos[5] + materia.getCargaHoraria();
                    qtMaterias[5]++;

                    break;

                case 7:
                    chPeriodos[6] = chPeriodos[6] + materia.getCargaHoraria();
                    qtMaterias[6]++;
                    break;

                case 8:
                    chPeriodos[7] = chPeriodos[7] + materia.getCargaHoraria();
                    qtMaterias[7]++;
                    break;

                case 9:
                    chPeriodos[8] = chPeriodos[8] + materia.getCargaHoraria();
                    qtMaterias[8]++;
                    break;

                case 10:
                    chPeriodos[9] = chPeriodos[9] + materia.getCargaHoraria();
                    qtMaterias[9]++;
                    break;

                case 11:
                    chPeriodos[10] = chPeriodos[10] + materia.getCargaHoraria();
                    qtMaterias[10]++;
                    break;

                case 12:
                    chPeriodos[11] = chPeriodos[11] + materia.getCargaHoraria();
                    qtMaterias[11]++;
                    break;

                case 13:
                    chPeriodos[12] = chPeriodos[12] + materia.getCargaHoraria();
                    qtMaterias[12]++;
                    break;

                case 14:
                    chPeriodos[13] = chPeriodos[13] + materia.getCargaHoraria();
                    qtMaterias[13]++;
                    break;

                case 15:
                    chPeriodos[14] = chPeriodos[14] + materia.getCargaHoraria();
                    qtMaterias[14]++;
                    break;


            }


        }

        //funcao de impressao das horas de todos periodos
        //--------------------------------------------------------------------------

        /*for(int i =0; i < chPeriodos.length; i++){
            System.out.println("CH Periodo " + (i + 1) + " = " + chPeriodos[i] + " horas" );
            System.out.println("Quantidade de materias = " + qtMaterias[i]);
            System.out.println();


        }*/

        //funcao para pegar a quantidade de periodos que o aluno cursou
        int quantidade_periodos = 0;
        for(int i =0; i < chPeriodos.length; i++){

            if(chPeriodos[i] != 0){
                quantidade_periodos++;
            }

        }

        //imprimir quantidade de periodos
        //System.out.println("Quantidade de periodos cursados: " + quantidade_periodos);


        /*RESTRICAO 5 - Garante que um conjunto de materias, nao ultrapasse a carga horaria disponivel do discente.
        somatorio de horas das materias de mesmo periodo, DEVE SER MENOR ou igual do que a carga horaria disponivel por periodo do discente */



        //Impressao das materias em seus periodos correspondentes:

        System.out.println("***************************************************** GRADE DO ALUNO *****************************************************");
        int saidaLength = 0;
        String espacoEmbranco = "";
        System.out.print("* PRIMEIRO PERIODO: ");
        saidaLength += "* PRIMEIRO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 1){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }

        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* SEGUNDO PERIODO:  ");
        saidaLength +="* SEGUNDO PERIODO:  ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 2){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* TERCEIRO PERIODO: ");
        saidaLength +="* TERCEIRO PERIODO: ".length();

        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 3){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* QUARTO PERIODO: ");
        saidaLength +="* QUARTO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 4){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* QUINTO PERIODO: ");
        saidaLength +="* QUINTO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 5){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* SEXTO PERIODO: ");
        saidaLength +="* SEXTO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 2){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* SETIMO PERIODO: ");
        saidaLength +="* SETIMO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 7){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* OITAVO PERIODO: ");
        saidaLength +="* OITAVO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 8){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* NONO PERIODO: ");
        saidaLength +="* NONO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 9){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";

        System.out.print("* DECIMO PERIODO: ");
        saidaLength +="* DECIMO PERIODO: ".length();
        for(Materia materia : variaveis2){
            if(materia.getPosicao_grade() == 10){
                System.out.print(materia.getNome() + " | ");
                saidaLength += materia.getNome().length()+3;
            }
        }
        for(int i =0; i<=(120-saidaLength);i++){
            espacoEmbranco += " ";
            if(i == (120-saidaLength)){
                espacoEmbranco += "*";
            }
        }
        System.out.println(espacoEmbranco);
        saidaLength=0;
        espacoEmbranco = "";
        for(int i =0; i<=121;i++){
            espacoEmbranco += "*";
        }
        System.out.println(espacoEmbranco);
    }











        //System.out.println("Quantidade de horas do periodo 1" + somatorio[0]);

        //passando todos periodos das materias para um array


        //vetor que armazena quantidade da soma de horas das materias de cada periodo










        //periodo 1







        // ______________________________________________________________________________________________________________________________
        /*int contador = 0;
        for (int i = 0; i < 44; i++){
            for(int j = 1; j < 44; j++) {
                if(i != j) {
                    //System.out.println("Valor de i" + i + "Valor de j" + j);
                    //contador++;
                    //System.out.println(contador);
                    constraints[aux1] = new BasicConstraint(new String[]{variaveis2[i].getNome(),  variaveis2[j].getNome()}, values -> (!
                            (
                                    (Integer) values[0]
                            ).equals(
                                    (
                                            (Integer) values[1]
                                    )
                            )));
                    aux1++;
                }
            }

        }*/
        //_________________________________________________________________________________________________________________________________________________



        //Restrição 4 - Tentativa de criar uma restricao que use o periodo ofertado como base











        // BacktrackingSearch bs = new BacktrackingSearch();
        //Assignment asn = bs.apply(csp3);
        //System.out.println(asn.getAssignments());

        /*    System.out.println("\n============================================================================================================================================================================================================================================");
        System.out.println("-Antes de ac3.test()");
        System.out.println("============================================================================================================================================================================================================================================");

        System.out.println( "Variaveis : " + csp3.getVariables() );
        System.out.println( "Dominio   : " + csp3.getDomains() );
        System.out.println( "CSP       : " + csp3 );
*/


        //BacktrackingSearch backtracking = new BacktrackingSearch();
        //backtracking.apply(csp3);



        //passa o dominio de uma variavel em especifico
        // System.out.println(asn.getAssignments().get("QualidadedeSoftware"));

        //Object [] dominios_reduzidos = new Object[15];

        /*for(Materia materia : variaveis2){
            materia.setPosicao_grade((int) asn.getAssignments().get(materia.getNome()));
        }*/

        /*for(Materia materia : variaveis2){
            System.out.println(" Materia: " + materia.getNome() + " Posicao na Grade: " + materia.getPosicao_grade());
        }*/

        /*String [][] matrizPeriodo = new String[10][8];
        int contLinha = 0;
        int contColuna = 0;
        int contHoras = 0;
        for(int i = 0; i < variaveis2.length; i++) {
            if (contColuna >= matrizPeriodo[0].length) {
                if(contLinha >= matrizPeriodo.length) break;
                else {
                    contLinha++;
                    contColuna = 0;
                }
            }
            if((contHoras + variaveis2[i].getCargaHoraria() <= 480) && ( contLinha >= variaveis2[i].getPeriodoOfertado())) {
                matrizPeriodo[contLinha][contColuna] = variaveis2[i].getNome();
                contColuna++;
                contHoras += variaveis2[i].getCargaHoraria();
            }
            else {
                contLinha++;
                contColuna = 0;
            }
        }

        for (int i =0; i < 10; i++){
            for (int j = 0; j< 8; j++){
                System.out.println(matrizPeriodo[i][j] + "\t");

            }
            System.out.println();
        }*/





        /*AC3 ac3 = new AC3();
        ac3.test(csp3);

        System.out.println("\n============================================================================================================================================================================================================================================");
        System.out.println("-Depois de ac3.test()");
        System.out.println("============================================================================================================================================================================================================================================");

        System.out.println( "Variaveis : " + csp3.getVariables() );
        System.out.println( "Dominio   : " + csp3.getDomains() );
        System.out.println( "CSP       : " + csp3 );



        //funcao que passa os dominios para uma lista

        */
        /*Materia []periodos = new Materia[44];

        for(Materia materia : variaveis2) {
            periodos[materia.getPosicao_grade() - 1] = materia;
        }

        int posicaoMateria = 0;
        int periodo = 1;

        while(posicaoMateria < periodos.length){
            System.out.println("Periodo " + periodo);
            System.out.println();
            for(int i = 0; i < 5; i++){
                if(posicaoMateria < periodos.length){
                System.out.println(periodos[posicaoMateria]);
                posicaoMateria++; }


            }
            System.out.println();
            periodo++;
        }*/


    }



