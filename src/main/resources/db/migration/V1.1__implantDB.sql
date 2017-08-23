	--creacion tabla Proyecto
	CREATE TABLE IF NOT EXISTS proyecto (
		codigoProyecto VARCHAR(15) NOT NULL	,
		CONSTRAINT pk_codigoProyecto PRIMARY KEY(codigoProyecto),
		elementoPEP VARCHAR(50),
		nombreProyecto VARCHAR(200) NOT NULL,
		responsableProyecto VARCHAR(100) NOT NULL,
		fechaInicio VARCHAR(35) NOT NULL,
		fechaFin VARCHAR(35) NOT NULL,
		estatus VARCHAR(50),
		posicion INTEGER,
		presupuesto DOUBLE PRECISION,
		disponible DOUBLE PRECISION,
		codigoCompra VARCHAR(10),
		codigoOrden VARCHAR(10),
		tipo VARCHAR(30) NOT NULL
	);
	ALTER TABLE proyecto OWNER TO implantdb;

	--creacion tabla Recurso
	CREATE TABLE IF NOT EXISTS recurso(
		codigoRecurso VARCHAR(10) NOT NULL,
		CONSTRAINT pk_codigoRecurso PRIMARY KEY(codigoRecurso),
		nombreRecurso VARCHAR(40) NOT NULL,
		apellidoPaterno VARCHAR(40) NOT NULL,
		apellidoMaterno VARCHAR(40) NOT NULL,
		nombrePerfil VARCHAR(40) NOT NULL,
		nombreEmpresa VARCHAR(100) NOT NULL,
		estadoRecurso VARCHAR(10) NOT NULL
	);
	ALTER TABLE recurso OWNER TO implantdb;

	--creacion tabla tmpRecurso
	CREATE TABLE IF NOT EXISTS tmpRecurso(
		codigoRecurso VARCHAR(10) NOT NULL,
		nombreRecurso VARCHAR(40) NOT NULL,
		apellidoPaterno VARCHAR(40) NOT NULL,
		apellidoMaterno VARCHAR(40) NOT NULL,
		nombrePerfil VARCHAR(40) NOT NULL,
		nombreEmpresa VARCHAR(100) NOT NULL,
		estadoRecurso VARCHAR(10) NOT NULL
	);
	ALTER TABLE tmpRecurso OWNER TO implantdb;

	--creacion tabla Justificacion
	CREATE TABLE IF NOT EXISTS justificacion(
		idJustificacion SMALLINT NOT NULL,
		CONSTRAINT pk_idJustificacion PRIMARY KEY(idJustificacion),
		descripcion VARCHAR(60) NOT NULL
	);
	ALTER TABLE justificacion OWNER TO implantdb;

	--creacion tabla Proyecto Justificacion
	CREATE TABLE IF NOT EXISTS proyecto_justificacion(
		codigoProyecto VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoProyecto FOREIGN KEY(codigoProyecto) REFERENCES proyecto(codigoProyecto),
		idJustificacion SMALLINT NOT NULL,
		CONSTRAINT fk_idJustificacion FOREIGN KEY(idJustificacion) REFERENCES justificacion(idJustificacion)
	);
	ALTER TABLE proyecto_justificacion OWNER TO implantdb;

	--creacion tabla ROL
	CREATE TABLE IF NOT EXISTS rol(
		idRol SMALLINT NOT NULL,
		CONSTRAINT pk_idRol PRIMARY KEY(idRol),
		nombreRol VARCHAR(40) NOT NULL
	);
	ALTER TABLE rol OWNER TO implantdb;

	--creacion tabla Usuario
	CREATE TABLE IF NOT EXISTS usuario(
		idUsuario SERIAL NOT NULL,
		CONSTRAINT pk_idUsuario PRIMARY KEY(idUsuario),
		nombreUsuario VARCHAR(30) NOT NULL,
		apellidoPaterno VARCHAR(30) NOT NULL,
		apellidoMaterno VARCHAR(30),
		mailUsuario VARCHAR(35) NOT NULL,
		idRol SMALLINT NOT NULL,
		CONSTRAINT fk_idRol FOREIGN KEY(idRol) REFERENCES rol(idRol)
	);
	ALTER TABLE usuario OWNER TO implantdb;

	--creacion tabla Proyecto Usuario
	CREATE TABLE IF NOT EXISTS proyecto_usuario(
		codigoProyecto VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoProyecto FOREIGN KEY(codigoProyecto) REFERENCES proyecto(codigoProyecto),
		idUsuario SMALLINT NOT NULL,
		CONSTRAINT fk_idUsuario FOREIGN KEY(idUsuario) REFERENCES usuario(idUsuario),
		actividad VARCHAR(50) NOT NULL,
		fecha DATE NOT NULL
	);
	ALTER TABLE proyecto_usuario OWNER TO implantdb;

	--creacion tabla Moneda
	CREATE TABLE IF NOT EXISTS moneda(
		idMoneda SMALLINT NOT NULL,
		CONSTRAINT pk_idMoneda PRIMARY KEY(idMoneda),
		tipoMoneda VARCHAR(20) NOT NULL,
		tipoCambio 	DOUBLE PRECISION
	);
	ALTER TABLE moneda OWNER TO implantdb;


	--creacion tabla Empresa
	CREATE TABLE IF NOT EXISTS empresa(
		codigoEmpresa VARCHAR(5) NOT NULL,
		CONSTRAINT pk_idEmpresa PRIMARY KEY(codigoEmpresa),
		nombreEmpresa VARCHAR(100) NOT NULL,
		estatusEmpresa VARCHAR(20) NOT NULL,
		tarifaGeneral DOUBLE PRECISION NOT NULL,
		idMoneda SMALLINT NOT NULL,
		CONSTRAINT fk_idMoneda FOREIGN KEY(idMoneda) REFERENCES moneda(idMoneda)
	);
	ALTER TABLE empresa OWNER TO implantdb;

	--creacion tabla Proyecto Empresa
	CREATE TABLE IF NOT EXISTS proyecto_empresa(
		codigoProyecto VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoProyecto FOREIGN KEY(codigoProyecto) REFERENCES proyecto(codigoProyecto),
		codigoEmpresa VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoEmpresa FOREIGN KEY(codigoEmpresa) REFERENCES empresa(codigoEmpresa)
	);
	ALTER TABLE proyecto_empresa OWNER TO implantdb;

	--creacion tabla Proyecto Recurso
	CREATE TABLE IF NOT EXISTS proyecto_recurso(
		codigoProyecto VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoProyecto FOREIGN KEY(codigoProyecto) REFERENCES proyecto(codigoProyecto),
		codigoRecurso VARCHAR(15) NOT NULL,
		CONSTRAINT fk_codigoRecurso FOREIGN KEY(codigoRecurso) REFERENCES recurso(codigoRecurso)
	);
	ALTER TABLE proyecto_recurso OWNER TO implantdb;

	-- creacion tabla horas
	CREATE TABLE IF NOT EXISTS horas(
		idHoras SERIAL NOT NULL,
		CONSTRAINT pk_idHoras PRIMARY KEY(idhoras),
		anio INT NOT NULL,
		mes SMALLINT NOT NULL,
		cantidad SMALLINT NOT NULL,
		pago INT
	);
	ALTER TABLE horas OWNER TO implantdb;

	-- creacion tabla horas_recurso
	CREATE TABLE IF NOT EXISTS horas_recurso(
		idHoras INT NOT NULL,
		CONSTRAINT fk_horas_recurso FOREIGN KEY(idHoras) REFERENCES horas(idHoras),
		CONSTRAINT pk_horas_recurso PRIMARY KEY(idHoras),
		codigoRecurso VARCHAR(10) NOT NULL,
		CONSTRAINT fk_codigoRecurso FOREIGN KEY(codigoRecurso) REFERENCES recurso(codigoRecurso)
	);
	ALTER TABLE horas_recurso OWNER TO implantdb;

	-- crecion tabla horas_Empresa
	CREATE TABLE IF NOT EXISTS horas_empresa(
		idHoras INT NOT NULL,
		CONSTRAINT fk_horas_empresa FOREIGN KEY(idHoras) REFERENCES horas(idHoras),
		CONSTRAINT pk_horas_empresa PRIMARY KEY(idHoras),
		codigoEmpresa VARCHAR(10) NOT NULL,
		CONSTRAINT fk_codigoEmpresa FOREIGN KEY(codigoEmpresa) REFERENCES empresa(codigoEmpresa)
	);
	ALTER TABLE horas_empresa OWNER TO implantdb;

	--creacion tablas temporales
	CREATE TABLE IF NOT EXISTS tmpPartida(
		idTmpPartida SERIAL NOT NULL,
		CONSTRAINT pk_idTmpPartida PRIMARY KEY(idTmpPartida),
		defProyecto VARCHAR(40) NOT NULL,
		elementoPEP VARCHAR(20) NOT NULL,
		presupuesto DOUBLE PRECISION NOT NULL,
		disponible DOUBLE PRECISION NOT NULL
	);
	ALTER TABLE tmpPartida OWNER TO implantdb;

	CREATE TABLE IF NOT EXISTS tmpCartera(
		idTmpCartera SERIAL NOT NULL,
		CONSTRAINT pk_idTmpCartera PRIMARY KEY(idTmpCartera),
		codigoPrograma VARCHAR(100) NOT NULL,
		nombrePrograma VARCHAR(200) NOT NULL,
		codigoProyecto VARCHAR(100) NOT NULL,
		codigoPMT VARCHAR(35) NOT NULL,
		proyecto VARCHAR(100) NOT NULL,
		estado VARCHAR(50) NOT NULL,
		tipoProyecto VARCHAR(35) NOT NULL,
		liderPMO VARCHAR(100) NOT NULL,
		fechaInicio VARCHAR(35) NOT NULL,
		fechaFin VARCHAR(35) NOT NULL,
		codigoPartidaPresupuestal VARCHAR(500) NOT NULL
	);
	ALTER TABLE tmpCartera OWNER TO implantdb;

	-- creacion tabla Perfil
	CREATE TABLE IF NOT EXISTS perfil(
		idPerfil SERIAL NOT NULL,
		CONSTRAINT pk_idPerfil PRIMARY KEY(idPerfil),
		codigoEmpresa VARCHAR(10) NOT NULL,
		CONSTRAINT fk_codigoEmpresa FOREIGN KEY(codigoEmpresa) REFERENCES empresa(codigoEmpresa),
		nombrePerfil VARCHAR(40) NOT NULL,
		pago DOUBLE PRECISION
	);
	ALTER TABLE perfil OWNER TO implantdb;

