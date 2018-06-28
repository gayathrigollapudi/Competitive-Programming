import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class MillionGazillion {

    // implement a trie and use it to efficiently store string
    static final int ALPHABET_SIZE = 26;

    static class Trie {
        
        Trie[] children = new Trie[ALPHABET_SIZE];
      
        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;
         
        Trie(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
        
        static Trie root=new Trie();
        public boolean addWord(String word) {
            if(!search(word)) {
                insert(word);
                return true;
            }
            return false;
        }
        static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;
      
        Trie pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new Trie();
      
            pCrawl = pCrawl.children[index];
        }
      
        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        Trie pCrawl = root;
      
        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
      
            if (pCrawl.children[index] == null)
                return false;
      
            pCrawl = pCrawl.children[index];
        }
      
        return (pCrawl != null && pCrawl.isEndOfWord);
    }

    }

    













    // tests

    @Test
    public void trieTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("catch");
        assertTrue(result);

        result = trie.addWord("cakes");
        assertTrue(result);

        result = trie.addWord("cake");
        assertTrue(result);

        result = trie.addWord("cake");
        assertFalse(result);

        result = trie.addWord("caked");
        assertTrue(result);

        result = trie.addWord("catch");
        assertFalse(result);

        result = trie.addWord("");
        assertTrue(result);

        result = trie.addWord("");
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