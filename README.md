# EXCEPTION CHECKED - JAVA

Projeto simples em Java para demonstrar o uso de **Exceptions Checked**, criação de **exceções personalizadas** e tratamento de erros com `try/catch`.

---

# 📚 Conceitos abordados

- `try/catch`
- `throws`
- Exceções Checked
- Exceções personalizadas (`MyException`)
- Validação de dados
- `Scanner`
- `InputMismatchException`
- Sobrescrita de método `toString()`

---

# 📁 Estrutura do projeto

```bash
src/
│
├── Main.java
├── Produto.java
└── MyException.java
```

---

# 🚀 Funcionamento do projeto

O sistema cria um objeto `Produto` e realiza validações:

- O `id` não pode ser menor ou igual a `0`
- A descrição não pode ser nula ou vazia

Caso alguma regra seja quebrada, uma exceção personalizada (`MyException`) é lançada.

---

# 🧠 Classe `MyException`

Classe responsável por criar uma exceção personalizada.

```java
public class MyException extends Exception {

    public MyException(String mensagem) {
        super(mensagem);
    }
}
```

## ✔ Objetivo

Permitir mensagens de erro mais específicas e personalizadas para o sistema.

---

# 📦 Classe `Produto`

Representa um produto com:

- `id`
- `descricao`

## ✔ Validações implementadas

### Método `setDescricao`

```java
if (descricao == null || descricao.length() == 0)
```

Valida se a descrição está vazia ou nula.

---

### Método `setId`

```java
if (id <= 0)
```

Valida se o ID é válido.

---

# ▶ Classe `Main`

Responsável por executar o programa.

## ✔ Fluxo

1. Cria um `Scanner`
2. Instancia um `Produto`
3. Solicita um ID ao usuário
4. Trata possíveis erros usando `try/catch`

---

# ⚠ Tratamento de exceções

O projeto trata:

```java
catch (MyException | ArithmeticException | InputMismatchException e)
```

## Exceções tratadas

| Exceção | Descrição |
|---|---|
| `MyException` | Exceção personalizada |
| `InputMismatchException` | Entrada inválida |
| `ArithmeticException` | Erros matemáticos |

---

# 💻 Exemplo de saída

## Entrada válida

```bash
Digite o id do produto
10

Produto{
 descricao='Produto em estoque'
 , id=10
}
```

---

## Entrada inválida

```bash
Digite o id do produto
0

!!ERRO!! Id não pode ser 0 ou negativo
```

---

# 🛠 Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)

---

# 🎯 Objetivo educacional

Este projeto foi desenvolvido para praticar:

- Manipulação de exceções
- Boas práticas de validação
- Criação de exceções customizadas
- Estrutura básica de projetos Java

---

# 📌 Aprendizados importantes

## ✔ Checked Exception

São exceções verificadas em tempo de compilação.

Obrigam o programador a:

- tratar com `try/catch`
ou
- propagar com `throws`

Exemplo:

```java
public void setId(int id) throws MyException
```

