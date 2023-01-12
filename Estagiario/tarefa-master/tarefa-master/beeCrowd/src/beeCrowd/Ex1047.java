package beeCrowd;

import java.util.Scanner;

public class Ex1047 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int horaInicio, minutoInicio, horaFinal, minutoFinal, hora = 0, minuto = 0;
        horaInicio = input.nextInt();
        minutoInicio = input.nextInt();
        horaFinal = input.nextInt();
        minutoFinal = input.nextInt();
        if (horaInicio >= 0 && horaInicio <= 24 && horaFinal >= 0 && horaFinal <= 24 && minutoInicio >= 0 && minutoInicio <= 60
                && minutoFinal >= 0 && minutoFinal <= 60) {
            if (minutoFinal > minutoInicio) {
                minuto = minutoFinal - minutoInicio;
            }else if (minutoFinal < minutoInicio) {
                minuto = minutoFinal - minutoInicio + 60;
                horaFinal = horaFinal - 1;
            }
            if (horaFinal >= horaInicio) {
                hora = horaFinal - horaInicio;
            }else if (horaFinal < horaInicio) {
                hora = horaFinal - horaInicio + 24;
            }
            if (hora == 0 && minuto == 0) {
                hora = 24;
            }
        }
        System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
        
        input.close();
    }
}