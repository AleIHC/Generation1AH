DROP DATABASE IF EXISTS TestJoin

CREATE DATABASE TestJoin

USE TestJoin


CREATE TABLE Grupos
(
    Id int NOT NULL Primary key,
    Nombre varchar(20)
)

CREATE TABLE Alumnos
(
    Id int NOT NULL Primary key AUTO_INCREMENT,
    Nombre varchar(20),
    grupo_id int
)

ALTER TABLE alumnos
ADD CONSTRAINT FK_Alumno_id_grupo_id  -- asignar nombre a la relacion
FOREIGN KEY (grupo_id) REFERENCES Grupos(id);

INSERT INTO Grupos VALUES(1, 'Grupo1'),
(2, 'Grupo2'),
(3, 'Grupo3'),
(4, 'Grupo4'),
(5, 'Grupo5'),
(6, 'Grupo6');

INSERT INTO Alumnos (nombre, grupo_id) VALUES ('Cristobal', 3), 
('Luis', 3), 
('Alejandro', 3), 
('Joao', 3), 
('Cristian', 3);
