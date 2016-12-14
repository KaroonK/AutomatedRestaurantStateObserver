package Classes;

import Interfaces.CMDInterface;

/**
 * Created by Karoon on 12/13/2016.
 */
public class CMDGetTab implements CMDInterface {
    private Aggregator a;
    public CMDGetTab(Aggregator aggr){
        this.a = Restaurant.agg;
    }
    public Tab execute(){
        a.setState(new StateTabPaid());
        a.setState(new StateEmpty());
        return new Tab(Restaurant.rest[Restaurant.tableChoice].getOrder());
    }
}
