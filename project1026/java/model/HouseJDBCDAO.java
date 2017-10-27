package com.house.model;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HouseJDBCDAO implements House_interface {
	String name = "project";
	String password = "project";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String driver = "oracle.jdbc.driver.OracleDriver";

	private static final String INSERT = "INSERT INTO HOUSEINFO (" + "house_No," + "title," + "location," + "price,"
			+ "total_pings," + "main_pings," + "amenity_pings," + "accessory_pings," + "floor," + "age," + "pattern,"
			+ "orientation," + "building_materials," + "parking_space," + "classification_of_land," + "land_pings,"
			+ "data_info," + "main_img," + "lat," + "lng," + "house_states," + "insert_time,"
			+ "final_update_time)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,current_timestamp,current_timestamp)";
	private static final String UPDATE = "UPDATE HOUSEINFO SET " + "title=?," + "location=?," + "price=?,"
			+ "total_pings=?," + "main_pings=?," + "amenity_pings=?," + "accessory_pings=?," + "floor=?," + "age=?,"
			+ "pattern=?," + "orientation=?," + "building_materia=?," + "parking_space=?," + "classification_of_land=?,"
			+ "land_pings=?," + "data_info=?," + "main_img=?," + "lat=?," + "lng=?," + "house_staties=?,"
			+ "insert_time=?" + "final_update_time=? where house_No=?";
	private static final String DELETE = "DELETE FORM HOUSEINFO WHERE HOUSE_NO=?";
	private static final String GET_ONE = "SELECT * FROM HOUSEINFO WHERE House_No=?";
	private static final String GET_ALL = "SELECT * FROM HOUSEINFO";

	@Override
	public void insert(HouseVO houseVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, password);
			pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, houseVO.getHouse_No());
			pstmt.setString(2, houseVO.getTitle());
			pstmt.setString(3, houseVO.getLocation());
			pstmt.setString(4, houseVO.getPrice());
			pstmt.setDouble(5, houseVO.getTotal_pings());
			pstmt.setDouble(6, houseVO.getMain_pings());
			pstmt.setDouble(7, houseVO.getAmenity_pings());
			pstmt.setDouble(8, houseVO.getAccessory_pings());
			pstmt.setString(9, houseVO.getFloor());
			pstmt.setDouble(10, houseVO.getAge());
			pstmt.setString(11, houseVO.getPattern());
			pstmt.setString(12, houseVO.getOrientation());
			pstmt.setString(13, houseVO.getBuilding_materia());
			pstmt.setString(14, houseVO.getParking_space());
			pstmt.setString(15, houseVO.getClassification_of_land());
			pstmt.setDouble(16, houseVO.getLand_pings());
			pstmt.setString(17, houseVO.getData_info());
			pstmt.setBytes(18, houseVO.getMain_img());
			pstmt.setDouble(19, houseVO.getLat());
			pstmt.setDouble(20, houseVO.getLng());
			pstmt.setString(21, houseVO.getHouse_states());
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(HouseVO houseVO) {

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, password);
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setString(1, houseVO.getTitle());
			pstmt.setString(2, houseVO.getLocation());
			pstmt.setString(3, houseVO.getPrice());
			pstmt.setDouble(4, houseVO.getTotal_pings());
			pstmt.setDouble(5, houseVO.getMain_pings());
			pstmt.setDouble(6, houseVO.getAmenity_pings());
			pstmt.setDouble(7, houseVO.getAccessory_pings());
			pstmt.setString(8, houseVO.getFloor());
			pstmt.setDouble(9, houseVO.getAge());
			pstmt.setString(10, houseVO.getPattern());
			pstmt.setString(11, houseVO.getOrientation());
			pstmt.setString(12, houseVO.getBuilding_materia());
			pstmt.setString(13, houseVO.getParking_space());
			pstmt.setString(14, houseVO.getClassification_of_land());
			pstmt.setDouble(15, houseVO.getLand_pings());
			pstmt.setString(16, houseVO.getData_info());
			pstmt.setBytes(17, houseVO.getMain_img());
			pstmt.setDouble(18, houseVO.getLat());
			pstmt.setDouble(19, houseVO.getLng());
			pstmt.setString(20, houseVO.getHouse_states());
			pstmt.setTimestamp(21, houseVO.getInsert_Time());
			pstmt.setTimestamp(22, houseVO.getFinal_update_time());
			pstmt.setString(23, houseVO.getHouse_No());
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void delete(String house_No) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, password);
			pstmt = con.prepareStatement(DELETE);
			pstmt.setString(1, house_No);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public HouseVO findByPrimaryKey(String house_No) {
		HouseVO houseVO = new HouseVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, password);
			pstmt = con.prepareStatement(GET_ONE);
			pstmt.setString(1, house_No);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				houseVO.setHouse_No(rs.getString("house_No"));
				houseVO.setTitle(rs.getString("title"));
				houseVO.setLocation(rs.getString("location"));
				houseVO.setPrice(rs.getString("price"));
				houseVO.setTotal_pings(rs.getDouble("total_pings"));
				houseVO.setMain_pings(rs.getDouble("main_pings"));
				houseVO.setAmenity_pings(rs.getDouble("amenity_pings"));
				houseVO.setAccessory_pings(rs.getDouble("accessory_pings"));
				houseVO.setFloor(rs.getString("floor"));
				houseVO.setAge(rs.getDouble("age"));
				houseVO.setPattern(rs.getString("pattern"));
				houseVO.setOrientation(rs.getString("orientation"));
				houseVO.setBuilding_materia(rs.getString("building_materia"));
				houseVO.setParking_space(rs.getString("parking_space"));
				houseVO.setClassification_of_land(rs.getString("classification_of_land"));
				houseVO.setLand_pings(rs.getDouble("land_pings"));
				houseVO.setData_info(rs.getString("data_info"));
				houseVO.setMain_img(rs.getBytes("main_img"));
				houseVO.setLat(rs.getDouble("lat"));
				houseVO.setLng(rs.getDouble("lng"));
				houseVO.setHouse_states(rs.getString("house_states"));
				houseVO.setInsert_Time(rs.getTimestamp("insert_Time"));
				houseVO.setFinal_update_time(rs.getTimestamp("final_update_time"));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return houseVO;
	}

	@Override
	public List<HouseVO> getAll() {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		HouseVO houseVO = new HouseVO();
		List<HouseVO> list = new ArrayList<>();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, password);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				houseVO.setHouse_No(rs.getString("house_No"));
				houseVO.setTitle(rs.getString("title"));
				houseVO.setLocation(rs.getString("location"));
				houseVO.setPrice(rs.getString("price"));
				houseVO.setTotal_pings(rs.getDouble("total_pings"));
				houseVO.setMain_pings(rs.getDouble("main_pings"));
				houseVO.setAmenity_pings(rs.getDouble("amenity_pings"));
				houseVO.setAccessory_pings(rs.getDouble("accessory_pings"));
				houseVO.setFloor(rs.getString("floor"));
				houseVO.setAge(rs.getDouble("age"));
				houseVO.setPattern(rs.getString("pattern"));
				houseVO.setOrientation(rs.getString("orientation"));
				houseVO.setBuilding_materia(rs.getString("building_materia"));
				houseVO.setParking_space(rs.getString("parking_space"));
				houseVO.setClassification_of_land(rs.getString("classification_of_land"));
				houseVO.setLand_pings(rs.getDouble("land_pings"));
				houseVO.setData_info(rs.getString("data_info"));
				houseVO.setMain_img(rs.getBytes("main_img"));
				houseVO.setLat(rs.getDouble("lat"));
				houseVO.setLng(rs.getDouble("lng"));
				houseVO.setHouse_states(rs.getString("house_states"));
				houseVO.setInsert_Time(rs.getTimestamp("insert_Time"));
				houseVO.setFinal_update_time(rs.getTimestamp("final_update_time"));
				list.add(houseVO);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public byte[] getByteArray(String path) {
		byte[] bytes = new byte[8192];
		int length;
		try {
			FileInputStream fis = new FileInputStream(path);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			while ((length = fis.read(bytes)) != -1) {
				bos.write(bytes, 0, length);
			}
			bos.close();
			fis.close();
			return bos.toByteArray();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bytes;
	}

	public static void main(String[] args) {

//		insert功能測試----成功!
		HouseVO houseVO = new HouseVO();
		houseVO.setHouse_No("hs000004");
		houseVO.setTitle("舊宗稀有景觀豪宅");
		houseVO.setLocation("台北市內湖區舊宗路");
		houseVO.setPrice("1,300");
		houseVO.setTotal_pings(50.12);
		houseVO.setMain_pings(30.12);
		houseVO.setAmenity_pings(15.0);
		houseVO.setAccessory_pings(5.0);
		houseVO.setFloor("8~8/12樓");
		houseVO.setAge(29.5);
		houseVO.setPattern("3房(室)1廳1衛");
		houseVO.setOrientation("朝向南");
		houseVO.setBuilding_materia("鋼筋混凝土(RC)");
		houseVO.setParking_space("坡道平面 固定車位");
		houseVO.setClassification_of_land("土地使用分區：第三種住宅區");
		houseVO.setLand_pings(6.02);
		houseVO.setData_info("蟑螂的家");
		String imgPath = "C:/Users/Java/Desktop/Beautiful_World/15065925683.jpg";
		HouseJDBCDAO dao = new HouseJDBCDAO();
		byte[] imgByteArray = dao.getByteArray(imgPath);
		houseVO.setMain_img(imgByteArray);
		houseVO.setLat(133.00);
		houseVO.setLng(50.00);
		houseVO.setHouse_states("selling");
		dao.update(houseVO);
	}
	
	
	
	
	

}
