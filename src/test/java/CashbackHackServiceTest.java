import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);


    }

}
