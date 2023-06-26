
package com.mycompany.resourceserver;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

public class TollController {

    List<Tolldata> tolldata;

	public TollController(){

		tolldata =new ArrayList<>();

		tolldata.add(new Tolldata("100","123wer","2021-01-10"));
		tolldata.add(new Tolldata("111","wer234","2023-01-01"));
		tolldata.add(new Tolldata("100","BDFR12","2024-01-01"));

	}

	@RequestMapping("/tolldata")
	public List<Tolldata> getdata(){
		return tolldata;
	}
    
}
