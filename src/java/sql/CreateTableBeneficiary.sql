CREATE TABLE IF NOT EXISTS beneficiary(
beneficiary_id INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(55),
middle_initial VARCHAR(10),
last_name VARCHAR(55),
address VARCHAR(70),
aptNum VARCHAR(10),
city VARCHAR(33),
state VARCHAR(2),
zipcode VARCHAR(5),
phone_num VARCHAR(13),
contingent_first_name VARCHAR(55),
contingent_last_name VARCHAR(55),
relationship_owner VARCHAR(10),
contingent_relationship VARCHAR(10),
PRIMARY KEY(beneficiary_id)
);