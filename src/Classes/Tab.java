package Classes;

/**
 * Created by Karoon on 12/11/2016.
 */
public class Tab {
    private Order orders;
    public Tab (Order orders){
        this.orders = orders;
    }
    public void getTab(){
        double total = 0;
        for(MenuItem m : orders.getListOrder()){
            System.out.println(m.getMenuItem() + " " + m.getMenuItemDescription() + " " + m.mCost);
            total += m.mCost;
        }
        System.out.println();
        System.out.printf("Your total: $%.2f", total);
        System.out.println();
        new StateTabPaid().execute();
        System.out.println();
    }

}