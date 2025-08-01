CREATE TABLE Professor(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200),
    disciplina VARCHAR(50)
);

CREATE TABLE Aluno(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200),
    turma VARCHAR(50),
    matricula INT
);

CREATE TABLE Pais(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200),
    ddi VARCHAR(10),
    foto LONGTEXT
);

CREATE TABLE Cidade(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200),
    ddd VARCHAR(10)
);
