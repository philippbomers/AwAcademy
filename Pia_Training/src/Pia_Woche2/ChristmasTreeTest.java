package Pia_Woche2;

public class ChristmasTreeTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int leertaste = 1; leertaste <= 5 - i; leertaste++) {
                System.out.print(" ");
            }
            for (int stern = 1; stern <= (2 * i - 1); stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
