package com.example.pattern.factory;

import com.example.pattern.models.IChair;
import com.example.pattern.models.ITable;
import com.example.pattern.models.PlasticChair;
import com.example.pattern.models.PlasticTable;

public class PlasticFurnitureFactory extends FurnitureAbstractFactory{
    @Override
    public ITable createTable() {
        return new PlasticTable();
    }

    @Override
    public IChair createChair() {
        return new PlasticChair();
    }
}
