package com.house.model;

import java.sql.Timestamp;

public class HouseVO {
	private String house_No;
	private String title;
	private String location;
	private String price;
	private Double total_pings;
	private Double main_pings;
	private Double amenity_pings;
	private Double accessory_pings;
	private String floor;
	private Double age;
	private String pattern;
	private String orientation;
	private String building_materia;
	private String parking_space;
	private String classification_of_land;
	private Double land_pings;
	private String data_info;// clob
	private byte[] main_img;// blob
	private Double lat;
	private Double lng;
	private String house_states;
	private Timestamp Insert_Time;
	private Timestamp final_update_time;	
	
	public String getHouse_No() {
		return house_No;
	}
	public void setHouse_No(String house_No) {
		this.house_No = house_No;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Double getTotal_pings() {
		return total_pings;
	}
	public void setTotal_pings(Double total_pings) {
		this.total_pings = total_pings;
	}
	public Double getMain_pings() {
		return main_pings;
	}
	public void setMain_pings(Double main_pings) {
		this.main_pings = main_pings;
	}
	public Double getAmenity_pings() {
		return amenity_pings;
	}
	public void setAmenity_pings(Double amenity_pings) {
		this.amenity_pings = amenity_pings;
	}
	public Double getAccessory_pings() {
		return accessory_pings;
	}
	public void setAccessory_pings(Double accessory_pings) {
		this.accessory_pings = accessory_pings;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getBuilding_materia() {
		return building_materia;
	}
	public void setBuilding_materia(String building_materia) {
		this.building_materia = building_materia;
	}
	public String getParking_space() {
		return parking_space;
	}
	public void setParking_space(String parking_space) {
		this.parking_space = parking_space;
	}
	public String getClassification_of_land() {
		return classification_of_land;
	}
	public void setClassification_of_land(String classification_of_land) {
		this.classification_of_land = classification_of_land;
	}
	public Double getLand_pings() {
		return land_pings;
	}
	public void setLand_pings(Double land_pings) {
		this.land_pings = land_pings;
	}
	public String getData_info() {
		return data_info;
	}
	public void setData_info(String data_info) {
		this.data_info = data_info;
	}
	public byte[] getMain_img() {
		return main_img;
	}
	public void setMain_img(byte[] main_img) {
		this.main_img = main_img;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public String getHouse_states() {
		return house_states;
	}
	public void setHouse_states(String house_states) {
		this.house_states = house_states;
	}
	public Timestamp getInsert_Time() {
		return Insert_Time;
	}
	public void setInsert_Time(Timestamp insert_Time) {
		Insert_Time = insert_Time;
	}
	public Timestamp getFinal_update_time() {
		return final_update_time;
	}
	public void setFinal_update_time(Timestamp final_update_time) {
		this.final_update_time = final_update_time;
	}
	

}