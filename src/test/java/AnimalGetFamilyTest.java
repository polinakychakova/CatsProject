import com.example.Animal;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class AnimalGetFamilyTest {
    @Mock
    Animal animal = new Animal();

    @Test
    public void getFamilyTest()
    {
        String actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }
}

