package com.capgemini.greatoutdoors.service;
import java.util.List;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoImpl1;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;

public class RetailerInventoryServiceImpl1 implements RetailerInventoryService {
	RetailerInventoryDaoImpl1 obj; 
	public RetailerInventoryServiceImpl1()
   {
    obj=new RetailerInventoryDaoImpl1();
		
   }

	public List<RetailerInventoryTrackDTO> getItemListByRetailer1()throws RetailerException {
		List<RetailerInventoryTrackDTO> result=obj.getItemListByRetailer();
		if(result.isEmpty())
		{
			throw new RetailerException("RetailerInventoryList Cannot be empty!!");
		}
		else
		{
			result = obj.getItemListByRetailer();
			return result;
		}
	}

	public List<RetailerInventoryTrackDTO> getListOfRetailers()throws RetailerException {
		return obj.getListOfRetailers();
	}

	public List<RetailerInventoryTrackDTO> getProductDispatchTimestamp() throws RetailerException{
		return obj.getProductDispatchTimestamp();
		// TODO Auto-generated method stub
		//return false;
	}

	public boolean updateProductSaleTimeStamp(String RetailerInventoryDTO)throws RetailerException {
		if(RetailerInventoryDTO.isEmpty())
			throw new RetailerException("RetailerInventory Id Cannot be empty!!");
		else
			//return obj.getProductDispatchTimestamp(RetailerInventoryDTO);
			return false;
	}

	public boolean updateProductReceiveTimeStamp() throws RetailerException {
		// TODO Auto-generated method stub
		return false;
	}

	public List<RetailerInventoryTrackDTO> getItemListByRetailer() throws RetailerException {
		// TODO Auto-generated method stub
		return null;
	}




}
