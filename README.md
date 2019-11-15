- O projeto consiste em criar um serviço rest que consuma a API de Consulta Tabela FIPE, que receba como parâmetro o ID de uma marca e o ID de um veículo e retorne o valor e o percentual da alteração do valor total do veículo ao longo dos anos em que o mesmo foi fabricado.

O serviço foi disponibilizado em um servidor EC2 da Amazon.

<h4>Foi criado um front para o serviço na url abaixo:</h4>

 -  https://desafiotabelafipe.000webhostapp.com/
 
<h4>Link do Github do front:</h4>

 - https://github.com/mauriciopedroso26/desafio-tabela-fipe-front

<h3>Tecnologias utilizadas</h3>

- [x] Java 8.
- [x] Spring.
- [x] Rest.
- [x] Maven.

<h3>Url publica do serviço</h3>
 * http://ec2-52-91-19-205.compute-1.amazonaws.com

<h3>Url disponibilizada</h3>

 - A palavra GET que está antes das url, é o verbo HTTP a ser utilizado antes da chamada da url.

 <h4>Para processar e buscar os valores do veículo: </h4>

  - GET: http://ec2-52-91-19-205.compute-1.amazonaws.com:8070/api/admin/fipe/21/4828

  - O número 21 após a url, neste caso é o id da marca a ser buscado, e o número 4828 é o id do modelo.