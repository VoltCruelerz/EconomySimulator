/**=========================================================================
 * Copyright Michael Greene 2016
 * 
 * Name:			EconomySimulator.java
 * Description: 	Main class for the simulator.  Initializes and runs all others.
 * 
 * Version History
 * 
 * User                 Description
 * ------------------   -----------
 * Volt Cruelerz        Initial commit
 * 
 * =========================================================================
 */

import java.util.ArrayList;

public class EconomySimulator {

	static Government gov = new Government(new Money("1T"));
	static ArrayList<Corporation> corps = new ArrayList<Corporation>();
	static ArrayList<Person> people = new ArrayList<Person>();
	
	static PersonFactory pf = new PersonFactory();
	
	static double inflationRate = 0.01;
	
	
	public EconomySimulator()
	{
		// initialize government
		echo("Initialize Government");
		
		
		// initialize corporations
		echo("Initialize Corporations");
		
		
		// initialize people
		echo("Initialize People");
		
		
		// run simulation
		echo("Run Simulation");
		
		
		// analyze results of sim
		echo("Analyze Results");
		
	}
	
	public static void main(String[] args) {
		new EconomySimulator();
	}

	public void echo(String s)
	{
		System.out.println(s);
	}
}
