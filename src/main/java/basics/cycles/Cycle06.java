/* Когда-нибудь, когда полностью разберусь с Сhar нужно будет вернуться и поправить таблицу вывода на экран
 * BS и TAB воспринимает соответстввенно и не выводит а исполняет. возможно стоит заключить вывод в одинарные ковычки.
 */

package basics.cycles;

/**
 * @author Potapov Alexey;
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Cycle06 {
    public static void main(String[] args) {
        System.out.print("ASCII символы и коды:\nDEC CHAR\n");
        for (int i = 1; i < 256; i++) {
            char ch = charPrinting(i);
            System.out.printf("%03d %3s%n", i, ch);
        }
    }

    public static char charPrinting(int numberOfChar) {
        return (char) numberOfChar;
    }
}