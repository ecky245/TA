CREATE TABLESPACE vouchergame
datafile 'F:\Basdat\VOUCHER_GAME'
size 25M;
CREATE USER Mecky_06956
IDENTIFIED BY ecky
DEFAULT TABLESPACE vouchergame 
QUOTA 25M ON vouchergame;
GRANT ALL PRIVILEGES To ecky_06956; 
conn Mecky_06956/ecky

CREATE table owner 
(
id_owner INTEGER not null,
username_owner varchar2(30),
passowrd varchar2(30),
constraint PK_owner primary key (id_owner)
);

CREATE table pembeli 
(
id_pembeli INTEGER not null,
username_pembeli varchar2(30),
alamat_pembeli varchar2(50),
no_telp_pembeli Number,
constraint PK_pembeli primary key (id_pembeli)
);

CREATE table barang
(
id_barang INTEGER not null,
nama_voucher varchar2(30),
Harga_voucher Integer,
Stock_barang Integer,
constraint PK_barang primary key (id_barang)
);

CREATE table transaksi
(
id_transaksi Integer,
tgl_transaksi DATE,
total_harga Float
);

CREATE table detail_transaksi
(
id_transaksi Integer not null,
id_barang Integer,
total_harga float,
tgl_transaksi DATE,
constraint PK_detail primary key (id_transaksi)
);

alter table transaksi
add constraint FK_Id_transaksi FOREIGN key (Id_transaksi)
references transaksi(Id_transaksi);

alter table detail_transaksi
add constraint FK_Id_barang FOREIGN key (Id_barang)
references barang(Id_barang);

insert all
into owner (id_owner, username_owner, password) values (1, 'joko', '12345')
into owner (id_owner, username_owner, password) values (2, 'panji', '34512')
into owner (id_owner, username_owner, password) values (3, 'andi', '45123')
into owner (id_owner, username_owner, password) values (4, 'wisnu', '51234')
into owner (id_owner, username_owner, password) values (5, 'anwar', '123456')
select 1 from dual;

insert all
into pembeli (id_pembeli, username_pembeli, alamat_pembeli, no_telp_pembeli) values (1, 'jokow', 'Surabaya', '12345')
into pembeli (id_pembeli, username_pembeli, alamat_pembeli, no_telp_pembeli) values (2, 'anji', 'Sidoarjo', '34512')
into pembeli (id_pembeli, username_pembeli, alamat_pembeli, no_telp_pembeli) values (3, 'andiw', 'Malang', '45123')
into pembeli (id_pembeli, username_pembeli, alamat_pembeli, no_telp_pembeli) values (4, 'wisna', 'Surabaya', '51234')
into pembeli (id_pembeli, username_pembeli, alamat_pembeli, no_telp_pembeli) values (5, 'anwari', 'Sidoarjo', '123456')
select 1 from dual;

insert all
into barang (id_barang, nama_voucher, harga_voucher, stock_barang) values (1, 'garena', '50000', '100')
into barang (id_barang, nama_voucher, harga_voucher, stock_barang) values (2, 'steam', '100000', '100')
into barang (id_barang, nama_voucher, harga_voucher, stock_barang) values (3, 'zepetto', '25000', '50')
into barang (id_barang, nama_voucher, harga_voucher, stock_barang) values (4, 'googleplay', '50000', '50')
into barang (id_barang, nama_voucher, harga_voucher, stock_barang) values (5, 'megaxus', '50000', '10')
select 1 from dual;

insert all
into transaksi (id_pembeli, tgl_transaksi, total_harga ) values (1, to_date('01/10/2020','dd/mm/yyyy'), '50000')
into transaksi (id_pembeli, tgl_transaksi, total_harga ) values (2, to_date('02/10/2020','dd/mm/yyyy'), '40000')
into transaksi (id_pembeli, tgl_transaksi, total_harga ) values (3, to_date('04/10/2020','dd/mm/yyyy'), '20000')
into transaksi (id_pembeli, tgl_transaksi, total_harga ) values (4, to_date('05/10/2020','dd/mm/yyyy'), '35000')
into transaksi (id_pembeli, tgl_transaksi, total_harga ) values (5, to_date('07/10/2020','dd/mm/yyyy'), '20000')
select 1 from dual; 
 

insert all
into detail_transaksi (id_transaksi, id_barang, total_harga, tgl_transaksi) values (1, 1, '30000', to_date('01/02/2020','dd/mm/yyyy'))
into detail_transaksi (id_transaksi, id_barang, total_harga, tgl_transaksi) values (2, 2, '32000', to_date('02/03/2020','dd/mm/yyyy'))
into detail_transaksi (id_transaksi, id_barang, total_harga, tgl_transaksi) values (3, 3, '45000', to_date('03/04/2020','dd/mm/yyyy'))
into detail_transaksi (id_transaksi, id_barang, total_harga, tgl_transaksi) values (4, 4, '30000', to_date('04/05/2020','dd/mm/yyyy'))
into detail_transaksi (id_transaksi, id_barang, total_harga, tgl_transaksi) values (5, 5, '28000', to_date('05/06/2020','dd/mm/yyyy'))
select 1 from dual; 


