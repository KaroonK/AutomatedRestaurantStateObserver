package Classes;

import Interfaces.State;

/**
 * Created by Karoon on 12/13/2016.
 */
public class StateOrdered implements State {
    @Override
    public void execute() {
        System.out.println("Client has submitted their order.");
    }
}
