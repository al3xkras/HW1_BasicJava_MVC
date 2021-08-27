package org.example;



public class Model {

    public String[] valid_words = new String[]{"Hello","world!"};
    public int current_word_index = 0;

    public boolean isValidWord(String word){
        if (word==null){
            return false;
        }
        return valid_words[current_word_index].equals(word);
    }

    public boolean nextWord(){
        if (current_word_index+1<valid_words.length){
            current_word_index += 1;
            return true;
        }
        return false;
    }

    public String createPhrase(){
        if (valid_words==null || valid_words.length==0){
            return "";
        }
        return "   "+String.join(" ", valid_words);
    }

    public void printPhrase(){
        System.out.println(createPhrase());
    }



}
