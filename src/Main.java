import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream()
//                .forEach(System.out::println);
/*        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

//        numerosAleatorios.forEach(System.out::println);

/*        System.out.println("pegue os 5 últimos primeiros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/


//        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros: ");
//        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());
        
        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })*/

//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .toList()
//                .forEach(System.out::println);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .toList()
                .forEach(System.out::println);
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer i) {
//                        if (i % 2 == 0 && i > 2) return true;
//                        return false;
//                    }
//                }).collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios1.stream()
//                .average()
//                .ifPresent(System.out::println);
/*
        numerosAleatorios.stream()
                        .mapToInt(new ToIntFunction<String>() {
                            @Override
                            public int applyAsInt(String s) {
                                return Integer.parseInt(s);
                            }
                        });
*/

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os valores impares: ");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer % 2 !=0) return true;
//                return false;
//            }
//        });

        numerosAleatoriosInteger.removeIf(i -> (i % 2 !=0));
        System.out.println(numerosAleatoriosInteger);
    }
}