package com.capgemini.greatoutdoors.util;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoImpl1;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
public class RetailerInventoryTrackRepository {
	public static List<RetailerInventoryTrackDTO> list=new ArrayList();
	private java.util.Date date;
	public RetailerInventoryTrackRepository()
	{
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj1 = new RetailerInventoryTrackDTO("Tanushree",(byte)1,"abc","aa-bb","2020/02/20","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj2= new RetailerInventoryTrackDTO("Parag",(byte)2,"bcd","bb-cc","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj3= new RetailerInventoryTrackDTO("Monika",(byte)3,"cde","cc-dd","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj4= new RetailerInventoryTrackDTO("Lalita",(byte)4,"def","dd-ee","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj5= new RetailerInventoryTrackDTO("Nikita",(byte)5,"efg","ee-ff","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj6= new RetailerInventoryTrackDTO("Megha",(byte)6,"fgh","ff-gg","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj7= new RetailerInventoryTrackDTO("Amrita",(byte)7,"ghi","gg-hh","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj8= new RetailerInventoryTrackDTO("Himanshu",(byte)8,"hij","hh-ii","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj9=new RetailerInventoryTrackDTO("Aman",(byte)9,"ijk","ii-jj","2020/02/21","2020/02/22","2020/02/23");
		list.add(RetailerInventoryTrackDTOObj1);
		list.add(RetailerInventoryTrackDTOObj2);
		list.add(RetailerInventoryTrackDTOObj3);
		list.add(RetailerInventoryTrackDTOObj4);
		list.add(RetailerInventoryTrackDTOObj5);
		list.add(RetailerInventoryTrackDTOObj6);
		list.add(RetailerInventoryTrackDTOObj7);
		list.add(RetailerInventoryTrackDTOObj8);
		list.add(RetailerInventoryTrackDTOObj9);
	
	}
	public static List<RetailerInventoryTrackDTO> getList() {
		// TODO Auto-generated method stub
		return list;
	}
	
}