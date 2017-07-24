INSERT INTO BASE_USER (id,first_name,last_name) VALUES ('001','taro','tanaka');
INSERT INTO BASE_USER (id,first_name,last_name) VALUES ('002','hanako','yamada');

/* password:demo*/
INSERT INTO BASE_USER_ACCOUNT (account_id,id,password,login_failed_count) VALUES ('001','001','ce5f8d0c5790bf82e9b253d362feb51ba02853301ae24149b260bd30acb00f1b2a0d8b18bbff97a9',0);
INSERT INTO BASE_USER_ACCOUNT (account_id,id,password,login_failed_count) VALUES ('002','002','ce5f8d0c5790bf82e9b253d362feb51ba02853301ae24149b260bd30acb00f1b2a0d8b18bbff97a9',0);

INSERT INTO BASE_USER_ATTRIBUTE (attribute_name,sort_no,id) VALUES ('ROLE_BASE_ADMIN',1,'001');
INSERT INTO BASE_USER_ATTRIBUTE (attribute_name,sort_no,id) VALUES ('ROLE_TEST_USER',1,'002');