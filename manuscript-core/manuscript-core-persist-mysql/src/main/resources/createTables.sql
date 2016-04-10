create table if not exists user(
	id varchar(10) primary key,
	first_name varchar(20),
	last_name varchar(20),
	user_name varchar(30),
	password varchar(150),
	birth_date date,
	personal_description varchar(255),
	role varchar(10),
	registration_date date,
	user_accessibility_id varchar(10),
	foreign key user_accessibility_id references user_accessibility(id)
);

create table if not exists user_accessibility(
	id varchar(10) primary key,
	email varchar(50),
	pistal_adress_id varchar(10),
	foreign key postal_adress_id references postal_adress(id)
);

create table if not exists postal_adress(
	id varchar(10),
	adress varchar(50),
	city varchar(30),
	post_code int(5),
	country varchar(30)
);

