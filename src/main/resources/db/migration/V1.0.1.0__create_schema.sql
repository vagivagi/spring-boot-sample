CREATE TABLE BASE_USER (id VARCHAR primary key,first_name VARCHAR(20),last_name VARCHAR(30));

CREATE TABLE BASE_USER_ACCOUNT (account_id VARCHAR(255) primary key,id VARCHAR(255),password VARCHAR(255), login_failed_count INT);

CREATE TABLE BASE_USER_ATTRIBUTE (attribute_name VARCHAR(255),sort_no INT,id VARCHAR(255),primary key(attribute_name,sort_no,id));