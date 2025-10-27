# Identificando-Gadget-em-java
Este projeto contém uma função simples e eficiente para identificar a categoria de um gadget a partir de seu código. Desenvolvido com foco em boas práticas de programação, o sistema classifica gadgets como tablet, phone, notebook ou unknown com base na letra inicial do código.

Este projeto Java foi desenvolvido para o desadfio da DIO, com o objetivo de facilitar a classificação de gadgets recém-criados a partir de seus códigos. A solução aplica boas práticas de programação, como modularização, clareza e reutilização de funções.

## 🚀 Funcionalidade

A aplicação identifica a categoria de um gadget com base na primeira letra do seu código:

- Códigos iniciados com **T** → `tablet`
- Códigos iniciados com **P** → `phone`
- Códigos iniciados com **N** → `notebook`
- Qualquer outro código → `unknown`

## 📦 Estrutura do Projeto

- `CategoriaGadget.java`: contém a função principal e a lógica de identificação de categoria.

# Exemplos de Entrada e Saída

| Entrada   | Saída     |
 `T12345X`   `tablet` 

# Como Executar

1. Certifique-se de ter o Java instalado.
2. Compile o arquivo:
3. execute o programa: java CategoriaGadget
4. Digite o código do Gadget quando solicitado

```bash
javac CategoriaGadget.java
