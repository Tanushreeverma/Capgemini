package com.capgemini.greatoutdoors.GreatOutdoors;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exception.RetailerException;
import com.capgemini.greatoutdoors.service.RetailerInventoryServiceImpl1;
import com.capgemini.greatoutdoors.util.RetailerInventoryTrackRepository;

public class ServiceTest {
	
	RetailerInventoryServiceImpl1 a1=new RetailerInventoryServiceImpl1();
	@Test
	public void testgetListOfRetailers() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a1.getListOfRetailers());
	}
	RetailerInventoryServiceImpl1 a2=new RetailerInventoryServiceImpl1();
	@Test
	public void testItemListByRetailer() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a2.getItemListByRetailer());
	}
	
	
}

