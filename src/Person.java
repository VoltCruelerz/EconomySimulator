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
	double _baseSalary;
	double _skill;
	boolean _isSingle;
	int _age;
	double _practicalSalary;
	
	public Person(double baseSalary, Sex sex, int selfIndex, double skill, boolean isSingle, int age) {
		super(new Money(1.5*baseSalary), sex, false, selfIndex);
		_baseSalary = baseSalary;
		_skill = skill;
		_isSingle = isSingle;
		_age = age;
		_practicalSalary = baseSalary*PersonFactory.getAgeSalaryMult(age);
	}
}
