package com.house.model;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HouseService {
	private HouseJDBCDAO dao;

	public HouseService() {
		dao = new HouseJDBCDAO();
	}

	public HouseVO addHouse(String house_no, String title, String location, String price, Double total_pings,
			Double main_pings, Double amenity_pings, Double accessory_pings, String floor, Double age, String pattern,
			String orientation, String building_materia, String parking_space, String classification_of_land,
			Double land_pings, String data_info, byte[] main_img, Double lat, Double lng, String house_states) {
		HouseVO houseVO = new HouseVO();
		houseVO.setHouse_No(house_no);
		houseVO.setTitle(title);
		houseVO.setLocation(location);
		houseVO.setPrice(price);
		houseVO.setTotal_pings(total_pings);
		houseVO.setMain_pings(main_pings);
		houseVO.setAmenity_pings(amenity_pings);
		houseVO.setAccessory_pings(accessory_pings);
		houseVO.setFloor(floor);
		houseVO.setAge(age);
		houseVO.setPattern(pattern);
		houseVO.setOrientation(orientation);
		houseVO.setBuilding_materia(building_materia);
		houseVO.setParking_space(parking_space);
		houseVO.setClassification_of_land(classification_of_land);
		houseVO.setLand_pings(land_pings);
		houseVO.setData_info(data_info);		
		houseVO.setMain_img(main_img);
		houseVO.setLat(lat);
		houseVO.setLng(lng);
		houseVO.setHouse_states(house_states);
		dao.insert(houseVO);
		return houseVO;
	}
	
	public HouseVO updateHouse(String title, String location, String price, Double total_pings,
			Double main_pings, Double amenity_pings, Double accessory_pings, String floor, Double age, String pattern,
			String orientation, String building_materia, String parking_space, String classification_of_land,
			Double land_pings, String data_info, byte[] main_img, Double lat, Double lng, String house_states,String house_no){
		HouseVO houseVO = new HouseVO();
		
		
		
		
		return houseVO;
		
	}
	
	
	
	


}
