#CultHub

API do projeto CultHub - Aplicativo de entretenimento para organização de Filmes, Series, Livros, Jogos e Musicas.

## Tarefas

- [ ] CRUD de Itens
- [ ] Dashboard

## Documentação da API

### Endpoint
- [Listar Todos os Itens](#listar-todas-os-itens)
- [Cadastrar Itens](#cadastrar-itens)
- [Detalhes dos Itens](#detalhes-dos-itens)
- [Apagar Itens](#apagar-itens)
- [Atualizar itens](#atualizar-itens)

### Listar Todos os Itens

`GET` /itens

Retorna um array com todos os itens cadastrados.

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Death Stranding"
    }
]
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Os dados dos itens foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar

---

### Cadastrar Itens

`POST` /itens

Cria um novo item com os dados enviados no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição|
|-----|----|:-----------:|---------|
|nome|string|✅|Um nome curto para o item.

```js
{
    "nome": "Death Stranding"
}
```

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Death Stranding"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|201|Itens cadastrados com sucesso
|400|Dados enviados são inválidos. Verifique o corpo da requisição
|401|Acesso negado. Você deve se autenticar

---

### Detalhes dos Itens

`GET` /itens/`{id}`

Retornar os detalhes dos itens com o `id` informado como parâmetro de path.

#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Death Stranding"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Os dados dos itens foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe item com o `id` informado

___

### Apagar itens

`DELETE` /itens/`{id}`

Apaga os itens com o `id` especificado no parâmetro de path.

#### Códigos de Status

|código|descrição|
|------|---------|
|204|Itens foram apagados com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe item com o `id` informado

___

### Atualizar Itens

`PUT` /itens/`{id}`

Altera dos dados dos itens especificados no `id`, utilizando as informações enviadas no corpo da requisição.

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição|
|-----|----|:-----------:|---------|
|nome|string|✅|Um nome curto para os itens.

```js
{
    "nome": "Death Stranding"
}
```
#### Exemplo de Resposta

```js
{
    "id": 1,
    "nome": "Death Stranding"
}
```

#### Códigos de Status

|código|descrição|
|------|---------|
|200|Itens alterados com sucesso
|400|Dados enviados são inválidos. Verifique o corpo da requisição
|401|Acesso negado. Você deve se autenticar
|404|Não existe item com o `id` informado

---
