package aima.test;

import aima.core.environment.support.CSPFactory;
import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
import aima.core.search.basic.csp.AC3;


public class Principal {
    public static void main(String[] args) {
        Object[] digitos = new Object[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,
                19,20,21,22,23,24,25,26,27};

        String variaveis2[] = new String[] {"EixoF" , "RodaEF", "RodaDF" , "EixoT", "RodaET", "RodaDT",
                "PorcasEF", "PorcasDF", "PorcasET", "PorcasDT", "CalotaEF", "CalotaDF", "CalotaET",
                "CalotaDT", "Inspecionar"};
        Object[][] dominios2 = new Object[][] { digitos, digitos, digitos, digitos, digitos, digitos, digitos
                , digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos};
        Constraint restricao2 = new BasicConstraint( variaveis2,
                values -> ((Integer) values[0] + 10 ) <= ((Integer) values[1]));
               // values -> ((Integer) values[1] + 10 ) <= ((Integer) values[2]));

//                values -> ((Integer) values[0]) + ((Integer) values[1]) == 4 );

        CSP csp3 = new BasicCSP( variaveis2, dominios2, restricao2 );

        System.out.println( "Variáveis : " + csp3.getVariables() );
        System.out.println( "Dominios  : " + csp3.getDomains() );
        System.out.println( "DominioX  : " + csp3.getDomains().get( csp3.indexOf("X") ).getValues() );
        System.out.println( "DominioX-2: " + csp3.getDomainValues("X") );
        System.out.println( "DominioY  : " + csp3.getDomains().get( csp3.indexOf("Y") ).getValues() );
        System.out.println( "RestricaoBinaria: " + csp3.getConstraints().get(0).isBinary() );
        System.out.println( "csp       : " + csp3 );
        System.out.println("---------------------------------------------------------------------");
        System.out.println( "DominioX-2: " + csp3.getDomainValues("X") );
        System.out.println("---------------------------------------------------------------------");

        AC3 ac3 = new AC3();
        ac3.test(csp3);
        System.out.println("-Depois de ac3.test()--------------------------------------------------------------------");
        System.out.println( "Variáveis : " + csp3.getVariables() );
        System.out.println( "Dominios  : " + csp3.getDomains() );
        System.out.println( "DominioX  : " + csp3.getDomains().get( csp3.indexOf("X") ).getValues() );
        System.out.println( "DominioX-2: " + csp3.getDomainValues("X") );
        System.out.println( "DominioY  : " + csp3.getDomains().get( csp3.indexOf("Y") ).getValues() );
        System.out.println( "RestricaoBinaria: " + csp3.getConstraints().get(0).isBinary() );
        System.out.println( "csp       : " + csp3 );

        System.out.println("=====================================================================");

        //------------------------------------------------------------------------------------------


    }
}