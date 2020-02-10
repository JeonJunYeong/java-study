package prob03;

public class Money {

	private int amount;
	private int now;
    
	public Money(int amount)
	{
		this.amount=amount;
		now=0;
	}
	
		
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money s) {
		now=s.getAmount();
		return new Money(amount+now);
		
	}
	public Money minus(Money s) {
		now=s.getAmount();
		
		return new Money(amount-now);
	}
	public Money multiply(Money s) {
		
		now=s.getAmount();
		return new Money(amount*now);
	}
	public Money devide(Money s) {
		now=s.getAmount();
		return new Money(amount/now);
	}
	

	
	public boolean equals(Object nowClass)
	{
		if(getClass()==nowClass.getClass())
		
		{
			Money now=(Money)nowClass;

			if(now.getAmount()==this.amount)
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
	
	
    
}
