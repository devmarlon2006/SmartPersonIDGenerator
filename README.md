# Gerador de ID

Este é um protótipo inicial de um aplicativo Java que gera IDs únicos no formato especificado.

-----

## Versão 0.0.1-ALPHA

Esta é a **primeira versão de teste (ALPHA)** do Gerador de ID. É um **protótipo inicial** focado em demonstrar a funcionalidade básica de geração de IDs.

**Funcionalidade Principal:**

* Gera um ID único de **11 caracteres**.
* O formato do ID é composto por **7 caracteres numéricos e letras**, seguidos por um **travessão (`-`)**, e finalizado por mais **3 caracteres numéricos**.

**Exemplo de ID Gerado:** `ab123c4-000`

**Propósito:**
Esta versão é estritamente para **fins de teste e validação inicial**. Funcionalidades adicionais, validações robustas e melhorias de usabilidade serão implementadas em futuras atualizações.

-----

## Como Executar o Gerador de ID

Para executar este aplicativo, você precisará ter o **Java Runtime Environment (JRE)** instalado em seu sistema. Recomendamos fortemente a execução via linha de comando para maior controle e visibilidade de qualquer saída ou erro.

### 1\. Pré-requisitos: Instale o Java (JRE)

Certifique-se de que o Java está instalado em seu computador. Você pode verificar isso abrindo o **Terminal** (macOS/Linux) ou o **Prompt de Comando (CMD)** (Windows) e digitando:

```bash
java -version
```

Se você vir uma versão do Java (ex: `java version "17.0.2"`), você está pronto. Caso contrário, você precisará instalar o JRE ou JDK. Visite o [site oficial da Oracle Java](https://www.google.com/search?q=https://www.java.com/pt-br/download/) ou uma distribuição OpenJDK como o [Adoptium (Eclipse Temurin)](https://adoptium.net/temurin/releases/) para baixar e instalar a versão mais recente.

### 2\. Baixe o Arquivo Executável

Faça o download do arquivo `.jar` do Gerador de ID. Ele geralmente estará disponível na seção de "Releases" do projeto. Por exemplo: `GeradordeID-0.0.1-ALPHA.jar`.

-----

### Executando no Windows (Via Prompt de Comando - CMD)

1.  **Abra o Prompt de Comando:**

    * Pressione `Win + R`, digite `cmd` e pressione Enter.
    * Ou digite "cmd" na barra de pesquisa do Windows e selecione "Prompt de Comando".

2.  **Navegue até a Pasta do Arquivo `.jar`:**

    * Use o comando `cd` para ir até o diretório onde você salvou o arquivo `.jar`.
    * **Exemplo:** Se o seu arquivo `.jar` está em `C:\Downloads`, digite:
      ```cmd
      cd C:\Downloads
      ```
    * **Dica Rápida:** Você pode digitar ` cd  ` (com um espaço no final), depois arrastar a pasta do Explorador de Arquivos para a janela do CMD e soltar. O caminho será preenchido automaticamente.

3.  **Execute o Arquivo `.jar`:**

    * Com o CMD na pasta correta, execute o comando:
      ```cmd
      java -jar GeradordeID-0.0.1-ALPHA.jar
      ```
   

4.  **Verifique a Saída:**

    * O ID gerado aparecerá diretamente na janela do Prompt de Comando. Se houver algum erro, ele também será exibido aqui, o que é útil para depuração.

-----

### Executando no macOS / Linux (Via Terminal)

1.  **Abra o Terminal:**

    * No macOS, você pode encontrá-lo em `Aplicativos > Utilitários > Terminal`.
    * No Linux, geralmente está nos seus "Aplicativos" ou pode ser aberto com `Ctrl + Alt + T`.

2.  **Navegue até a Pasta do Arquivo `.jar`:**

    * Use o comando `cd` para ir até o diretório onde você salvou o arquivo `.jar`.
    * **Exemplo:** Se o seu arquivo `.jar` está na sua pasta `Downloads`, digite:
      ```bash
      cd ~/Downloads
      ```

3.  **Execute o Arquivo `.jar`:**

    * Com o Terminal na pasta correta, execute o comando:
      ```bash
      java -jar GeradordeID-0.0.1-ALPHA.jar
      ```


4.  **Verifique a Saída:**

    * O ID gerado aparecerá diretamente na janela do Terminal. Qualquer erro ou mensagem de depuração também será exibido aqui.

-----

### Execução com um Clique (Apenas Windows)

Embora a execução via linha de comando seja recomendada, no Windows é possível configurar o `.jar` para abrir com um clique duplo, **se a associação de arquivos Java estiver configurada corretamente**.

1.  **Localize o arquivo `.jar`** no Explorador de Arquivos.
2.  **Clique com o botão direito** no arquivo e selecione **"Abrir com" \> "Escolher outro aplicativo"**.
3.  Navegue até a pasta `bin` da sua instalação Java (JRE ou JDK) e selecione `javaw.exe`.
    * **Exemplo de caminho:** `C:\Program Files\Java\jdk-X.Y.Z\bin\javaw.exe`
4.  **Marque a caixa "Sempre usar este aplicativo para abrir arquivos .jar"** e clique em **"OK"**.

Agora, um clique duplo no `.jar` deve executar o aplicativo. Observe que, se o aplicativo for de console, a janela do console pode aparecer e desaparecer rapidamente. Por isso, a execução via CMD/Terminal é geralmente preferível para apps de console.
