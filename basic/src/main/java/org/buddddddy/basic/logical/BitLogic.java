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
public class BitLogic {

    public static void main(String[] args) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int а = 3; // О + 2 + 1 , или 0011 в двоичном представлении
        int b = 6; // 4 + 2 + О , или 0110 в двоичном представлении
        int c = а | b; // поразрядное или
        System.out.println(c);
        int d = а & b; //  поразрядное и
        System.out.println(d);
        int e = а ^ b; //  поразрядное исключающее ИЛИ
        System.out.println(e);
        int f = (~а & b) | (а & ~b);
        System.out.println(f);
        int g = ~а & 0x0f ;
        System.out.println(g);
        System.out.println( " а = " + binary[а]) ;
        System.out.println( " b = " + binary[b] ) ;
        System.out.println( " a|b = " + binary[c] ) ;
    }
}
