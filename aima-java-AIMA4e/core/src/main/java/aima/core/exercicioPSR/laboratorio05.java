package aima.core.exercicioPSR;

import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.csp.AC3;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;

public class laboratorio05 {
    public static void main(String[] args){
        Object[] digitos = new Object[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        String variaveis[] = new String[] {"AxleF", "AxleB", "WheelRF", "WheelLF" , "WheelRB" ,"WheelLB", "NutsRF", "NutsLF", "NutsRB", "NutsLB", "CapRF", "CapLF", "CapRB", "CapLB", "Inspect"};
        Object[][] dominios = new Object[][] { digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos, digitos};


        Constraint restricao1 = new BasicConstraint( new String[] {"AxleF","WheelRF"},
                values -> (((Integer) values[0])+10) <= ((Integer) values[1]) ); //AxleF + 10 ≤ WheelRF

        Constraint restricao2 = new BasicConstraint( new String[] {"AxleF", "WheelLF"},
                values -> ((Integer) values[0])+10 <= ((Integer) values[1]) ); //AxleF + 10 ≤ WheelLF ;

        Constraint restricao3 = new BasicConstraint( new String[] {"AxleB", "WheelRB"},
                values -> ((Integer) values[0])+10 <= ((Integer) values[1]) ); //AxleB + 10 ≤ WheelRB;

        Constraint restricao4 = new BasicConstraint( new String[] {"AxleB", "WheelLB"},
                values -> ((Integer) values[0])+10 <= ((Integer) values[1]) ); //AxleB + 10 ≤ WheelLB;

        Constraint restricao5 = new BasicConstraint( new String[] {"WheelRF", "NutsRF"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) ); //WheelRF + 1 ≤ NutsRF

        Constraint restricao6 = new BasicConstraint( new String[] {"WheelLF", "NutsLF"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) ); //WheelLF + 1 ≤ NutsLF ;

        Constraint restricao7 = new BasicConstraint( new String[] {"WheelRB", "NutsRB"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) ); //WheelRB + 1 ≤ NutsRB;

        Constraint restricao8 = new BasicConstraint( new String[] {"WheelLB", "NutsLB"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) ); //WheelLB + 1 ≤ NutsLB;

        Constraint restricao9 = new BasicConstraint( new String[] {"NutsRF", "CapRF"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) ); //NutsRF + 2 ≤ CapRF ;

        Constraint restricao10 = new BasicConstraint( new String[] {"NutsLF", "CapLF"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) ); //NutsLF + 2 ≤ CapLF ;

        Constraint restricao11 = new BasicConstraint( new String[] {"NutsRB", "CapRB"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) ); //NutsRB + 2 ≤ CapRB;

        Constraint restricao12 = new BasicConstraint( new String[] {"NutsLB", "CapLB"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) ); //NutsLB + 2 ≤ CapLB

        Constraint restricao13 = new BasicConstraint( new String[] {"AxleF", "AxleB"},
                values -> (((Integer) values[0])+10 <= ((Integer) values[1])) || (((Integer) values[1])+10 <= ((Integer) values[0]) )); //(AxleF + 10 ≤ AxleB) or (AxleB + 10 ≤ AxleF )

        Constraint restricao14 = new BasicConstraint( new String[] {"AxleF","Inspect"},
                values -> ((Integer) values[0])+10 <= ((Integer) values[1]));

        Constraint restricao15 = new BasicConstraint(  new String[] {"AxleB","Inspect"},
                values -> ((Integer) values[0])+10 <= ((Integer) values[1]) );

        Constraint restricao16 = new BasicConstraint( new String[] {"WheelRF","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao17 = new BasicConstraint( new String[] {"WheelLF","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao18 = new BasicConstraint( new String[] {"WheelRB","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao19 = new BasicConstraint( new String[] {"WheelLB","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao20 = new BasicConstraint( new String[] {"NutsRF","Inspect"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) );

        Constraint restricao21 = new BasicConstraint( new String[] {"NutsLF","Inspect"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) );

        Constraint restricao22 = new BasicConstraint( new String[] {"NutsRB","Inspect"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) );

        Constraint restricao23 = new BasicConstraint( new String[] {"NutsLB","Inspect"},
                values -> ((Integer) values[0])+2 <= ((Integer) values[1]) );

        Constraint restricao24 = new BasicConstraint( new String[] {"CapRF","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao25 = new BasicConstraint( new String[] {"CapLF","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao26 = new BasicConstraint( new String[] {"CapRB","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint restricao27 = new BasicConstraint( new String[] {"CapLB","Inspect"},
                values -> ((Integer) values[0])+1 <= ((Integer) values[1]) );

        Constraint[] restricoes = {restricao1, restricao2, restricao3, restricao4, restricao5, restricao6, restricao7, restricao8, restricao9, restricao10, restricao11, restricao12, restricao13, restricao14,restricao15, restricao16, restricao17, restricao18, restricao19, restricao20, restricao21, restricao22, restricao23, restricao24, restricao25, restricao26, restricao27};

        CSP job = new BasicCSP( variaveis, dominios, restricoes);

        System.out.println( "Variáveis : " + job.getVariables() );
        System.out.println( "Dominios  : " + job.getDomains() );
        System.out.println( "Dominio Axlef  : " + job.getDomains().get( job.indexOf("AxleF") ).getValues() );
        System.out.println( "Dominio Inspect  : " + job.getDomains().get( job.indexOf("Inspect") ).getValues() );
        System.out.println( "RestricaoBinaria: " + job.getConstraints().get(0).isBinary());
        System.out.println( "csp       : " + job );
        System.out.println("---------------------------------------------------------------------");

        AC3 ac3 = new AC3();
        ac3.test(job);
        System.out.println("Depois de ac3.test()--------------------------------------------------------------------");
        System.out.println( "Variáveis : " + job.getVariables() );
        System.out.println( "Dominios  : " + job.getDomains() );
        System.out.println( "Dominio AxleF  : " + job.getDomains().get( job.indexOf("AxleF") ).getValues() );
        System.out.println( "Dominio Inspect: " + job.getDomainValues("Inspect") );
        System.out.println( "csp       : " + job );


    }
}