CREATE DATABASE codecookers;

USE codecookers;

/*CREATE TABLE Caixa (
	caixaID INT NOT NULL AUTO_INCREMENT,
	senha VARCHAR(50) NOT NULL,
	nome VARCHAR(150) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	PRIMARY KEY(caixaID)
);

CREATE TABLE Metre (
	metreID INT NOT NULL AUTO_INCREMENT,
	senha VARCHAR(50) NOT NULL,
	nome VARCHAR(150) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	PRIMARY KEY(metreID)
);

CREATE TABLE Gerente (
	gerenteID INT NOT NULL AUTO_INCREMENT,
	senha VARCHAR(50) NOT NULL,
	nome VARCHAR(150) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	cnpj VARCHAR(14) NOT NULL,
	PRIMARY KEY(gerenteID)
);*/

CREATE TABLE usuario (
	usuarioID INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL,
	senha VARCHAR(100) NOT NULL,
	tipoUsuario SMALLINT NOT NULL,
	nome VARCHAR(150) NOT NULL,
	cpf VARCHAR(14) NOT NULL,
	cnpj VARCHAR(20),
	PRIMARY KEY(usuarioID)
);

CREATE TABLE mesa (
	numMesa SMALLINT NOT NULL AUTO_INCREMENT,
	status BOOLEAN NOT NULL,
	PRIMARY KEY(numMesa)
);

CREATE TABLE conta (
	contaID INT NOT NULL AUTO_INCREMENT,
	numMesa INT NOT NULL,
	valorTotal DOUBLE(10, 2) NOT NULL,
	dataConta DATE NOT NULL,
	status BOOLEAN NOT NULL,
	PRIMARY KEY(contaID, numMesa),
	FOREIGN KEY(numMesa) REFERENCES mesa(numMesa)
);

CREATE TABLE item (
	itemID INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	tipo VARCHAR(50) NOT NULL,
	preco FLOAT(10) NOT NULL,
	ingredientes VARCHAR(500),
	disponibilidade BOOLEAN NOT NULL,
	PRIMARY KEY(itemID)
);

CREATE TABLE pedido (
	pedidoID INT NOT NULL AUTO_INCREMENT,
	contaID INT NOT NULL,
	PRIMARY KEY(pedidoID),
	FOREIGN KEY(contaID) REFERENCES conta(contaID)
);

CREATE TABLE item_pedido (
	itemID INT NOT NULL,
	pedidoID INT NOT NULL,
	Quantidade SMALLINT NOT NULL,
	Valor DOUBLE(10, 2),
	PRIMARY KEY(itemID, pedidoID),
	FOREIGN KEY(itemID) REFERENCES item(itemID),
	FOREIGN KEY(pedidoID) REFERENCES pedido(pedidoID)
);

CREATE TABLE item_cardapio (
	item_cardapioID INT NOT NULL AUTO_INCREMENT,
	itemID INT NOT NULL,
	diaDaSemana VARCHAR(15) NOT NULL,
	PRIMARY KEY(item_cardapioID),
	FOREIGN KEY(itemID) REFERENCES item(itemID)
);

CREATE TABLE produto (
	produtoID INT NOT NULL AUTO_INCREMENT,
	qtd INT NOT NULL,
	nome VARCHAR(150) NOT NULL,
	marca VARCHAR(150),
	fornecedor VARCHAR(150),
	PRIMARY KEY(produtoID)
);

CREATE TABLE reserva (
	reservaID INT NOT NULL AUTO_INCREMENT,
	numMesa SMALLINT NOT NULL,
	usuarioID INT NOT NULL,
	nome VARCHAR(200) NOT NULL,
	dataEHorario DATETIME NOT NULL,
	numPessoas SMALLINT NOT NULL,
	telefone VARCHAR(15),
	PRIMARY KEY(reservaID),
	FOREIGN KEY(numMesa) REFERENCES mesa(numMesa),
	FOREIGN KEY(usuarioID) REFERENCES usuario(usuarioID)
);

INSERT INTO mesa (numMesa, status) VALUES (1, 0), (2,0), (3,0), (4,0), (5,0), (6,0);

CREATE TRIGGER `deletarItemDeCardapios` AFTER DELETE ON `item`
 FOR EACH ROW DELETE FROM item_cardapio WHERE itemID = old.itemID;

CREATE TRIGGER `deletarItemPedidos` AFTER DELETE ON `pedido`
 FOR EACH ROW DELETE FROM item_pedido WHERE item_pedido.pedidoID = old.pedidoID;

CREATE TRIGGER `updateValorTotalConta` AFTER INSERT ON `item_pedido`
 FOR EACH ROW UPDATE conta
JOIN pedido ON pedido.contaID = conta.contaID
SET conta.valorTotal = conta.valorTotal + new.Valor
WHERE pedido.pedidoID = new.pedidoID;

CREATE TRIGGER `updateValorTotalContaAfterUpdate` AFTER UPDATE ON `item_pedido`
 FOR EACH ROW UPDATE conta
JOIN pedido ON pedido.contaID = conta.contaID
SET conta.valorTotal = conta.valorTotal + new.Valor
WHERE pedido.pedidoID = new.pedidoID;

CREATE TRIGGER `updateValorTotalContaBeforeUpdate` BEFORE UPDATE ON `item_pedido`
 FOR EACH ROW UPDATE conta
JOIN pedido ON pedido.contaID = conta.contaID
SET conta.valorTotal = conta.valorTotal - old.Valor
WHERE pedido.pedidoID = new.pedidoID;

CREATE TRIGGER `updateValorTotalContaAfterDelete` AFTER DELETE ON `item_pedido`
 FOR EACH ROW UPDATE conta
JOIN pedido ON pedido.contaID = conta.contaID
SET conta.valorTotal = conta.valorTotal - old.Valor
WHERE pedido.pedidoID = old.pedidoID;
