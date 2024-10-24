/**
 * Model an order to be delivered from one
 * location to another.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * @version 2024.10.07 DP classes 
 */
public class Order

{
    private String sendingName;
    private Location location;
    private Location destination;
    private int deliveryTime;
    private double weight;
    private String destinationName;
    private String deliveryPersonName;
    
    /**
     * Constructor for objects of class Order
     * @param sendingName The sender's name.
     * @param location The pickup location, must not be null.
     * @param destination The destination location, must not be null.
     * @param deliveryTime The hour of delivery.
     * @param weight  The order's weight
     * @param destinationName The name of the person receiving the order.
     * @throws NullPointerException If either location is null.
     */
    
    public Order(String sendingName, Location location, Location destination, int deliveryTime, 
    double weight, String destinationName) 
    {
        if(location == null) {
            throw new NullPointerException("Pickup location cannot be null");
        }
        if(destination == null) {
            throw new NullPointerException("Destination location cannot be null");
        }
        if(sendingName == null || sendingName.isEmpty()) {
            throw new IllegalArgumentException("Sender's name cannot be null or empty");
        }
        if(destinationName == null || destinationName.isEmpty()) {
            throw new IllegalArgumentException("Destination name cannot be null or empty");
        }
        if(deliveryTime <= 0) {
            throw new IllegalArgumentException("Delivery time must be positive");
        }
        if(weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }

        this.sendingName = sendingName;
        this.location = location;
        this.destination = destination;
        this.deliveryTime = deliveryTime;
        this.weight = weight;
        this.destinationName = destinationName;
    }

    

    /**
     * @return The name of the delivery person.
     */
    public String getDeliveryPersonName()
    {
    return this.deliveryPersonName;
    }

    /**
     * Set the new name of the delivery person.
     * @param The new name of the delivery person.
     */
    public void setDeliveryPersonName(String deliveryPersonName)
    {
    if (deliveryPersonName == null || deliveryPersonName.isEmpty()) {
            throw new IllegalArgumentException("Delivery person name cannot be null or empty");
        }
        else{
        this.deliveryPersonName = deliveryPersonName;
    }
    }

    /**
     * @return The destination location.
     */
    public Location getDestination()
    {
     
        return this.destination;
    }
    
    public Location getLocation()
    {
        return this.location;
    }

    /**
     * Return details of the passenger, such as where it is.
     * @return A string representation of the passenger.
     */
    public String toString()
    {
        return "Order "+"info a decidir"+" travelling from " +
        location + " to " + destination;
    }

    /**
     * Show the final information about the order, including the sender's name, the 
     * destination and name of the deliveryPerson who delivers it.
     */
    public String showFinalInfo()
    {
        return "Order sent by " + sendingName + " to " + destinationName + " at " + destination + 
               ". Delivered by: " + (deliveryPersonName != null ? deliveryPersonName : "Unknown");
    
    }

}