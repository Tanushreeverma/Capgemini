package com.capgemini.greatoutdoors.service;

import java.util.Calendar;
import java.util.List;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;

public interface RetailerInventoryService {
	
	public List<RetailerInventoryTrackDTO> getItemListByRetailer()throws RetailerException;
	public List<RetailerInventoryTrackDTO> getListOfRetailers()throws RetailerException;
	boolean updateProductReceiveTimeStamp()throws RetailerException;
	boolean updateProductSaleTimeStamp(String RetailerInventoryDTO) throws RetailerException;
	
  
}
