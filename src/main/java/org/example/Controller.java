package org.example;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    final View view;
    final Model model;

    public Controller(View view, Model model){

        this.view = view;
        this.model = model;
    }

    public String inputWordWithScanner(){
        while (!sc.hasNext()){
            sc.next();
        }
        return sc.next();
    }

    public void run(){
        view.messageOnStart();

        while (model.current_word_index<model.valid_words.length) {
            String word = inputWordWithScanner();

            if (model.isValidWord(word)){
                if (!model.nextWord()) {
                    break;
                }
                view.messageInputNextWord();

            } else {
                view.messageWrongInput();

            }
        }

        view.messagePhraseCompleted();
        model.printPhrase();
    }

}
