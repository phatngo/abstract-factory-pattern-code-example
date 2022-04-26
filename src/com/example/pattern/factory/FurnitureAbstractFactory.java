package com.example.pattern.factory;

import com.example.pattern.models.IChair;
import com.example.pattern.models.ITable;

public abstract class FurnitureAbstractFactory {
    public abstract ITable createTable();
    public abstract IChair createChair();
}
