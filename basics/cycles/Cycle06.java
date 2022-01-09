/*Когда-нибудь, когда полностью разберусь с Сhar нужно будет вернуться и поправить таблицу вывода на экран
* BS TAB воспринимает соответстввенно и не выводит а исполняет. возможно стоит заключить вывод в одинарные ковычки.
*/

package com.epam.IntroductionToJavaOnline.basics.cycles;

/**
 * @author Potapov Alexey;
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Cycle06 {
    public static void main(String[] args) {
        System.out.print("ASCII символы и коды:\nDEC CHAR HEX\n");
        for (int i = 1; i < 256; i++) {
            char ch = (char) i;
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %4s%n", i, ch, tempHex);
        }
    }
}