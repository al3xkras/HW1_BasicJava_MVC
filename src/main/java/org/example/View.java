package org.example;

public class View {
    final String MESSAGE_ON_START =
            "Input words to create phrase \"Hello world!\"\nInput word:";
    final String MESSAGE_WRONG_INPUT =
            "Wrong input! Try again.";
    final String MESSAGE_INPUT_NEXT_WORD =
            "Great! Now input next word:";
    final String MESSAGE_PHRASE_COMPLETED =
            "Phrase completed:";

    public void messageOnStart(){
        System.out.println(MESSAGE_ON_START);
    }

    public void messageWrongInput(){
        System.out.println(MESSAGE_WRONG_INPUT);
    }

    public void messageInputNextWord(){
        System.out.println(MESSAGE_INPUT_NEXT_WORD);
    }

    public void messagePhraseCompleted(){
        System.out.println(MESSAGE_PHRASE_COMPLETED);
    }

}
