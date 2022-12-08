# API Fivee

## Requisitos

- Ser capaz de registrar um novo usuário;
- Ser capaz de iniciar uma nova sessão de usuário;
- Ser capaz de criar um perfil pra o usuario;
- Ser capaz de buscar o perfil criado para o usuário;


- Cadastrar um novo evento;
- Alterar um evento existente;
- Buscar um evento pela ID;
- Buscar eventos por palavra chave;
- Listar todos os eventos;
- Remover um evento existente;
- Criar um novo ingresso para o evento;
- Buscar os ingressos do evento

## Casos de uso

### Cadastro de novo usuário
Entrada esperada
- E-mail;
- Usuário;
- Senha;
- Telefone;

Saída esperada
- Objeto usuário;

### Login 
Entrada esperada
- Usuario;
- Senha;

Saída esperada
- Sessão;

### Cadastro de novo evento
Entrada esperada
 - Nome;
 - Descrição;
 - Data Evento;
 - Local;
 - Ingresso{ Tipo, Valor};
 
 Saída esperada
 - Objeto evento;
 
 ### Listar todos os eventos
 Entrada esperada;
 - null;
 
 Saída esperada
 - Lista de eventos;

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
## Controllers

### Usuario:

---
#### POST (/register):  Cadastrar novo usuário

> {"usuario": "exemplo",
  "senha" : "exemploSenha",
  "email" : "exemplo@exemplo.com"
  "telefone" : "00000000000"
}

#### Retorno esperado
>{"id" : x, "usuario" : "exemplo", "senha" : "exemploSenha", "email" : "exemplo@exemplo.com" "telefone" : "00000000000" }

---
#### POST (/login): Verificar se o usuarios está cadastrado

> {"usuario": "",
"senha" : "exemploSenha",
"email" : "exemplo@exemplo.com"
"telefone" : ""
}

#### Retorno esperado
>{"id" : x, "usuario" : "exemplo", "senha" : "exemploSenha", "email" : "exemplo@exemplo.com" "telefone" : "00000000000" }

### Perfil:

---
#### POST (/perfil): Cria um novo perfil para o usuário Z

>{
"cpf": "00000000000",
"nome": "EXEMPLO",
"cidade": "EXEMPLO",
"distanciaRec": 0.0,
"interesses": "EXEMPLO",
"gostoMusical": "EXEMPLO",
"tiposEventos": "EXEMPLO",
"usuario": {
"id": **Z**
> }
}

#### Retorno esperado
>{
"cpf": "00000000000",
"nome": "EXEMPLO",
"cidade": "EXEMPLO",
"distanciaRec": 0.0,
"interesses": "EXEMPLO",
"gostoMusical": "EXEMPLO",
"tiposEventos": "EXEMPLO",
"usuario": {
"id": **Z**,
"usuario": "EXEMPLO USUARIO",
"senha": "EXE",
"email": "exemplo@exemplo.com",
"telefone": "3100000000"
}}


---
#### GET (/perfil/id): Buscar perfil referente ao usuário Z

#### Retorno esperado
>{
"cpf": "00000000000",
"nome": "EXEMPLO",
"cidade": "EXEMPLO",
"distanciaRec": 0.0,
"interesses": "EXEMPLO",
"gostoMusical": "EXEMPLO",
"tiposEventos": "EXEMPLO",
"usuario": {
"id": **Z**,
"usuario": "EXEMPLO USUARIO",
"senha": "EXE",
"email": "exemplo@exemplo.com",
"telefone": "3100000000"
}}

### Evento:

---
#### POST (/eventos/register): Registrar novo evento

> {
"nome" : "exemplo nome",
"desc" : "exemplo de descriçao",
"local" : "exemplo local",
"data" : "yyyy-mm-dd"
}

#### Retorno esperado
>{
"id" : x
"nome" : "exemplo nome",
"desc" : "exemplo de descriçao",
"local" : "exemplo local",
"data" : "yyyy-mm-dd"
}

---
#### PUT (/eventos/{id}): Alterar Evento

> {
"nome" : "exemplo nome alterado",
"desc" : "exemplo de descriçao alterada",
"local" : "exemplo local alterado",
"data" : "yyyy-mm-dd"
}

#### Retorno esperado
>{
"id" : **{id}**
"nome" : "exemplo nome alterado",
"desc" : "exemplo de descriçao alterada",
"local" : "exemplo local alterado",
"data" : "yyyy-mm-dd"
}

---
#### GET (/eventos/{id}): Buscar evento por ID

#### Retorno esperado
>{
"id" : **{id}**
"nome" : "exemplo nome",
"desc" : "exemplo de descriçao",
"local" : "exemplo local",
"data" : "yyyy-mm-dd"
}

---
#### GET (/eventos/search?k={chave}): Buscar evento por palavra chave

#### Retorno esperado
>{
"id" : x
"nome" : "**{chave}**",
"desc" : "exemplo de descriçao alterada",
"local" : "exemplo local alterado",
"data" : "yyyy-mm-dd"
}

---
#### GET (/eventos): Buscar todos os eventos

#### Retorno esperado
> JSON contendo todos os eventos: [{evento1...}, {evento2...}, {evento3...}]

---
#### DELETE (/eventos/{id}): Remover um evento

#### Retorno esperado
> OK

### Ingresso:

---
#### POST (/ingresso): Criar novo ingresso para o evento Z

>{
"tipo": "EXEMPLO",
"valor": x,
"evento": {
"id": **Z**,
}


#### Retorno esperado
>{
"id": x,
"tipo": "EXEMPLO",
"valor": x,
"evento": {
"id": **Z**,
"nome": "EXEMPLO",
"desc": "EXEMPLO",
"local": "EXEMPLO",
"data": "yyyy-mm-dd"
}

---
#### GET (/ingresso/{id}): Buscar ingressos do evento pelo ID do evento

#### Retorno esperado
>{
"id": 1,
"tipo": "EXEMPLO",
"valor": x,
"evento": {
"id": **{id}**,
"nome": "EXEMPLO",
"desc": "EXEMPLO",
"local": "EXEMPLO",
"data": "yyyy-mm-dd"
}

---
SpringBoot 3.0
Java OpenJDK 19.0.1
Maven 3.8.6
MySQL


