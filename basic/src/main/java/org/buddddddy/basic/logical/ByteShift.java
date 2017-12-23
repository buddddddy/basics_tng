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
public class ByteShift {

    public static void main(String[] args) {
        byte а = 64, b;
        int i ;
        i = а << 2 ;
        b = (byte) (а<<2);
        System.out.println("Пepвoнaчaльнoe значение а : " + а ) ;
        System.out.println(" i and b : " + i + " " + b ) ;
    }
}
