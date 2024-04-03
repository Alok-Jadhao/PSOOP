package Abstraction.Interfaces;

/*
Write a java program to create an interface searchable with a method search() that searches for a given word in a text document.
Create two classes Document and webpage that implements the searchable interface and provide their own implementations
of the search() method , one searches a string and other a number.
 */

interface Searchable {
    boolean search();
}

class Document implements Searchable {

    @Override
    public boolean search() {

    }
}

class WebPage implements Searchable {

    @Override
    public boolean search() {

    }
}

public class Search {
    public static void main(String[] args) {

    }
}