package service;

import model.cat;
import model.dog;
import model.hamster;

import java.util.*;

public class DataPets <pet>{
    List<pet> listPets = new ArrayList<pet>();
    public List<pet> getAllPets (){
        return listPets;
    }

    public void addPet(pet pet){
        listPets.add(pet);
    }
    public List<pet> getCats(){
        return listPets.stream().filter(x -> x instanceof cat).toList();
    }
    public List<pet> getDogs (){
        return listPets.stream().filter(x -> x instanceof dog).toList();
    }
    public List<pet> getHamsters (){
        return listPets.stream().filter(x -> x instanceof hamster).toList();
    }
    public cat findCat(String name) {
        List<cat> cats = (List<cat>) this.getCats();
        cat cat = null;
        for (cat c : cats) {
            if (c.getName().equals(name)) {
                cat = c;
            }
        }
        return cat;
    }
    public dog findDog(String name){
        List<dog> dogs = (List<dog>) this.getDogs();
        dog dog = null;
        for (dog d : dogs){
            if (d.getName().equals(name)){
                dog = d;
                break;
            }
        }
        return dog;
    }

    public hamster findHamster(String name){
        List<hamster> hamsters = (List<hamster>) this.getHamsters();
        hamster hamster = null;
        for (hamster h : hamsters){
            if (h.getName().equals(name)){
                hamster=h;
                break;
            }
        }
        return hamster;
    }
}