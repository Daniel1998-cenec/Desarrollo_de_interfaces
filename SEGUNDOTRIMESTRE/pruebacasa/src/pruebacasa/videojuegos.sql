drop database videojuegos;
create database videojuegos;
use videojuegos;

create table IF NOT EXISTS jugador(
id int auto_increment primary key,
nombre varchar(100),
nivel int,
puntos int,
amigo varchar(50)
);
