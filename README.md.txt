Trabalho 1 - Máquina de Estados

## Como Compilar e Rodar
1. Abra o terminal na pasta `src`.
2. Compile os arquivos com o comando: `javac *.java`
3. Execute o programa principal com: `GestorJogo.java`

## Descrição dos Agentes e Estados
Agente A (Trabalhador): Coleta recursos. Possui os estados: `Caminhando`, `Minerando` e `Retornando`.
Agente B (Torre de Defesa):Vigia a base. Possui os estados: `Vigiando` e `Em Alerta`.

## Como observar as transições no console
A simulação roda no console ciclo a ciclo. As transições ficam claras porque cada mudança de estado imprime a tag `[LEAVE]` do estado antigo e a tag `[ENTER]` do estado novo, seguidas pelas ações de `[EXECUTE]`.