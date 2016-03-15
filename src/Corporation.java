import java.util.ArrayList;

public class Corporation extends Entity {

	public ArrayList<Person> employees = new ArrayList<Person>();
	
	public Corporation(Money startingFunds, int selfIndex) {
		super(startingFunds, Sex.ORG, false, selfIndex);
		
		
	}

}
