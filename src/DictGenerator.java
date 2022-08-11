import java.util.List;

@FunctionalInterface
public interface DictGenerator {
    List<String> generate(String s);
}
