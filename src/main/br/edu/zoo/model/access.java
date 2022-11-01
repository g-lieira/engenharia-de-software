package src.main.br.edu.zoo.model;

import java.util.ArrayList;
import java.util.List;

public class access {
    private sector Sector;
    private category Category;
    private List<person> personList = new ArrayList<person>();

    public access (sector Sector, category Category){
        this.Sector = Sector;
        this.Category = Category;
    }

    public access (sector Sector, category Category, List<person> personList){
        this.Sector = Sector;
        this.Category = Category;
        this.personList = personList;
    }

    public void addPerson(person Person){
        this.personList.add(Person);
    }

    public void removePerson(person Person){
        this.personList.remove(Person);
    }

    public category getCategory() {
        return Category;
    }

    public sector getSector() {
        return Sector;
    }

    public List<person> getPersonList() {
        return personList;
    }

    public void setCategory(category Category) {
        this.Category = Category;
    }

    public void setSector(sector Sector) {
        this.Sector = Sector;
    }

    public void setPersonList(List<person> personList) {
        this.personList = personList;
    }


}
