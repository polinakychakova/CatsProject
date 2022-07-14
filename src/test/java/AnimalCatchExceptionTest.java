import com.example.Animal;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;


@RunWith(Parameterized.class)
public class AnimalCatchExceptionTest {
    final static String wrongVar = "Покемон";
    private final String animalKind;
    private final List<String> expected;

    public AnimalCatchExceptionTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }
    @Mock
    Animal animal;
    @Parameterized.Parameters //для произведения
    public static Object[] getKindData() {
        return new Object[][]{
                { wrongVar, List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")}
        };
    }



    @Test
    public void getFoodTest() throws Exception {
        Exception exc = new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            animal.getFood(animalKind);
        }, "Exception was expected");

        Assertions.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
    }


}