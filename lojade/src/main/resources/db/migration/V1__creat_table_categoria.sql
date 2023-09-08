create table produto(

    id bigint not null auto_increment,
    nome varchar(100) not null,

    qtdEstoque varchar(100) not null,
    valor varchar(100) not null,
    imagem varchar(100),

    primary key(id)

);

