package Classes;
import Interfaces.State;
import java.lang.Object;
/**
 * Created by Karoon on 12/13/2016.
 */
public class Restaurant implements Cloneable {
    static Aggregator[] rest = new Aggregator[10];
    static Aggregator agg;
    static int tableChoice = 0;
    public Aggregator getTables(){
        return agg;
    }
    public void printTables(){
        int x = 0;
        for(Aggregator t: rest) {
            x++;
            try {
                if (t.getState().equals(new StateEmpty())) {
                    System.out.println("Table " + x + ": Empty");
                } else
                    System.out.println("Table " + x + ": Not Empty");
            }catch(NullPointerException e){
                System.out.println("Table " + x + ": Empty");
            }
        }
    }
}
