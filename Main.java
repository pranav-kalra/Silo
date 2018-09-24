public class Main {

    public static void main(String[] args) {
	// write your code here
        // V = hπr^2 => V = h(1/4)πd^2

        double h1 = 72;
        double d1 = 22;
        double v1 = h1 * 3.14 * (d1/2) * (d1/2);
        double h2 = 19;
        double d2 = 18;
        double v2 = h2 * 3.14 * (d2/2) * (d2/2);
        double h3 = 50;
        double d3 = 13;
        double v3 = h3 * 3.14 * (d3/2) * (d3/2);
        double h4 = 67;
        double d4 = 16;
        double v4 = h4 * 3.14 * (d4/2) * (d4/2);
        double h5 = 16;
        double d5 = 14;
        double v5 = h5 * 3.14 * (d5/2) * (d5/2);
        double h6 = 53;
        double d6 = 23;
        double v6 = h6 * 3.14 * (d6/2) * (d6/2);
        double h7 = 69;
        double d7 = 22;
        double v7 = h7 * 3.14 * (d7/2) * (d7/2);
        double h8 = 30;
        double d8 = 22;
        double v8 = h8 * 3.14 * (d8/2) * (d8/2);
        double h9 = 52;
        double d9 = 23;
        double v9 = h9 * 3.14 * (d9/2) * (d9/2);
        double h10 = 40;
        double d10 = 16;
        double v10 = h10 * 3.14 * (d10/2) * (d10/2);
        double h11 = 31;
        double d11 = 18;
        double v11 = h11 * 3.14 * (d11/2) * (d11/2);
        double h12 = 75;
        double d12 = 23;
        double v12 = h12 * 3.14 * (d12/2) * (d12/2);
        //0.00378541m^3 to 1 gallon
        //264.17 gallons to m^3
        //.246 m^3 to 65 gallon
        //everything should be in gallons

        System.out.println("Tower 1: Diameter " + d1 + " | Height " + h1 + " | Volume " + v1);
        System.out.println("Tower 2: Diameter " + d2 + " | Height " + h2 + " | Volume " + v2);
        System.out.println("Tower 3: Diameter " + d3 + " | Height " + h3 + " | Volume " + v3);
        System.out.println("Tower 4: Diameter " + d4 + " | Height " + h4 + " | Volume " + v4);
        System.out.println("Tower 5: Diameter " + d5 + " | Height " + h5 + " | Volume " + v5);
        System.out.println("Tower 6: Diameter " + d6 + " | Height " + h6 + " | Volume " + v6);
        System.out.println("Tower 7: Diameter " + d7 + " | Height " + h7 + " | Volume " + v7);
        System.out.println("Tower 8: Diameter " + d8 + " | Height " + h8 + " | Volume " + v8);
        System.out.println("Tower 9: Diameter " + d9 + " | Height " + h9 + " | Volume " + v9);
        System.out.println("Tower 10: Diameter " + d10 + " | Height " + h10 + " | Volume " + v10);
        System.out.println("Tower 11: Diameter " + d11 + " | Height " + h11 + " | Volume " + v11);
        System.out.println("Tower 12: Diameter " + d12 + " | Height " + h12 + " | Volume " + v12);

        System.out.println();
        int population = 37640;
        double totalVolume = (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8
                + v9 + v10 + v11 + v12) * 264.172;

        double totalCityWaterUsageT = population * 65 * 28;
        double difference = (totalCityWaterUsageT - totalVolume) /  (population * 28);

        System.out.println("Population: " + population);
        System.out.println("Volume of Stored Water in Gallons: " + totalVolume);
        System.out.println("Total Theoretical Water Usage: " + totalCityWaterUsageT);
        System.out.println("Each person must save " + difference + " gallons of water, which means he/she must" +
                " use no more than " + (65 - difference) + " gallons per day.");
        System.out.println("Each person must save " + (difference*0.00378541) + " cubic meters of water, " +
                "which means he/she must use no more than " + (.246 - (difference*0.00378541)) +
                " cubic meters per day.");

    }
}
