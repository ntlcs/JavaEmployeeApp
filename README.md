# JavaEmployeeApp

# Sistema de Gerenciamento de Departamento
Este projeto foi desenvolvido para praticar os conceitos fundamentais da programação em **Java**, aprendidos durante o curso **Learn Java Programming Basics**. O sistema permite gerenciar um departamento com funcionalidades como cadastro de funcionários, busca por ID, cálculo do total e da média de salários.

## Funcionalidades

- **Cadastro de Funcionários**: Adiciona novos funcionários com informações como ID, nome e salário.
- **Busca por ID**: Permite buscar um funcionário utilizando seu ID.
- **Cálculo do Total de Salários**: Soma todos os salários dos funcionários cadastrados.
- **Cálculo da Média Salarial**: Calcula a média dos salários no departamento.

## Conceitos Aprendidos

Durante o desenvolvimento deste projeto, apliquei os seguintes conceitos:

- **Variáveis**: Utilizadas para armazenar informações, como o ID e o salário dos funcionários.
- **Classes e Objetos**: A classe `Employee` armazena as informações dos funcionários, enquanto a classe `Department` é responsável pelo gerenciamento dos dados.
- **Laços de Repetição (Loops)**: Usados para calcular o total de salários e a média salarial.
- **Estruturas de Decisão (Conditions)**: Permitiram a verificação de condições, como a existência de um funcionário ao buscar pelo ID.
- **Arrays**: Utilizados para armazenar os funcionários do departamento.
- **Tratamento de Exceções**: Implementado para garantir que o sistema lide com possíveis erros, como a busca por um ID inexistente.
- **Herança e Interfaces**: Não foram usados explicitamente nesse projeto, mas são conceitos que compreendo e estou pronta para aplicar em projetos mais complexos.

## Estrutura do Projeto

O sistema foi dividido em três classes principais:

- **Employee**: Responsável por armazenar as informações de cada funcionário, como ID, nome e salário.
- **Department**: Faz o gerenciamento dos funcionários, incluindo as funções de adicionar, buscar e calcular dados.
- **Main**: É onde o sistema é executado e testado, com o código que chama as funcionalidades descritas.

## Como Rodar

1. Faça o clone do repositório:
    ```bash
    git clone https://github.com/seu-usuario/sistema-gerenciamento-departamento.git
    ```

2. Abra o projeto no **IntelliJ IDEA**.
3. Compile e execute a classe `Main.java`.

## Exemplo de Saída

```text
Total de funcionários: 3
Total de salários: 9500.0
Média de salários: 3166.67
Funcionário encontrado: Maria
