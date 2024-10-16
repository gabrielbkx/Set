# Log Entry System

Este projeto Java lê um arquivo de log que contém entradas de usuário com data e hora e exibe o número total de usuários únicos que fizeram login.

## Funcionalidades

- **Leitura de arquivos**: O programa lê os dados de um arquivo contendo entradas de log no formato `<username> <timestamp>`.
- **Armazenamento de registros**: Armazena as entradas em um `Set` para garantir que não haja duplicatas de usuários.
- **Relatório de usuários**: Calcula e exibe o número de usuários únicos com base nas entradas.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **LogEntry**: Representa uma entrada de log com um nome de usuário e o momento do login.
    - A classe sobrescreve os métodos `equals` e `hashCode` para garantir que dois objetos `LogEntry` sejam considerados iguais se tiverem o mesmo nome de usuário.

2. **App**: A classe principal que:
    - Lê o caminho completo do arquivo do usuário.
    - Lê as entradas do arquivo e as adiciona a um `HashSet`.
    - Exibe o total de usuários únicos.


