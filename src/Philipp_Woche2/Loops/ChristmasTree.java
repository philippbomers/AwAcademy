/**
 * Dreiecke
 * Weihnachtsbaum (Bonusaufgabe)
 * “Weihnachten kommt immer so plötzlich”. Zeichne bereits jetzt schon einen
 * Weihnachtsbaum mit der Höhe von 5 Zeilen plus eine Zeile für den Stamm auf der Konsole.
 * Diese Aufgabe hat einen erhöhten Schwierigkeitsgrad und dient als echte Herausforderung.
 */

package Philipp_Woche2.Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main() {
        Scanner scanChristmasTreeInput = new Scanner(System.in);

        System.out.println("Wie hoch soll der Weihnachtsbaum sein?");
        int heightOfChristmasTree = scanChristmasTreeInput.nextInt();

        System.out.println(drawChristmasTree(heightOfChristmasTree));
    }

    public static String drawChristmasTree(int heightOfChristmasTree) {

        heightOfChristmasTree = heightOfChristmasTree * 2;
        StringBuilder drawChristmasTree = new StringBuilder();
        StringBuilder addBackground;
        StringBuilder currentLine;
        int i;
        int n;
        int t;

        for (i = 0; i < heightOfChristmasTree; i++) {

            currentLine = new StringBuilder();
            addBackground = new StringBuilder();

            for (t = i; t >= 0; t--) {
                currentLine.append("*");
            }

            for (n = 0; n < heightOfChristmasTree - currentLine.length(); n += 2) {
                addBackground.append(" ");
            }

            if (i % 2 == 0) {
                drawChristmasTree.append(addBackground).append(currentLine).append(addBackground).append("\n");
            }

            if (i + 1 == heightOfChristmasTree) {
                for (n = 0; n < heightOfChristmasTree; n += 2) {
                    addBackground.append(" ");
                }
                drawChristmasTree.append(addBackground).append("I").append(addBackground);
            }

        }
        return drawChristmasTree.toString();
    }
}
