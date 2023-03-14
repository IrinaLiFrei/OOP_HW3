package OOP_HW3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private int number;

    public void setAction(ArrayList<Figure> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------SELECT AN OPTION-----------" + "\n" +
                "               1. View details of all figures in our collection" + "\n" +
                "               2. Add a figure" + "\n" +
                "               3. Remove a figure" + "\n" +
                "               4. Change parameters of a figure" + "\n" +
                "               5. Sort figures by their area" + "\n" +
                "---------Enter the number of what you want to do: ----------");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number < 0 || number > 6) {
                System.out.println("Enter the number from 1 to 5");
                setAction(arr);
            }
        } else {
            System.out.println("Enter the number from 1 to 5");
            setAction(arr);
        }
        Collection con = new Collection();
        if (number == 1) {
            con.showFigures(arr);
            setAction(arr);
        }
        if (number == 2) {
            con.addFigure(arr);
            setAction(arr);
        }
        if (number == 3) {
            con.removeFigure(arr);
            setAction(arr);
        }
        if (number == 4) {
            con.changeFigure(arr);
            setAction(arr);
        }
        if (number == 5) {
            con.showFigures(arr);
            con.sortByArea(arr);
            System.out.println();
            con.showFigures(arr);
            setAction(arr);
        }
        scanner.close();
    }

}
