--<ScriptOptions statementTerminator=";"/>

ALTER TABLE VEHICLES DROP CONSTRAINT vehicle_type_fk;

ALTER TABLE USER_UNDO DROP CONSTRAINT USER_UNDO_fkey;

ALTER TABLE MAP_GEOMETRY DROP CONSTRAINT MAP_GEOMETRY_MAP_fkey;

ALTER TABLE OPERATORS DROP CONSTRAINT operator_type_fk;

ALTER TABLE USER_UNDO_CURRENT DROP CONSTRAINT USER_UNDO_CURRENT_fkey;

ALTER TABLE ZONES DROP CONSTRAINT ZONES_pkey;

ALTER TABLE USER_UNDO DROP CONSTRAINT USER_UNDO_pkey;

ALTER TABLE DEVICE_TYPE DROP CONSTRAINT DEVICE_TYPE_pkey;

ALTER TABLE MAP_GEOMETRY DROP CONSTRAINT MAP_GEOMETRY_pkey;

ALTER TABLE QUERIES DROP CONSTRAINT QUERIES_pkey;

ALTER TABLE UPLOADS DROP CONSTRAINT UPLOADS_pkey;

ALTER TABLE SIGNS DROP CONSTRAINT SIGNS_pkey;

ALTER TABLE USERS DROP CONSTRAINT USERS_pkey;

ALTER TABLE OPERATOR_TYPES DROP CONSTRAINT OPERATOR_TYPES_pkey;

ALTER TABLE OPERATORS DROP CONSTRAINT OPERATORS_pkey;

ALTER TABLE VEHICLES DROP CONSTRAINT VEHICLES_pkey;

ALTER TABLE TRACKING_LOGS DROP CONSTRAINT TRACKING_LOGS_pkey;

ALTER TABLE spatial_ref_sys DROP CONSTRAINT spatial_ref_sys_pkey;

ALTER TABLE MINES DROP CONSTRAINT MINES_pkey;

ALTER TABLE VEHICLE_TYPES DROP CONSTRAINT VEHICLE_TYPES_pkey;

ALTER TABLE USERS DROP CONSTRAINT USERS_NAME_key;

ALTER TABLE CONFIG DROP CONSTRAINT CONFIG_pkey;

ALTER TABLE LABELS DROP CONSTRAINT LABELS_pkey;

ALTER TABLE TRACKING_PRESTART_CHECKS DROP CONSTRAINT TRACKING_PRESTART_CHECKS_pkey;

ALTER TABLE NODES DROP CONSTRAINT NODES_pkey;

ALTER TABLE USER_UNDO_CURRENT DROP CONSTRAINT USER_UNDO_CURRENT_pkey;

DROP INDEX MAP_GEOMETRY_pkey;

DROP INDEX USER_UNDO_CURRENT_pkey;

DROP INDEX VEHICLES_NAME_key;

DROP INDEX LABELS_VERSION_key;

DROP INDEX SIGNS_pkey;

DROP INDEX NODES_VERSION_key;

DROP INDEX MAP_GEOMETRY_LABELS_idx;

DROP INDEX MAP_GEOMETRY_HASH_IDX;

DROP INDEX VEHICLES_pkey;

DROP INDEX USERS_pkey;

DROP INDEX QUERIES_pkey;

DROP INDEX TRACKING_LOGS_pkey;

DROP INDEX MAP_GEOMETRY_VERSION_key;

DROP INDEX TRACKING_PRESTART_CHECKS_pkey;

DROP INDEX spatial_ref_sys_pkey;

DROP INDEX OPERATOR_TYPES_NAME_key;

DROP INDEX CONFIG_pkey;

DROP INDEX NODES_LOG_idx;

DROP INDEX OPERATORS_pkey;

DROP INDEX USERS_VERSION_key;

DROP INDEX QUERIES_VERSION_key;

DROP INDEX QUERIES_NAME_key;

DROP INDEX MAP_GEOMETRY_GEOMETRY_IDX;

