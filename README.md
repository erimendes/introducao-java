# introducao-java

// 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int nota = 90;
        String graduacao;

        if ( nota >= 80 ) {
            graduacao = "A";
        } else if ( nota > 60 && nota < 80 ) {
            graduacao = "B";
        } else if ( nota > 40 && nota < 60 ) {
            graduacao = "C";
        } else if ( nota > 0 && nota < 40 ) {
            graduacao = "F";
        } else {
            graduacao = "D";
        }

        switch (graduacao) {
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno aprovado");
                break;
            case "F":
                System.out.println("Aluno reprovado");
                break;
            case "D":
                System.out.println("Aluno reprovado por falta");
                break;
            default:
                System.out.println("Nota inválida");
        }
        System.out.println("Conceito: " + graduacao);

        // Olá, {nome}. Hoje é {dia-da-semana}, Bom dia!

        String nome = "Jesse";

        Locale brasil = new Locale("pt", "BR");
        // ISO 8601 - Padrão de data
        LocalDate hoje = LocalDate.now();
        
        System.out.println("Olá, " + nome + ". Hoje é " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) + ", Bom dia");
        
    }
}
