## Ejercicio 9 – Matriz transpuesta

**Tema:** `Recorrer matriz y cambiar posiciones`

### Instrucciones
Dada una matriz cuadrada 3x3, genera su matriz transpuesta (las filas se vuelven columnas).

### Ejemplo de salida
``` 
Original:
1 2 3
4 5 6
7 8 9

Transpuesta:
1 4 7
2 5 8
3 6 9
``` 

### Pista
Usa un segundo array `transpuesta[j][i] = matriz[i][j];`.

## Ejercicio 10 – Diagonal principal y secundaria
**Tema:** `Recorrido con condiciones`

### Instrucciones
Crea una matriz 3x3 y muestra los elementos de:
- La diagonal principal (de arriba izquierda a abajo derecha)
- La diagonal secundaria (de arriba derecha a abajo izquierda)

### Ejemplo de salida
``` 
Matriz:
1 2 3
4 5 6
7 8 9

Diagonal principal: 1 5 9
Diagonal secundaria: 3 5 7
```

### Pista
- Principal → posiciones donde `i == j`
- Secundaria → posiciones donde `i + j == longitud - 1`