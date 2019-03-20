package com.example.prince.hsam9;

public class Item {
    private String Name;
    private int image;

    public Item(String animalName, int image) {
        this.Name = animalName;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

//    public void setAnimalName(String animalName) {
//        this.animalName = animalName;
//    }

    public int getImage() {
        return image;
    }

//    public void setImage(int image) {
//        this.image = image;
//    }
}
