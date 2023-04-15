package com.example.curdoperation.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("get")
    public List<BankData> getAllDetail()
    {
        BankData b1= new BankData(123,"ICICI","Pune");
        BankData b2= new BankData(134,"HDFC","Pune");
        BankData b3= new BankData(112,"Kotak","Pune");
        BankData b4= new BankData(133,"BOM","Pune");
        BankData b5= new BankData(143,"SBI","Pune");

        List<BankData> list= new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }

    @GetMapping("get/{id}")
    public BankData getElementbyId(@PathVariable int id)
    {
        BankData b1= new BankData(123,"ICICI","Pune");
        BankData b2= new BankData(134,"HDFC","Pune");
        BankData b3= new BankData(112,"Kotak","Pune");
        BankData b4= new BankData(133,"BOM","Pune");
        BankData b5= new BankData(143,"SBI","Pune");

        List<BankData> list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        BankData res= null;
        for(BankData b : list)
        {
            if (b.getBankid()==id)
                res = b;
        }
        return res;
    }

    @PostMapping("Newuser")
    public BankData createBankDetail(@RequestBody BankData bank)
    {
        BankData b = new BankData();
        b.setBankid(bank.getBankid());
        b.setName(bank.getName());
        b.setLocation(bank.getLocation());
        return b;
    }

    @PutMapping("update/{id}")
    public List<BankData> udateDatabyId(@PathVariable int id,@RequestBody BankData bank)
    {
        BankData b1= new BankData(123,"ICICI","Pune");
        BankData b2= new BankData(134,"HDFC","Pune");
        BankData b3= new BankData(112,"Kotak","Pune");
        BankData b4= new BankData(133,"BOM","Pune");
        BankData b5= new BankData(143,"SBI","Pune");

        List<BankData> list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        for(BankData b:list)
        {
            if (b.getBankid()==id)
            {
                b.setBankid(bank.getBankid());
                b.setName(bank.getName());
                b.setLocation(bank.getLocation());
            }
        }
       return list;
    }

    @DeleteMapping("delete/{id}")
    public List<BankData> deleteById(@PathVariable int id)
    {
        BankData b1 = new BankData(123, "ICICI", "Pune");
        BankData b2 = new BankData(134, "HDFC", "Pune");
        BankData b3 = new BankData(112, "Kotak", "Pune");
        BankData b4 = new BankData(133, "BOM", "Pune");
        BankData b5 = new BankData(143, "SBI", "Pune");

        List<BankData> list = new ArrayList();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        List<BankData> list1 = new ArrayList();

        for (BankData b : list) {
            if (b.getBankid() == id) {

            } else {
                list1.add(b);
            }
        }
        System.out.println("deleted successfully");
        return list1;

    }
}
