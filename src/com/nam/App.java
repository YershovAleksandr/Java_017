package com.nam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private int mFlag;

    private void init() throws IOException {
        System.out.println("App::init()");

      /*  mFlag = 24;

        Number nb;

        nb = 69;

        System.out.println(nb.byteValue());


        Double d1 = new Double(3.14159);

        Double d2 = new Double("314159E-5");

        System.out.print(d1 + " = " + d2 + " -> " + d1.equals(d2));


        d1 = new Double(1/0.);
        d2 = new Double(0/0.);

        System.out.println();
        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
*/
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        int i;
        int sum = 0;

        System.out.println("Please enter number, 0 - for exit.");

        do {
            str = br.readLine();

            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Bad format");
                i = 0;
            }

            sum += i;

            System.out.println("Current summ equal: " + sum);
        } while (i != 0);

*/


        System.out.println("Free memory " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory " + Runtime.getRuntime().totalMemory());

        Runtime.getRuntime().gc();

        System.out.println("Free memory " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory " + Runtime.getRuntime().totalMemory());


        //Runtime.getRuntime().traceMethodCalls(true);




    }

    public void run() throws IOException {
        System.out.println("App::run()");

        init();

        System.out.println("\nApp::mFlag = " + mFlag);

    }
}
