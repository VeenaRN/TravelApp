package coms.SampleRestApiApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.SampleRestApiApp.entities.Product;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	

	@GetMapping("prds")
	public List<Product> viewAll()
	{
		List<Product> prdLst=new ArrayList<Product>();
		Product prd=new Product(101,"LED",10,25000.00f);
		prdLst.add(prd);
		prd=new Product(105,"Washing Machine",10,25000.00f);
		prdLst.add(prd);
		prd=new Product(103,"Fridge",10,25000.00f);
		prdLst.add(prd);
		return prdLst;
	}
}
