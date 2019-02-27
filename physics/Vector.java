package physics;

import static physics.Utils.*;

public class Vector {
	
	public static int DIM = 3;

	private double[] vector;
	private double[] unit;
	private double magnitude;
	
	public Vector() {
		vector = new double[] {0, 0, 0};
		unit = new double[] {0, 0, 0};
		magnitude = 0;
	}
	
	public Vector(double[] vector) {
		this.vector = vector.clone();
		magnitude = magnitude(vector);
		unit = multiply(1/magnitude, vector);
	}
	
	public Vector(double[] unit, double magnitude) {
		this.unit = unit.clone();
		this.magnitude = magnitude;
		vector = multiply(magnitude, unit);
	}
	
	public double[] getUnit() {
		return unit.clone();
	}
	
	public void setUnit(double[] unit) {
		this.unit = unit.clone();
		vector = multiply(magnitude, this.unit);
	}

	public double[] getVector() {
		return vector.clone();
	}

	public void setVector(double[] vector) {
		this.vector = vector.clone();
		magnitude = magnitude(this.vector);
		unit = multiply(1/magnitude, this.vector);
	}

	public double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
		vector = multiply(magnitude, unit);
	}
	
	public Vector clone() {
		return new Vector(vector);
	}
}
