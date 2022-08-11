import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Исходный текст аборигенов
        String line = "asfsd gsdfg sdfg sdf gs asfasdags esergaertwae fase fas d";

        // Детерменированная функция. Результат зависит только от входных параметров и нет
        // Нет побочных эффектов. Исходный объект не изменяется
        DictGenerator generator = (s) -> Arrays.stream(s.split(" ")).sorted().collect(Collectors.toList());


        System.out.println(generator.generate(line));
        System.out.println(line);
    }
}
