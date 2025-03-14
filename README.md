# Spring Boot com Thymeleaf

Este projeto demonstra a utilização do Spring Boot com Thymeleaf para renderização de páginas HTML dinâmicas.

## 📌 Tecnologias Utilizadas

Spring Boot

Spring Web

Thymeleaf

Maven

Java 1.8 (outras versões são consideradas em branchs especificas)

## 🚀 Configuração do Projeto

1️⃣ Clonar o Repositório

git clone https://github.com/admilsonsoares/thymeleaf

cd seu-repositorio

2️⃣ Configurar o pom.xml

Verifique se as dependências necessárias estão no pom.xml:

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>

3️⃣ Executar o projeto

mvn spring-boot:run

## 🛠️ Como Funciona

1. Criando um Controller

Crie um controlador para processar as requisições:

```
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", "Bem-vindo ao Spring Boot com Thymeleaf!");
        return "home"; // Renderiza home.html
    }
}
```
2. Criando a View (home.html)

No diretório src/main/resources/templates/, crie o arquivo home.html:
```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Página Inicial</title>
</head>
<body>
    <h1 th:text="${mensagem}">Mensagem Padrão</h1>
</body>
</html>
```

3. Acessando a Página

Após iniciar a aplicação, acesse:

http://localhost:8080/

Você verá a mensagem renderizada pelo Thymeleaf!

## 📚 Recursos Adicionais

[Documentação do Spring Boot](https://spring.io/projects/spring-boot)

[Guia do Thymeleaf](https://www.thymeleaf.org/documentation.html)

Criado com ❤️ por Admilson (Ad).