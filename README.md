Eduqi Service
=============

##Sobre

O EduQI é um portal que tem por objetivo disponibilizar dados estatísticos referentes a infra-estrutura  das escolas 
do brasil. O EduQI obtém dados da Prova Brasil e faz uma média das condições de infra-estrutura, segurança e recursos de auxilio 
ao ensino das 1000 escolas com melhor desempenho na Prova Brasil. Com essa média é possível analisar e comparar as condições de uma 
escola escolhida através da busca do site com a média das escolas com as melhores classificações.
O objetivo desta comparação é tentar escolher algumas prioridades para investimento nas escolas comparadas. 



EduQI Service é o serviço responsável por disponibilizar todos os dados para a camada de front-end do projeto eduqi.
Como é um serviço todos os dados utilizados na exibição podem ser consumidos por outros aplicativos acessando os
seguintes endereços:


Porcentagem de respostas do questionário socio-econômico das 1000 primeiras escolas:
```bash
http://[host da aplicacao]:[porta]/eduqi-server/probservlet
```


Serviço que retorna o CEP da escola de acordo com o id da escola:
```bash
http://[host da aplicacao]:[porta]/eduqi-server/cepprovider?idEscola=[id da escola]
```
Serviço de de respostas do questionário socio-econômico da escola selecionada:
```bash
http://[host da aplicacao]:[porta]/eduqi-server/questservlet?idEscola=[id da escola]
```


OBS: Os dados estão disponíveis no formato JSON.

http://eduqi.org/
