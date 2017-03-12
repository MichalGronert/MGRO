package training.Task1;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.Character.isLetter;

/**
 * Created by MGRO on 2017-03-12.
 */
public class Task1 {

    private static List<String> myList
            = Arrays.asList("Ala", "Marcin", "Kuba", "Łukasz", "stefan", "", "andrzej", "imieZKropka.", "imieZ,Przecinkiem");

    public static void main(String[] args) {
//Zadanie 2 - wyswietlenie pierwszych 3 imion DONE
//        List<Object> zad2 = myList.stream()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(zad2);
        System.out.println(myList.toString());

        Predicate<String> stringPredicate = e -> Character.isLetter(myList);

        List<String> czyLitera = filter(myList, stringPredicate);

        System.out.println(czyLitera);
    }
        private static List<String> filter(List<String> list,
                Predicate<String> stringPredicate) {
            List<String> out = new ArrayList<>();
            for (String element : list){
                if (stringPredicate.test(element)){
                    out.add(element);
                }
            }
            return out;
    }
}
 /*TODO napisac swoje predykaty dla listy
        - filtrowanie czy same litery
        - wyswietlenie pierwszych 3 imion DONE
        - wyswietlenie najkrotszego imienia (niepustego)
        - wyswietlenie najdluzszego imienia
        - dodanie znaków na końcu imienia
        - dodanie znaków na poczatku
        - zamiana wszystkich liter na duze litery
        - wyswietlenie imion ktore zawieraja w sobie litere 'a'

        UWAGA szablon może zawierać błędy; nie musicice trzymać się struktury szablonu, możecie dopisywać swoje metody, klasy
        lub modyfikować istniejące, liczy się wykonania zadania z wykorzystaniem konstrukcji z Java 8
        */