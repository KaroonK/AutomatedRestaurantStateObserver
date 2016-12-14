package Classes;
import Interfaces.State;
/**
 * Created by Karoon on 12/13/2016.
 */
public class Aggregator implements Cloneable{
    private Menu menu;
    private Order orders;
    private State state = new StateEmpty();

    public Aggregator(){
        menu = new Menu();
        orders = new Order();
    }
    public Aggregator(Menu menu, Order orders){
        this.menu = menu;
        this.orders = orders;
    }
    public Menu getMenu(){
        return menu;
    }
    public Order getOrder(){
        return orders;
    }
    public void setOrder(Order o) { orders = o; }
    public State getState(){
        return state;
    }
    public void setState(State state){this.state = state;}
    public Aggregator(Aggregator aggre){
        Menu men = new Menu();
        Order orde = new Order();
        men = aggre.getMenu();
        orde = aggre.getOrder();
        Aggregator a = new Aggregator(men, orde);
    }

}
