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
	- Trocas: Número de vezes que os elementos foram trocados;
	- Comparação: Número de vezes que os valores foram comparados;
	- Iterações: Quantas iterações foram feitas na lista;
	- Tempo: Tempo para realizar a operação.


### Lista 1:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |     78 |         180 |        15 | 0.000016  |      |
| Selection Sort |     18 |         190 |        19 | 0.000017  |      |
| Cocktail Sort  |     78 |         154 |         6 | 0.000017  |      |
| Comb Sort      |     22 |         129 |         9 | 0.000017  |      |
| Gnome Sort     |     78 |          96 |       174 | 0.000005  |      |
| Bucket Sort    |        |             |           |           |      |

### Lista 2:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |      0 |          19 |         1 | 0.000002  |      |
| Selection Sort |      0 |         190 |        19 | 0.000011  |      |
| Cocktail Sort  |      0 |          19 |         1 | 0.000005  |      |
| Comb Sort      |      0 |         110 |         8 | 0.000033  |      |
| Gnome Sort     |      0 |          19 |        19 | 0.000001  |      |
| Bucket Sort    |        |             |           |           |      |

### Lista 3:

| Algoritmo      | Trocas | Comparações | Iterações | Tempo (s) | Rank |
|----------------|--------|-------------|-----------|-----------|------|
| Bubble Sort    |    190 |         190 |        20 | 0.000024  |      |
| Selection Sort |     10 |         190 |        19 | 0.000013  |      |
| Cocktail Sort  |    190 |         190 |        10 | 0.000024  |      |
| Comb Sort      |     18 |         129 |         9 | 0.000017  |      |
| Gnome Sort     |    190 |         190 |       380 | 0.000015  |      |
| Bucket Sort    |        |             |           |           |      |


