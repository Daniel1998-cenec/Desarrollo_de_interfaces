drop database Universidad; 
CREATE DATABASE IF NOT EXISTS Universidad;
USE Universidad;

create table estudiante (
id int auto_increment primary key,
nombre varchar(50),
correoElectronico varchar(100),
telefono varchar(15),
curso varchar(50),
fechaInscripcion varchar(50)

);