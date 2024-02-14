-- drop database Biblioteca; 
CREATE DATABASE IF NOT EXISTS Biblioteca;
USE Biblioteca;

CREATE TABLE IF NOT EXISTS libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    editorial VARCHAR(255),
    autor_tutor VARCHAR(255),
    paginas INT
);