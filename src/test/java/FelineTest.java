import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void FelineGetKittensTest(){
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void FelineGetFamilyTest(){
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
