package aima.core.ProjetoFinal;

import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.csp.AC3;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class Principal{
    public static void main(String[] args) {


//1° periodo
        Materia materia1 = new Materia("SemináriosdeProgramação", new Materia[]{}, 30, 1);
        Materia materia2 = new Materia("CálculaA", new Materia[]{}, 60, 1);
        Materia materia3 = new Materia("Vetores", new Materia[]{}, 60, 1);
        Materia materia4 = new Materia("ProgramaçãoFuncional", new Materia[]{}, 60, 1);
        Materia materia5 = new Materia("Intr. ADM", new Materia[]{}, 60, 1);
//2° periodo
        Materia materia6 = new Materia("CalB", new Materia[]{materia2, materia3}, 60, 2);
        Materia materia7 = new Materia("FundamentosMat", new Materia[]{}, 60, 2);
        Materia materia8 = new Materia("OMSAdm", new Materia[]{materia5}, 60, 2);
        Materia materia9 = new Materia("ProgramaçãoImperativa", new Materia[]{}, 60, 2);
        Materia materia10 = new Materia("InformaticaEticaSoc", new Materia[]{}, 60, 2);
//3° periodo
        Materia materia11 = new Materia("ArquiteturaDeComputadores", new Materia[]{materia9}, 60, 3);
        Materia materia12 = new Materia("LogicaComputacao", new Materia[]{materia7}, 60, 3);
        Materia materia13 = new Materia("EstruturadeDados", new Materia[]{materia6, materia4}, 60, 3);
        Materia materia14 = new Materia("EstatisticaAplicada", new Materia[]{}, 60, 3);
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
        Materia materia42 = new Materia("PIBIC", new Materia[]{}, 960, 0);
        Materia materia43 = new Materia("PIBIT", new Materia[]{}, 960, 0);
        Materia materia44 = new Materia("AtividadesExtras", new Materia[]{}, 120, 0);


        //Dominios: todas matérias do segundo periodo em diante
       /* Object[] variaveis = new Object[]{
                materia1, materia2, materia3, materia4, materia5, materia6, materia7, materia8, materia9,
                materia10, materia11, materia12, materia13, materia14, materia15, materia16, materia17, materia18,
                materia19, materia20, materia21, materia22, materia23, materia24, materia25, materia26, materia27,
                materia28, materia29, materia30, materia31, materia32, materia33, materia34, materia35, materia36, materia37,
                materia38, materia39, materia40, materia41, materia42, materia43, materia44};
*/
        String[] variaveis= new String[]{
                materia1.getNome(),materia2.getNome(),materia3.getNome(),materia4.getNome(),materia5.getNome(),materia6.getNome(),
                materia7.getNome(),materia8.getNome(),materia9.getNome(),
                materia10.getNome(),materia11.getNome(), materia12.getNome(),materia13.getNome(),materia14.getNome(),
                materia15.getNome(),materia16.getNome(),materia17.getNome(),materia18.getNome(),
                materia19.getNome(),materia20.getNome(),materia21.getNome(),materia22.getNome(),materia23.getNome(),
                materia24.getNome(),materia25.getNome(),materia26.getNome(),materia27.getNome(),materia28.getNome(),
                materia29.getNome(),materia30.getNome(),materia31.getNome(),materia32.getNome(),materia33.getNome(),
                materia34.getNome(),materia35.getNome(),materia36.getNome(),materia37.getNome(),materia38.getNome(),
                materia39.getNome(),materia40.getNome(),materia41.getNome(),materia42.getNome(),materia43.getNome(),
                materia44.getNome(),};



// linha 0
        Posicao posicao1 = new Posicao(0,0);
        Posicao posicao2 = new Posicao(0,1);
        Posicao posicao3 = new Posicao(0,2);
        Posicao posicao4 = new Posicao(0,3);
        Posicao posicao5 = new Posicao(0,4);
        Posicao posicao6 = new Posicao(0,5);
        Posicao posicao7 = new Posicao(0,6);
        Posicao posicao8 = new Posicao(0,7);
        Posicao posicao9 = new Posicao(0,8);
        Posicao posicao10 = new Posicao(0,9);
// linha 1
        Posicao posicao11 = new Posicao(1,0);
        Posicao posicao12= new Posicao(1,1);
        Posicao posicao13 = new Posicao(1,2);
        Posicao posicao14 = new Posicao(1,3);
        Posicao posicao15 = new Posicao(1,4);
        Posicao posicao16 = new Posicao(1,5);
        Posicao posicao17 = new Posicao(1,6);
        Posicao posicao18 = new Posicao(1,7);
        Posicao posicao19 = new Posicao(1,8);
        Posicao posicao20 = new Posicao(1,9);
// linha 2
        Posicao posicao21 = new Posicao(2,0);
        Posicao posicao22 = new Posicao(2,1);
        Posicao posicao23 = new Posicao(2,2);
        Posicao posicao24 = new Posicao(2,3);
        Posicao posicao25 = new Posicao(2,4);
        Posicao posicao26 = new Posicao(2,5);
        Posicao posicao27 = new Posicao(2,6);
        Posicao posicao28 = new Posicao(2,7);
        Posicao posicao29 = new Posicao(2,8);
        Posicao posicao30 = new Posicao(2,9);
// linha 3
        Posicao posicao31 = new Posicao(3,0);
        Posicao posicao32 = new Posicao(3,1);
        Posicao posicao33 = new Posicao(3,2);
        Posicao posicao34 = new Posicao(3,3);
        Posicao posicao35 = new Posicao(3,4);
        Posicao posicao36 = new Posicao(3,5);
        Posicao posicao37 = new Posicao(3,6);
        Posicao posicao38 = new Posicao(3,7);
        Posicao posicao39 = new Posicao(3,8);
        Posicao posicao40 = new Posicao(3,9);
// linha 4
        Posicao posicao41 = new Posicao(4,0);
        Posicao posicao42 = new Posicao(4,1);
        Posicao posicao43 = new Posicao(4,2);
        Posicao posicao44 = new Posicao(4,3);
        Posicao posicao45 = new Posicao(4,4);
        Posicao posicao46 = new Posicao(4,5);
        Posicao posicao47 = new Posicao(4,6);
        Posicao posicao48 = new Posicao(4,7);
        Posicao posicao49 = new Posicao(4,8);
        Posicao posicao50 = new Posicao(4,9);
// linha 5
        Posicao posicao61 = new Posicao(5,0);
        Posicao posicao62 = new Posicao(5,1);
        Posicao posicao63 = new Posicao(5,2);
        Posicao posicao64 = new Posicao(5,3);
        Posicao posicao65 = new Posicao(5,4);
        Posicao posicao66 = new Posicao(5,5);
        Posicao posicao67 = new Posicao(5,6);
        Posicao posicao68 = new Posicao(5,7);
        Posicao posicao69 = new Posicao(5,8);
        Posicao posicao70 = new Posicao(5,9);
// linha 6
        Posicao posicao81 = new Posicao(6,0);
        Posicao posicao82 = new Posicao(6,1);
        Posicao posicao83 = new Posicao(6,2);
        Posicao posicao84 = new Posicao(6,3);
        Posicao posicao85 = new Posicao(6,4);
        Posicao posicao86 = new Posicao(6,5);
        Posicao posicao87 = new Posicao(6,6);
        Posicao posicao88 = new Posicao(6,7);
        Posicao posicao89 = new Posicao(6,8);
        Posicao posicao90 = new Posicao(6,9);
// linha 7
        Posicao posicao91 = new Posicao(7,0);
        Posicao posicao92 = new Posicao(7,1);
        Posicao posica093 = new Posicao(7,2);
        Posicao posicao94 = new Posicao(7,3);
        Posicao posicao95 = new Posicao(7,4);
        Posicao posicao96 = new Posicao(7,5);
        Posicao posicao97 = new Posicao(7,6);
        Posicao posicao98 = new Posicao(7,7);
        Posicao posicao99 = new Posicao(7,8);
        Posicao posicao100 = new Posicao(7,9);


        Object[] posicoes = new Object[]{
                posicao1, posicao2, posicao3, posicao4, posicao5, posicao6, posicao7, posicao8, posicao9, posicao10,
                posicao11, posicao12, posicao13, posicao14, posicao15, posicao16, posicao17, posicao18, posicao19, posicao20,
                posicao21, posicao22, posicao23, posicao24, posicao25, posicao26, posicao27, posicao28, posicao29, posicao30,
                posicao31, posicao32, posicao33, posicao34, posicao35, posicao36, posicao37, posicao38, posicao39, posicao40,
                posicao41, posicao42, posicao43, posicao44, posicao45, posicao46, posicao47, posicao48, posicao49, posicao50,
                posicao61, posicao62, posicao63, posicao64, posicao65, posicao66, posicao67, posicao68, posicao69, posicao70,
                posicao81, posicao82, posicao83, posicao84, posicao85, posicao86, posicao87, posicao88, posicao89, posicao90,
                posicao91, posicao92, posica093, posicao94, posicao95, posicao96, posicao97, posicao98, posicao99, posicao100
                };

        //Object[][] posicao = new Object[8][10];

        Object[][] dominio = new Object[][] { posicoes, posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,posicoes,
                posicoes,posicoes,posicoes,posicoes,};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
           //     posicao[i][j] = posicao[i];
            }
        }


        Constraint constraints = new BasicConstraint( new String[] {  variaveis[0],  variaveis[2]}, values -> (((Integer) values[0] + 10 <= (Integer) values[1]))); // AxleF + 10 ≤ Wheel RF};
        Constraint constraints2 = new BasicConstraint( new String[] {  variaveis[0],  variaveis[2]}, values -> (((Integer) values[0] + 10 <= (Integer) values[1])));

        System.out.println("Restrições saindo aqui");
        System.out.println(constraints);
        System.out.println("Terminando");


        CSP csp3 = new BasicCSP( variaveis, dominio , constraints);

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

}



