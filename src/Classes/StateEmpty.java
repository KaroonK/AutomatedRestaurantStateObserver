package Classes;

import Interfaces.State;

/**
 * Created by Karoon on 12/13/2016.
 */
public class StateEmpty implements State {
    public void execute(){
        System.out.println("Table is empty.");
    }
}
