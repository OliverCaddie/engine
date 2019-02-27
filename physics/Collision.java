package physics;

import static physics.Utils.*;

public class Collision {

	private Particle a;
	private Particle b;
	private Vector iva, ivb, fva, fvb;
	
	public Collision(Particle a, Particle b) {
		this.a = a;
		this.b = b;
	}

	public void collide() {
		Vector d = new Vector(subtract(b.getPosition(), a.getPosition()));
		double ma = a.getMass();
		double mb = b.getMass();
		double m = ma + mb;
		iva = project(a.getVelocity(), d);
		ivb = project(b.getVelocity(), d);
		fva = add(
				multiply((ma - mb)/m, iva), 
				multiply((2 * mb)/m, ivb)
				);
		fvb = add(
				multiply((2 * ma)/m, iva), 
				multiply((mb - ma)/m, ivb)
				);
		a.setVelocity(add(fva, subtract(a.getVelocity(), iva)));
		b.setVelocity(add(fvb, subtract(b.getVelocity(), ivb)));
	}
	
	
	public Particle getA() {
		return a;
	}

	public Particle getB() {
		return b;
	}
}
