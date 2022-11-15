package aima.core.ProjetoFinal;

import aima.core.search.api.Assignment;
import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.csp.AC3;
import aima.core.search.basic.csp.BacktrackingSearch;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
import javafx.geometry.Pos;

import java.util.ArrayList;
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


      /*  Object[] posicoes = new Object[]{
                posicao1, posicao2, posicao3, posicao4, posicao5, posicao6, posicao7, posicao8, posicao9, posicao10,
                posicao11, posicao12, posicao13, posicao14, posicao15, posicao16, posicao17, posicao18, posicao19, posicao20,
                posicao21, posicao22, posicao23, posicao24, posicao25, posicao26, posicao27, posicao28, posicao29, posicao30,
                posicao31, posicao32, posicao33, posicao34, posicao35, posicao36, posicao37, posicao38, posicao39, posicao40,
                posicao41, posicao42, posicao43, posicao44, posicao45, posicao46, posicao47, posicao48, posicao49, posicao50,
                posicao61, posicao62, posicao63, posicao64, posicao65, posicao66, posicao67, posicao68, posicao69, posicao70,
                posicao81, posicao82, posicao83, posicao84, posicao85, posicao86, posicao87, posicao88, posicao89, posicao90,
                posicao91, posicao92, posica093, posicao94, posicao95, posicao96, posicao97, posicao98, posicao99, posicao100
                };
*/

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



        //Constraint constraints = new BasicConstraint( new String[] { materia1.getNome(),  materia2.getNome()}, values -> (( values[0]  ==  values[1])));

        Constraint[] constraints1 = {,
                    };

        Constraint[] constraints = new  Constraint[52]; //Tamanho de restrições                                                                        // [1,2,3,4,5,...]  +  [1,2,3,4,5...]
                                                                                                                   //   == [0,1,2,3,4,5]
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
        //Restrição 3
       /* int aux2 = 53;
        for(Materia materia : variaveis2){
            if(materia.getPreRequisito() != null){
                for(Materia preReq : materia.getPreRequisito()){
                    //   System.out.println(materia.getNome() +" "+ preReq.getNome());
                    constraints[aux2] = new BasicConstraint(new String[] { materia.getNome(), preReq.getNome() },
                            values -> (((Integer) values[0] > (Integer) values[1])));
                    aux2 ++;
                }
            }
        }*/

     /*   Constraint[] constraints2 = {new BasicConstraint(new String[]{ materia1.getNome(),  materia5.getNome()}, values -> (((Integer) values[0] < (Integer) values[1]))),
                new BasicConstraint(new String[]{variaveis[1], variaveis[4]}, values -> (((Integer) values[0]  <= (Integer) values[1]))),
                new BasicConstraint(new String[]{variaveis[2], variaveis[4]}, values -> (((Integer) values[0]  <= (Integer) values[1]))),
                new BasicConstraint(new String[]{variaveis[3],  variaveis[4]}, values -> (((Integer) values[0] <= (Integer) values[1]))),
                new BasicConstraint(new String[]{variaveis[4], variaveis[4]}, values -> (((Integer) values[0]  <= (Integer) values[1]))),
        };*/



                /*   Constraint constraints2 = new BasicConstraint( new String[] {  variaveis[0],  variaveis[1],  variaveis[2],
                             variaveis[3],  variaveis[4]}, values -> (( (String) values[0]  == (String) variaveis[0])
                                                                     && (String) values[1]  == (String) variaveis[1])
                                                                     && (String) values[2]  == (String) variaveis[2])
                                                                     && (String) values[2]  == (String) variaveis[2])
                                                                     && (String) values[2]  == (String) variaveis[2])
                   );*/



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





        AC3 ac3 = new AC3();
        ac3.test(csp3);

        System.out.println("\n============================================================================================================================================================================================================================================");
        System.out.println("-Depois de ac3.test()");
        System.out.println("============================================================================================================================================================================================================================================");

        System.out.println( "Variaveis : " + csp3.getVariables() );
        System.out.println( "Dominio   : " + csp3.getDomains() );
        System.out.println( "CSP       : " + csp3 );

    }

}



