/**=========================================================================
 * Copyright Michael Greene 2016
 * 
 * Name:			Government.java
 * Description: 	Class signifying the US government which absorbs tax funds and injects money
 *                  into the economy.
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


public class Government extends Entity {

	public Government(Money startingFunds) {
		super(startingFunds, Sex.ORG, true, 0);
		
	}

}
