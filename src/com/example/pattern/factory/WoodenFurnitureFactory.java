package com.example.pattern.factory;

import com.example.pattern.models.*;

public class WoodenFurnitureFactory extends FurnitureAbstractFactory{
    @Override
    public ITable createTable() {
        return new WoodenTable();
    }

    @Override
    public IChair createChair() {
        return new WoodenChair();
    }
}
