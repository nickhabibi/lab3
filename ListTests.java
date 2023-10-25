import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


class StrCheck implements StringChecker {
    public boolean checkString(String s) {
        return true;
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("b");
        input1.add("c");
        List<String> expected1 = new ArrayList<String>();
        expected1.add("a");
        expected1.add("b");
        expected1.add("c");

        StringChecker sc = new StrCheck();
        

        assertArrayEquals(expected1.toArray(),ListExamples.filter(input1, sc).toArray());
    }

    @Test
    public void testMerge() {
        List<String> input1A = new ArrayList<String>();
        input1A.add("a");
        input1A.add("c");
        List<String> input1B = new ArrayList<String>();
        input1B.add("b");
        input1B.add("d");
        List<String> expected1 = new ArrayList<String>();
        expected1.add("a");
        expected1.add("b");
        expected1.add("c");
        expected1.add("d");
        
        

        assertArrayEquals(expected1.toArray(),ListExamples.merge(input1A, input1B).toArray());
    }
}


