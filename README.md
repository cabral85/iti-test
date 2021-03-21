# ITI - Validação de Senha Forte
### Aplicação escrita em Java 8 com Spring na versão 2.4.3
### Adicionar Springfox Swagger para facilitar a visualização do contrato e testes do serviço

## Executando a aplicação
#### Pré Requisito: Docker
#### Como rodar: abra o terminal / powershell, vá para a pasta raiz da aplicação e execute: docker-compose up
#### A aplicação será inicializada na porta 8080
#### Para testes execute no navegador o seguinte endereço: http://localhost:8080/swagger-ui.html


## Sobre a aplicação
### Ela ficou dividida da seguinte forma: Controller, Component, DTO E Entity
#### -> Controller: É a inicialização do serviço, através dele está definido a rota e argumentos
#### -> Component: É quem cuida da regra de negocio, ele é responsável por fazer chamada de utilitários que o ajudem a definir a resposta de acordo com a regra de negócio
#### -> DTO: Utilizado para transformação da resposta do servidor para o cliente
#### -> Entity: Utilizado como mapa da entrada do serviço, ele quem define o corpo da requisição

#### <=--Lombok--=> Utilizado para reduzir a quantidade de código dentro de entity e dto, agiliza a escrita de propriedades que precisem de getters e setters

## Itens que faltaram
### -Testes do Controller
#### Motivo: Não consegui achar uma forma de inicializar o contexto do spring para testar a rota
