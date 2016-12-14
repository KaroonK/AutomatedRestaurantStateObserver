package Classes;

import Interfaces.CMDInterface;

/**
 * Created by Karoon on 12/13/2016.
 */
public class CMDGetMenu implements CMDInterface {
    private Aggregator a;
    public CMDGetMenu(Aggregator a) {
        this.a = a;
    }
    public Menu execute(){
        System.out.println("CMD Get Menu Execute. \n");
        a.setState(new StateSeated());
        return a.getMenu();
    }
}
