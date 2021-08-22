-- create schema carro;
-- use carro;
show tables;
show columns from concesionario;
describe camioneta;
-- drop table camioneta;
-- INSERT INTO concesionario(con_identificacion, con_ubicacion)
-- 		values(1003, "Medellin");

INSERT INTO concesionario(con_identificacion, con_ubicacion)
 		values(1102, "Cali");
       
INSERT INTO camioneta(cam_placa, 
    cam_cilindraje,
    cam_referencia,
    cam_con_id)
		values('AXY-123', 5000, "4X4",  1001),
				('BXY-123', 4000, "todo terreno",  1002),
                ('CXY-123', 2000, "4X2",  1002),
                ('DXY-123', 8000, "todo terreno",  1001);
        
UPDATE camioneta SET cam_pais="Venezuela" WHERE cam_placa='WXY-123';
UPDATE camioneta SET cam_con_id=1002 WHERE cam_placa='DXD-123';

UPDATE camioneta SET cam_pais="Ecuador", cam_cilindraje=5000 WHERE cam_placa='WXY-123';

SELECT * FROM camioneta;

-- delete from camioneta;

ALTER TABLE camioneta add velocidad_maxima integer null;

ALTER TABLE camioneta add cam_ciudad_placa varchar(30) not null;

ALTER TABLE camioneta DROP velocidad_maxima;

alter table camioneta rename column cam_ciudad_placa to cam_ciu_pla;

INSERT INTO camioneta(velocidad_maxima, cam_placa,
    cam_cilindraje,
    cam_con_id,
    cam_ciudad_placa)
		values(250, 'AXX-011', 10000, 1001, 'Medellín');

UPDATE camioneta SET cam_id=9 WHERE cam_id=1;

select cam_placa, cam_cilindraje from camioneta;

select con_ubicacion from concesionario;

select cam_cilindraje, cam_pais from camioneta where cam_cilindraje=10000;

update camioneta set cam_pais="Ecuador" where cam_id=10;

select * from camioneta where cam_cilindraje<5000;
select * from camioneta where cam_pais='Colombia';

select * from camioneta where cam_referencia like "%terre%"
and cam_con_id like "1002";

UPDATE camioneta SET cam_con_id=1102 WHERE cam_id=9;

select * from camioneta where cam_con_id like "1_02";

select * from camioneta order by cam_cilindraje asc limit 2;

select * from camioneta order by cam_cilindraje desc;

select count(cam_cilindraje) from camioneta where cam_cilindraje=10000;






