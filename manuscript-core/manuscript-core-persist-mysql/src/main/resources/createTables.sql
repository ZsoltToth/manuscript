CREATE  TABLE users (
	username VARCHAR(45) NOT NULL ,
	password VARCHAR(150) NOT NULL ,
	enabled TINYINT NOT NULL DEFAULT 1 ,
	PRIMARY KEY (username)
);

CREATE TABLE user_roles (
	user_role_id int(11) NOT NULL AUTO_INCREMENT,
	username varchar(45) NOT NULL,
	role varchar(45) NOT NULL,
	PRIMARY KEY (user_role_id),
	UNIQUE KEY uni_username_role (role,username),       
	INDEX usr_ind (username),
    	FOREIGN KEY (username)
	REFERENCES users(username)
        	ON DELETE CASCADE
);

CREATE TABLE user_datas(
	id int(11) PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(45),
	firstname VARCHAR(30),
	lastname VARCHAR(30),
	birthdate date,
	personal_description VARCHAR(250),
	registration_date date,
	email VARCHAR(30),
	phone_number VARCHAR(20),
	street VARCHAR(45),
	city VARCHAR(45),
	postcode int(11),
	country VARCHAR(20),
    	INDEX usrdts_ind (username),
    	FOREIGN KEY (username) 
        REFERENCES users(username)
        	ON DELETE CASCADE
);
