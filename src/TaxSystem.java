
public class TaxSystem {
	public enum Tax
	{
		Untaxable,
		Income,
		Sales,
		CorporateIncome,
		CapitalGains
	}

	public static double getTaxRate(Tax type, Class senderClass, Class receiverClass, double _value) {
		
		// lots of logic and math goes here
		if(type == Tax.Untaxable)
		{
			return 0.0;
		}
		else if(type == Tax.Income)
		{
			return 0.25;
		}
		else if(type == Tax.Sales)
		{
			return 0.06;
		}
		else if(type == Tax.CorporateIncome)
		{
			return 0.20;
		}
		else if(type == Tax.CapitalGains)
		{
			return 0.30;
		}
		else
		{
			return -1.0;
		}
	}
}
