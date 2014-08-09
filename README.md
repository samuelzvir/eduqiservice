Eduqi Service
=============

##Sobre


O EduQI é um portal que tem por objetivo disponibilizar dados estatísticos referentes a infra-estrutura  das escolas 
do brasil. O EduQI obtém dados da Prova Brasil e faz uma média das condições de infra-estrutura, segurança e recursos de auxilio 
ao ensino das 1000 escolas com melhor desempenho na Prova Brasil. Com essa média é possível analisar e comparar as condições de uma 
escola escolhida através da busca do site com a média das escolas com as melhores classificações.
O objetivo desta comparação é tentar escolher algumas prioridades para investimento nas escolas comparadas. 
EduQI Service é o serviço responsável por disponibilizar todos os dados para a camada de front-end do projeto EduQI.
Como é um serviço todos os dados utilizados na exibição podem ser consumidos por outros aplicativos através dos
seguintes endereços:


### Acesse:
######Endereço na WEB: 
http://eduqi.org

######Repositório do Front-end: 
https://github.com/dcardosods/eduqi

### Como contribuir

- Use o [EduQI](http://eduqi.org)!
- Sugira melhorias, reporte bugs, envie críticas em [EduQI Service/Issues](https://github.com/samuelyuri/eduqiservice/issues) ou [EduQI/Issues](https://github.com/dcardosods/eduqi/issues)
- Faça um fork, corrija bugs, implemente novas funcionalidades...


---
### Informações
--
### Versão 2.0.0

## Chamadas REST

-  Chamada que retorna uma lista com os nomes e ids de escolas 
    
    ```sh
    http://[host da aplicacao]:[porta]/eduqiservice/v1/eduqiservice/v1/schoolna me/{query}/{limit}
    ```
  * query : termos da pesquisa
  * limit : número máximo de escolas que estarão na na lista de retorno. (0 retorna todos os elementos da busca)

-  Chamada que retorna uma lista com uma média das repostas do quetionário sobre a infraestrutura das escolas com melhor desempenho
    ```sh
    http://[host da aplicacao]:[porta]/eduqiservice/v1/generalstats
    ```

-  Chamada que retorna os dados do formulário da escola
    ```sh
    http://[host da aplicacao]:[porta]/eduqiservice/v1/schoolanswers/{schoolID}
    ```
  * schoolID : ID da escola

- Chamada que retorna o CEP da escola
    ```sh
    http://[host da aplicacao]:[porta]/eduqiservice/v1/getcep/{idEscola} 
    ```
  * schoolID : ID da escola


--
####Dependências da Aplicação (Versão 2.0):
  * Spring: http://spring.io
  * Cleo: https://engineering.linkedin.com/cleo
  * Hibernate: http://hibernate.org/
  
--
###      Versão 1.0.0 (Versão inicial)

####Servlets da Aplicação:
- Porcentagem de respostas do questionário socio-econômico das 1000 primeiras escolas:

```bash
http://[host da aplicacao]:[porta]/eduqi-server/probservlet
```
- Serviço que retorna o CEP da escola de acordo com o id da escola:

```bash
http://[host da aplicacao]:[porta]/eduqi-server/cepprovider?idEscola=[id da escola]
```
- Serviço de de respostas do questionário socio-econômico da escola selecionada:

```bash
http://[host da aplicacao]:[porta]/eduqi-server/questservlet?idEscola=[id da escola]
```





