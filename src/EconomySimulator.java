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

public class EconomySimulator 
{
	public static void main(String[] args) 
	{
		new EconomySimulator();
	}
	
	
	static Government gov = new Government(new Money("1T"));
	static ArrayList<Corporation> corps = new ArrayList<Corporation>();
	static ArrayList<Person> people = new ArrayList<Person>();
	
	static PersonFactory pf = new PersonFactory();
	
	static double inflationRate = 0.01;
	
	
	public EconomySimulator()
	{
		// initialize government
		echo("Initialize Government");
		initGov();
		
		// initialize corporations
		echo("Initialize Corporations");
		initCorps();
		
		// initialize people
		echo("Initialize People");
		initPeople();
		
		// run simulation
		echo("Run Simulation");
		run();
		
		// analyze results of sim
		echo("Analyze Results");
		analyze();
	}

	public void echo(String s)
	{
		System.out.println(s);
	}
	
	void initGov()
	{
		
	}
	
	void initCorps()
	{
		
	}
	
	void initPeople()
	{
		
	}
	
	void run()
	{
		
	}
	
	void analyze()
	{
		
	}
}
