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
	KEY fk_username_idx (username),
	CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username)
);

CREATE TABLE user_datas(
	id int(11) PRIMARY KEY,
	username VARCHAR(45) references users.id,
	firstname VARCHAR(30),
	lastname VARCHAR(30),
	birthdate date,
	personal_description VARCHAR(250),
	registration_date date,
	email VARCHAR(30),
	phone_number VARCHAR(20),
	address_id int(11) references user_address.id
);

CREATE TABLE user_address(
	id int(11) primary key,
	street VARCHAR(45),
	city VARCHAR(45),
	postcode int(11),
	country VARCHAR(20)
);
