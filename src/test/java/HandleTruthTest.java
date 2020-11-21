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

        System.out.println("Assert 'you' should be present in HashMap");
        System.out.println("Is 'you' present?");
        System.out.print("Answer : " + ans.containsKey("you"));



    }
}