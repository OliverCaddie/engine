package physics;

public class Particle {

	private Vector velocity;
	private double mass;
	private double radius;
	private double[] position;
	
	public Particle(double mass, double radius) {
		this(mass, radius, new double[] {0, 0, 0});
	}
	
	public Particle(double mass, double radius, double[] position) {
		this(mass, radius, position, new Vector());
	}
	
	public Particle(double mass, double radius, 
			double[] position, Vector velocity) {
		this.mass = mass;
		this.radius = radius;
		this.velocity = velocity;
		this.position = position;
	}
	
	
	
	
	
	
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double[] getPosition() {
		return position;
	}
	
	public void setPosition(double[] position) {
		this.position = position;
	}
	
	public Vector getVelocity() {
		return velocity;
	}
	
	public void setVelocity(Vector velocity) {
		this.velocity = velocity;
	}
	
	public Particle clone() {
		return new Particle(mass, radius, position.clone(), velocity.clone());
	}
}
