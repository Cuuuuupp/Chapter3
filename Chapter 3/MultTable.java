
/**
 * Write a description of class MultTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultTable
{
    public static void main(String[] args) {
        int row = 1;
        int column;
        for (row = 1; row < 13; row++){
            for (column = 1; column < 13; column++){
                System.out.print((column * row) + "  ");
            }
            System.out.println("");
        }
    }
}