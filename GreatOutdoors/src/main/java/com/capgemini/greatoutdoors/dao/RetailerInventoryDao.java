package com.capgemini.greatoutdoors.dao;

import java.util.Calendar;
import java.util.List;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;
public interface RetailerInventoryDao
{
	public List<RetailerInventoryTrackDTO> getItemListByRetailer()throws RetailerException;
	public List<RetailerInventoryTrackDTO> getListOfRetailers()throws RetailerException;
	boolean updateProductReceiveTimeStamp(String RetailerInventoryDTO);
	boolean updateProductSaleTimeStamp(String RetailerInventoryDTO);

}
