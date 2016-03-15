/**=========================================================================
 * Copyright Michael Greene 2016
 * 
 * Name:			Person.java
 * Description: 	Class signifying an individual person
 * 
 * Version History
 * 
 * User                 Description
 * ------------------   -----------
 * Volt Cruelerz        Initial commit
 * 
 * =========================================================================
 */

public class Person extends Entity {

	Corporation _employer = null;
	
	public Person(Money startingFunds, Sex sex, int selfIndex) {
		super(startingFunds, sex, false, selfIndex);
	}
}
