package Classes;
import Interfaces.CMDInterface;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;
/**
 * Created by Karoon on 12/13/2016.
 */
public class CMDSubmitOrder implements CMDInterface{
    static int count  = 0;
    private Aggregator a;
    public CMDSubmitOrder(Aggregator a){
        this.a = a;
    }
    public Object execute(){
        int userChoice;
        Scanner input = new Scanner(System.in);
        Menu aMenu = a.getMenu();
        aMenu.printMenu();
        System.out.print("Please enter a menu number, -1 to quit: ");
        userChoice = input.nextInt();
        Order ord = new Order();
        while(userChoice != -1){
            try {
                ord.addOrder(aMenu.getMenu().get(userChoice));
                System.out.print("Another item (-1 to quit): ");
                userChoice = input.nextInt();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Please enter a number from the menu");
                System.out.print("Another item (-1 to quit): ");
                userChoice = input.nextInt();
            }
        }
        a.setOrder(ord);
        a.setState(new StateOrdered());
        Restaurant.agg = new Aggregator();
        Restaurant.agg.setOrder(ord);
        Restaurant.rest[Restaurant.tableChoice] = Restaurant.agg;
        System.out.println("CMDSUBMITORDER" + Restaurant.rest[Restaurant.tableChoice].getOrder().listOrder.size());
        count++;
        return null;
    }
}
