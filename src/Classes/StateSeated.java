package Classes;

import Interfaces.State;

/**
 * Created by Karoon on 12/13/2016.
 */
public class StateSeated implements State {
    @Override
    public void execute() {
        System.out.println("Client has been seated.");
    }
}
