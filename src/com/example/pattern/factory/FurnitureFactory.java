package com.example.pattern.factory;

import com.example.pattern.enums.MaterialType;

public class FurnitureFactory {
    public FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case PLASTIC:
                return new PlasticFurnitureFactory();
            case WOODEN :
                return new WoodenFurnitureFactory();
            default:
                return null;
        }
    }
}
