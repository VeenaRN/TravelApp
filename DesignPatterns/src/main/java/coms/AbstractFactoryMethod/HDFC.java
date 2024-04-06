package coms.AbstractFactoryMethod;

public class HDFC implements Bank{
	
	private final String bname;
	public HDFC()
	{
		bname="HDFC";
	}

	@Override
	public String getBankName() {
		
		return bname;
	}

}
