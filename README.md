# Automação Api Pet

#Tecnologias:

Java + RestAssured + Maven

#Pre requisitos para rodar em Windows:

1 - Java 8 instalado na máquina com a variavel de ambiente configurada

2 - Maven configurado como variavel de ambiente

3 - Uma IDE que tenha compatibilidade com java caso queira rodar os testes pela IDE (Recomendo o intellij)

#Descrição

O projeto consome uma massa de testes de um arquivo .json que está dentro da pasta resources, executa chamadas em algumas Apis para validar um fluxo de venda de pet para uma cliente 

#Executando o projeto

Para rodar o projeto depois de configurado os requisitos citados acima, basta clicar no botão "play" dentro da classe ApiTest ou se quiser rodar por linha de comando. basta executar o seguinte comando: "mvn surefire:test" com ele todos os tests do projeto serão executados.
