package Classes;
import Interfaces.State;
/**
 * Created by Karoon on 12/13/2016.
 */
public class Invoker {
    Aggregator agg = new Aggregator();
    public Menu getMenu(){
        return new CMDGetMenu(agg).execute();
    }
    public Order getOrder(){
        return (Order) new CMDSubmitOrder(agg).execute();
    }
    public Tab getTab(){
        return (Tab) new CMDGetTab(agg).execute();
    }
    public State getState(){return (State) new CMDGetTableState(agg).execute();}
    public Restaurant getRestaurant(){return (Restaurant) new CMDTable().execute();}
}
