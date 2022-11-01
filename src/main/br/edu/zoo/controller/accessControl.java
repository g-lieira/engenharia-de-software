package src.main.br.edu.zoo.controller;

import src.main.br.edu.zoo.model.access;
import src.main.br.edu.zoo.model.category;
import src.main.br.edu.zoo.model.person;
import src.main.br.edu.zoo.model.sector;

import java.util.ArrayList;
import java.util.List;



public class accessControl {
    private List<access> accessList = new ArrayList<access>();

    public accessControl (List<access> accessList){
        this.accessList = accessList;
    }

    public boolean registerAccess(sector Sector, category Category, person Person){
        if ((Category == null) || (Sector == null) || (Person == null)) {
            System.out.println("Erro de cadastro!");
            return false;
        }
        access Access = consultAccess(Sector, Category);
        if (Access == null) {
            Access = new access(Sector, Category);
        }
        Access.addPerson(Person);
        this.accessList.add(Access);
        return true;
    }

    public boolean updateAccess(sector Sector, category Category, person Person){
        if ((Category == null) || (Sector == null) || (Person == null)) {
            System.out.println("Erro de atualizacao!");
            return false;
        }
        access acessoVerificado = consultAccess(Sector, Category);
        if (acessoVerificado == null){
            System.out.println("Nao existe esse Acesso");
            return false;
        }
        if(acessoVerificado.getPersonList().contains(Person)){
            acessoVerificado.getPersonList().remove(Person);
            return true;
        }

        return registerAccess(Sector, Category, Person);
    }

    public access consultAccess(sector Sector, category Category){
        return this.accessList.stream()
                .filter(access -> access. getCategory().equals(Category) && access.getSector().equals(Sector))
                .findFirst()
                .orElse(null);
    }

    public int quantidadeAcessoCriado(){
        return accessList.size();
    }
}
