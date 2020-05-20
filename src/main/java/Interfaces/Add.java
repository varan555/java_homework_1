package Interfaces;

import sweet.Sweetness;

import java.util.ArrayList;

@FunctionalInterface
public interface Add {
    public void add(ArrayList<Sweetness> list, Sweetness sweet);
}
