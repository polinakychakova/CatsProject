import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionMethodsTest {

    @Mock
    Feline feline ;
//    Feline feline = new Feline();

    @Test
    public void LionGetKittensTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void LionCatchExceptionConstructorTest() throws Exception {

        String sex = "";
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(sex);
        }, "Exception was expected");

        assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());

    }

    @Test
    public void LionGetFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
