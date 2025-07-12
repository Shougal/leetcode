package LeetCode75;//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
//Example 3:
//
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//        word1:  a   b   c   d
//word2:    p   q
//merged: a p b q c   d
//
//
//Constraints:
//
//        1 <= word1.length, word2.length <= 100
//word1 and word2 consist of lowercase English letters.

class String1768 {
    public static void main(String[] args) {
        System.out.println("starting class");
        String1768 test1768 = new String1768();
        String result = test1768.mergeAlternatively("abcd", "pqre");
        System.out.println(result);

    }
    public String mergeAlternatively(String word1, String word2) {
//        long startTime = System.nanoTime();
        int shortestLength;
        int remainingIndex;
        boolean isWord1Longer = false;
        /**
         * StringBuilder is optimal for string concatenation because it appends characters to an internal mutable
         * char[] buffer, avoiding the creation of a new immutable String object on each operation.
         */
        StringBuilder sb = new StringBuilder();

        if(word1.length()>word2.length()){
            shortestLength=word2.length();
            remainingIndex = word1.length()-word2.length();
            isWord1Longer = true;
        } else if (word2.length()> word1.length()) {
            shortestLength=word1.length();
            remainingIndex = word2.length()-word1.length();

        } else{
            shortestLength=word1.length();
            remainingIndex = 0;
        }
        for(int i=0; i<shortestLength; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(remainingIndex>0){
            if(isWord1Longer){
                sb.append(word1.substring(shortestLength));
            }
            else{
                sb.append(word2.substring(shortestLength));
            }

        }
        // O ms runtime
//        long endTime = System.nanoTime();
//        long duration = endTime - startTime; // Duration in nanoseconds
//        long millieDuration = duration/1000000;
//        System.out.println("Execution time: " + millieDuration + " millie seconds");
        return sb.toString();


    }


}

