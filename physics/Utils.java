package physics;

public class Utils {

	public static Vector add(Vector u, Vector v) {
		return new Vector(add(u.getVector(), v.getVector()));
	}
	
	public static double[] add(double[] u, double[] v) {
		double[] out = new double[u.length];
		for (int i = 0; i < u.length; i++) out[i] = u[i] + v[i];
		return out;
	}
	
	public static Vector subtract(Vector u, Vector v) {
		return new Vector(subtract(u.getVector(), v.getVector()));
	}
	
	public static double[] subtract(double[] u, double[] v) {
		double[] out = new double[u.length];
		for (int i = 0; i < u.length; i++) out[i] = u[i] - v[i];
		return out;
	}
	
	public static Vector multiply(double scalar, Vector vector) {
		return new Vector(multiply(scalar, vector.getVector()));
	}
	
	public static double[] multiply(double scalar, double[] vector) {
		double[] out = new double[vector.length];
		for (int i = 0; i < vector.length; i++) out[i] = vector[i] * scalar;
		return out;
	}
	
	public static double magnitude(double[] vector) {
		double s = 0;
		for (int i = 0; i < vector.length; i++) s += vector[i] * vector[i];
		return Math.sqrt(s);
	}
	
	public static Vector project(Vector u, Vector v) {
		return new Vector(multiply(dot(u.getVector(), v.getUnit()), v.getUnit()));
	}
	
	public static double dot(Vector u, Vector v) {
		return dot(u.getVector(), v.getVector());
		
	}
	
	public static double dot(double[] u, double[] v) {
		double s = 0;
		for (int i = 0; i < v.length ; i++) s+= v[i] * u[i];
		return s;
	}
}
