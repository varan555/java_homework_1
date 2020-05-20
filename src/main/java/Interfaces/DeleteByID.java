package Interfaces;

import sweet.Sweetness;

import java.util.ArrayList;

@FunctionalInterface
public interface DeleteByID {

    public void deleteByID(ArrayList<Sweetness> list, int id);
}
