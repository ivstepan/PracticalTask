
INSERT INTO customer(birthday, email, first_name, last_name) VALUES('23-05-1986', 'tortuga@island.ru', 'Capitan', 'Flint');
INSERT INTO customer(birthday, email, first_name, last_name) VALUES('18-07-1997', 'john@gmail.com', 'John', 'Doe');
INSERT INTO customer(birthday, email, first_name, last_name) VALUES('27-08-1995', 'vika@list.ru', 'Victoriya', 'Yahoo');
INSERT INTO customer(birthday, email, first_name, last_name) VALUES('08-03-1988', 'demo@yahoo.ru', 'Damian', 'Marks');

INSERT INTO auto(brand, model) VALUES('VAZ', 'Granta');
INSERT INTO auto(brand, model) VALUES('Audi', 'A6');
INSERT INTO auto(brand, model) VALUES('VAZ', 'Kalina');
INSERT INTO auto(brand, model) VALUES('VAZ', 'Vesta');
INSERT INTO auto(brand, model) VALUES('VAZ', 'X-RAY');

INSERT INTO options(airbags_price, auto_price, electric_scooters_price, floor_mats_price, heated_seats_price, heated_windshield_price, winter_tires_price, auto_id) VALUES(30000, 424000, 15000, 5000, 10000, 8000, 12000, 1);
INSERT INTO options(airbags_price, auto_price, electric_scooters_price, floor_mats_price, heated_seats_price, heated_windshield_price, winter_tires_price, auto_id) VALUES(80000, 1860000, 40000, 20000, 30000, 25000, 120000, 2);
INSERT INTO options(airbags_price, auto_price, electric_scooters_price, floor_mats_price, heated_seats_price, heated_windshield_price, winter_tires_price, auto_id) VALUES(30000, 520000, 20000, 7000, 12000, 10000, 14000, 3);
INSERT INTO options(airbags_price, auto_price, electric_scooters_price, floor_mats_price, heated_seats_price, heated_windshield_price, winter_tires_price, auto_id) VALUES(40000, 650000, 25000, 9000, 14000, 12000, 17000, 4);
INSERT INTO options(airbags_price, auto_price, electric_scooters_price, floor_mats_price, heated_seats_price, heated_windshield_price, winter_tires_price, auto_id) VALUES(50000, 920000, 30000, 10000, 15000, 15000, 30000, 5);

INSERT INTO orders("date", status, auto_id, customer_id) VALUES('2019-01-01 13:27:25.436', 'COMPLETED', 2, 1);
INSERT INTO orders("date", status, auto_id, customer_id) VALUES('2019-03-28 09:13:11.113', 'PROCESS', 4, 3);
INSERT INTO orders("date", status, auto_id, customer_id) VALUES('2019-03-29 17:02:19.272', 'RECEIVED', 5, 4);
INSERT INTO orders("date", status, auto_id, customer_id) VALUES('2019-04-02 11:35:09.117', 'RECEIVED', 3, 4);

INSERT INTO order_detail(options_description, options_price, order_id) VALUES('autoPrice', 1860000 , 1);
INSERT INTO order_detail(options_description, options_price, order_id) VALUES('autoPrice', 650000 , 2);
INSERT INTO order_detail(options_description, options_price, order_id) VALUES('autoPrice', 920000 , 3);
INSERT INTO order_detail(options_description, options_price, order_id) VALUES('autoPrice', 520000 , 4);