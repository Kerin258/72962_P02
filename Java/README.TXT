Este proyecto utiliza el método Monte Carlo para calcular una aproximación de π, ofreciendo dos enfoques:

1. Versión Secuencial (`MonteCarlo.java`)
2. Versión Paralela mediante Hilos (`MonteCarloHilos.java`)

sin hilos

Numero total de puntos: 1000000
Puntos dentro del circulo: 785097
Aproximacion de pi: 3.140388
Error: 0.0012046535897929367
Tiempo total de cilculo: 46 ms

con hilos 

Hilo 2: añadiendo 196451 puntos al total.
Hilo 1: añadiendo 196252 puntos al total.
Hilo 3: añadiendo 196756 puntos al total.
Hilo 0: añadiendo 196249 puntos al total.

N mero total de puntos: 1000000
Puntos dentro del c rculo: 785708
Aproximacion de pi: 3.142832
Error: 0.001239346410206732
Tiempo total de c lculo: 44 ms