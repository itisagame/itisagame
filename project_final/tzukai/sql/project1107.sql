drop table houseinfo;
drop table houseimages;
drop table Advertisement;
drop table Follow_RTR_List;
DROP TABLE PRODUCT;
DROP TABLE PRD_CATEGORY;

drop sequence house_sequence;
drop sequence houseimages_sequence;
drop sequence advertisement_sequance;
DROP SEQUENCE PD_SEQ;
DROP SEQUENCE PRDT_CATE_SEQ;

create sequence house_sequence
start with 1
increment by 1
minvalue 0
nomaxvalue;

create sequence houseimages_sequence
start with 1
increment by 12 
minvalue 0
nomaxvalue;

create sequence advertisement_sequance
start with 1
increment by 1
minvalue 0
nomaxvalue;

CREATE SEQUENCE PD_SEQ
INCREMENT BY 1 
START WITH 1 
NOCACHE;



CREATE TABLE HouseInfo(
House_No varchaR2(100) not null primary key,
RE_NO varchar2(100) not null,
HOUSE_Serial_number varchar2(100) not null,
Title varchar2(100) not null,
Location varchar2(100) not null,
house_type varchar2(100) not null,
Price number(10) not null,
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




CREATE TABLE PRODUCT (
PRD_NO          VARCHAR2(10) NOT NULL,
SLR_NO          VARCHAR2(10) NOT NULL,
CATE_NO         VARCHAR2(10) NOT NULL,
PRD_NAME        VARCHAR2(100) NOT NULL,
PRD_DESC        CLOB,
PRD_STOCK       NUMBER(6),
PRD_PRICE       NUMBER(10) NOT NULL,
PRD_STATE       VARCHAR2(10),
CONSTRAINT PRD_PK PRIMARY KEY(PRD_NO)
--,
--CONSTRAINT PRD_SL_FK FOREIGN KEY(SLR_NO) REFERENCES SELLER(SLR_NO),
--CONSTRAINT PRD_CG_FK FOREIGN KEY(CATE_NO) REFERENCES PRD_CATEGORY(CATE_NO) 
);

CREATE TABLE PRDIMG (
IMG_NO VARCHAR2(10) NOT NULL,
PRD_NO VARCHAR2(10) NOT NULL,
IMG BLOB,
state varchar2(50) not null,
insert_time timestamp,
CONSTRAINT PRDIMG_PK PRIMARY KEY(IMG_NO)
--,
--CONSTRAINT PRDIMG_PD_FK FOREIGN KEY(PRD_NO) REFERENCES PRODUCT(PRD_NO) 
);

CREATE SEQUENCE PRDIMG_SEQ
INCREMENT BY 1 
START WITH 1 
NOCACHE;

DROP SEQUENCE PRDIMG_SEQ;
DROP TABLE PRDIMG;

CREATE TABLE PRD_CATEGORY (
CATE_NO      VARCHAR2(10) NOT NULL,
CATE_NAME    VARCHAR2(100) NOT NULL,
CONSTRAINT PRDT_CATE_PK PRIMARY KEY(CATE_NO) );

CREATE SEQUENCE PRDT_CATE_SEQ 
INCREMENT BY 1 
START WITH 1 
NOCACHE;

select * from houseinfo where location like '%文山區%';

select * from houseinfo where price BETWEEN 2000 AND 4000 AND LOCATION LIKE '%中山區%' ORDER BY PRICE;
            
SELECT * FROM HOUSEINFO ORDER BY PRICE;

SELECT * FROM HOUSEINFO WHERE PATTERN NOT LIKE '%1房%' AND PATTERN NOT LIKE '%2房%' AND PATTERN NOT LIKE '%3房%' AND PATTERN NOT LIKE '%4房%' ORDER BY TOTAL_PINGS;

select * from houseinfo where (house_Type like '%公寓%' or house_Type like '%大樓%' or house_Type like '%電梯%'  ) and(location like '%中山區%' or location like '%文山區%'  ) and(pattern like '%1房%' or pattern like '%2房%' or pattern like '%3房%' or pattern like '%4房%'  ) and(price BETWEEN 0 AND 9999  ) and(total_Pings BETWEEN 900 AND 1000 or total_Pings BETWEEN 0 AND 50  ) 