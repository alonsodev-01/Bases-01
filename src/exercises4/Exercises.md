# Ejercicios Array en Java

---
## Ejercicio 1 – Promedio de notas
**Tema:** `Array unidimensional`

### Instrucciones
Crea un programa que pida al usuario 5 notas (números enteros o decimales) y luego calcule y muestre el promedio.

### Ejemplo de salida
****
``` 
Ingresa 5 notas:
Nota 1: 15
Nota 2: 18
Nota 3: 14
Nota 4: 20
Nota 5: 17
El promedio es: 16.8
```

### Pista
Usa un array  `double[] notas = new double[5];`y un bucle for para llenarlo.

## Ejercicio 2 – Número mayor y menor
**Tema:** `Array unidimensional`

### Instrucciones
Pide al usuario ingresar 6 números enteros, guárdalos en un array y muestra cuál es el mayor y cuál el menor.
### Ejemplo de salida
****

``` 
Ingresa 6 números:
10, 4, 8, 22, 3, 7
El número mayor es: 22
El número menor es: 3
```

### Pista
Recorre el array comparando valores con variables mayor y menor.


## Ejercicio 3 – Invertir un array
**Tema:** `Array unidimensional`

### Instrucciones
Crea un programa que tenga un array con los números {1, 2, 3, 4, 5} y muestre el mismo array en orden inverso.

### Ejemplo de salida
****
``` 
Array original: 1 2 3 4 5
Array invertido: 5 4 3 2 1
```

### Pista
Usa un for que empiece desde el último índice y vaya hacia 0.

## Ejercicio 4 – Contar ocurrencias
**Tema:** `Array unidimensional`

### Instrucciones
Pide al usuario ingresar 10 números y luego preguntar otro número.
El programa debe decir cuántas veces aparece ese número en el array.

### Ejemplo de salida
****
``` 
Ingresa 10 números:
1 3 2 3 4 3 5 6 3 2
Ingresa un número a buscar: 3
El número 3 aparece 4 veces.
```


## Ejercicio 5 – Suma de matrices
**Tema:** `Array bidimensional (matriz)`

### Instrucciones
Declara dos matrices de 2x3 (dos filas y tres columnas) con valores enteros.
Calcula la suma de ambas y muestra el resultado en una tercera matriz.

### Ejemplo de salida
****
``` 
Matriz A:
1 2 3
4 5 6

Matriz B:
6 5 4
3 2 1

Suma:
7 7 7
7 7 7
```

### Pista
Usa dos bucles `for` anidados para recorrer filas y columnas.

## Ejercicio 6 – Matriz de multiplicación
**Tema:** `Array bidimensional`

### Instrucciones
Crea una matriz 3x3 donde cada elemento sea el producto de su fila y columna (ejemplo: posición `[i][j] = i * j`).

### Ejemplo de salida
``` 
Tabla generada:
0 0 0
0 1 2
0 2 4
```

### Pista
Recuerda que los índices comienzan en 0. Puedes usar `i+1` y `j+1` si prefieres que empiece en 1.

## Ejercicio 7 – Buscar un valor en una matriz
**Tema:** `Array bidimensional`

### Instrucciones
Crea una matriz 3x3 con valores ingresados por el usuario.
Luego pide un número y muestra si existe o no en la matriz.

### Ejemplo de salida
``` 
Ingresa valores para la matriz 3x3:
1 2 3
4 5 6
7 8 9
Número a buscar: 5
El número 5 se encuentra en la matriz.
```

### Pista
Usa un booleano encontrado = `false` y cambia a `true` si aparece el número.

## Ejercicio 8 - Suma por filas y columnas
**Tema:** `Array bidimensional`

### Instrucciones
Pide al usuario llenar una matriz 3x3 con números enteros.
Luego muestra la suma de cada fila y la suma de cada columna.

### Ejemplo de salida
``` 
Matriz:
1 2 3
4 5 6
7 8 9

Suma por fila:
Fila 1: 6
Fila 2: 15
Fila 3: 24

Suma por columna:
Columna 1: 12
Columna 2: 15
Columna 3: 18
```