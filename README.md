# Cliente-Servidor

Este trabalho é composto por um servidor REST desenvolvido utilizando o framework [Spring](https://spring.io) e um cliente utilizando 
[JavaFX](https://wiki.openjdk.java.net/display/OpenJFX/Main) e [OKHttp](http://square.github.io/okhttp/). Ambos cliente e servidor são bastante simples. 
O servidor não realiza acesso à banco, ele apenas possui uma lista de 20 clientes, não clientes consumidores do serviço do servidor, 
mas objetos com nome e idade. Por sua vez o cliente é apenas uma tela com um campo textual, um botão e algumas labels.

O objetivo do servidor é responder a requisições na porta 8080 em localhost no caminho /cliente, com parâmetro value em requisições do tipo GET,
respondendo uma String contendo a idade do cliente com o nome igual ao valor do parâmetro value ou a mensagem ‘Não sei’.

Por outro lado, o cliente enviará uma requisição GET para o endereço ‘http://localhost:8080/cliente’ com parâmetro value sendo o valor colocado no 
campo textual da interface gráfica ao clicar no botão. Ao receber a resposta do servidor a interface gráfica atualiza uma label com a mensagem do tipo
*‘A idade de Felipe é: 23’*.
