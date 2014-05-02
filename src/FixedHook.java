import java.util.*;

public class FixedHook extends PhysicsElement implements SpringAttachable{
	private static int id = 0;
	private final double mass;
	private final double radius;
	private double pos_t;
	private ArrayList<Spring> springs;
	
	protected FixedHook() {
		this(1.0, 0.1, 0);
	}
	
	public FixedHook(double mass, double radius, double position) {
		super(id++);
		this.mass = mass;
		this.pos_t = position;
		this.radius = radius;
		springs = new ArrayList<Spring>();
	}
   // to be coded by you. Think of a Ball that does not move.

	public void attachSpring(Spring s) {
		springs.add(s);
		
	}

	public double getPosition() {
		return this.pos_t;
	}

	@Override
	public String getDescription() {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public String getState() {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public void computeNextState(double delta_t, MyWorld myWorld) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void updateState() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public double getMass() {
		return this.mass;
	}
} 