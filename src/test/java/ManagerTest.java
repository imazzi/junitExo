import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito;

public class ManagerTest {
    Manager manager;
    CalculService calculService;
    @Before
    public void setUp() throws Exception {
        this.manager = new Manager();
        this.calculService = Mockito.mock(CalculService.class);
    }

    @After
    public void tearDown() throws Exception {
        this.manager = null;
        this.calculService = null;
    }

    @Test
    public void testCalculAchat() {
        assertEquals(20, manager.calculAchat(10,1));
        assertEquals(1, manager.calculAchat(0,1));
        assertEquals(0, manager.calculAchat(0,0));
    }

    @Test
    public void testAction(){
        assertEquals(1, manager.action(1,0));
    }

    @Test(expected = ArithmeticException.class)
    public void testActionTrowException(){
        manager.action(0,1);
    }

    @Test
    public void testCalculAchatSold(){
        when(calculService.solde(80,30)).thenReturn(56);
        assertEquals(56, calculService.solde(80,30));
    }
}