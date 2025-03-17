# Trainer-card-Maker
# Pokemon Trainer Card
## Autor: Victor Lucas Tornelli
Este projeto, **Pokemon Trainer Card**, é uma aplicação desenvolvida em **Java** que permite aos usuários criarem e gerenciarem seus próprios cartões de treinador Pokémon. Ele conta com uma interface gráfica intuitiva e funcionalidades como login, cadastro e gestão de cartões.

## Funcionalidades
- **Cadastro e login de usuários**
- **Criação e personalização de cartões de treinador**
- **Atualização e exclusão de cartões**
- **Visualização interativa dos cartões criados**

## Tecnologias Utilizadas
- **Linguagem:** Java
- **IDE:** NetBeans (uso do GUI Builder)
- **Bibliotecas:** 

## Estrutura do Projeto
```
PokemonTrainerCard/
|-- build.xml
|-- manifest.mf
|-- nbproject/  # Configurações do NetBeans
|-- src/
|   |-- pokemontrainercard/
|   |   |-- PokemonTrainerCard.java  # Classe principal
|   |   |-- Login.java, Menu.java  # Interface de login e menu
|   |   |-- Cadastro.java, Atualizar.java, Apagar.java  # Gestão de dados
|   |   |-- CardView.java  # Visualização dos cartões
|   |   |-- DatabaseConnection.java  # Gerenciamento centralizado do banco de dados
|   |-- Imagens, PokeSprites, Trainers, etc.  # Recursos visuais
```

## Como Executar
### Compilando
1. **Clone o repositório**
   ```sh
   git clone https://github.com/Viihctor/Trainer-card-Maker.git
   ```
2. **Abra o projeto no NetBeans**
3. **Compile e execute a classe principal** (`PokemonTrainerCard.java`)


### Pré Compilado
1. **Na pasta Dist há um jar executavel para o teste do protótipo**



## Aplicando o Padrão Singleton (Entrega 16/03)
Para melhorar a eficiência e segurança do acesso ao banco de dados, aplicamos o padrão **Singleton** na classe `DatabaseConnection`. Agora, todas as operações de banco de dados (CRUD) são centralizadas nessa classe, garantindo que apenas uma instância da conexão seja utilizada durante a execução da aplicação.

### Benefícios da Mudança:
- **Evita a criação excessiva de conexões** com o banco de dados.
- **Facilita a manutenção** do código ao concentrar as operações SQL em um único local.
- **Melhora a segurança** ao restringir o acesso direto ao banco de dados.

Agora, qualquer classe que precisar interagir com o banco de dados pode chamar os métodos estáticos da `DatabaseConnection`, garantindo um acesso mais eficiente e organizado aos dados.

## Contribuição
Fique à vontade para contribuir com melhorias! Para isso:
1. Faça um fork do repositório
2. Crie uma nova branch (`git checkout -b minha-feature`)
3. Faça suas alterações e commit (`git commit -m 'Minha melhoria'`)
4. Envie as mudanças (`git push origin minha-feature`)
5. Abra um Pull Request

## Licença
Este projeto está sob a licença [MIT](LICENSE).

## Imagens do Projeto

### Menu Principal
![Menu Principal](Images/Menu.png)

### Tela de Criação
![Tela de Criação](Images/Create.png)

### Tela de Atualização
![Tela de Atualização](Images/Update.png)

### Tela de Leitura
![Tela de Leitura](Images/Read.png)

### Tela de Visualização
![Tela de Visualização](Images/View.png)

### Tela de Exclusão
![Tela de Exclusão](Images/Delete.png)
