package aima.core.projetoNovo;

import aima.core.search.api.CSP;
import aima.core.search.api.Constraint;
import aima.core.search.basic.support.BasicCSP;
import aima.core.search.basic.support.BasicConstraint;
import aima.core.search.basic.csp.AC3;


class Principal {
    public static void main(String[] args) {

        Object[] minute = new Object[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10,11,12,13,14,15,16,17,18,
                19,20,21,22,23,24,25,26,27 };

        String[] variables = new String[] { "AxleF",  "AxleB",
                "WheelRF","WheelLF","WheelRB","WheelLB",
                "NutsRF", "NutsLF", "NutsRB", "NutsLB",
                "CapRF",  "CapLF",  "CapRB",  "CapLB",
                "Inspect" };

        Object[][] domain = new Object[][] { minute, minute, minute,
                minute, minute, minute,
                minute, minute, minute,
                minute, minute, minute,
                minute, minute, minute };

        Constraint[] constraints = {  new BasicConstraint( new String[] { variables[0], variables[2] }, values -> (((Integer) values[0] + 10 <= (Integer) values[1]))), // AxleF + 10 ≤ Wheel RF
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
        };

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
}