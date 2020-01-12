CREATE TABLE `category` (
  id int(11) NOT NULL AUTO_INCREMENT,
  id_parent int(11) NOT NULL DEFAULT '0',
  title varchar(200) NOT NULL,
  icon varchar(200) NOT NULL,
  description varchar(2000) DEFAULT '',
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);
CREATE TABLE `product` (
  id varchar(20) NOT NULL,
  name varchar(500) NOT NULL,
  price int(10) unsigned NOT NULL,
  description varchar(2000) NOT NULL,
  image_url varchar(200) NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);
CREATE TABLE `users` (
  username varchar(50) NOT NULL,
  password varchar(500) NOT NULL,
  enabled tinyint(4) NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (username)
);
CREATE TABLE `authorities` (
  username varchar(50) NOT NULL,
  authority varchar(50) NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (username,authority),
  FOREIGN KEY (username) REFERENCES users (username)
);
CREATE TABLE `basket` (
  username varchar(50) NOT NULL,
  product_id varchar(20) NOT NULL,
  count int(10) unsigned NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (username),
  FOREIGN KEY (product_id) REFERENCES product (id),
  FOREIGN KEY (username) REFERENCES users (username)
);
CREATE TABLE `board` (
  id varchar(20) NOT NULL,
  username varchar(50) NOT NULL,
  type varchar(20) NOT NULL,
  content blob NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (username) REFERENCES users (username)
);
CREATE TABLE `order` (
  id varchar(20) NOT NULL,
  username varchar(50) NOT NULL,
  product_id varchar(20) NOT NULL,
  status enum('ready','delivery','complete') NOT NULL,
  create_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_timestamp timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (product_id) REFERENCES product (id),
  FOREIGN KEY (username) REFERENCES users (username)
);