DROP INDEX VEHICLE_TYPES_pkey;

DROP INDEX USER_UNDO_pkey;

DROP INDEX MINES_pkey;

DROP INDEX UPLOADS_pkey;

DROP INDEX NODES_pkey;

DROP INDEX CONFIG_NAME_key;

DROP INDEX OPERATORS_NAME_key;

DROP INDEX USERS_NAME_key;

DROP INDEX MINES_NAME_key;

DROP INDEX UPLOADS_VERSION_key;

DROP INDEX USER_UNDO_idx;

DROP INDEX VEHICLE_TYPES_NAME_key;

DROP INDEX DEVICE_TYPE_pkey;

DROP INDEX LABELS_NAME_IDX;

DROP INDEX OPERATOR_TYPES_pkey;

DROP INDEX LABELS_pkey;

DROP INDEX ZONES_pkey;

DROP VIEW raster_overviews;

DROP VIEW raster_columns;

DROP VIEW geometry_columns;

DROP VIEW geography_columns;

DROP TABLE USERS;

DROP TABLE SIGNS;

DROP TABLE QUERIES;

DROP TABLE MINES;

DROP TABLE VEHICLES;

DROP TABLE MAP_GEOMETRY;

DROP TABLE NODES_LOG;

DROP TABLE spatial_ref_sys;

DROP TABLE UPLOADS;

DROP TABLE DEVICE_TYPE;

DROP TABLE TRACKING_PRESTART_CHECKS;

DROP TABLE OPERATORS;

DROP TABLE VEHICLE_TYPES;

DROP TABLE DB_VERSION;

DROP TABLE USER_UNDO_CURRENT;

DROP TABLE TRACKING_LOGS;

DROP TABLE OPERATOR_TYPES;

DROP TABLE LABELS;

DROP TABLE CONFIG;

DROP TABLE USER_UNDO;

DROP TABLE NODES;

DROP TABLE ZONES;

