# Analisador de Frases

### Observações
- **Texto alternativo da imagem**: Essa parte é importante para acessibilidade e aparecerá se a imagem não puder ser carregada.
- **URL_da_imagem**: Certifique-se de que o caminho da imagem está correto em relação à estrutura do seu repositório. Se a imagem estiver na raiz do repositório, você pode usar simplesmente `bankpro.png`.

![Logo do Analisador de Frases](target/bankpro-1.0-SNAPSHOT/bankpro.png)

## Descrição
O **Analisador de Frases** é um sistema web simples desenvolvido em Java utilizando JSF, PrimeFaces, e Hibernate. O projeto permite que os usuários insiram uma frase e obtenham a contagem de palavras distintas e suas respectivas ocorrências.

## Tecnologias Utilizadas
- **Java 8**
- **JSF (JavaServer Faces)**
- **PrimeFaces**
- **JPA (Java Persistence API) com Hibernate**
- **WildFly (Servidor de Aplicações)**
- **Maven** (para gerenciamento de dependências)
- **HTML**

## Funcionalidades
- Entrada de texto para a frase.
- Análise da frase para contagem de palavras distintas e ocorrências.
- Interface gráfica responsiva renderizada em um navegador.
- Comunicações entre cliente e servidor via Web Services.

## Estrutura do Projeto

## Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu_usuario/analisador-frases.git
## Navegue até o diretório do projeto:
cd analisador-frases

## Compile e empacote o projeto usando Maven:
mvn clean install

## Desploe o arquivo WAR gerado na pasta target no servidor WildFly.

## Acesse a aplicação pelo navegador em 
 ```bash
http://localhost:8080/bankpro-1.0-SNAPSHOT/index.xhtml




