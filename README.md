Exemplo de Leitura de Arquivos e Uso de Sets em Java
Descrição
Este projeto Java demonstra a leitura de um arquivo de texto, a criação de entradas de log (LogEntry), e a utilização de um HashSet para armazenar entradas únicas com base no nome de usuário. O programa lê um arquivo contendo logs, onde cada linha representa uma entrada de log com um nome de usuário e um carimbo de data/hora, e conta o número de usuários únicos.

Estrutura do Projeto
plaintext

Copiar
src/
├── App.java
└── entities/
└── LogEntry.java
Classes
App
Descrição: Classe principal que contém o método main.

Funcionamento:

Solicita ao usuário o caminho completo do arquivo de logs.

Lê o arquivo e processa cada linha, dividindo-a em nome de usuário e carimbo de data/hora.

Adiciona cada entrada (LogEntry) a um HashSet para garantir unicidade com base no nome de usuário.

Imprime o número total de usuários únicos.

LogEntry
Descrição: Representa uma entrada de log com um nome de usuário e um carimbo de data/hora.

Atributos:

userName: Nome do usuário.

moment: Carimbo de data/hora da entrada de log.

Métodos:

getUserName(), setUserName(), getMoment(), setMoment(): Métodos getter e setter para os atributos.

equals(): Compara entradas de log com base no nome de usuário.

hashCode(): Gera um código hash baseado no nome de usuário.

Uso
Para executar o programa, siga os seguintes passos:

Compile as classes Java:

sh

Copiar
javac src/App.java src/entities/LogEntry.java
Execute o programa:

sh

Copiar
java src/App
Insira o caminho completo do arquivo de log quando solicitado.

Exemplo de Arquivo de Log
O arquivo de log deve ter o seguinte formato, onde cada linha contém um nome de usuário e um carimbo de data/hora no formato ISO 8601, separados por um espaço:

plaintext

Copiar
Gabriel 2023-10-13T17:44:00Z
Maria 2023-10-13T17:45:00Z
Gabriel 2023-10-13T18:00:00Z
Exemplo de Saída
plaintext

Copiar
Enter file full patch: /caminho/para/o/arquivo.log
Total users: 2
