import java.util.Scanner;
/**
 * Write a description of class Stars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stars
{
    public static void main(String[] args) {
        int biggestLine;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Stars are in the biggest line?");
        biggestLine = scan.nextInt();
        
        String shape = "";
        
        System.out.println("What Shape do you want? (Shape1 Shape2 Shape3)");
        shape = scan.next();
        
        int numberOfStars = 0;
        int currentLine = 0;
        int numberOfSpaces = 0;
        if (shape.equals("Shape1")) {
            for (currentLine = 0; currentLine < biggestLine + 1; currentLine++){
                for (numberOfStars = 0; numberOfStars < currentLine; numberOfStars++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        if (shape.equals("Shape2")) {
            for (currentLine = biggestLine; currentLine > 0; currentLine--){
                for (numberOfStars = 0; numberOfStars < currentLine; numberOfStars++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        if (shape.equals("Shape3")) {
            for (currentLine = biggestLine; currentLine > 0; currentLine--){
                for (numberOfSpaces = 0; numberOfSpaces < currentLine ; numberOfSpaces++) {
                    System.out.print(" ");
                }
                for (numberOfStars = currentLine; numberOfStars < biggestLine + 1; numberOfStars++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
