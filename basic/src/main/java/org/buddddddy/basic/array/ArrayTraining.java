package org.buddddddy.basic.array;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 09.12.2017
 * @package org.buddddddy.basic.array
 */
public class ArrayTraining {

    public static void main(String[] args) {
//        int array[] = new int[5];
//        int array2[] = new int[6];
//        System.arraycopy(array, 0, array2, 0, 5);
//
//        int[][] a = new int[3][];
//        a[0] = new int[2];
//        a[1] = new int[4];
//        a[2] = new int[3];
//
//        int[][] b =
//                {
//                        {10, 20, 30},
//                        {15, 25, 35, 45, 55},
//                        {27, 29, 37, 48}
//                };
//
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        while (true) {
//            System.out.println("fd");
//            break;
//        }
//
////        for (;;) {
////
////        }
//
//
        long st, en;
        int n = 8000;
        int g[][] = new int[n][n];
        st = System.nanoTime();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = i + j;
            }
        }

        en = System.nanoTime();
        System.out.println("\nOne time " + (en - st)/1000000.d + " msc");

//        for (int i = 0; i < g.length; i++) {
//            for (int j = 0; j < g[i].length; j++) {
//                System.out.print(g[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("--------------------------");

        st = System.nanoTime();
        for (int i = 0; i < g.length; i++) {
            g[i][i] = i * 2;
            for (int j = 0; j < g[i].length; j++) {
                g[i][j] = g[j][i] = i + j;
            }
        }

        en = System.nanoTime();
        System.out.println("\nTwo time " + (en - st)/1000000.d + " msc");

//        for (int i = 0; i < g.length; i++) {
//            for (int j = 0; j < g[i].length; j++) {
//                System.out.print(g[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
