import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void CatGetSoundTest() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void CatGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба" ), cat.getFood());
    }

}
