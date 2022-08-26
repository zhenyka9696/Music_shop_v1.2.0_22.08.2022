insert into artist (artist_Id,Name) values (1,'AC/DC');
insert into artist (artist_Id,Name) values (2,'Accept');
insert into artist (artist_Id,Name) values (3,'Aerosmith');
insert into artist (artist_Id,Name) values (4,'Alanis Morisette');
insert into artist (artist_Id,Name) values (5,'Alice In Chains');
insert into artist (artist_Id,Name) values (6,'Carlos Jobim');
insert into artist (artist_Id,Name) values (7,'Apocalyptica');
insert into artist (artist_Id,Name) values (8,'Audioslave');
insert into artist (artist_Id,Name) values (9,'BackBeat');
insert into artist (artist_Id,Name) values (10,'Samurai');

insert into album (album_id,title, artist_id) values (1,'For Those About To Rock We Salute You',1);
insert into album (album_id,title, artist_id) values (2,'Balls to the wall',2);
insert into album (album_id,title, artist_id) values (3,'Restless and Wild',2);
insert into album (album_id,title, artist_id) values (4,'Let There Be Rock',1);
insert into album (album_id,title, artist_id) values (5,'Chippin_In',10);
insert into album (album_id,title, artist_id) values (6,'The Ballad Of Buck Ravers',10);
insert into album (album_id,title, artist_id) values (7,'A Like Supreme',10);
insert into album (album_id,title, artist_id) values (8,'Never Fade Away',10);
insert into album (album_id,title, artist_id) values (9,'Black Dog',10);
insert into album (album_id,title, artist_id) values (10,'Archangel',10);

insert into customer (customer_id,first_name,last_name,company,address,city,state,country,postal_code,phone) values
 (1,'Luis','Gonsalves','Embraer - Brasileira de aeronatica S.A.','Av Brigadeiro Faria Lima 2170','Sao Jose dos Campos','SP','Brazil','12227-000','+55 (12) 3923-5555');
insert into customer (customer_id,first_name,last_name,address,city,country,postal_code,phone)values (2,'Leonie','Kohler','Theodor-Huess-Strabe 34','Stuttgart','Germany','70174','+49 0711 2842222');
insert into customer (customer_id,first_name, last_name,address,city,state,country,postal_code,phone)values (3,'Francios','Tremlay','1498 Rue Belanger','Montreal','QC','Canada','H2G 1A7','+1 (514) 721 4771');
insert into customer (customer_id,first_name, last_name,address,city,country,postal_code,phone)values (4,'Bjorn','Hansen','Ullevalsen 14','Oslo','Norway','0171','+47 22 44 22 22');
insert into customer (customer_id,first_name,last_name,company,address,city,country,postal_code,phone)values (5,'Frantsishek','Wichterlova','JetBrains s.r.o','Klanova 9/506','Prague','Czech Republic','14700','+420 2 4172 5555');
insert into customer (customer_id,first_name,last_name,address,city,country,postal_code,phone)values (6,'Helen','Holy','Rilska 3174/6','Prague','Czech Republic','14300','+420 2 4177 0449');
insert into customer (customer_id,first_name,last_name,address,city,country,postal_code,phone)values (7,'Astrid','Gruber','Rotentursabe 4, 1010 Innere Stadt','Vienna','Austria','1010','+43 01 5134505');
insert into customer (customer_id,first_name,last_name,address,city,country,postal_code,phone)values (8,'Daan','Peeters','Gretrystraat 63','Brussels','Belgium','1000','+32 02 219 03 03');
insert into customer (customer_id,first_name,last_name,address,city,country,postal_code,phone)
values (9,'Kara','Nielsen','Sonder Boulevard 51','Copenhagen','Denmark','1720','+453 3331 9991');
insert into customer (customer_id,first_name,last_name,company,address,city,state,country,postal_code,phone)values
(10,'Eduardo','Martins','Woodstock Discos','Rua Dr. Falcao Filho,155','Sao Paulo','SP','Brazil','01007-010','+55 (21) 3923-5555');

insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (1,1,'01-01-2009','Theodor-Huess-Strabe 34','Stuttgart','Germany','70174',1.98);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (2,1,'02-01-2009','Ullevalsen 14','Oslo','Norway','0171', 3.96);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
(3,2,'03-01-2009','Gretrystraat 63','Brussels','Belgium','1000', 5.94);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (4,2,'06-01-2009','Av Brigadeiro Faria Lima 2170','Sao Jose dos Campos','Brazil','12227-000', 8.91);
insert into invoice (invoice_id,customer_id, invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (5,3,'11-01-2009','Theodor-Huess-Strabe 34','Stuttgart','Germany','70174',13.86);
insert into invoice (invoice_id, customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (6,3,'19-01-2009','Theodor-Huess-Strabe 34','Stuttgart','Germany','70175',13.87);
insert into invoice (invoice_id,customer_id, invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
(7,4,'01-02-2009','Ullevalsen 14','Oslo','Norway','0171',1.98);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
 (8,4,'01-02-2009','Klanova 9/506','Prague','Czech Republic','14700',1.98);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
(9,5,'02-02-2009','Rilska 3174/6','Prague','Czech Republic','14300',3.96);
insert into invoice (invoice_id,customer_id,invoice_date,billing_address,billing_city,billing_country,billing_postal_code,total) values
(10,5,'02-03-2009','Rotentursabe 4, 1010 Innere Stadt','Vienna','Austria','1010',5.94);


