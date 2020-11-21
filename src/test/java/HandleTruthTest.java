import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {

        HashMap ans = HandleTruth.wordCount();
        //HandleTruth.wordCount();
        //System.out.println("Here is answer: " + ans);

        //Test 1
        System.out.println("Assert 'you' should be present in HashMap");
        System.out.println("Is 'you' present?");
        System.out.print("Answer : " + ans.containsKey("you"));
        System.out.println();

        //Test 2
        System.out.println("Assert 'hello' should NOT be present in HashMap");
        System.out.println("Is 'hello' present?");
        System.out.print("Answer : " + ans.containsKey("hello"));
        System.out.println();

        //Test 3
        System.out.println("Assert 'you' should be present in HashMap");
        System.out.println("Is 'you' present?");
        System.out.print("Answer : " + ans.containsKey("you"));



    }
}