package calificador;

import java.util.Arrays;

/**
 *
 * @author Eber MD
 */

class Operaciones {
    public double darPromedio(int[] cal){
        double promedio = 0, sumador = 0;
        for(int i = 0; i < cal.length; i++){
            sumador += cal[i];
        }
        promedio = sumador/cal.length;
        
        return promedio;
    }
    
    public String evaluador(double promedio){
        String resultado = "K";
        promedio = (int) promedio;
        
        if(promedio <= 50){
            resultado = "F";
        } else if (promedio >= 51 && promedio <= 60){
            resultado = "E";
        } else if (promedio >= 61 && promedio <= 70){
            resultado = "D";
        } else if (promedio >= 71 && promedio <= 80){
            resultado = "C";
        } else if (promedio >= 81 && promedio <= 90){
            resultado = "B";
        } else if (promedio >= 91 && promedio <= 100){
            resultado = "A";
        } else{
            System.out.println("Oh no!");
        }
        return resultado;
    }
    
    public void mostrar(String nombre, int[] cal, double promedio, String resultado){
        System.out.println("Estudiante: "+nombre
                +"\n"+"Con las calificaciones: "+Arrays.toString(cal)
                +"\n"+"Su promedio es de: "+promedio
                +"\n"+"Su resultado es de: "+resultado);
    }
}
public class Calificador {
    public static void main(String[] args) {
        String nombre;
        nombre = "Juan";
        int[] cal = new int[5];
        Operaciones OP = new Operaciones();
        
        cal[0] = 70; cal[1] = 90; cal[2] = 100;
        cal[3] = 60; cal[4] = 20;
        
        // 3 métodos: promedio, evaluador y mostrar
        
        double promedio  = OP.darPromedio(cal);
        String resultado = OP.evaluador(promedio);
        OP.mostrar(nombre, cal, promedio, resultado);
    }
}
