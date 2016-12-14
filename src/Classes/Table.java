package Classes;
import Interfaces.State;
/**
 * Created by Karoon on 12/13/2016.
 */
public class Table {
    State tableState = new StateEmpty();
    private Order o;
    private Tab t;
    public Table(Order o, State s){
        this.o = o;
        tableState = s;
    }
    public void setState(State s){
        tableState = s;
    }
    public State getState(){
        return this.tableState;
    }
    public void execute(){
        this.tableState.execute();
    }

}