CREATE TABLE USERS (
		ID BIGSERIAL DEFAULT nextval('"USERS_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		DESCRIPTION VARCHAR(1000),
		OPTIONS TEXT(2147483647),
		ROLE VARCHAR(100),
		CONTEXTS TEXT(2147483647),
		PASSWORD VARCHAR(200),
		VERSION BIGSERIAL DEFAULT nextval('"USERS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE SIGNS (
		ID BIGSERIAL DEFAULT nextval('"SIGNS_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200) NOT NULL,
		DESCRIPTION VARCHAR(2000),
		ROLES null,
		LOCATION null,
		ZONE VARCHAR(200),
		IMAGE BYTEA(2147483647),
		ACTIVE BOOL,
		TIMESTART TIMESTAMP,
		TIMEEND TIMESTAMP,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar,
		VERSION BIGSERIAL DEFAULT nextval('"SIGNS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		IMAGENAME BPCHAR(200),
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE QUERIES (
		ID BIGSERIAL DEFAULT nextval('"QUERIES_ID_SEQ"'::regclass) NOT NULL,
		SQL TEXT(2147483647),
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		NAME VARCHAR(200) NOT NULL,
		ROLES VARCHAR(200) DEFAULT 'NOCONTEXT'::character varying,
		VERSION BIGSERIAL DEFAULT nextval('"QUERIES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		DESCRIPTION TEXT(2147483647),
		MTIME FLOAT8
	);

CREATE TABLE MINES (
		ID BIGSERIAL DEFAULT nextval('"MINES_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		DESCRIPTION VARCHAR(1000),
		PROPERTIES null,
		ID_UPLOAD INT8,
		VERSION BIGSERIAL DEFAULT nextval('"MINES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		ROUTES_DATA TEXT(2147483647),
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE VEHICLES (
		ID SERIAL DEFAULT nextval('"VEHICLES_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		DESCRIPTION VARCHAR(1000),
		DISPLAY_TYPE INT4,
		PROPERTIES null,
		ZONE_PERMISSIONS null,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		VERSION BIGSERIAL DEFAULT nextval('"VEHICLES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8
	);

CREATE TABLE MAP_GEOMETRY (
		ID BIGSERIAL DEFAULT nextval('"MAP_GEOMETRY_ID_SEQ"'::regclass) NOT NULL,
		ID_MAP INT8 NOT NULL,
		GEOMETRY null,
		LABELS VARCHAR[ ](200),
		HASH INT8,
		VERSION BIGSERIAL DEFAULT nextval('"MAP_GEOMETRY_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		DESCRIPTION VARCHAR(1000),
		PROPERTIES null DEFAULT '{"opacity":1, "color":"green"}'::json,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE NODES_LOG (
		ID INT8 NOT NULL,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		VALUE TEXT(2147483647)
	);

CREATE TABLE spatial_ref_sys (
		srid INT4 NOT NULL,
		auth_name VARCHAR(256),
		auth_srid INT4,
		srtext VARCHAR(2048),
		proj4text VARCHAR(2048)
	);

CREATE TABLE UPLOADS (
		ID BIGSERIAL DEFAULT nextval('"UPLOADS_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		HASH VARCHAR(200),
		VERSION BIGSERIAL DEFAULT nextval('"UPLOADS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		PROPERTIES null,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE DEVICE_TYPE (
		ID BIGSERIAL DEFAULT nextval('"DEVICE_TYPE_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		VERSION BIGSERIAL DEFAULT nextval('"DEVICE_TYPE_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL
	);

CREATE TABLE TRACKING_PRESTART_CHECKS (
		ID BIGSERIAL DEFAULT nextval('"TRACKING_PRESTART_CHECKS_ID_SEQ"'::regclass) NOT NULL,
		DESCRIPTION VARCHAR(2000),
		ORDER INT4,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar,
		VERSION BIGSERIAL DEFAULT nextval('"TRACKING_PRESTART_CHECKS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE OPERATORS (
		ID SERIAL DEFAULT nextval('"OPERATORS_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		DESCRIPTION VARCHAR(1000),
		DISPLAY_TYPE INT4,
		PROPERTIES null,
		ZONE_PERMISSIONS null,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		VERSION BIGSERIAL DEFAULT nextval('"OPERATORS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8
	);

CREATE TABLE VEHICLE_TYPES (
		ID SERIAL DEFAULT nextval('"VEHICLE_TYPES_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		DESCRIPTION VARCHAR(1000),
		PROPERTIES null,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		VERSION BIGSERIAL DEFAULT nextval('"VEHICLE_TYPES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		ZONE_PERMISSIONS null
	);

CREATE TABLE DB_VERSION (
		major INT4 NOT NULL,
		minor INT4 NOT NULL,
		increment INT4 NOT NULL,
		lastscript BPCHAR(100)
	);

CREATE TABLE USER_UNDO_CURRENT (
		USERNAME VARCHAR(200) NOT NULL,
		ID_OBJECT INT4 NOT NULL,
		ID_OPERATION INT4 NOT NULL,
		CURRENT INT4 NOT NULL
	);

CREATE TABLE TRACKING_LOGS (
		ID BIGSERIAL DEFAULT nextval('"TRACKING_LOGS_ID_SEQ"'::regclass) NOT NULL,
		OPERATORID INT8 NOT NULL,
		VEHICLEID INT8 NOT NULL,
		LOG_TYPE VARCHAR(50) NOT NULL,
		LOG_MSG null NOT NULL,
		LOG_TIME TIMESTAMP NOT NULL,
		LOG_NOTES VARCHAR(2000) NOT NULL,
		VEHICLE_DETAILS null NOT NULL,
		VERSION BIGSERIAL DEFAULT nextval('"TRACKING_LOGS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE OPERATOR_TYPES (
		ID SERIAL DEFAULT nextval('"OPERATOR_TYPES_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		DESCRIPTION VARCHAR(1000),
		PROPERTIES null,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		VERSION BIGSERIAL DEFAULT nextval('"OPERATOR_TYPES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		ZONE_PERMISSIONS null
	);

CREATE TABLE LABELS (
		ID BIGSERIAL DEFAULT nextval('"LABELS_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200) NOT NULL,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		DESCRIPTION VARCHAR(1000),
		TYPE INT2,
		VERSION BIGSERIAL DEFAULT nextval('"LABELS_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		PROPERTIES null DEFAULT '{"transparency":0, "color":"green", "radius":0.5, "convex_hull":0.5,"selectable":false, "include":false, "exclude":false}'::json,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE CONFIG (
		ID BIGSERIAL DEFAULT nextval('"CONFIG_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200),
		VALUE VARCHAR(1000),
		VERSION BIGSERIAL DEFAULT nextval('"CONFIG_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE USER_UNDO (
		ID BIGSERIAL DEFAULT nextval('"USER_UNDO_ID_SEQ"'::regclass) NOT NULL,
		USERNAME VARCHAR(200) NOT NULL,
		ID_OBJECT INT4 NOT NULL,
		ID_OPERATION INT4 NOT NULL,
		TYPE INT2 NOT NULL,
		FORWARD TEXT(2147483647),
		BACKWARD TEXT(2147483647)
	);

CREATE TABLE NODES (
		ID BIGSERIAL DEFAULT nextval('"NODES_ID_SEQ"'::regclass) NOT NULL,
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar NOT NULL,
		DESCRIPTION VARCHAR(1000),
		VERSION BIGSERIAL DEFAULT nextval('"NODES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		PROPERTIES null,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1)
	);

CREATE TABLE ZONES (
		ID BIGSERIAL DEFAULT nextval('"ZONES_ID_SEQ"'::regclass) NOT NULL,
		NAME VARCHAR(200) NOT NULL,
		DESCRIPTION VARCHAR(2000),
		ZONESTATUS VARCHAR(200),
		COLOUR VARCHAR(200),
		STATUS BPCHAR(1) DEFAULT 'y'::bpchar,
		VERSION BIGSERIAL DEFAULT nextval('"ZONES_VERSION_SEQ"'::regclass) NOT NULL,
		MASTER_VERSION INT8,
		MTIME FLOAT8 DEFAULT round((date_part('epoch'::text, now()))::numeric, 1),
		PROPERTIES null
	);

CREATE VIEW raster_overviews (o_table_catalog, o_table_schema, o_table_name, o_raster_column, r_table_catalog, r_table_schema, r_table_name, r_raster_column, overview_factor) 
WITH CASCADED CHECK OPTION;

CREATE VIEW raster_columns (r_table_catalog, r_table_schema, r_table_name, r_raster_column, srid, scale_x, scale_y, blocksize_x, blocksize_y, same_alignment, regular_blocking, num_bands, pixel_types, nodata_values, out_db, extent) 
WITH CASCADED CHECK OPTION;

CREATE VIEW geometry_columns (f_table_catalog, f_table_schema, f_table_name, f_geometry_column, coord_dimension, srid, type) 
WITH CASCADED CHECK OPTION;

CREATE VIEW geography_columns (f_table_catalog, f_table_schema, f_table_name, f_geography_column, coord_dimension, srid, type) 
WITH CASCADED CHECK OPTION;

CREATE UNIQUE INDEX MAP_GEOMETRY_pkey ON MAP_GEOMETRY (ID ASC);

CREATE UNIQUE INDEX USER_UNDO_CURRENT_pkey ON USER_UNDO_CURRENT (USERNAME ASC, ID_OBJECT ASC, ID_OPERATION ASC);

CREATE UNIQUE INDEX VEHICLES_NAME_key ON VEHICLES (NAME ASC);

CREATE UNIQUE INDEX LABELS_VERSION_key ON LABELS (VERSION ASC);

CREATE UNIQUE INDEX SIGNS_pkey ON SIGNS (ID ASC);

CREATE UNIQUE INDEX NODES_VERSION_key ON NODES (VERSION ASC);

CREATE INDEX MAP_GEOMETRY_LABELS_idx ON MAP_GEOMETRY (LABELS ASC);

CREATE INDEX MAP_GEOMETRY_HASH_IDX ON MAP_GEOMETRY (HASH ASC);

CREATE UNIQUE INDEX VEHICLES_pkey ON VEHICLES (ID ASC);

CREATE UNIQUE INDEX USERS_pkey ON USERS (ID ASC);

CREATE UNIQUE INDEX QUERIES_pkey ON QUERIES (ID ASC);

CREATE UNIQUE INDEX TRACKING_LOGS_pkey ON TRACKING_LOGS (ID ASC);

CREATE UNIQUE INDEX MAP_GEOMETRY_VERSION_key ON MAP_GEOMETRY (VERSION ASC);

CREATE UNIQUE INDEX TRACKING_PRESTART_CHECKS_pkey ON TRACKING_PRESTART_CHECKS (ID ASC);

CREATE UNIQUE INDEX spatial_ref_sys_pkey ON spatial_ref_sys (srid ASC);

CREATE UNIQUE INDEX OPERATOR_TYPES_NAME_key ON OPERATOR_TYPES (NAME ASC);

CREATE UNIQUE INDEX CONFIG_pkey ON CONFIG (ID ASC);

CREATE INDEX NODES_LOG_idx ON NODES_LOG (MTIME ASC, ID ASC);

CREATE UNIQUE INDEX OPERATORS_pkey ON OPERATORS (ID ASC);

CREATE UNIQUE INDEX USERS_VERSION_key ON USERS (VERSION ASC);

CREATE UNIQUE INDEX QUERIES_VERSION_key ON QUERIES (VERSION ASC);

CREATE UNIQUE INDEX QUERIES_NAME_key ON QUERIES (NAME ASC);

CREATE INDEX MAP_GEOMETRY_GEOMETRY_IDX ON MAP_GEOMETRY (GEOMETRY ASC);

CREATE UNIQUE INDEX VEHICLE_TYPES_pkey ON VEHICLE_TYPES (ID ASC);

CREATE UNIQUE INDEX USER_UNDO_pkey ON USER_UNDO (ID ASC);

CREATE UNIQUE INDEX MINES_pkey ON MINES (ID ASC);

CREATE UNIQUE INDEX UPLOADS_pkey ON UPLOADS (ID ASC);

CREATE UNIQUE INDEX NODES_pkey ON NODES (ID ASC);

CREATE UNIQUE INDEX CONFIG_NAME_key ON CONFIG (NAME ASC);

CREATE UNIQUE INDEX OPERATORS_NAME_key ON OPERATORS (NAME ASC);

CREATE UNIQUE INDEX USERS_NAME_key ON USERS (NAME ASC);

CREATE UNIQUE INDEX MINES_NAME_key ON MINES (NAME ASC);

CREATE UNIQUE INDEX UPLOADS_VERSION_key ON UPLOADS (VERSION ASC);

CREATE INDEX USER_UNDO_idx ON USER_UNDO (USERNAME ASC, ID_OBJECT ASC, ID_OPERATION ASC);

CREATE UNIQUE INDEX VEHICLE_TYPES_NAME_key ON VEHICLE_TYPES (NAME ASC);

CREATE UNIQUE INDEX DEVICE_TYPE_pkey ON DEVICE_TYPE (ID ASC);

CREATE UNIQUE INDEX LABELS_NAME_IDX ON LABELS (NAME ASC);

CREATE UNIQUE INDEX OPERATOR_TYPES_pkey ON OPERATOR_TYPES (ID ASC);

CREATE UNIQUE INDEX LABELS_pkey ON LABELS (ID ASC);

CREATE UNIQUE INDEX ZONES_pkey ON ZONES (ID ASC);

ALTER TABLE ZONES ADD CONSTRAINT ZONES_pkey PRIMARY KEY (ID);

ALTER TABLE USER_UNDO ADD CONSTRAINT USER_UNDO_pkey PRIMARY KEY (ID);

ALTER TABLE DEVICE_TYPE ADD CONSTRAINT DEVICE_TYPE_pkey PRIMARY KEY (ID);

ALTER TABLE MAP_GEOMETRY ADD CONSTRAINT MAP_GEOMETRY_pkey PRIMARY KEY (ID);

ALTER TABLE QUERIES ADD CONSTRAINT QUERIES_pkey PRIMARY KEY (ID);

ALTER TABLE UPLOADS ADD CONSTRAINT UPLOADS_pkey PRIMARY KEY (ID);

ALTER TABLE SIGNS ADD CONSTRAINT SIGNS_pkey PRIMARY KEY (ID);

ALTER TABLE USERS ADD CONSTRAINT USERS_pkey PRIMARY KEY (ID);

ALTER TABLE OPERATOR_TYPES ADD CONSTRAINT OPERATOR_TYPES_pkey PRIMARY KEY (ID);

ALTER TABLE OPERATORS ADD CONSTRAINT OPERATORS_pkey PRIMARY KEY (ID);

ALTER TABLE VEHICLES ADD CONSTRAINT VEHICLES_pkey PRIMARY KEY (ID);

ALTER TABLE TRACKING_LOGS ADD CONSTRAINT TRACKING_LOGS_pkey PRIMARY KEY (ID);

ALTER TABLE spatial_ref_sys ADD CONSTRAINT spatial_ref_sys_pkey PRIMARY KEY (srid);

ALTER TABLE MINES ADD CONSTRAINT MINES_pkey PRIMARY KEY (ID);

ALTER TABLE VEHICLE_TYPES ADD CONSTRAINT VEHICLE_TYPES_pkey PRIMARY KEY (ID);

ALTER TABLE USERS ADD CONSTRAINT USERS_NAME_key UNIQUE (NAME);

ALTER TABLE CONFIG ADD CONSTRAINT CONFIG_pkey PRIMARY KEY (ID);

ALTER TABLE LABELS ADD CONSTRAINT LABELS_pkey PRIMARY KEY (ID);

ALTER TABLE TRACKING_PRESTART_CHECKS ADD CONSTRAINT TRACKING_PRESTART_CHECKS_pkey PRIMARY KEY (ID);

ALTER TABLE NODES ADD CONSTRAINT NODES_pkey PRIMARY KEY (ID);

ALTER TABLE USER_UNDO_CURRENT ADD CONSTRAINT USER_UNDO_CURRENT_pkey PRIMARY KEY (USERNAME, ID_OBJECT, ID_OPERATION);

ALTER TABLE VEHICLES ADD CONSTRAINT vehicle_type_fk FOREIGN KEY (DISPLAY_TYPE)
	REFERENCES VEHICLE_TYPES (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE USER_UNDO ADD CONSTRAINT USER_UNDO_fkey FOREIGN KEY (USERNAME)
	REFERENCES USERS (NAME)
	ON DELETE CASCADE
	ON UPDATE CASCADE;

ALTER TABLE MAP_GEOMETRY ADD CONSTRAINT MAP_GEOMETRY_MAP_fkey FOREIGN KEY (ID_MAP)
	REFERENCES MINES (ID)
	ON DELETE CASCADE
	ON UPDATE CASCADE;

ALTER TABLE OPERATORS ADD CONSTRAINT operator_type_fk FOREIGN KEY (DISPLAY_TYPE)
	REFERENCES OPERATOR_TYPES (ID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

ALTER TABLE USER_UNDO_CURRENT ADD CONSTRAINT USER_UNDO_CURRENT_fkey FOREIGN KEY (USERNAME)
	REFERENCES USERS (NAME)
	ON DELETE CASCADE
	ON UPDATE CASCADE;

