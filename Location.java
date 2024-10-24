/**
 * Model a location in a city.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * @version 2024.10.07 DP classes 
 */
public class Location
{
    private int x;  
    private int y; 

    /**
     * Model a location in the city.
     * @param x The x coordinate. Must be positive.
     * @param y The y coordinate. Must be positive.
     * @throws IllegalArgumentException If a coordinate is negative.
     */
    public Location(int x, int y)
    {
        if(x < 0) {
            throw new IllegalArgumentException(
                "Negative x-coordinate: " + x);
        }
        if(y < 0) {
            throw new IllegalArgumentException(
                "Negative y-coordinate: " + y);
        }        
        this.x = x;
        this.y = y;
    }

    /**
     * @return The x coordinate.
     */
    public int getX()
    {
        return x;
    }

    /**
     * @return The y coordinate.
     */
    public int getY()
    {    
        return y;
    }

    /**
     * Generate the next location to visit in order to
     * reach the destination. If the current location
     * is the same location of the destination, show 
     * a message about we already arrived and return 
     * the current location.
     * @param destination Where we want to get to.
     * @return A location in a direct line from this to
     *         destination or the current location if we
     *         already reached to the destination.
     */
    public Location nextLocation(Location destination)
    {
        int xNuevo = this.x;
        int yNuevo = this.y;
        if((this.x == destination.getX()) && (this.y == destination.getY())){
            System.out.println("We have already reached to the destination");
        }
        else{
            if(this.x < destination.getX()){
                xNuevo++;
            }
            else{
                if(this.x > destination.getX()){
                    xNuevo--;
                }
            }
        
            if(this.y < destination.getY()){
                yNuevo++;
            }
            else{
                if(this.y > destination.getY()){
                    yNuevo--;
                }
            }
        }
        
        return (new Location(xNuevo, yNuevo));
    }

    /**
     * Determine the number of movements required to get
     * from here to the destination.
     * @param destination The required destination.
     * @return the number of movement steps.
     */
    public int distance(Location destination)
    {
        int xAux;
        int yAux;
        xAux = Math.abs(destination.getX() - this.x);
        yAux = Math.abs(destination.getY() - this.y);
        return (Math.max(xAux,yAux));
    }

    /**
     * @return A representation of the location.
     */
    public String toString()
    {
        return "location " + x + "," + y;
    }

    /**
     * Implement content equality for locations.
     * @return true if this location matches the other, false otherwise.
     */
    public boolean equals(Object other)
    {
        if(other instanceof Location) {
            Location otherLocation = (Location) other;
            return x == otherLocation.getX() &&
            y == otherLocation.getY();
        }
        else {
            return false;
        }
    }

    /**
     * Use the top 16 bits for the y value and the bottom for the x.
     * Except for very big grids, this should give a unique hash code
     * for each (x, y) pair.
     * @return A hashcode for the location.
     */
    public int hashCode()
    {
        return (y << 16) + x;
    }
}
