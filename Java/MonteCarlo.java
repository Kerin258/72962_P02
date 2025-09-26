package Java;

import java.util.Random; 

public class MonteCarlo {

    public  static void main (String[] args) {
        int totalSamples = 1_000_000; //numero total de puntos
        long insideCircle = 0; //contador total
        Random rand = new Random();

        //generar puntos aleatorios y verificar si caen dentro del circulo
        for(int i = 0; i < totalSamples; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            if(x * x + y * y <= 1.0) {
                insideCircle++;
            }
        }

        //calcular aprox. de pi
        double piApprox = (4.0 * insideCircle) / totalSamples;
        System.out.println("Numero total de puntos: " + totalSamples);
        System.out.println("Puntos dentro de circulo: " + insideCircle);
        System.out.println("Aproximacion de pi: " + piApprox);
        System.out.println("Error: " + Math.abs(piApprox - Math.PI));
    }
}

