import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoTest {
    @Test
    void firstMono() {
        Mono.just("B");
    }

    @Test
    void monoWithConsumer() {
        Mono.just("A").log().subscribe(s -> System.out.println(s));
    }

}
