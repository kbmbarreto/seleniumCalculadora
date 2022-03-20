# seleniumCalculadora

<p>Projeto criado para automação de casos de teste da calculadora do Windows.</p>

## Ferramentas utilizadas

- Java
- Maven
- JUnit
- Selenium
- Winnium Driver

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(no meu caso, utilizo o IntelliJ)**, em seguida, altere a classe **MyFirstTestCase.java** para que o projeto se adeque a ao 
executável **mais recente da calculadora do Windows**:

**Trecho da classe que deve ser alterado**:

````java
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
````

Em seguida, basta rodar a classe MyFirstTestCase.java. Lembrando que este é apenas um projeto utilizado como modelo, tendo sido realizado apenas um caso de teste, com este projeto servindo apenas como portfólio.

## Tutoriais úteis para configurar sua estação de trabalho.

- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Configurar variáveis de ambiente MAVEN](https://pt.stackoverflow.com/questions/259927/como-configurar-vari%C3%A1veis-de-ambiente-maven-java)
