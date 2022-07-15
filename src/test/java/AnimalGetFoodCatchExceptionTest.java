import com.example.Animal;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;


@RunWith(Parameterized.class)
public class AnimalGetFoodCatchExceptionTest {
    final static String wrongVar = "Покемон";
    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodCatchExceptionTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters //для произведения
    public static Object[] getKindData() {
        return new Object[][]{
                { wrongVar, List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник")}
        };
    }



    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        Exception exc = new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            animal.getFood(animalKind);
        }, "Exception was expected");

        Assertions.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
    }


}