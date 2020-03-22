package com.capgemini.greatoutdoors.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;
import com.capgemini.greatoutdoors.util.RetailerInventoryTrackRepository;

public class RetailerInventoryDaoImpl1 implements RetailerInventoryDao{

	RetailerInventoryTrackRepository object1;
	public RetailerInventoryDaoImpl1()
	{
		object1=new RetailerInventoryTrackRepository();
	}

	
	public List<RetailerInventoryTrackDTO> getItemListByRetailer() {
		List< RetailerInventoryTrackDTO>op3=object1.getList();
	
		return op3;
	}

	public List<RetailerInventoryTrackDTO> getListOfRetailers() {
		List< RetailerInventoryTrackDTO>op4=object1.getList();
		
		return op4;
	}

	public List<RetailerInventoryTrackDTO> getProductDispatchTimestamp() {
		// TODO Auto-generated method stub
		List< RetailerInventoryTrackDTO>op5=object1.getList();
		
		return op5;
	}

	public boolean updateProductReceiveTimeStamp(List<RetailerInventoryTrackDTO>list) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateProductSaleTimeStamp(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean updateProductReceiveTimeStamp(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}
	}
