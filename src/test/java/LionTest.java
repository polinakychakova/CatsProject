import com.example.Lion;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    @Test
    public void LionGetKittensTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void LionCatchExceptionConstructorTest() throws Exception {

        Exception exc = new Exception("Используйте допустимые значения пола животного - самец или самка");
        String sex = "";
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(sex);
        }, "Exception was expected");

        Assertions.assertEquals(exc.getMessage(), thrown.getMessage());

    }

    @Test
    public void LionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
