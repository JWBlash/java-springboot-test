package com.example.jblash.testing;

//Each piece of data in the NxN matrix will live in here, since each piece of data is a character.
public class CharNode implements Traversable {
    private char thing;
    private int x, y;

    public CharNode(char nodeChar) {
        this.thing = nodeChar;
    }

    @Override
    public boolean isTraversable() {
        return false;
    }
}
