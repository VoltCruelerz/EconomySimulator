/**=========================================================================
 * Copyright Michael Greene 2016
 * 
 * Name:			PersonFactory.java
 * Description: 	Factory to create Person objects
 * 
 * Version History
 * 
 * User                 Description
 * ------------------   -----------
 * Volt Cruelerz        Initial commit
 * 
 * =========================================================================
 */
import java.util.Random;

public class PersonFactory {

	public static Person getPerson(Money startingFunds) {
		Random r = new Random();
		Entity.Sex sex;
		if(r.nextBoolean())
		{
			sex = Entity.Sex.MAL;
		}
		else
		{
			sex = Entity.Sex.FEM;
		}
		
		Person p = new Person(startingFunds, sex, EconomySimulator.people.size());
		EconomySimulator.people.add(p);
		
		return p;
	}

}
