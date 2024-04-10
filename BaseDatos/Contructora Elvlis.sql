drop database if exists bdconstructora;
-- creamos la base de datos
create database bdconstructora;
-- seleccionamos la base de datos
use bdconstructora;
-- creamos las tablas , eliminanadolas si existieran
drop table if exists t_distrito;
create table t_distrito(
coddis int auto_increment primary key,
nomdis varchar(50) not null,
estdis bit not null
);
-- insertamos datos
insert into t_distrito(nomdis,estdis)  values  ('Cercado de Lima',1);
insert into t_distrito(nomdis,estdis)  values ('Breña',1);
insert into t_distrito(nomdis,estdis)  values ('Surco',1);
insert into t_distrito(nomdis,estdis)  values ('Callao',1);
insert into t_distrito(nomdis,estdis)  values ('La molina',1);

-- mostramos los datos ingresados
select * from t_distrito where estdis=1;
select * from t_distrito;
-- mostramos los datos del libro

drop table if exists t_Proveedor;
create table t_Proveedor(
codprove int auto_increment primary key,
nomprove varchar(50) not null,
telprove varchar(10) not null,
corprove varchar(50) not null,
rucprove varchar (10)not null,
coddis int not null,
estprove bit not null,
foreign key (coddis)references t_distrito(coddis)

);
-- insertamos datos
insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove)
values('Armando Torres','54654566','a_torres@gamil.com',1,'206556465',1);
insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove)
values('Andrea Larosa','46545457','a_larosa@gmail.com',2,'201654655',1);
insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove)
values('Rafael Bravo','46545647','b_rafa@gmail.com',3,'205644665',1);
insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove)
values('Fernanda Rosas','64564564','f_rosas@gamil.com',4,'20464644',1);
insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove)
values('Alejandro Piedra','46544636','a_piedra@gmail.com',5,'204646589',1);
-- mostramos los datos de la editorial
select * from t_Proveedor;

select pr.codprove,pr.nomprove,pr.telprove,pr.corprove,pr.rucprove,d.nomdis,pr.rucprove,pr.estprove
from t_proveedor pr inner join t_distrito d
on pr.coddis=d.coddis;


drop table if exists t_Compra;
create table t_Compra(
codcom int auto_increment primary key,
codprove int not null,

estcom bit not null,
foreign key (codprove) references t_Proveedor(codprove)
-- foreign key (coddet) references t_Detalles_de_compra(coddet)
);

insert into t_compra (codprove,estcom)values(1,1);
insert into t_compra (codprove,estcom)values(2,1);
insert into t_compra (codprove,estcom)values(3,1);
insert into t_compra (codprove,estcom)values(4,1);
insert into t_compra (codprove,estcom)values(5,1);

select *from t_compra;

select c.codcom,pr.nomprove,estcom
from t_compra c inner join t_proveedor pr
on c.codprove=pr.codprove;


drop table if exists t_Detalles_de_producto;
create table t_Detalles_de_producto(
coddet int auto_increment primary key,
prodet varchar(50)not null,
impodet varchar(50)not null,
candet varchar (10)not null,
fecdet date not null,
codcom int not null,
estdet bit not null,
foreign key(codcom)references t_Compra(codcom)
);
-- insertamos datos
insert into t_Detalles_de_producto (prodet,impodet,candet,fecdet,codcom,estdet) 
values('bebidas','100','20','2015-10-17',1,1);
insert into t_Detalles_de_producto (prodet,impodet,candet,fecdet,codcom,estdet) 
values('enlatados','200','16','2014-09-18',2,1);
insert into t_Detalles_de_producto (prodet,impodet,candet,fecdet,codcom,estdet) 
values('cemento','250','18','2016-05-12',3,1);
insert into t_Detalles_de_producto (prodet,impodet,candet,fecdet,codcom,estdet) 
values('bolsa','150','22','2017-07-14',4,1);
insert into t_Detalles_de_producto (prodet,impodet,candet,fecdet,codcom,estdet)  
values('latas','250','19','2018-09-17',5,1);

