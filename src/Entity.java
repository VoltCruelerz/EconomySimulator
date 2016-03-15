import java.util.ArrayList;


/**
 * @author Michael Greene
 *
 */
public class Entity {
	public enum Sex
	{
		MAL,
		FEM,
		ORG
	}
	
	Money _debt = new Money(0);
	Money _liquidAssets = new Money(0);
	Money _solidAssets = new Money(0);
	Sex _sex;
	boolean _isGovernment;
	int _selfIndex;
	
	public Entity(Money startingFunds, Sex sex, boolean isGovernment, int selfIndex)
	{
		if(startingFunds.isBlack())
			_liquidAssets = startingFunds;
		else
			_debt = startingFunds;
		
		_sex = sex;
		_isGovernment = isGovernment;
		_selfIndex = selfIndex;
	}
	
	public boolean inBlack()
	{
		if(_debt.equals(0))
			return true;
		return false;
	}
	
	public void get(Money m)
	{
		_liquidAssets.add(m);
	}
	
	public void pay(Money m)
	{
		_liquidAssets.sub(m);
	}
}
