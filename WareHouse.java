
/**
 * Write a description of class WareHouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class WareHouse
{
    // instance variables - replace the example below with your own
    private Location location; //Lugar donde se encuentra el almacen
    private ArrayList<Order> order;  //Lista de paquetes que  hay en el almacen

    /**
     * Constructor for objects of class WareHouse
     */
    public WareHouse(Location location)
    {
        // initialise instance variables
        if (this.location==null)
        throw new NullPointerException("location");
        if (this.order==null)
        throw new NullPointerException("order");
        this.location= location;
        order=new ArrayList<Order>();
       
    }
    /**
     * get the WareHouse location
     * @returns the location where the warehouse is.
     */
    public Location getAlmacen(){
        return location;
    }
    /**
     * get arrayList 
     * @returns the list of warehouse orders.
     */
    public ArrayList<Order> getOrder(){
        return order;
    }
    /**
     * inserts an item into the warehouse order list
     */
    
    public void insertarOrder(Order order){
        this.order.add(order);
    }
    /**
     * returns an element from the warehouse list
     */
    public Order getElementoOrder(){
        return order.get(0);
    }
}
    

    

