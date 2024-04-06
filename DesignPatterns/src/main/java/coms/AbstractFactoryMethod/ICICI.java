package coms.AbstractFactoryMethod;

public class ICICI implements Bank{
	
	private final String bname;
	public ICICI()
	{
		bname="ICICI";
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return bname;
	}

}
