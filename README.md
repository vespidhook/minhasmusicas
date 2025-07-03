# 🎵 Minhas Músicas

> Projeto desenvolvido durante o curso de **Orientação a Objetos com Java** da Alura

## 📋 Sobre o Projeto

O **Minhas Músicas** é um sistema de gerenciamento de áudio que demonstra os conceitos fundamentais de **Programação Orientada a Objetos** em Java. O projeto simula uma plataforma de streaming de música e podcasts, permitindo reproduzir, curtir e gerenciar preferências de diferentes tipos de conteúdo de áudio.

## 🚀 Funcionalidades

- ✅ **Reprodução de Áudio** com contador de reproduções
- ❤️ **Sistema de Curtidas** com contador de likes
- ⭐ **Sistema de Classificação** baseado em reproduções e curtidas
- 🎵 **Gerenciamento de Músicas** com álbum, cantor e gênero
- 🎙️ **Gerenciamento de Podcasts** com apresentador e descrição
- 📋 **Lista de Preferidas** com recomendações automáticas

## 🏗️ Arquitetura do Projeto

### 📁 Estrutura de Pacotes

```
src/
├── br/dev/brunoalves/minhasmusicas/
│   ├── modelos/
│   │   ├── Audio.java           # Classe base abstrata
│   │   ├── Musica.java          # Herda de Audio
│   │   ├── Podcast.java         # Herda de Audio
│   │   └── MinhasPreferidas.java # Gerenciador de preferidas
│   └── principal/
│       └── Principal.java       # Classe principal
```

### 🎯 Conceitos de POO Implementados

| Conceito           | Implementação                                         |
| ------------------ | ----------------------------------------------------- |
| **Herança**        | `Musica` e `Podcast` herdam de `Audio`                |
| **Polimorfismo**   | `MinhasPreferidas` aceita qualquer `Audio`            |
| **Encapsulamento** | Atributos privados com getters/setters                |
| **Abstração**      | Classe base `Audio` com métodos comuns                |
| **Sobrescrita**    | Método `getClassificacao()` personalizado por classe |

## 🛠️ Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos para Execução

1. **Clone o repositório**

   ```bash
   git clone https://github.com/seu-usuario/minhasmusicas.git
   cd minhasmusicas
   ```

2. **Compile o projeto**

   ```bash
   javac -d bin src/**/*.java
   ```

3. **Execute a aplicação**
   ```bash
   java -cp bin br.dev.brunoalves.minhasmusicas.principal.Principal
   ```

## 📖 Exemplo de Uso

O programa demonstra:

```java
// Criando uma música
Musica minhaMusica = new Musica();
minhaMusica.setTitulo("Forever");
minhaMusica.setCantor("Kiss");

// Reproduzindo a música
for (int i = 0; i < 1000; i++) {
    minhaMusica.reproduz();
}

// Curtindo a música
for (int i = 0; i < 50; i++) {
    minhaMusica.curte();
}

// Criando um podcast
Podcast meuPodcast = new Podcast();
meuPodcast.setTitulo("BoalhaDev");
meuPodcast.setApresentador("Marcos Mendes");

// Reproduzindo o podcast
for (int i = 0; i < 5000; i++) {
    meuPodcast.reproduz();
}

// Adicionando às preferidas
MinhasPreferidas preferidas = new MinhasPreferidas();
preferidas.inclui(meuPodcast);
preferidas.inclui(minhaMusica);
```

## 🎓 Aprendizados do Curso

Este projeto foi desenvolvido durante o curso **"Java: Orientação a Objetos"** da Alura, onde foram abordados:

- ✅ **Classes e Objetos** - Criação e manipulação
- ✅ **Atributos e Métodos** - Encapsulamento de dados
- ✅ **Herança** - Reutilização de código através de `Audio`
- ✅ **Polimorfismo** - Flexibilidade no tratamento de diferentes tipos de áudio
- ✅ **Sobrescrita de Métodos** - Personalização do método `getClassificacao()`
- ✅ **Encapsulamento** - Controle de acesso aos atributos

## 📊 Exemplo de Saída

```
BoalhaDev é considerado sucesso absoluto e preferido por todos
Forever tambem é um dos que todo mundo está curtindo
```

## 🎵 Funcionalidades Detalhadas

### 🎼 Classe Musica
- **Atributos específicos**: álbum, cantor, gênero
- **Classificação**: 10 se > 2000 reproduções, senão 7

### 🎙️ Classe Podcast
- **Atributos específicos**: apresentador, descrição
- **Classificação**: 10 se > 500 curtidas, senão 8

### 📋 Classe MinhasPreferidas
- **Critério**: Inclui apenas áudios com classificação >= 9
- **Feedback**: Mensagens personalizadas baseadas na classificação

## 🤝 Contribuindo

Este é um projeto educacional desenvolvido durante o curso da Alura. Contribuições são bem-vindas para melhorar o código ou adicionar novas funcionalidades!

1. Faça um Fork do projeto
2. Crie uma Branch para sua Feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a Branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**Bruno Alves**

- GitHub: [@vespidhook](https://github.com/vespidhook)
- LinkedIn: [Bruno Alves](https://www.linkedin.com/in/brunoalvesilva/)

---

<div align="center">
  <p>Desenvolvido com ❤️ durante o curso da <a href="https://www.alura.com.br">Alura</a></p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/OOP-Object--Oriented--Programming-blue?style=for-the-badge" alt="OOP">
  <img src="https://img.shields.io/badge/Music-🎵-green?style=for-the-badge" alt="Music">
</div> 