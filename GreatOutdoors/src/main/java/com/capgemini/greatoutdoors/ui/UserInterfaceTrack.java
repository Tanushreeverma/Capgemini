package com.capgemini.greatoutdoors.ui;

import java.util.List;
import java.util.Scanner;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoImpl1;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;
import com.capgemini.greatoutdoors.service.RetailerInventoryServiceImpl1;
import com.capgemini.greatoutdoors.service.RetailerInventoryServiceImpl1;
import com.capgemini.greatoutdoors.util.RetailerInventoryTrackRepository;
public class UserInterfaceTrack {
	static Scanner s=new Scanner(System.in);
	static RetailerInventoryServiceImpl1 obj=new RetailerInventoryServiceImpl1();
	
	public static void main(String args[])
	{
		System.out.println("****enter choice:****");
		System.out.println("***press1 to See list by retailer*** \n ***press2 to see list of retailers*** \n*** press3 to see product dispatch time stamp***");
		int input=s.nextInt();
		switch(input) {
		case 1: getItemListByRetailer();
		break;
		case 2: getListOfRetailers();
		break;
		case 3: getProductDispatchTimestamp();
		break;
		}
		
		}

	private static void getItemListByRetailer() {
		try {
			List<RetailerInventoryTrackDTO>list=obj.getItemListByRetailer1();
			for(RetailerInventoryTrackDTO s:list) {
				
				System.out.println("Retailer id"+" "+s.getRetailorId());
	
				System.out.println("****************************************");
				
				
			}
		} catch (RetailerException e) {
			System.out.println(e.getMessage());
		}
	}

		
	private static void getListOfRetailers() {
		try {
			List<RetailerInventoryTrackDTO>list=obj.getListOfRetailers();
		
				for(RetailerInventoryTrackDTO s:list) {
					
					System.out.println("product id"+" "+s.getProductId());
					System.out.println("Retailers name"+" "+s.getRetailorId());
					System.out.println("product unique id "+" "+s.getProductUniqueId());
					System.out.println("****************************************");
					
					
				}
		} catch (RetailerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static void getProductDispatchTimestamp() {
		try {
			List<RetailerInventoryTrackDTO>list=obj.getProductDispatchTimestamp();
			for(RetailerInventoryTrackDTO s:list) {
				
				System.out.println("product dispatch time"+" "+s.getProductDispatchTimestamp());
				System.out.println("Product category"+" "+s.getProductCategory());
				System.out.println("Product Recieve Time stamp "+" "+s.getProductReceiveTimestamp());
				System.out.println("****************************************");	
			}
		} catch (RetailerException e) {
			System.out.println(e.getMessage());
		}	
	}
	}

