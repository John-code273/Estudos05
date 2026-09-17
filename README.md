# Estudos05

Este projeto ├® um exerc├¡cio para ajudar a entender os conceitos b├ísicos de [K
programa├º├úo orientada a objetos (POO) utilizando o idioma Java. Ele se conc[4D[K
concentra em criar uma classe chamada `Produto` que representa um produto d[1D[K
de uma loja e oferece funcionalidades b├ísicas para gerenciar a quantidade e[1D[K
em estoque.

## Objetivo do Projeto

O objetivo deste projeto ├®:

1. Criar uma classe `Produto` com atributos e m├®todos b├ísicos.
2. Implementar m├®todos para adicionar e remover quantidade do produto.
3. Calcular o total valor do produto com base na quantidade e pre├ºo.
4. Exibir o produto em formato de string.

## Principais Funcionalidades Encontradas

1. **Classe `Produto`:**
   - Atributos: `nome`, `preco` e `quantidade`.
   - Construtores: Um construtor que aceita os tr├¬s atributos e outro que a[1D[K
aceita apenas o nome e pre├ºo.
   - M├®todos:
     - `getNome()`, `setNome(String nome)`: M├®todos para obter e definir o [K
nome do produto.
     - `getPreco()`, `setPreco(double preco)`: M├®todos para obter e definir[7D[K
definir o pre├ºo do produto.
     - `totalValor()`: M├®todo que calcula o total valor do produto multipli[8D[K
multiplicando a quantidade pelo pre├ºo.
     - `adicionar(int quantidade)`: M├®todo para adicionar quantidade ao pro[3D[K
produto.
     - `remover(int quantidade)`: M├®todo para remover quantidade do produto[7D[K
produto.
     - `toString()`: M├®todo que retorna uma representa├º├úo de string do prod[4D[K
produto.

2. **Interface Gr├ífica (Optional):**
   - O projeto pode ser estendido para incluir uma interface gr├ífica (GUI) [K
usando bibliotecas como Swing ou JavaFX para melhorar a interatividade.

## Tecnologias Utilizadas

1. **Java:** O projeto utiliza o JDK 25 para compila├º├úo e execu├º├úo.

## Como Executar

Para executar este projeto, siga os seguintes passos:

1. **Clonar o Reposit├│rio:**
   - Use o comando Git para clonar o reposit├│rio para sua m├íquina local:
     ```bash
     git clone https://github.com/seu_usuario/Estudos05.git
     ```

2. **Navegar para o Diret├│rio:**
   - Entre no diret├│rio do projeto:
     ```bash
     cd Estudos05
     ```

3. **Compilar o Projeto:**
   - Use o comando `javac` para compilar o c├│digo:
     ```bash
     javac src/Main.java src/Produto.java
     ```

4. **Executar o Programa:**
   - Use o comando `java` para executar o arquivo `Main`:
     ```bash
     java src/Main
     ```

5. **Interagir com o Programa:**
   - O programa solicitar├í os dados do produto, como nome, pre├ºo e quantida[8D[K
quantidade, e exibir├í as op├º├Áes de adicionar e remover quantidade.

## Conceitos de Programa├º├úo Presentes

- **Encapsulamento:** A classe `Produto` possui os atributos encapsulados d[1D[K
dentro dela, permitindo que eles possam ser acessados e modificados apenas [K
atrav├®s dos m├®todos da classe.
- **Heran├ºa:** Em um contexto mais complexo, esta classe poderia ser extend[6D[K
extendida para criar subclasses para diferentes tipos de produtos, se neces[5D[K
necess├írio.
- **Polimorfismo:** Embora simples, o exemplo inclui m├®todos com o mesmo no[2D[K
nome mas diferentes comportamentos, que pode ser ├║til em cen├írios mais comp[4D[K
complexos.

Este projeto serve como um ├│timo ponto de partida para estudar os conceitos[9D[K
conceitos b├ísicos da POO e a programa├º├úo orientada a objetos no Java.
