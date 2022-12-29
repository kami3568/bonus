
import org.junit.Test;
import ru.netology.service.CashbackHackService;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

}
