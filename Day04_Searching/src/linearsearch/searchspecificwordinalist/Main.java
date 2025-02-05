package linearsearch.searchspecificwordinalist;

import linearsearch.searchfirstnegativenumber.LinearSearchNegative;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a powerful programming language.",
                "Artificial Intelligence is the future.",
                "Data Structures and Algorithms are important."
        };

        String word = "Java";
        LinearSearchWord lsn = new LinearSearchWord();
        String result = lsn.findSentenceWithWord(sentences, word);

        System.out.println("Sentence containing the word: " + result);
    }
    }

