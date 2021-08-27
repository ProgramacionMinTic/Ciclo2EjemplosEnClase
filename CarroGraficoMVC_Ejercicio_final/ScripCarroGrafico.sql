DROP schema IF EXISTS carro;
create schema carro;
use carro;
  
  CREATE TABLE concesionario(
	con_identificacion integer NOT NULL PRIMARY KEY, 
    con_ubicacion varchar(20) NOT NULL
 ); 
 
 CREATE TABLE camioneta(
	cam_id integer not null auto_increment,
	cam_placa VARCHAR(7) NOT NULL unique, 
    cam_cilindraje integer NOT NULL,
    cam_referencia varchar(30) NULL,
    cam_con_id integer NOT NULL,
    cam_pais ENUM('Colombia', 'Ecuador', 'Venezuela')
    default 'Colombia',
    cam_ciu_pla varchar(30) not null,
    
    primary key(cam_id),
    foreign key (cam_con_id) references 
    concesionario(con_identificacion)
 ); 
 
 
 show tables;
show columns from concesionario;
describe camioneta;
-- drop table camioneta;
 INSERT INTO concesionario(con_identificacion, con_ubicacion)
 		values(1003, "Medellin"),
        (1001, "Bogotá"),
        (1002, "Cali");

INSERT INTO concesionario(con_identificacion, con_ubicacion)
 		values(1102, "Cali");
       
INSERT INTO camioneta(cam_placa, 
    cam_cilindraje,
    cam_referencia,
    cam_ciu_pla,
    cam_con_id)
		values('AXY-123', 5000, "4X4", "Cali", 1001),
				('BXY-123', 4000, "todo terreno", "Cali", 1002),
                ('CXY-123', 2000, "4X2", "Bogota", 1002),
                ('DXY-123', 8000, "todo terreno", "Medellín", 1001);
 
 