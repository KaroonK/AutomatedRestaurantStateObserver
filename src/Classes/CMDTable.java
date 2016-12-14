package Classes;
import java.util.Scanner;
import Interfaces.CMDInterface;

/**
 * Created by Karoon on 12/13/2016.
 */
public class CMDTable implements CMDInterface {

    public Object execute() {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("CMDTable Execute");
        Restaurant r = new Restaurant();
        r.printTables();
        System.out.print("Please select a Table between 1 to 10:");
        do{
            choice = input.nextInt();
        }while(choice<=0 || choice >10);
        Restaurant.tableChoice = choice-1;
        Restaurant.agg = Restaurant.rest[Restaurant.tableChoice];
        return null;
    }

}
