package lab;

public class RoadTripLog {
	
	private double TotalDistance;
	private double TotalFuel;
	private String tripName;
	
	public RoadTripLog (String name) {
		
		this.tripName = name;
		this.TotalDistance = 0;
		this.TotalFuel = 0;
	}
	
	public double addDistance(double dist) {
		return TotalDistance += dist;
	}
	
	public double addFuel(double fuel) {
		return TotalFuel += fuel;
	}
	
	public double getTotalDistance() {
		return TotalDistance;
	}
	
	public double getTotalFuel() {
		return TotalFuel;
	}
	
	public double getMPG() {
		return Math.round((TotalDistance/TotalFuel) * 10.0) / 10.0;
	}

	
	public String toString() {
		return ("Trip: " + tripName + "\nDistance: " + TotalDistance 
				+ "\nFuel Used: " + TotalFuel + "\nMPG: " 
				+ Math.round((TotalDistance/TotalFuel) * 10.0) / 10.0);
		
		
		
	}
}
