package com.house.model;

import java.util.List;

public interface House_interface {

	public void insert(HouseVO houseVO);

	public void update(HouseVO houseVO);

	public void delete(String house_No);

	public HouseVO findByPrimaryKey(String house_No);

	public List<HouseVO> getAll();

}
