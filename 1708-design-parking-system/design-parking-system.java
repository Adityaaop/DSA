class ParkingSystem {
    int[] parkingSlots;
    public ParkingSystem(int big, int medium, int small) {
        this.parkingSlots = new int[4];
        parkingSlots[1] = big;
        parkingSlots[2] = medium;
        parkingSlots[3] = small;
    }
    public boolean addCar(int carType) {
        if(parkingSlots[carType] > 0)  {
            parkingSlots[carType] --;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */