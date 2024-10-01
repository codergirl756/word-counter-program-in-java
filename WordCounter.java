// calculate the number of words from the given sentence..

public class WordCounter {
    static int countWords(String sentence) {
        
        int count = 1;

        for (int i = 0; i < sentence.length(); ++i) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "Programming is fun and challenging";
        System.out.println("Number of words: " + countWords(sentence));
    }
}

   
    
        
