package com.example.pattern.client;

import com.example.pattern.enums.MaterialType;
import com.example.pattern.factory.FurnitureFactory;
import com.example.pattern.models.IChair;
import com.example.pattern.models.ITable;

public class Client {
    public static void main(String[] args) {
        IChair plasticChair = new FurnitureFactory()
                .getFactory(MaterialType.PLASTIC)
                .createChair();
        plasticChair.get();

        IChair woodenChair = new FurnitureFactory()
                .getFactory(MaterialType.WOODEN)
                .createChair();
        woodenChair.get();

        ITable plasticTable = new FurnitureFactory()
                .getFactory(MaterialType.PLASTIC)
                .createTable();
        plasticTable.get();

        ITable woodenTable = new FurnitureFactory()
                .getFactory(MaterialType.WOODEN)
                .createTable();
        woodenTable.get();
    }
}
