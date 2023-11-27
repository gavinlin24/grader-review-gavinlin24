import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testMerge(){
    ArrayList<String> input1 = new ArrayList<String>();
    ArrayList<String> input2 = new ArrayList<String>();
    input1.add("a");
    input1.add("d");
    input2.add("b");
    input2.add("c");

    ArrayList<String> output = new ArrayList<String>();
    output.add("a");
    output.add("b");
    output.add("c");
    output.add("d");

    assertEquals(output, ListExamples.merge(input1, input2));
  }

  @Test
  public void testFilter(){
        ArrayList<String> input1 = new ArrayList<String>();
        input1.add("MOON");
        input1.add("sun");
       
        ListExamples.filter(input1, new IsMoon());

        ArrayList<String> output = new ArrayList<String>();
        output.add("MOON");

        assertEquals(output, input1);


  }
}
