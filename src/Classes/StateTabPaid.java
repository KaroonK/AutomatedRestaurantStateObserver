package Classes;

import Interfaces.State;

/**
 * Created by Karoon on 12/13/2016.
 */
public class StateTabPaid implements State {
    @Override
    public void execute() {
        System.out.println("Client has paid their tab.\n Clearing Table.");
        System.out.println("Table has been cleared.");
        Restaurant.rest[Restaurant.tableChoice] = null;
    }
}
