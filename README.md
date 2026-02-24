#PRÁTICA DE PROGRAMAÇÃO ORIENTADA A OBJETOS

Esse repositório tem como prática postar meus códigos baseados em Programação Orientada a Objetos tendo como base a linguagem JAVA.

EXERCÍCIO 03 (PROBLEMA-DESÁFIO) - NOTA(7,5/10):

Descrição: Uma startup de tecnologia no Vale do Silício está desenvolvendo uma nova "Máquina de Café Inteligente". O hardware já está pronto, mas o engenheiro chefe pediu para você escrever o software de controle da máquina utilizando Programação Orientada a Objetos.

Para evitar acidentes (como transbordamento de água ou moagem a seco), o acesso direto aos compartimentos da máquina é estritamente proibido. Todas as interações devem ser feitas através do painel de controle (métodos públicos).

A máquina segue as seguintes regras de negócio:

- Capacidade Máxima: A máquina suporta no máximo 1000 ml de água e 500 g de grãos de café.
- Estado Inicial: A máquina sempre começa desligada, com 0 ml de água, 0 g de grãos e 0 cafés servidos.
- Fazer Café: Para fazer um café, a máquina gasta exatamente 100 ml de água e 20 g de grãos.
- Restrições para fazer café: - A máquina não pode fazer café se estiver desligada.
- A máquina não pode fazer café se não houver água ou grãos suficientes para a dose.
- Abastecimento: Ao abastecer água ou grãos, se a quantidade inserida ultrapassar o limite máximo, o excedente é descartado (o compartimento enche até o limite e não passa disso).

Entrada: A primeira linha da entrada contém um número inteiro N (1 ≤ N ≤ 50), que representa a quantidade de comandos enviados ao painel da máquina. As N linhas seguintes contêm um comando cada, que podem ser:
- L : Ligar a máquina.
- D : Desligar a máquina.
- C : Tentar fazer um café.
- A X : Abastecer a máquina com X ml de água.
- G X : Abastecer a máquina com X gramas de grãos de café.
- 
Saída: O programa deve gerar uma saída apenas quando o comando for C (Fazer café). Nesses casos, imprima:
- "Erro: Maquina desligada" se o comando for recebido com ela desligada.
- "Erro: Ingredientes insuficientes" se ela estiver ligada, mas faltar água ou grão.
- "Cafe servido!" se a operação for um sucesso.
A
pós processar todos os comandos, imprima um relatório final contendo o total de cafés servidos, a água restante e os grãos restantes, no formato: Total de cafes: [quantidade] Agua: [ml] ml, Graos: [g] g

