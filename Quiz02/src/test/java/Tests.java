import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
public class Tests {
	
	private Hotel hotel;
	
	@Before
	public void setup() {
		hotel = new Hotel();
	}
	
	@Test
	public void testCount() {
		int expectedResult = 0;
		int actualResult = hotel.getRoomCount();
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void testCount2() {
		hotel.addRooms(); //adding first room
		int expectedResult = 1;
		int actualResult = hotel.getRoomCount();
		//assert
		Assert.assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void testBook() {
		hotel.bookRoom("Shayan"); //adding first room
		String expectedResult = "Shayan";
		String actualResult = hotel.searchGuest(0);	//first index booked by Shayan
		//assert
		Assert.assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void testBook2() {
		hotel.bookRoom("Asad"); //adding first room
		String expectedResult = "Asad";
		String actualResult = hotel.searchGuest(1);	//second index booked by Asad
		//assert
		Assert.assertEquals(expectedResult, actualResult);
		
	}

	
	@Test
	public void testBook3() {
		hotel.bookRoom("Mark"); //adding first room
		String expectedResult = "Mark";
		String actualResult = hotel.searchGuest(2);	//third index booked by Mark
		//assert
		Assert.assertEquals(expectedResult, actualResult);
		
	}
}
