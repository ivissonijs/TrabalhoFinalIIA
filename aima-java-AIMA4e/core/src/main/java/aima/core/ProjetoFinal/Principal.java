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

import java.util.List;

public class Principal{
    public static void main(String[] args) {

//1° periodo
        Materia materia1 = new Materia("SemináriosdeProgramação", 30, 1);
        Materia materia2= new Materia("CálculaA",  60, 1);
        Materia materia3 = new Materia("Vetores",  60, 1);
        Materia materia4 = new Materia("ProgramaçãoFuncional",  60, 1);
        Materia materia5 = new Materia("Intr. ADM", 60, 1);
//2° periodo
        Materia materia6 = new Materia("CalB", new Materia[]{materia2, materia3}, 60, 2);
        Materia materia7 = new Materia("FundamentosMat",  60, 2);
        Materia materia8 = new Materia("OMSAdm", new Materia[]{materia5}, 60, 2);
        Materia materia9 = new Materia("ProgramaçãoImperativa",  60, 2);
        Materia materia10 = new Materia("InformaticaEticaSoc",  60, 2);
//3° periodo
        Materia materia11 = new Materia("ArquiteturaDeComputadores", new Materia[]{materia9}, 60, 3);
        Materia materia12 = new Materia("LogicaComputacao", new Materia[]{materia7}, 60, 3);
        Materia materia13 = new Materia("EstruturadeDados", new Materia[]{materia6, materia4}, 60, 3);
        Materia materia14 = new Materia("EstatisticaAplicada",  60, 3);
        Materia materia15 = new Materia("POO", new Materia[]{materia9}, 60, 3);
//4° periodo
        Materia materia16 = new Materia("MetodoseTecnicasPesquisa", new Materia[]{materia1}, 30, 4);
        Materia materia17 = new Materia("SO", new Materia[]{materia11}, 60, 4);
        Materia materia18 = new Materia("PAA", new Materia[]{materia7, materia13}, 60, 4);
        Materia materia19 = new Materia("Grafos", new Materia[]{materia13, materia12}, 60, 4);
        Materia materia20 = new Materia("SociologiaOrganização", new Materia[]{materia5}, 60, 4);
//5°
        Materia materia21 = new Materia("Redes", new Materia[]{materia11}, 60, 5);
        Materia materia22 = new Materia("LFC", new Materia[]{materia12, materia4}, 60, 5);
        Materia materia23 = new Materia("BancodeDados1", new Materia[]{materia13}, 60, 5);
        Materia materia24 = new Materia("TGS", new Materia[]{materia8}, 60, 5);
        Materia materia25 = new Materia("EngSoft1", new Materia[]{materia15}, 60, 5);
//6°
        Materia materia26 = new Materia("LabRedes", new Materia[]{materia21}, 30, 6);
        Materia materia27 = new Materia("SistemasDistribuidos", new Materia[]{materia21, materia17, materia15}, 4, 6);
        Materia materia28 = new Materia("SAD", new Materia[]{materia23, materia25}, 60, 6);
        Materia materia29 = new Materia("IA", new Materia[]{materia19, materia14}, 60, 6);
        Materia materia30 = new Materia("EngSoft2", new Materia[]{materia25}, 60, 6);
//7°
        Materia materia31 = new Materia("EmpreendorismoeGestão", new Materia[]{materia8}, 60, 7);
        Materia materia32 = new Materia("GestãodeSI", new Materia[]{materia24}, 60, 7);
        Materia materia33 = new Materia("TestedeSoftware", new Materia[]{materia30}, 60, 7);
//8°
        Materia materia34 = new Materia("GerenciadeProjetos", new Materia[]{materia23}, 60, 8);
        Materia materia35 = new Materia("QualidadedeSoftware", new Materia[]{materia30}, 60, 8);
        Materia materia36 = new Materia("EvoluçãodeSoftware", new Materia[]{materia30}, 60, 8);
//9°
        Materia materia37 = new Materia("Pratica1", new Materia[]{materia21, materia23, materia25}, 180, 9);
        Materia materia38 = new Materia("TCC1", new Materia[]{materia23, materia16, materia21, materia25}, 60, 9);

        //10°
        Materia materia39 = new Materia("Estagio", new Materia[]{materia23, materia21, materia25}, 210, 10);
        Materia materia40 = new Materia("TCC2", new Materia[]{materia38}, 120, 10);
        Materia materia41 = new Materia("Pratica2", new Materia[]{materia37}, 60, 10);
//PIBIT, PIBIC e Atividades Complementares
        Materia materia42 = new Materia("PIBIC",  960, 0);
        Materia materia43 = new Materia("PIBIT",  960, 0);
        Materia materia44 = new Materia("AtividadesExtras", new Materia[]{}, 120, 0);


        //Dominios: todas matérias do segundo periodo em diante

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

        Object[] dominioMaterias = new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10,11,12,13,14,15,16,17,18, 19,20,21,22,23,24,25,26,27,
                28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44
        };


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



        Constraint constraints1;

        Constraint[] constraints = new  Constraint[1901]; //Tamanho de restrições

        //Restrição 1 - Primeiras 5 materias sendo obrigatória do 1° periodo

        constraints[0] = new BasicConstraint(new String[]{materia1.getNome(),  materia5.getNome()}, values -> (((Integer) values[0] + (Integer) values[1])) <= 6);
        constraints[1] = new BasicConstraint(new String[]{materia2.getNome(), materia5.getNome()}, values -> (((Integer) values[0] + (Integer) values[1])) <= 6);
        constraints[2] = new BasicConstraint(new String[]{materia3.getNome(), materia5.getNome()}, values -> (((Integer) values[0] + (Integer) values[1])) <= 6);
        constraints[3] = new BasicConstraint(new String[]{materia4.getNome(),  materia5.getNome()}, values -> (((Integer) values[0] + (Integer) values[1])) <= 6);

        //Restrição 2 - Garante que a matéria com pré requisito seja pego somente depois de pegar o pré requisito

        int aux1 = 4;
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

        //Restrição 3 - Tentativa de criar um newEqualConstraint para restringir que variaveis nao recebam valores de dominios iguais
        // ______________________________________________________________________________________________________________________________
        int contador = 0;
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

        }
        //_________________________________________________________________________________________________________________________________________________



        //Restrição 4 - Tentativa de criar uma restricao que use o periodo ofertado como base








        CSP csp3 = new BasicCSP( variaveis1, domain , constraints);


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

        BacktrackingSearch bs = new BacktrackingSearch();
        Assignment asn = bs.apply(csp3);
        //passa todas as variaveis e dominios
        System.out.println(asn.getAssignments());

        //passa o dominio de uma variavel em especifico
        // System.out.println(asn.getAssignments().get("QualidadedeSoftware"));

        Object [] dominios_reduzidos = new Object[44];

        for(Materia materia : variaveis2){
            materia.setPosicao_grade((int) asn.getAssignments().get(materia.getNome()));
        }

        for(Materia materia : variaveis2){
            System.out.println(" Materia: " + materia.getNome() + " Posicao na Grade: " + materia.getPosicao_grade());
        }

        String [][] matrizPeriodo = new String[10][8];
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
        }





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


    }

}