select *from t_Detalles_de_producto;

-- mostramos los datos del libro

drop table if exists T_Perfil;
create table T_Perfil(
codper int primary key auto_increment,
nomper varchar(40) not null,
estper bit not null 
);

insert into t_perfil(nomper,estper)values('Administrador del Sistema',1);
insert into t_perfil(nomper,estper)values('Administrador',1);
insert into t_perfil(nomper,estper)values('Vendedor',1);
insert into t_perfil(nomper,estper)values('Cajero',0);
insert into t_perfil(nomper,estper)values('Contador',1);
insert into t_perfil(nomper,estper)values('Estafador',1);
-- mostramos datos de la tabla perfil
select *from t_perfil;

drop table if exists T_Usuario;
create table T_Usuario(
codusu int primary key auto_increment,
nomusu varchar(40) not null,
clausu varchar(40) not null,
codper int not null,
estusu bit not null,
foreign key (codper) references T_Perfil(codper)
);
insert into t_usuario(nomusu,clausu,codper,estusu)values('Rodolfo','15151515',1,1);
insert into t_usuario(nomusu,clausu,codper,estusu)values('Alexis','123456',2,0);
insert into t_usuario(nomusu,clausu,codper,estusu)values('Jimy','123123',3,1);
insert into t_usuario(nomusu,clausu,codper,estusu)values('smorales','654321',4,1);
insert into t_usuario(nomusu,clausu,codper,estusu)values('Jose','654321',4,1);


select *from t_usuario;

select u.codusu,u.nomusu,u.clausu,p.nomper,u.estusu from t_usuario u inner join t_perfil p 
on u.codper=p.codper; 

-- CREAMOS LA TABLA EMPLEADO
drop table if exists t_Empleado;
create table t_Empleado(
codemp int auto_increment primary key,
nomemp varchar(40) not null,
apeemp varchar(40) not null,
coremp varchar(50) not null,
diremp varchar(50) not null,
genemp varchar (50) not null,
fecemp date not null,
telemp varchar(10)not null,
sueemp decimal(7,2)not null,
fotemp longblob null,
coddis int not null,
codusu int not null,
estemp bit not null,
foreign key (coddis) references t_distrito(coddis),
foreign key (codusu)references t_usuario(codusu)

);
-- insertando datos a la tabla empleado

insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp)value
('Rodolfo Elias','Delgado Huillcamascco','rdelgado@gamil.com','Av.Luis Braille','Masculino','2015-10-12','42369587','450',null,1,1,1);
insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp)value
('Alexis','Huapallla Morales','ahuapalla@gamil.com','Av.Luis Pa''ahuapalla@gamil.com','Masculino','2016-08-17','42369587','750',null,2,2,1);
insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp)value
('German Leguia','Lopez Estrada','gleguia@gmail.com','Av.Amazonas','Masculino','2017-05-12','42369587','730',null,3,3,1);
insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp)value
('Jet','Fernadez Bernal','jfernanda@gmail.com','Av.Progreso','Masculino','2014-07-19','42369587','850',null,4,4,1);
insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp)value
('Eden','Sosa Osorio','esosa@gmail.com','Av.Los jasmines','Masculino','2014-12-17','42369587','890',null,5,5,1);
 

select *from t_empleado;   

 select e.codemp,e.nomemp,e.apeemp,e.diremp,e.telemp,e.sueemp,d.nomdis,u.nomusu,e.estemp
 from t_empleado e inner join t_distrito d on e.coddis=d.coddis 
inner join t_usuario u on u.codusu=e.codusu;

  select e.codemp,e.nomemp,e.apeemp,e.coremp,e.diremp,e.genemp,e.fecemp,e.telemp,e.sueemp,d.nomdis,u.nomusu,e.estemp
 from t_empleado e inner join t_distrito d on e.coddis=d.coddis 
