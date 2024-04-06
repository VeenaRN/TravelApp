package com.dmlOperations;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.connections.DbConnections;
import com.models.DealerCustomerInfo;

public class dealerOperations {
	
	private Connection conObj;
	private PreparedStatement pstmt=null;
	
	public dealerOperations() throws Exception
	{
		conObj=DbConnections.getConnection();
		
	}
	public List<DealerCustomerInfo> ViewAllDealerInfo()
	{
		List<DealerCustomerInfo> dealerlist=new ArrayList<DealerCustomerInfo>();
		DealerCustomerInfo dealer=null;
		try {
		pstmt =conObj.prepareStatement("select c.LastName,c.FirstName,c.StateId,c.StreetName,"
				+ "c.City,d.StateId,d.Name,d.StreetName,"
				+ "d.City from customers c inner join dealers d on c.StateId=d.StateId ");
		ResultSet rsDealer = pstmt.executeQuery();
		while(rsDealer.next())
		{
		dealer = new DealerCustomerInfo();
		//dealer.setId(rsDealer.getInt("Id"));
		dealer.setLastName(rsDealer.getString("LastName"));
		dealer.setFirstName(rsDealer.getString("FirstName"));
		dealer.setStateId(rsDealer.getInt("StateId"));
		dealer.setStreetName(rsDealer.getString("StreetName"));
		dealer.setCity(rsDealer.getString("City"));
		dealer.setName(rsDealer.getString("Name"));
		dealerlist.add(dealer);
		
		}
			
		}catch (Exception e) {
		System.out.println(e);
	}
		return dealerlist;
}
}