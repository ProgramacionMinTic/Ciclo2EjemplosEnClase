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
    
    primary key(cam_id),
    foreign key (cam_con_id) references 
    concesionario(con_identificacion)
 ); 

 
  CREATE TABLE camioneta(
	cam_id integer NOT NULL auto_increment,
	cam_placa VARCHAR(7) NOT NULL, 
    cam_cilindraje integer NOT NULL,
    cam_referencia varchar(30) NULL,
    cam_con_id integer NOT NULL,
    cam_pais ENUM('Colombia', 'Ecuador', 'Venezuela')
    default 'Colombia',
    
    primary key(cam_id),
    foreign key (cam_con_id) references 
    concesionario(con_identificacion)
 ); 