inner join t_usuario u on u.codusu=e.codusu;

drop table if exists t_Producto;
create table t_Producto(
codpro int auto_increment primary key,
nompro varchar(50) not null,
canpro varchar(10)not null,
fotpro longblob null,
prepro decimal(7,2)not null,
codprove int not null,
estpro bit not null,
foreign key(codprove)references t_proveedor(codprove)
);


insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro)
values('Rocas','1500',null,'252',1,1);
insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro)
values('Porcelana','1200',null,'150',2,1);
insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro)
values('Cola','1400',null,'162',3,1);
insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro)
values('Remaches','1000',null,'160',4,1);
insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro)
values('Pinturas','2500',null,'142',5,1);

select *from t_producto;

select p.codpro,p.nompro,p.canpro,p.fotpro,p.nompro,pr.nomprove,p.estpro
from t_producto p inner join t_proveedor pr
on p.codprove=pr.codprove;

drop table if exists t_Clientes;
create table t_Clientes(
codcli int auto_increment primary key,
nomcli varchar(50)not null,
apecli varchar(50)not null,
dnicli varchar (8)not null,
coddis int not null,
codpro int not null,
telcli varchar(10)not null,
estcli bit not null,
foreign key(coddis)references t_distrito(coddis),
foreign key(codpro)references t_producto(codpro)
);
insert into t_clientes(nomcli,apecli,dnicli,coddis,codpro,telcli,estcli)values
('Alfonso ','Torres','72264547',1,1,'64645254',1);
insert into t_clientes(nomcli,apecli,dnicli,coddis,codpro,telcli,estcli)values
('Martin ','Liberman','72545464',2,2,'64645254',1);
insert into t_clientes(nomcli,apecli,dnicli,coddis,codpro,telcli,estcli)values
('Marco ','Asensio','72154545',3,3,'64645254',1);
insert into t_clientes(nomcli,apecli,dnicli,coddis,codpro,telcli,estcli)values
('Cristian ','Delvega','72464864',4,4,'64645254',1);
insert into t_clientes(nomcli,apecli,dnicli,coddis,codpro,telcli,estcli)values
('Sergio ','Ramos','72267567',5,5,'64645254',1);

select *from t_clientes;

select c.codcli,c.nomcli,c.apecli,c.dnicli,d.nomdis,p.nompro,c.telcli,c.estcli
from t_clientes c inner join t_distrito d on c.coddis=d.coddis inner join t_producto p
on c.codpro=p.codpro;

-- CREANDO LA TABLA EVENTO
/*drop table if exists T_EVENTO;
CREATE TABLE T_EVENTO(
CODEVE INT PRIMARY KEY AUTO_INCREMENT,
NOMEVE VARCHAR(50) NOT NULL,
FECEVE DATETIME  NOT NULL,
PREEVE DECIMAL(7,2) not null,
CANEVE INT not null,
IMGEVE LONGBLOB NULL,
ESTEVE BIT not null
);
*/

-- BOLETO
drop table if exists T_BOLETO;
CREATE TABLE T_BOLETO(
NRO INT PRIMARY KEY AUTO_INCREMENT,
FECBOL DATETIME NOT NULL,
codprove INT NOT NULL,
CODEMP INT NOT NULL,
ESTBOL bit not NULL,
FOREIGN KEY (codprove) REFERENCES t_Proveedor(codprove),
FOREIGN KEY (codemp) REFERENCES t_Empleado(codemp)
);

-- DETALLE BOLETO
/*drop table if exists T_DETALLEBOLETO;
CREATE TABLE T_DETALLEBOLETO(
NRO INT NOT NULL,
CODEVE INT NOT NULL,
CANBOL INT NOT NULL,
FOREIGN KEY (NRO) REFERENCES T_BOLETO(NRO),
FOREIGN KEY (CODEVE) REFERENCES T_EVENTO(CODEVE)
);*/

