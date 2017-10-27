--drop table houseimages

CREATE TABLE HOUSEIMAGES(
Img_No number(5) not null primary key,
House_No varchar2(10) not null,
Img BLOB,
CONSTRAINT Fk_HOUSEIMG_HOUSEINFO FOREIGN KEY (House_No) References HOUSEINFO (HOUSE_NO)
);



--create sequence imgs_equance
--start with 1
--increment by 1
--minvalue 0
--nomaxvalue
drop table houseinfo;

CREATE TABLE HouseInfo(
House_No varchaR2(100) not null primary key,
Title varchar2(100) not null,
Location varchar2(100) not null,
Price varchar2(100) not null,
Total_Pings number(10,2) not null,
Main_Pings number(10,2),
Amenity_Pings number(10,2),
Accessory_Pings number(10,2),
Floor varchar2(100),
Age number(10,2),
Pattern varchar2(100),
Orientation VARCHAR2(100),
Building_Materials VARCHAR2(100),
Parking_Space varchar2(100),
Classification_Of_Land VARCHAR2(100),
Land_Pings number(10,10),
Data_Info CLOB,
Main_Img BLOB,
Lat number(10,8),
Lng number(10,8),
House_States varchar2(100),
Insert_Time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
final_update_time timestamp default current_timestamp
);


CREATE TABLE Advertisment(
Ad_No number(10) primary key not null,
Product_No number(10) not null,
EMP_No number(10) not null,
Ad_Type varchar2(30) not null,
Appling_Date Date,
Aduit_Date date,
Expiration_Date DATE
--,
--CONSTRAINT Fk_Advertisment_Product FOREIGN KEY (Product_No) References Product_No (Product_No),
--CONSTRAINT Fk_Advertisment_Employee FOREIGN KEY (EMP_No) References Employee (EMP_No) 
);


CREATE TABLE ARTICLE(
ARTICLE_NO VARCHAR2(10) PRIMARY KEY NOT NULL,
REALTOR_NO NUMBER(10) NOT NULL,
ARTICLE_BODY CLOB,
Post_Date DATE NOT NULL,
ARTICLE_STATE VARCHAR2(30) NOT NULL
--,
--CONSTRAINT FK_ARTICLE_REALTOR FOREIGN KEY (REALTOR_NO) REFERENCES REALTOR(REALTOR_NO)
);




INSERT INTO HOUSEINFO (house_No,title,location,price,total_pings,main_pings,amenity_pings,accessory_pings,floor,age,pattern,orientation,building_materials,parking_space,classification_of_land,land_pings,data_info,main_img

--			,lat,lng,house_states,insert_time,final_update_time
            )VALUES('hs000007','舊宗稀有景觀豪宅','台北市內湖區舊宗路','1,300',50.12,30.12,15.0,5.0,'8~8/12樓',29.5,'3房(室)1廳1衛','朝向南','鋼筋混凝土(RC)','坡道平面 固定車位','土地使用分區：第三種住宅區',6.02,null,null
--            ,'selling',current_timestamp,current_timestamp
            );