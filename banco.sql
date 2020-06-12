CREATE DATABASE COVID_19;

use COVID_19;

CREATE TABLE estado(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) not null);
	
CREATE TABLE cidade(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50) not null,
    estado int not null,
    
    FOREIGN KEY(estado) REFERENCES estado(id));
	
CREATE VIEW tabela_cidade as

SELECT c.id, c.nome, c.estado, e.nome as nomeestado 
from cidade c
INNER JOIN
estado e on c.estado=e.id;

CREATE TABLE grau(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    descricao varchar(50) not null);
	
CREATE TABLE sintomas(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    descricao varchar(40) not null);
	

CREATE TABLE pessoa(
    id int not null PRIMARY KEY AUTO_INCREMENT,
	nome varchar(50) not null,
	nasc varchar(15) not null,
    cpf varchar(15) not null UNIQUE,
    telefone varchar(18) NOT null,
    cep varchar(20) not null,
    rua varchar(200) not null,
    bairro varchar(50) not null,
    cidade varchar(50) not null,
	estado varchar(30) not null
   );
	
	
CREATE TABLE pergunta(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    descricao varchar(200) not null);


CREATE TABLE consulta(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    pessoa int not null,
    statuss varchar(30) not null,
	idade varchar(20),
	tempe varchar(20),
	pressa varchar(20),
    
    FOREIGN KEY(pessoa) REFERENCES pessoa(id));
	
	
CREATE view tabela_consulta as
SELECT c.id, c.pessoa, p.nome, p.cpf, c.statuss, c.idade, c.tempe, c.pressa
from consulta c
INNER JOIN pessoa p on c.pessoa=p.id;

	
create TABLE item_sintomas(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    sintoma int not null,
    grau int not null,
    consulta int not null,
    
    FOREIGN KEY(consulta) REFERENCES consulta(id),
    FOREIGN KEY(sintoma) REFERENCES sintomas(id),
    FOREIGN KEY(grau) REFERENCES grau(id));

CREATE VIEW tabela_sintomas AS
SELECT i.id, i.sintoma, s.descricao as nome, i.grau, g.descricao as risco, i.consulta
FROM item_sintomas i 
INNER JOIN sintomas s on i.sintoma=s.id
INNER JOIN grau g on i.grau=g.id;


CREATE TABLE item_perguntas(
    id int not null PRIMARY KEY AUTO_INCREMENT,
    pergunta int not null,
    resposta varchar(20) not null,
    consulta int not null,
    
    FOREIGN KEY(pergunta) REFERENCES pergunta(id),
    FOREIGN KEY(consulta) REFERENCES consulta(id));
	
CREATE VIEW tabela_pergunta AS
SELECT ip.id, ip.pergunta, p.descricao, ip.resposta, ip.consulta
from item_perguntas ip
INNER JOIN pergunta p on ip.pergunta=p.id;

