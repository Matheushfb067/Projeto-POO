Claro! Aqui está o README para o seu projeto em formato Markdown.

---

## 💻 Projeto PC Mania

Este projeto foi desenvolvido como parte de um exercício para a disciplina de Engenharia de Software. O objetivo é criar um sistema de gerenciamento de vendas de computadores para a loja fictícia "PC Mania", com base em um diagrama de classes UML e uma tabela de promoções predefinidas.

---

### ✨ Funcionalidades

O sistema permite que o cliente realize as seguintes ações:

* **Visualizar promoções:** Exibe três opções de computadores com configurações e preços fixos.
* **Comprar computadores:** O cliente pode escolher quantos computadores desejar de diferentes promoções. A compra é finalizada ao digitar o código `0`.
* **Calcular total da compra:** O sistema soma o preço de todos os computadores adquiridos.
* **Exibir informações:** Ao final da compra, são mostradas todas as informações do cliente, os detalhes dos PCs comprados e o valor total a ser pago.

---

### 🔨 Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE:** IntelliJ IDEA

---

### 📌 Estrutura do Projeto

O código foi implementado seguindo o diagrama de classes UML, utilizando o paradigma de Programação Orientada a Objetos (POO). A estrutura de classes é a seguinte:

* `Cliente`: Representa o cliente que realiza a compra.
* `Computador`: Contém os dados de um computador, incluindo seus componentes.
* `HardwareBasico`: Classe para os componentes internos do PC (processador, memória, HD).
* `MemoriaUSB`: Classe para os dispositivos USB que acompanham o PC.
* `SistemaOperacional`: Classe para o sistema operacional instalado.
* `ProcessarPedido`: Classe com um método para "enviar" o pedido.
* `Main`: A classe principal que executa o sistema e interage com o usuário.

---

### 🧑‍💻 Autor

* **Nome:** Matheus Henrique Ferreira Braz
* **Curso:** Engenharia de Software
* **Matrícula:** 636
