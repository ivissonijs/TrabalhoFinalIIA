package aima.core.ProjetoFinal;

import aima.core.logic.basic.common.Parser;
import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
import aima.core.search.basic.csp.AC3;

import java.util.List;

public class Principal{
    public static void main(String[] args) {
        Object[][] posicao = new Object[8][10];

//1° periodo
        Materia materia1 = new Materia("SemináriosdeProgramação",new Materia[]{},30, 1 );
        Materia materia2 = new Materia("CálculaA",new Materia[]{},60, 1 );
        Materia materia3 = new Materia("Vetores",new Materia[]{},60, 1 );
        Materia materia4 = new Materia("ProgramaçãoFuncional",new Materia[]{},60, 1 );
        Materia materia5 = new Materia("Intr. ADM",new Materia[]{},60, 1 );
//2° periodo
        Materia materia6 = new Materia("CalB",new Materia[]{materia2, materia3},60, 2 );
        Materia materia7 = new Materia("FundamentosMat",new Materia[]{},60, 2 );
        Materia materia8 = new Materia("OMSAdm",new Materia[]{materia5},60, 2 );
        Materia materia9 = new Materia("ProgramaçãoImperativa",new Materia[]{},60, 2 );
        Materia materia10 = new Materia("InformaticaEticaSoc",new Materia[]{},60, 2 );
//3° periodo
        Materia materia11= new Materia("ArquiteturaDeComputadores",new Materia[]{materia9},60, 3 );
        Materia materia12= new Materia("LogicaComputacao",new Materia[]{materia7},60, 3 );
        Materia materia13= new Materia("EstruturadeDados",new Materia[]{materia6, materia4},60, 3 );
        Materia materia14= new Materia("EstatisticaAplicada",new Materia[]{},60, 3 );
        Materia materia15= new Materia("POO",new Materia[]{materia9},60, 3 );
//4° periodo
        Materia materia16 = new Materia("MetodoseTecnicasPesquisa",new Materia[]{materia1},30, 4 );
        Materia materia17 = new Materia("SO",new Materia[]{materia11},60, 4 );
        Materia materia18 = new Materia("PAA",new Materia[]{materia7, materia13},60, 4 );
        Materia materia19 = new Materia("Grafos",new Materia[]{materia13, materia12},60, 4 );
        Materia materia20 = new Materia("SociologiaOrganização",new Materia[]{materia5},60, 4 );
//5°
        Materia materia21 = new Materia("Redes",new Materia[]{materia11},60, 5 );
        Materia materia22 = new Materia("LFC",new Materia[]{materia12, materia4},60, 5 );
        Materia materia23 = new Materia("BancodeDados1",new Materia[]{materia13},60, 5 );
        Materia materia24 = new Materia("TGS",new Materia[]{materia8},60, 5 );
        Materia materia25 = new Materia("EngSoft1",new Materia[]{materia15},60, 5 );
//6°
        Materia materia26= new Materia("LabRedes",new Materia[]{materia21},30, 6 );
        Materia materia27= new Materia("SistemasDistribuidos",new Materia[]{materia21, materia17, materia15},4, 6 );
        Materia materia28 = new Materia("SAD",new Materia[]{materia23, materia25},60, 6 );
        Materia materia29= new Materia("IA",new Materia[]{materia19, materia14},60, 6 );
        Materia materia30 = new Materia("EngSoft2",new Materia[]{materia25},60, 6 );
//7°
        Materia materia31 = new Materia("EmpreendorismoeGestão",new Materia[]{materia8},60, 7 );
        Materia materia32 = new Materia("GestãodeSI",new Materia[]{materia24},60, 7 );
        Materia materia33 = new Materia("TestedeSoftware",new Materia[]{materia30},60, 7 );
//8°
        Materia materia34= new Materia("GerenciadeProjetos",new Materia[]{materia23},60, 8 );
        Materia materia35 = new Materia("QualidadedeSoftware",new Materia[]{materia30},60, 8 );
        Materia materia36 = new Materia("EvoluçãodeSoftware",new Materia[]{materia30},60, 8);
//9°
        Materia materia37 = new Materia("Pratica1",new Materia[]{materia21, materia23, materia25},180, 9 );
        Materia materia38 = new Materia("TCC1",new Materia[]{materia23, materia16, materia21, materia25},60, 9 );

 //10°
        Materia materia39 = new Materia("Estagio",new Materia[]{materia23, materia21, materia25},210, 10 );
        Materia materia40 = new Materia("TCC2",new Materia[]{materia38},120, 10 );
        Materia materia41 = new Materia("Pratica2",new Materia[]{materia37},60, 10 );
//PIBIT, PIBIC e Atividades Complementares
        Materia materia42 = new Materia("PIBIC",new Materia[]{},960, 0 );
        Materia materia43 = new Materia("PIBIT",new Materia[]{},960, 0 );
        Materia materia44 = new Materia("AtividadesExtras",new Materia[]{},120, 0 );


        //Dominios: todas matérias do segundo periodo em diante
        Object[] variaveis = new Object[]{
                materia1,materia2,materia3,materia4,materia5,materia6,materia7,materia8,materia9,
                materia10,materia11,materia12,materia13,materia14,materia15,materia16,materia17,materia18,
                materia19,materia20,materia21,materia22,materia23,materia24,materia25,materia26,materia27,
                materia28,materia29,materia30,materia31,materia32,materia33,materia34,materia35,materia36,materia37,
                materia38,materia39,materia40,materia41,materia42,materia43,materia44};

       /* for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                posicao[i][j] = variaveis[i];
                System.out.println( posicao[i][j].toString() );
            }
        }*/


        /*String[] variables = new String[] { "AxleF",  "AxleB",
                "WheelRF","WheelLF","WheelRB","WheelLB",
                "NutsRF", "NutsLF", "NutsRB", "NutsLB",
                "CapRF",  "CapLF",  "CapRB",  "CapLB",
                "Inspect" };*/


        // Object[][] dominios = new Object[8][10]; //Variaveis

        //   for (int i = 0;  i < materias.length; i++) {
        //       dominios[i] = materias;
        //   }

    }


/*    Constraint[] constraints = {  new BasicConstraint( new String[] { variables[0], variables[2] }, values -> (((Integer) values[0] + 10 <= (Integer) values[1])))); // AxleF + 10 ≤ Wheel RF

             /*
                new BasicConstraint( new String[] { variables[0], variables[3] }, values -> (((Integer) values[0] + 10 <= (Integer) values[1]))), // AxleF + 10 ≤ Wheel LF
                new BasicConstraint( new String[] { variables[1], variables[4] }, values -> (((Integer) values[0] + 10 <= (Integer) values[1]))), // AxleB + 10 ≤ Wheel RB
                new BasicConstraint( new String[] { variables[1], variables[5] }, values -> (((Integer) values[0] + 10 <= (Integer) values[1]))), // AxleB + 10 ≤ Wheel LB

                new BasicConstraint( new String[] { variables[2], variables[6] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))),  // Wheel RF + 1 ≤ NutsRF
                new BasicConstraint( new String[] { variables[3], variables[7] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))),  // Wheel LF + 1 ≤ NutsLF
                new BasicConstraint( new String[] { variables[4], variables[8] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))),  // Wheel RB + 1 ≤ NutsRB
                new BasicConstraint( new String[] { variables[5], variables[9] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))),  // Wheel LB + 1 ≤ NutsLB

                new BasicConstraint( new String[] { variables[6], variables[10] }, values -> (((Integer) values[0] + 2 <= (Integer) values[1]))), // NutsRF + 2 ≤ CapRF
                new BasicConstraint( new String[] { variables[7], variables[11] }, values -> (((Integer) values[0] + 2 <= (Integer) values[1]))), // NutsLF + 2 ≤ CapLF
                new BasicConstraint( new String[] { variables[8], variables[12] }, values -> (((Integer) values[0] + 2 <= (Integer) values[1]))), // NutsRB + 2 ≤ CapRB
                new BasicConstraint( new String[] { variables[9], variables[13] }, values -> (((Integer) values[0] + 2 <= (Integer) values[1]))), // NutsLB + 2 ≤ CapLB

                new BasicConstraint( new String[] { variables[0], variables[1] }, values -> ( Math.abs( (Integer) values[0] - (Integer) values[1] ) >= 10 )), // Tempo entre os axles

                new BasicConstraint( new String[] { variables[10], variables[14] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))), // CapRF + 1 ≤ Inspection
                new BasicConstraint( new String[] { variables[11], variables[14] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))), // CapLF + 1 ≤ Inspection
                new BasicConstraint( new String[] { variables[12], variables[14] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))), // CapRB + 1 ≤ Inspection
                new BasicConstraint( new String[] { variables[13], variables[14] }, values -> (((Integer) values[0] + 1 <= (Integer) values[1]))), // CapLB + 1 ≤ Inspection
        };*/
/*
        CSP csp3 = new BasicCSP( variables, domain, constraints );

        System.out.println("\n============================================================================================================================================================================================================================================");
        System.out.println("-Antes de ac3.test()");
        System.out.println("============================================================================================================================================================================================================================================");

        System.out.println( "Variaveis : " + csp3.getVariables() );
        System.out.println( "Dominio   : " + csp3.getDomains() );
        System.out.println( "CSP       : " + csp3 );

        AC3 ac3 = new AC3();
        ac3.test(csp3);

        System.out.println("\n============================================================================================================================================================================================================================================");
        System.out.println("-Depois de ac3.test()");
        System.out.println("============================================================================================================================================================================================================================================");

        System.out.println( "Variaveis : " + csp3.getVariables() );
        System.out.println( "Dominio   : " + csp3.getDomains() );
        System.out.println( "CSP       : " + csp3 );

    }
    */


}
