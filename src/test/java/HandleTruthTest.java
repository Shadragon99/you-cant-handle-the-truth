import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HandleTruthTest {

    HashMap ans = HandleTruth.wordCount();

    @Test
    public void makeshiftTest() {

        //HandleTruth.wordCount();

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
    @Test
    public void makeshiftTest1() {
        //Test 2
        System.out.println("Assert 'hello' should NOT be present in HashMap");
        System.out.println("Is 'hello' present?");
        System.out.print("Answer : " + ans.containsKey("hello"));
        System.out.println();
    }

    @Test
    public void makeshiftTest2() {
        //Test 3
        System.out.println("Assert 'you' should be present in HashMap 18 times");
        System.out.println("Is 'you' counted 18 times?");
        System.out.print("Answer : (you , " + ans.get("you") + ") " + ans.containsKey("you"));
        System.out.println();
    }

    @Test
    public void makeshiftTest3() {
        //Test 4
        System.out.println("Assert 'lives' should be present in HashMap 2 times");
        System.out.println("Is 'lives' counted 2 times?");
        System.out.print("Answer : (lives , " + ans.get("lives") + ") " + ans.containsKey("lives"));
        System.out.println();
    }
}