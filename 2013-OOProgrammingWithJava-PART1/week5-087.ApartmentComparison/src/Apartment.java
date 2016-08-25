
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    // larger method
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    // price diff method
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.pricePerSquareMeter*this.squareMeters-otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
    }
    
    // more inxpensive method
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.pricePerSquareMeter*this.squareMeters > otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
    }
}
