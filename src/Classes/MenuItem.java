package Classes;

/**
 * Created by Karoon on 12/11/2016.
 */
public class MenuItem {
    int mItem;
    String mDescription;
    double mCost;

    public MenuItem(int mItem, String mDescription, double mCost){
        this.mItem = mItem;
        this.mDescription = mDescription;
        this.mCost = mCost;
    }

    public int getMenuItem(){
        return mItem;
    }
    public String getMenuItemDescription(){
        return mDescription;
    }
    public double getMenuItemCost(){
        return mCost;
    }
    public String toString(){
        return(mItem +" " + mDescription + " " + mCost);
    }
}