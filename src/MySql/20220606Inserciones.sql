INSERT INTO cursos (nombre, descripcion) VALUES ('Alfa', 'Aplicados'), ('Beta', 'Inteligentes'), ('Gamma', 'Astutos');

INSERT INTO registros (codigo, rut) VALUES ('ABE22315', '12345678-9'), ('TLP112235', '98765432-1'), ('TLP112236', '12312345-6');

INSERT INTO direcciones (nombre, numero, ciudad, region, pais) VALUES ('hipodromo', '1640', 'santiago', 13, 1), ('brownnte', '290', 'santiago', 13, 1), ('blestgana', '1720-A', 'santiago', 13, 1);

INSERT INTO usuarios (nick, email, pass) VALUES ('bacan', 'bacan@bacan.cl', 'admin1245'), ('pulento', 'pulento@pulento.cl', 'qwerty'), ('rasta', 'rasta@rasta.cl', 'adminadmin'), ('neo', 'neo@matrix.cl', 'morpheo');


-- insertar datos para alumnos
INSERT INTO alumnos (nombre, apellido, edad, cursos_id, registros_id, direcciones_id) 
VALUES
('Zoe', 'Morales', 3, 1, 1, 1),
('Ana', 'Lopez', 4, 1, 2, 2),
('Ivan', 'Fuentes', 3, 2, 3, 3)
;


