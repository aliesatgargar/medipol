import org.junit.*;



public class HesaplamaTest {

	@Test
	public void testToplaOndalikSayilar() {
		
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		
		Assert.assertEquals("142.80", sonuc);
	}

}
