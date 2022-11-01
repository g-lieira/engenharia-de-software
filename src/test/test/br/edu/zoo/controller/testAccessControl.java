package src.test.test.br.edu.zoo.controller;

import src.main.br.edu.zoo.controller.accessControl;
import src.main.br.edu.zoo.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class testAccessControl {
    private accessControl accessControl;


    @Before
    public void before(){
        accessControl = new accessControl(new ArrayList<>());
    }

    @Test
    public void test_registerAccessComplete_success(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = new manager();

        //Quando
        boolean resultado = accessControl.registerAccess(Sector, Category, Person);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_registerAccessNoSector_failure(){
        //Dado
        sector Sector = null;
        category Category = category.CADASTRO;
        person Person = new manager();

        //Quando
        boolean resultado = accessControl.registerAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);

    }

    @Test
    public void test_registerAccessNoCategory_failure(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = null;
        person Person = new manager();

        //Quando
        boolean resultado = accessControl.registerAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_registerAccessNoPerson_failure(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = null;

        //Quando
        boolean resultado = accessControl.registerAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_updateAccessRemovingAccess_success(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = new manager();
        access Access = new access(Sector, Category, new ArrayList<>(Arrays.asList(Person)));
        accessControl  = new accessControl(new ArrayList<>(Arrays.asList(Access)));

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_updateAccessAddingAccess_success(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = new manager();
        access Access = new access(Sector, Category);
        accessControl  = new accessControl(new ArrayList<>(Arrays.asList(Access)));

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertTrue(resultado);
    }

    @Test
    public void test_updateAccessNoAccess_success(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = new manager();

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_updateAccessNoSector_failure(){
        //Dado
        sector Sector = null;
        category Category = category.CADASTRO;
        person Person = new manager();
        access Access = new access(Sector, Category, new ArrayList<>(Arrays.asList(Person)));
        accessControl  = new accessControl(new ArrayList<>(Arrays.asList(Access)));

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_updateAccessNoCategory_failure(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = null;
        person Person = new manager();
        access Access = new access(Sector, Category, new ArrayList<>(Arrays.asList(Person)));
        accessControl  = new accessControl(new ArrayList<>(Arrays.asList(Access)));

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

    @Test
    public void test_updateAccessNoPerson_failure(){
        //Dado
        sector Sector = sector.RECEPCIONISTA;
        category Category = category.CADASTRO;
        person Person = null;
        access Access = new access(Sector, Category, new ArrayList<>(Arrays.asList(Person)));
        accessControl = new accessControl(new ArrayList<>(Arrays.asList(Access)));

        //Quando
        boolean resultado = accessControl.updateAccess(Sector, Category, Person);

        //Entao
        Assert.assertFalse(resultado);
    }

}
