# API Fivee

## Requisitos

- Ser capaz de registrar um novo usuário;
- Ser capaz de iniciar uma nova sessão do usuário;
-  Cadastrar um novo evento;
-  Listar todos os eventos;

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
