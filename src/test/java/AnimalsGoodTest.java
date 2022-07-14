import com.example.Animal;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalsGoodTest {
    private final String animalKind;
    private final List<String> expected;

    public AnimalsGoodTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }
    @Mock
    Animal animal;
    @Parameterized.Parameters //для произведения
    public static Object[] getKindData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }
}
