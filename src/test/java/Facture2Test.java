import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Facture2Test {
	IFacture facture;

	@Before
	public void setUp() throws Exception {
		this.facture = (IFacture) Mockito.mock(IFacture.class);
	}

	@After
	public void tearDown() throws Exception {
		this.facture = null;
	}

	@Test
	public void testGetFrasiTransport() {
		Mockito.when(facture.getFraisTransport(400.0)).thenReturn(45.0);
		assertEquals(45.0, facture.getFraisTransport(400.0), 0.0);
	}

	@Test
	public void testGetMontantFacture() {
		Mockito.when(facture.getMontantFacture()).thenReturn(900.0);
		assertEquals(900.0, facture.getMontantFacture(), 0.0);
	}
}
