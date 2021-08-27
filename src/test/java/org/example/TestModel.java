package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestModel {

    Model model;

    @Before
    public void createModel(){
        model = new Model();
    }

    @Test
    public void testIsValidWord1(){
        Assert.assertTrue(model.isValidWord("Hello"));
    }

    @Test
    public void testIsValidWord2(){
        Assert.assertFalse(model.isValidWord("world!"));
    }

    @Test
    public void testIsValidWord3(){
        model.current_word_index++;
        Assert.assertTrue(model.isValidWord("world!"));
    }

    @Test
    public void testIsValidWord4(){
        Assert.assertFalse(model.isValidWord("abc"));
    }

    @Test
    public void testIsValidWord5(){
        Assert.assertFalse(model.isValidWord(null));
    }

    @Test
    public void testNextWord1(){
        Assert.assertTrue(model.nextWord());
    }

    @Test
    public void testNextWord2(){
        model.current_word_index++;
        Assert.assertFalse(model.nextWord());
    }

    @Test
    public void testCreatePhrase1(){
        Assert.assertEquals(model.createPhrase(),"   "+"Hello world!");
    }

    @Test
    public void testCreatePhrase2(){
        model.valid_words = new String[]{};
        Assert.assertEquals(model.createPhrase(),"");
    }

    @Test
    public void testCreatePhrase3(){
        model.valid_words = null;
        Assert.assertEquals(model.createPhrase(),"");
    }

}
