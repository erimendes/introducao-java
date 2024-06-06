# introducao-java

```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import java.time.*;
import java.time.DayOfWeek;
import java.time.format.TextStyle;

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

        DayOfWeek dayWeek = DayOfWeek.from(LocalDate.now());

        
        
        System.out.println("Olá, " + nome + ". Hoje é " + dayWeek.getDisplayName(TextStyle.FULL, brasil) + ", Bom dia");
        
        
        System.out.println("Olá, " + nome + ". Hoje é " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) + ", Bom dia");


        
        //Modo 1
        LocalDate dia = LocalDate.of(2099, Month.JANUARY, 25);
        System.out.println(dia);

        //Modo 2
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = dia.format(formatador);
        System.out.println(valorFormatado);

        //Modo 3
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String valorFormatado2 = dia.format(formatador2);
        System.out.println(valorFormatado2);

        //Modo 4
        DateTimeFormatter mes = DateTimeFormatter.ofPattern("MMMM");
        String Vmes = dia.format(mes);
        System.out.println("Dia " + dia.getDayOfMonth() + " de " + Vmes + " de " + dia.getYear()); 


        
        // Initializing a DayOfWeek instance
        DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;
  
        // Get textual representation of the
        // day-of-week in FULL style
        String full_name
            = dayOfWeek
                  .getDisplayName(TextStyle.FULL,
                                  brasil);
  
        // Get textual representation of the
        // day-of-week in SHORT style
        // String short_name
        //     = dayOfWeek
        //           .getDisplayName(TextStyle.SHORT,
        //                           Locale.getDefault());
  
        // Get textual representation of the
        // day-of-week in NARROW style
        // String narrow_name
        //     = dayOfWeek
        //           .getDisplayName(TextStyle.NARROW,
        //                           Locale.getDefault());
  
        // Printing the textual names of the day-of-week
        System.out.println(full_name);
  
        // System.out.println(short_name);
  
        // System.out.println(narrow_name);
        
    }
}
```
