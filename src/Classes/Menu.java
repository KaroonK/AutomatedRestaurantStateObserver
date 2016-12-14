package Classes;

import java.util.ArrayList;

/**
 * Created by Karoon on 12/11/2016.
 */
public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    public Menu(){
        menu.add(new MenuItem(0,"Clams Casino",10.95));
        menu.add(new MenuItem(1,"Steamed Shrimp", 17.49));
        menu.add(new MenuItem(2, "Caesar Salad", 7.95 ));
        menu.add(new MenuItem(3, "Cream of Crab", 5.65));
        menu.add(new MenuItem(4, "New England Clam" , 4.95));
        menu.add(new MenuItem(5, "Smokehouse Crab Cake", 27.95));
        menu.add(new MenuItem(6, "Mexican Crab Cake", 27.95));
        menu.add(new MenuItem(7, "Salmon Dijonaise", 15.45));
        menu.add(new MenuItem(8, "Tilapia Parmesan", 15.45));
        menu.add(new MenuItem(9, "Orange Roughy", 17.95));
        menu.add(new MenuItem(10, "Prime Rib", 22.95));
    }
    public ArrayList<MenuItem> getMenu(){
        return menu;
    }
    public void printMenu(){
        for(MenuItem x : menu){
            System.out.println(x.getMenuItem() + " " + x.mDescription + " " + x.mCost);
        }
        System.out.println();
    }
}