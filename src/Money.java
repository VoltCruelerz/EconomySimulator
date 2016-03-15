import java.util.ArrayList;


public class Money {
	
	private double _value = 0;
	boolean _accountClosed = false;
	
	public Money(String abbreviation)
	{
		char suffix = abbreviation.charAt(abbreviation.length()-1);
		String valString = abbreviation.substring(0,abbreviation.length()-1);
		double val = Double.parseDouble(valString);
		
		if(suffix == 'K')
		{
			val *= 1000;
		}
		else if(suffix == 'M')
		{
			val *= 1000000;
		}
		else if(suffix == 'B')
		{
			val *= 1000000000;
		}
		else if(suffix == 'T')
		{
			val *= 1000000000000.0;// had to have a .0 so it would compile as a double instead of an int
		}
		else
		{
			System.out.println("Invalid Monetary Abbreviation: " + abbreviation);
		}
	}
	
	public Money(double num)
	{
		_value = num;
	}
	
	
	
	public boolean isBlack()
	{
		if(_value > 0)
		{
			return true;
		}
		return false;
	}
	
	private double getValue()
	{
		return _value;
	}
	
	public Money add(Money val)
	{
		_value += val.getValue();
		return this;
	}
	
	public Money sub(Money val)
	{
		_value -= val.getValue();
		return this;
	}
	
	public Money mergeAccounts(Money val)
	{
		add(val);
		val = null;
		return this;
	}
	
	public boolean equals(double d)
	{
		if(_value == d)
			return true;
		return false;
	}
	
	public boolean equals(int i)
	{
		if(_value == i)
			return true;
		return false;
	}
	
	public void transaction(Entity sender, Entity receiver, TaxSystem.Tax type)
	{
		Class senderClass = sender.getClass();
		Class receiverClass = receiver.getClass();
		
		double taxRate = TaxSystem.getTaxRate(type, senderClass, receiverClass, _value);
		double toGov = _value*taxRate;
		double remainder = _value*(1.0-taxRate);
		
		EconomySimulator.gov.get(new Money(toGov));
		sender.pay(new Money(remainder));
		receiver.get(new Money(remainder));
	}
}
