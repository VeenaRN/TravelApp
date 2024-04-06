package com.application;

import com.dmlOperations.dealerOperations;
import com.models.DealerCustomerInfo;
import java.sql.SQLException;
import java.util.List;

public class DealerApp {

	public static void main(String[] args)throws Exception {
		
		//DealerCustomerInfo dealerinfo = null;
		dealerOperations dealoper = new dealerOperations();
		
		List<DealerCustomerInfo> dealerinfo=dealoper.ViewAllDealerInfo();
		System.out.println(dealerinfo.size());
		for(DealerCustomerInfo d:dealerinfo)
		{
		System.out.println(d.getName()+"\t"+d.getFirstName()+"\t"+d.getLastName()+"\t"+d.getStreetName()+"\t"+d.getStateId());	
		}
	}
}
