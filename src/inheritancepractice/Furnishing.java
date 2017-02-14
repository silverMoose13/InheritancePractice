package inheritancepractice;

public class Furnishing extends Decoration {

    private String typeOfFurnishing;
    private String roomToBePlacedIn;
    private double surfaceAreaOfRoomToBePlacedIn;

    public String getRoomToBePlacedIn() {
        return roomToBePlacedIn;
    }

    public void setRoomToBePlacedIn(String roomToBePlacedIn) {
        this.roomToBePlacedIn = roomToBePlacedIn;
    }

    public double getSurfaceAreaOfRoomToBePlacedIn() {
        return surfaceAreaOfRoomToBePlacedIn;
    }

    public void setSurfaceAreaOfRoomToBePlacedIn(double surfaceAreaOfRoomToBePlacedIn) {
        this.surfaceAreaOfRoomToBePlacedIn = surfaceAreaOfRoomToBePlacedIn;
    }

    public String getTypeOfFurnishing() {
        return typeOfFurnishing;
    }

    public void setTypeOfFurnishing(String typeOfFurnishing) {
        this.typeOfFurnishing = typeOfFurnishing;
    }

    public boolean determineIfFurnishingWillFitInRoom() {
        if (calculateSurfaceArea() < getSurfaceAreaOfRoomToBePlacedIn()) {
            return true;
        } else {
            return false;
        }
    }

}
