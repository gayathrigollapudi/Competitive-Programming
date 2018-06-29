import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class FindRotationPoint {

    public static int findRotationPoint(String[] words) {

        // find the rotation point in the array
        int n=words.length-1;
        int i,l=0,h=n,mid;
        /*if(words[mid].compareTo(words[mid+1]) >1) {
            i=mid;
        }
        else i=0;*/
        while(l<h){
            mid=l+(h-l)/2;
            if(words[mid].compareTo(words[mid+1]) >1) return mid+1;
            else if(words[mid-1].compareTo(words[mid]) >1) return mid;
            else if(words[l].compareTo(words[mid])>1) h=mid-1;
            else l=mid+1;
        }

        return 0;
    }


















    // tests

    @Test
    public void smallArrayTest() {
        final int actual = findRotationPoint(new String[] {"cape", "cake"});
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void mediumArrayTest() {
        final int actual = findRotationPoint(new String[] {"grape", "orange", "plum",
            "radish", "apple"});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void largeArrayTest() {
        final int actual = findRotationPoint(
            new String[] {"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
            "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"});
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void possiblyMissingEdgeCaseTest() {
        // are we missing any edge cases?
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}