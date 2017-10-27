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

CREATE TABLE HouseInfo(
House_No varchaR2(10) not null primary key,
Title varchar2(100) not null,
Location varchar2(30) not null,
Price varchar2(30) not null,
Total_Pings number(10,2) not null,
Main_Pings number(10,2),
Amenity_Pings number(10,2),
Accessory_Pings number(10,2),
Floor varchar2(30),
Age number(3,2),
Pattern varchar2(30),
Orientation VARCHAR2(30),
Building_Materials VARCHAR2(30),
Parking_Space varchar2(30),
Classification_Of_Land VARCHAR2(30),
Land_Pings number(10,2),
Data_Info CLOB,
Main_Img BLOB,
Lat number(3,8),
Lng number(3,8),
House_States varchar2(30),
Insert_Time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
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