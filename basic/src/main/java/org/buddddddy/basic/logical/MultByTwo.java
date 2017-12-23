package org.buddddddy.basic.logical;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 16.12.2017
 * @package org.buddddddy.basic.logical
 */
public class MultByTwo {

    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        System.out.println(num);
        for (i = 0; i < 4; i++) {
            num = num << 1;
//            System.out.println(num);
        }

        int a = -1;
        System.out.println(Integer.toBinaryString(a));
        a = a >>>1;
        System.out.println(Integer.toBinaryString(a));
    }
}
