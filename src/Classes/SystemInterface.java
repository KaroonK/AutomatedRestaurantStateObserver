package Classes;
import Interfaces.*;
/**
 * Created by Karoon on 12/11/2016.
 */
public class SystemInterface {
    private static Invoker invoke = new Invoker();
    public static String getMenu(){
        Menu menu = invoke.getMenu();
        menu.printMenu();
        return menu + " ";
    }
    public static String getOrder(){
        Order order = invoke.getOrder();
        return order + "";
    }
    public static String getTab(){
        Tab tab = invoke.getTab();
        tab.getTab();
        return tab + " ";
    }
    public static String getState(){
        State s = invoke.getState();
        return s + " ";
    }
    public static String setTable(){
        Restaurant rest = invoke.getRestaurant();
        return rest + " ";

    }

}