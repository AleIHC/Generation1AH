use generationg1;

-- crear tabla curso

create table  cursos  ( 
id Integer primary key Auto_increment,
nombre varchar(10) Not null,
descripcion varchar(50)
);

-- crear tabla registros
create table  registros  ( 
id Integer primary key Auto_increment,
codigo varchar(30) Not null,
rut varchar(10) Not null
);

-- crear tabla direcciones
create table  direcciones  ( 
id Integer primary key Auto_increment,
nombre varchar(10) Not null,
numero varchar(10),
ciudad varchar(10),
region Integer,
pais Integer
);

-- crear tabla alumnos
create table  alumnos  (
id Integer primary key Auto_increment,
nombre varchar(10) Not null,
apellido varchar(10),
edad int,
cursos_id Integer,
registros_id Integer,
direcciones_id Integer
);

-- crear tabla usuarios
create table  usuarios  (
id Integer primary key Auto_increment,
nick varchar(10) Not null,
email varchar(100),
pass varchar(10),
);

---- Foreign Keys
ALTER TABLE alumnos
ADD CONSTRAINT FK_cursos_id
FOREIGN KEY (cursos_id) REFERENCES cursos(id),
ADD CONSTRAINT FK_direcciones_id
FOREIGN KEY (direcciones_id) REFERENCES direcciones(id),
ADD CONSTRAINT FK_registros_id
FOREIGN KEY (registros_id) REFERENCES registros(id)
;


-- Nuevas columnas
ALTER TABLE alumnos
ADD pais int;