drop table if exists T_DETALLEBOLETO;
CREATE TABLE T_DETALLEBOLETO(
NRO INT NOT NULL,
codpro INT NOT NULL,
CANBOL INT NOT NULL,
FOREIGN KEY (NRO) REFERENCES T_BOLETO(NRO),
FOREIGN KEY (codpro) REFERENCES t_Producto(codpro)
);

-- AGREGANDO LA CLAVE PRIMARIA AL DETALLE
-- ALTER TABLE T_DETALLEBOLETO ADD PRIMARY KEY(NRO,CODEVE);
ALTER TABLE T_DETALLEBOLETO ADD PRIMARY KEY(NRO,codpro);

/*-- INSERTANDO DATOS A EVENTO
INSERT INTO T_EVENTO(NOMEVE,FECEVE,PREEVE,CANEVE,ESTEVE) VALUES('CONCIERTO SHAKIRA','2017/09/17',250,2500,1);
INSERT INTO T_EVENTO(NOMEVE,FECEVE,PREEVE,CANEVE,ESTEVE) VALUES('CONCIERTO MANA','2017/10/28',150,1000,1);
INSERT INTO T_EVENTO(NOMEVE,FECEVE,PREEVE,CANEVE,ESTEVE) VALUES('CONCIERTO CHACALON JR','2017/12/31',50,800,1);

*/
drop table if exists t_Categoria;
create table t_Categoria(
codcat int auto_increment primary key,
nomcat varchar(50) not null,
codpro int not null,
estcat bit not null,
foreign key(codpro) references t_Producto(codpro)

);

insert into t_Categoria(nomcat,codpro,estcat) values ('Materiales Petreos',1,1);
insert into t_Categoria(nomcat,codpro,estcat) values ('Ceramicos y vidrios',2,1);
insert into t_Categoria(nomcat,codpro,estcat) values ('Union',3,1);
insert into t_Categoria(nomcat,codpro,estcat) values ('Metales',4,1);
insert into t_Categoria(nomcat,codpro,estcat) values ('Acabados',5,1);

select *from t_Categoria;
select *from t_Categoria where estcat=1;

select nomcat,nompro,estcat 
from t_Categoria a inner join t_Producto p
on a.codpro=p.codpro;

 select * from t_distrito where coddis=2;
-- actualizar
update t_distrito set nomdis='Lima', estdis=1 where coddis=1;

-- Eliminar
-- delete from t_distrito where coddis=2;
update t_distrito set estdis=0 where coddis =2;

-- consulta para validar usuario
select *from t_usuario where nomusu='Rodolfo' and clausu='15151515';
select *from t_usuario where nomusu='Alexis' and clausu='123456';
-- consulta para evaluar el estado
select estusu from t_usuario where nomusu='Alexis'and clausu='123456';

-- Consulta para obtener la sesion
select e.codemp,e.nomemp,e.apeemp,e.estemp,u.nomusu,p.nomper 
from t_empleado e inner join t_distrito d on e.coddis=d.coddis inner join t_usuario u
 on e.codusu=u.codusu inner join t_perfil p on u.codper=p.codper
where nomusu='Rodolfo' and clausu='15151515'; 

select e.codemp,e.nomemp,e.apeemp,e.estemp,u.nomusu,p.nomper 
from t_empleado e inner join t_distrito d on e.coddis=d.coddis inner join t_usuario u
 on e.codusu=u.codusu inner join t_perfil p on u.codper=p.codper
where nomusu='mhuapalla' and clausu='123456'; 


select u.codusu,u.nomusu,u.clausu,p.nomper,u.estusu
from t_usuario u inner join t_perfil p
 on u.codper=p.codper;

select u.codusu,u.nomusu,u.clausu,p.codper,u.estusu
from t_usuario u inner join t_perfil p
 on u.codper=p.codper;




