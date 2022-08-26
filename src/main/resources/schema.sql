create table artist(
                       artist_id INTEGER  AUTO_INCREMENT,
                       Name NVARCHAR(120)
);

CREATE TABLE album(
    album_id INTEGER  NOT NULL auto_increment,
    title NVARCHAR(160)  NOT NULL,
    artist_id INTEGER  NOT NULL
);
CREATE TABLE customer(
                         customer_id INTEGER AUTO_INCREMENT,
                         first_name NVARCHAR(40)  NOT NULL,
                         last_name NVARCHAR(20)  NOT NULL,
                         company NVARCHAR(80),
                         address NVARCHAR(70),
                         city NVARCHAR(40),
                         state NVARCHAR(40),
                         country NVARCHAR(40),
                         postal_code NVARCHAR(10),
                         phone NVARCHAR(24),
                         fax NVARCHAR(24),
                         email NVARCHAR(60),
                         CONSTRAINT pk_customer PRIMARY KEY  (customer_id)
);
CREATE TABLE invoice(
                        invoice_id INTEGER auto_increment,
                        customer_id integer not null,
                        invoice_date NVARCHAR(16)  NOT NULL,
                        billing_address NVARCHAR(70),
                        billing_city NVARCHAR(40),
                        billing_state NVARCHAR(40),
                        billing_country NVARCHAR(40),
                        billing_postal_code NVARCHAR(10),
                        total NUMERIC(10,2)  NOT NULL,
                        CONSTRAINT pk_invoice PRIMARY KEY  (invoice_id)

);



