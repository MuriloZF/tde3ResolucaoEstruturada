# TDE 3 - Ordenação
## Curso: Ciência da Computação - PUCPR
## Semestre: 4°
## Turma: B 
## Matéria: Resolução de problemas estruturados em computação 
## Profesor: Andrey Cabral Meira
---
## Aluno:
	- Murilo Zimerman Fortaleza
---
## Listas utilizadas:

Lista 1 (Aleatória): {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

Lista 2 (Ordenada): {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

Lista 3 (Decrescente):{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

---

## Resultados:
### Foi calculado:
	- Trocas (Movimentos): Número de vezes que os elementos foram escritos/empossados (atribuições em arrays);
	- Comparação: Número de vezes que os valores foram comparados;
	- Iterações: Quantas iterações foram feitas na lista;
	- Tempo: Tempo para realizar a operação.


### Lista 1:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |    156 |         180 |        15 | 0.000058  |    5 |
| Selection Sort |     36 |         190 |        19 | 0.000005  |    3 |
| Cocktail Sort  |    154 |         154 |         6 | 0.000003  |    4 |
| Comb Sort      |     44 |         129 |         9 | 0.000004  |    2 |
| Gnome Sort     |    156 |          96 |       174 | 0.000005  |    6 |
| Bucket Sort    |     20 |          40 |         2 | 0.000028  |    1 |

### Lista 2:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |      0 |          19 |         1 | 0.000002  |    1 |
| Selection Sort |      0 |         190 |        19 | 0.000011  |    6 |
| Cocktail Sort  |      0 |          19 |         1 | 0.000005  |    2 |
| Comb Sort      |      0 |         110 |         8 | 0.000033  |    5 |
| Gnome Sort     |      0 |          19 |        19 | 0.000001  |    3 |
| Bucket Sort    |      0 |          40 |         2 | 0.000030  |    4 |

### Lista 3:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |    380 |         190 |        20 | 0.000065  |    5 |
| Selection Sort |     20 |         190 |        19 | 0.000012  |    3 |
| Cocktail Sort  |    380 |         190 |        10 | 0.000058  |    4 |
| Comb Sort      |     36 |         129 |         9 | 0.000023  |    2 |
| Gnome Sort     |    380 |         190 |       380 | 0.000011  |    6 |
| Bucket Sort    |     20 |          58 |         8 | 0.000009  |    1 |




