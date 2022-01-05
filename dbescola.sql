create database bdescola; 
use bdescola;  
create table tb_aluno(     
    codigo_aluno integer primary key auto_increment,     
    nome_aluno varchar(60) not null,     
    ano_nascimento date,     
    email varchar(60),     
    sexo char(1) not null,     
    constraint ck_sexo check (sexo in ('m','f')) 
);  
    
create table tb_curso(     
    codigo_curso integer primary key auto_increment ,     
    nome_curso varchar(60) not null    
);

create table tb_matricula(
    codigo_aluno integer(3),
    codigo_curso integer(3)
);

alter table tb_matricula add foreign key (codigo_aluno) references tb_aluno(codigo_aluno);
alter table tb_matricula add foreign key (codigo_curso) references tb_curso(codigo_curso);

insert into tb_aluno (nome_aluno, ano_nascimento, email, sexo)
    values 
        ('josiel jardim', '1974-01-01', 'josiel@provasql.com.br', 'm'),
        ('ana maria', '1980-01-01', 'ana@provasql.com.br', 'f'),
        ('joao pedro', '1974-01-01', 'josiel@provasql.com.br', 'm'),
        ('pedro cesar', '1980-01-01', 'pedro@provasql.com.br', 'm');
        
insert into tb_curso(nome_curso) 
    values ('medicina'), ('arquitetura'), ('filosofia'), ('informatica'), ('jornalismo');   

insert into tb_matricula (codigo_aluno, codigo_curso)  
    values (1,1), (2,1), (3,2), (3,5), (4,4);

create database bdescola; 
use bdescola;  
create table tb_aluno(     
    codigo_aluno integer primary key auto_increment,     
    nome_aluno varchar(60) not null,     
    ano_nascimento date,     
    email varchar(60),     
    sexo char(1) not null,     
    constraint ck_sexo check (sexo in ('m','f')) 
);  
    
create table tb_curso(     
    codigo_curso integer primary key auto_increment ,     
    nome_curso varchar(60) not null    
);

create table tb_matricula(
    codigo_aluno integer(3),
    codigo_curso integer(3)
);

alter table tb_matricula add foreign key (codigo_aluno) references tb_aluno(codigo_aluno);
alter table tb_matricula add foreign key (codigo_curso) references tb_curso(codigo_curso);

insert into tb_aluno (nome_aluno, ano_nascimento, email, sexo)
    values 
        ('josiel jardim', '1974-01-01', 'josiel@provasql.com.br', 'm'),
        ('ana maria', '1980-01-01', 'ana@provasql.com.br', 'f'),
        ('joao pedro', '1974-01-01', 'josiel@provasql.com.br', 'm'),
        ('pedro cesar', '1980-01-01', 'pedro@provasql.com.br', 'm');
        
insert into tb_curso(nome_curso) 
    values ('medicina'), ('arquitetura'), ('filosofia'), ('informatica'), ('jornalismo');   

insert into tb_matricula (codigo_aluno, codigo_curso)  
    values (1,1), (2,1), (3,2), (3,5), (4,4);

select a.nome_aluno, c.nome_curso 
from tb_aluno a 
inner join tb_curso c 
inner join tb_matricula m 
where m.codigo_curso = c.codigo_curso 
and m.codigo_aluno = a.codigo_aluno
order by c.nome_curso asc;

select a.email as idade from tb_aluno a 
where year(from_days(to_days(now())-to_days(a.ano_nascimento))) > 18;

select a.nome_aluno from tb_aluno a;

select a.nome_aluno from tb_aluno a where sexo = 'f';

select a.nome_aluno, c.nome_curso 
from tb_aluno a 
inner join tb_curso c 
inner join tb_matricula m 
where m.codigo_curso = c.codigo_curso 
and m.codigo_aluno = a.codigo_aluno
and a.sexo = 'f'
and c.codigo_curso = 1;

select nome_curso from tb_curso order by nome_curso asc;
