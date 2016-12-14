package Classes;

import java.util.ArrayList;

/**
 * Created by Karoon on 12/11/2016.
 */
public class Order {
    ArrayList<MenuItem> listOrder;
    public Order(){
        listOrder = new ArrayList<MenuItem>();
    }
    public ArrayList<MenuItem> getListOrder(){
        return listOrder;
    }
    public void addOrder(MenuItem orderedItem){
        listOrder.add(orderedItem);
    }
    public void print(){
        int a = 0;
        for( MenuItem x: listOrder){
            System.out.println(x.getMenuItem());
            a++;
        }
    }
}