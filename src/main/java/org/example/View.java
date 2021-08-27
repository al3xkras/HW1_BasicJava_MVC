package org.example;

public class View {
    public static final String MESSAGE_ON_START =
            "Input words to create phrase \"Hello world!\"\nInput word:";
    public static final String MESSAGE_WRONG_INPUT =
            "Wrong input! Try again.";
    public static final String MESSAGE_INPUT_NEXT_WORD =
            "Great! Now input next word:";
    public static final String MESSAGE_PHRASE_COMPLETED =
            "Phrase completed:";

    public static void messageOnStart(){
        System.out.println(MESSAGE_ON_START);
    }

    public static void messageWrongInput(){
        System.out.println(MESSAGE_WRONG_INPUT);
    }

    public static void messageInputNextWord(){
        System.out.println(MESSAGE_INPUT_NEXT_WORD);
    }

    public static void messagePhraseCompleted(){
        System.out.println(MESSAGE_PHRASE_COMPLETED);
    }

}
