import static org.junit.Assert.*;

import org.junit.Test;

import com.blackboard.HorizontalLine;
import com.blackboard.Line;


public class LineTests {
	
	@Test
	public void lengthTest() {
		Line line = new HorizontalLine();
		line.setLength(4);
		assertEquals("====", line.toString());
	}
	
	@Test
	public void evenSplit() {
		Line line = new HorizontalLine();
		line.setLength(4);
		line.split(2);
		assertEquals("== ==", line.toString());
	}
	
	@Test
	public void oddSplit() {
		Line line = new HorizontalLine();
		line.setLength(5);
		line.split(2);
		assertEquals("== ===", line.toString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void morePiecesThanLineComponents() {
		Line line = new HorizontalLine();
		line.setLength(5);
		line.split(10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void zeroLengthString() {
		Line line = new HorizontalLine();
		line.setLength(0);
		line.split(10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void zeroPieces() {
		Line line = new HorizontalLine();
		line.setLength(10);
		line.split(0);
	}
}
