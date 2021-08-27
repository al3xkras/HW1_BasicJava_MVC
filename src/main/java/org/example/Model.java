package org.example;



public class Model {

    public final String[] valid_words = new String[]{"Hello","world!"};
    public int current_word_index = 0;

    public boolean isValidWord(String word){
        return valid_words[current_word_index].equals(word);
    }

    public boolean nextWord(){
        if (current_word_index+1<valid_words.length){
            current_word_index += 1;
            return true;
        }
        return false;
    }

    public void printPhrase(){
        System.out.println("   "+String.join(" ", valid_words));
    }



}
