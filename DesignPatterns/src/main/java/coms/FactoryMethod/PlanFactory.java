package coms.FactoryMethod;

public class PlanFactory {

	public Plan getPlan(String pType)
	{
		if(pType==null)
			return null;
		
		if(pType.equalsIgnoreCase("domestic"))
			return new DomesticPlan();
		
		if(pType.equalsIgnoreCase("institutional"))
			return new InstitutionalPlan();
		
		if(pType.equalsIgnoreCase("commercial"))
			return new CommercialPlan();
		
		return null;
	}
}
