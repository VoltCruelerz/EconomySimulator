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

	public static Person getRandomPerson() {
		
		Entity.Sex sex = getRandomSex();
		double skill = getRandomSkill();
		int age = getRandomAge();
		boolean isSingle = getRandomIsSingle(age);
		
		
		
		double salary = getRandomSalary(sex, age, skill, isSingle);
		
		Person p = new Person(salary, sex, EconomySimulator.people.size(), skill, isSingle, age);
		EconomySimulator.people.add(p);
		
		return p;
	}
	
	static Entity.Sex getRandomSex()
	{
		Random r = new Random();
		if(r.nextBoolean())
			return Entity.Sex.MAL;
		else
			return Entity.Sex.FEM;
	}
	
	static boolean getRandomIsSingle(int age)
	{
		if(age < 18)
			return false;
		
		Random r = new Random();
		double i = 100*r.nextDouble();
		
		if(age < 30)
			return ((i+age) > 65);
		else
			return ((i+30)) > 65;
	}
	
	static int getRandomAge()
	{
		Random r = new Random();
		double i = 100.0*r.nextDouble();
		double age;
		
		double j = r.nextDouble();
		
		if     (i < 19.4) age = 0;
		else if(i < 33.1) age = 15+j*9;
		else if(i < 73.0) age = 25+j*19;
		else if(i < 85.6) age = 55+j*9;
		else              age = 65+j*25;
		
		return (int)age;
	}

	static double getRandomSkill()
	{
		Random r = new Random();
		double base = 2.0*r.nextDouble()-1.0;// [-1,+1]
		double decimal = base*0.20;// [-0.2,+0.20]
		return decimal+1.0;
	}
	
	static double getRandomSalary(Entity.Sex sex, int age, double skill, boolean isSingle)
	{
		if(age < 15)
			return 0;
		
		Random r = new Random();
		double i = 100.0*r.nextDouble();
		double bypass = 50*r.nextDouble();
		if(age > 65 && age+bypass > 82)
			return 0;
		
		double salary;
		
		// Numbers are derived from 2010 household income data.  
		// Multiple by 108.6% to get it to today's dollars.
		if     (i < 3.52)  salary =   5000;
		else if(i < 4.11)  salary =   7500;
		else if(i < 7.63)  salary =  12500;
		else if(i < 13.51) salary =  17500;
		else if(i < 19.19) salary =  22500;
		else if(i < 25.05) salary =  27500;
		else if(i < 30.50) salary =  32500;
		else if(i < 36.00) salary =  37500;
		else if(i < 41.07) salary =  42500;
		else if(i < 45.86) salary =  47500;
		else if(i < 49.94) salary =  52500;
		else if(i < 54.21) salary =  57500;
		else if(i < 57.72) salary =  62500;
		else if(i < 61.38) salary =  67500;
		else if(i < 64.55) salary =  72500;
		else if(i < 67.53) salary =  77500;
		else if(i < 70.38) salary =  82500;
		else if(i < 72.89) salary =  87500;
		else if(i < 75.00) salary =  92500;
		else if(i < 77.15) salary =  97500;
		else if(i < 79.01) salary = 102500;
		else if(i < 81.09) salary = 107500;
		else if(i < 82.56) salary = 112500;
		else if(i < 83.98) salary = 117500;
		else if(i < 85.27) salary = 122500;
		else if(i < 86.55) salary = 127500;
		else if(i < 87.59) salary = 132500;
		else if(i < 88.59) salary = 137500;
		else if(i < 89.34) salary = 142500;
		else if(i < 90.20) salary = 147500;
		else if(i < 90.93) salary = 152500;
		else if(i < 91.90) salary = 157500;
		else if(i < 92.51) salary = 162500;
		else if(i < 93.08) salary = 167500;
		else if(i < 93.59) salary = 172500;
		else if(i < 94.10) salary = 177500;
		else if(i < 94.53) salary = 182500;
		else if(i < 94.91) salary = 187500;
		else if(i < 95.21) salary = 192500;
		else if(i < 95.53) salary = 197500;
		else if(i < 95.78) salary = 212500;
		else if(i < 97.68) salary = 237500;
		else               salary = 300000;
		
		salary *= 1.086;
		
		// the above numbers were for household incomes, meaning
		// that for most of them, those were couples
		if(isSingle)
			salary *= 0.5;
		
		// account for differences in skill level
		salary *= skill;
		
		// account for difference by sex
		if(sex == Entity.Sex.MAL)
			salary *= 1.05;
		else
			salary *= 0.95;
		
		return salary;
	}
	
	static double getAgeSalaryMult(int age)
	{
		if(age < 40)
			return 1.0-0.5*(40-age);
		else
			return 1.0+0.5*(age-40);
	}
	
}
