import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;
import java.util.*;

public class InflightEntertainment {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        // determine if two movies add up to the flight length
        int n=movieLengths.length;
        HashMap<Integer,Integer> hm=new HashMap();
        //int i=0,j=n-1;
        if(n<=1)return false;
        /*Arrays.sort(movieLengths);
        while(i<j){
            if(movieLengths[i]+movieLengths[j]==flightLength) return true;
            else if(movieLengths[i]+movieLengths[j]>flightLength) j--;
            else i++;
        }*/
        for(int i=0;i<n;i++){
            int k=flightLength-movieLengths[i];
            if(hm.containsKey(k)) return true;
            else hm.put(movieLengths[i],1);
        }
        return false;
    }


















    // tests

    @Test
    public void shortFlightTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {2, 4}, 1);
        assertFalse(result);
    }

    @Test
    public void longFlightTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {2, 4}, 6);
        assertTrue(result);
    }

    @Test
    public void onlyOneMovieHalfFlightLenghtTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {3, 8}, 6);
        assertFalse(result);
    }

    @Test
    public void twoMoviesHalfFlightLengthTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {3, 8, 3}, 6);
        assertTrue(result);
    }

    @Test
    public void lotsOfPossiblePairsTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {1, 2, 3, 4, 5, 6}, 7);
        assertTrue(result);
    }

    @Test
    public void oneMovieTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {6}, 6);
        assertFalse(result);
    }

    @Test
    public void noMoviesTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {}, 6);
        assertFalse(result);
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