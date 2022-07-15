import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineMethodsTest {

    Feline feline = new Feline();

    @Test
    public void FelineGetKittensTest(){
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void FelineGetFamilyTest(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void FelineEatMeatTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
