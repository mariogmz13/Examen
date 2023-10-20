
create database examen;
use examen;

create table tipoEmpleado(
	id int IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    horas tinyint NOT NULL,
	)

insert into tipoEmpleado values (
	'Local', 48
)
insert into tipoEmpleado values (
	'Externo', 40
)



create table empleado(
    nombre VARCHAR(50) NOT NULL,
    apellidoPaterno VARCHAR(50) NOT NULL,
    apellidoMaterno VARCHAR(50) NOT NULL,
    rfc VARCHAR(13) PRIMARY KEY NOT NULL,
    fechaNacimiento date,
	tipoEmpleado int FOREIGN KEY  REFERENCES tipoEmpleado (id),
    salarioHora int,
    horasSemana tinyint,
)


