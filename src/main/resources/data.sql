-- 의류
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(1, 0, '의류', 'fas fa-tshirt', '의류', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(101, 1, '아우터', 'far fa-circle', '아우터', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(102, 1, '티셔츠', 'far fa-circle', '티셔츠', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(103, 1, '바지', 'far fa-circle', '바지', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 신발
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(2, 0, '신발', 'fas fa-shoe-prints', '신발', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(201, 2, '운동화', 'far fa-circle', '운동화', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(202, 2, '로퍼', 'far fa-circle', '로퍼', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(203, 2, '부츠', 'far fa-circle', '부츠', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 악세사리
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(3, 0, '악세사리', 'fas fa-hat-wizard', '악세사리', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(301, 3, '양말', 'far fa-circle', '양말', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(302, 3, '모자', 'far fa-circle', '모자', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category
(id, id_parent, title, icon, description, create_timestamp, update_timestamp)
VALUES(303, 3, '가방', 'far fa-circle', '가방', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);