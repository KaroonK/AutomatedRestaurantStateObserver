package Classes;

import Interfaces.*;

/**
 * Created by Karoon on 12/13/2016.
 */
public class CMDGetTableState implements CMDInterface {
    private Aggregator a = new Aggregator();
    public CMDGetTableState(Aggregator a){
        this.a = a;
    }
    public Object execute() {
        a.getState().execute();
        return a.getState();
    }
}
