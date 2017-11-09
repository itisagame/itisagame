drop table houseinfo;
drop table houseimages;
drop table Advertisement;
drop table Follow_RTR_List;
--drop table article;

drop sequence house_sequence;
drop sequence houseimages_sequence;
drop sequence advertisement_sequance;
--drop sequence article_sequence;

create sequence house_sequence
start with 1
increment by 1
minvalue 0
nomaxvalue;

create sequence houseimages_sequence
start with 1
increment by 1
minvalue 0
nomaxvalue;

create sequence advertisement_sequance
start with 1
increment by 1
minvalue 0
nomaxvalue;

--create sequence article_sequence
--start with 1
--increment by 1
--minvalue 0
--nomaxvalue;



CREATE TABLE HouseInfo(
House_No varchaR2(100) not null primary key,
RE_NO varchar2(10) not null,
HOUSE_Serial_number varchar2(100) not null,
Title varchar2(100) not null,
Location varchar2(100) not null,
house_type varchar2(100) not null,
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
Land_Pings number(10,2),
Data_Info CLOB,
Main_Img BLOB,
Lat number(10,5),
Lng number(10,5),
House_States varchar2(100),
Insert_Time TIMESTAMP,
final_update_time timestamp default current_timestamp
--,
--constraint FK_HOUSEINFO_REALESTATE foreign key(RE_NO) REFERENCES RealEstate(RE_NO),
);

CREATE TABLE HOUSEIMAGES(
Img_No varchar2(100) not null primary key,
House_No varchar2(100) not null,
Img BLOB,
state varchar2(50) not null,
insert_time timestamp
--,
--CONSTRAINT Fk_HOUSEIMG_HOUSEINFO FOREIGN KEY (House_No) References HOUSEINFO (HOUSE_NO)
);


CREATE TABLE Advertisement(
Ad_No VARCHAR2(100) primary key not null,
PRD_NO VARCHAR2(10) not null,
EMP_No VARCHAR2(10),
Ad_Type varchar2(100) not null,
AD_IMG BLOB,
Appling_Date Timestamp,
Audit_Date Timestamp,
Expiration_Date Timestamp
--,
--CONSTRAINT Fk_Advertisment_Product FOREIGN KEY (Product_No) References Product_No (Product_No),
--CONSTRAINT Fk_Advertisment_Employee FOREIGN KEY (EMP_No) References Employee (EMP_No) 
);
 
--CREATE TABLE ARTICLE(
--ARTICLE_NO VARCHAR2(100) PRIMARY KEY NOT NULL,
--RTR_NO NUMBER(10) NOT NULL,
--ARTICLE_BODY CLOB,
--Post_Date TIMESTAMP NOT NULL,
--UPDATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--ARTICLE_STATE VARCHAR2(30) NOT NULL
----,
----CONSTRAINT FK_ARTICLE_REALTOR FOREIGN KEY (REALTOR_NO) REFERENCES REALTOR(REALTOR_NO)
--);

CREATE TABLE FOLLOW_RTR(
RTR_NO VARCHAR2(10)NOT NULL ,
MEM_NO VARCHAR2(10)NOT NULL ,
STATE VARCHAR2(10),
FOLLOW_DATE TIMESTAMP,
CONSTRAINT PK_FOLLOW_RTR PRIMARY KEY(RTR_NO,MEM_NO)
);

            