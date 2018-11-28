CREATE TABLE IF NOT EXISTS applicant(
    applicant_id INT NOT NULL AUTO_INCREMENT,
    first_name varchar(55),
    middle_initial varchar(2),
    last_name varchar(55),
    address varchar(70),
    city varchar(55),
    stateAB varchar(2),
    zip varchar(5),
    phone_num varchar(13),
    social_num varchar(13),
    date_birth varchar(13),
    sex_male boolean,
    relationship_owner boolean,
    PRIMARY KEY(applicant_id)
);