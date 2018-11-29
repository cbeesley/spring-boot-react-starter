-- Sample DB if you want to test things out
-- Assuming Postgres here, change to your db user

CREATE DATABASE exampledb
    WITH
    OWNER = chrisbeesley
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


CREATE TABLE "account_users" (
"pk_id" serial8,
"uid" uuid NOT NULL,
"username" varchar(255),
"auth_token" varchar(255),
"password" varchar(255),
"first_name" varchar(255),
"last_name" varchar(255),
"is_enabled" bool,
"role_code" int,
"status_code" int2,
"last_login_time" timestamp,
"contact_ref" int8,
"date_entered" timestamp,
"date_modified" timestamp,
"is_reset_code" bool,
PRIMARY KEY ("pk_id")
);
