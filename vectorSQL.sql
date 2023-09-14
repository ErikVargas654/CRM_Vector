create table cliente(
	id_cliente uuid primary key not null,
	nome_cliente varchar(250) not null,
	dt_nasc date not null,
	cpf varchar(11) not null unique,
	email varchar(200) not null,
	senha varchar(40) not null,
	logradouro varchar(150) not null,
	numero_casa numeric not null,
	cidade varchar(100) not null,
	estado varchar (50) not null
);

create type tipo_chamado as enum ('Orçamento', 'Manutenção', 'SAC');

create type estado_chamado as enum('Aberto', 'Enviado', 'Fechado', 'Recusado');

create table chamado(
	id_chamado uuid primary key not null,
	dt_chamado date not null,
	tipo_chamado tipo_chamado not null,
	estado_chamado estado_chamado not null,
	id_cliente uuid references cliente(id_cliente)
);

create table item_orcado(
	id_item uuid primary key not null,
	tipo_item varchar(50) not null,
	descricao_item(500) not null default ('item sem descrição'),
	valor_item decimal(15,2) not null default (0.0)
);