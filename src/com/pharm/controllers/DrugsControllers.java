package com.pharm.controllers;
import com.pharm.models.Drugs;
import java.util.ArrayList;
import java.util.Scanner;
public class DrugsControllers {
    Drugs drugs;
    Scanner scan; 
    ArrayList<Drugs> drugsArrayList = new ArrayList<Drugs>();

    public DrugsControllers(){
        scan = new Scanner(System.in);
        drugs = new Drugs();
    }

    public void addDrugs(){
        int id = drugsArrayList.size() + 1;
        drugs.setId(id);
        System.out.println("Name drug");
        drugs.setNameDrugString(scan.next());
        System.out.println("description :");
        drugs.setDescString(scan.next());
        System.out.println("price : ");
        drugs.setPrice(scan.nextFloat());
        drugsArrayList.add(drugs);
        System.out.println("Drug added successfuly with id " +id);
    }
    public void updateDrugs(){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(drugsArrayList);
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("please choose an id to update it");
            int idUpdate = scan.nextInt();
            System.out.println("Name drug");
            drugs.setNameDrugString(scan.next());
            System.out.println("description :");
            drugs.setDescString(scan.next());
            System.out.println("price : ");
            drugs.setPrice(scan.nextFloat());
            drugsArrayList.set(idUpdate - 1, drugs);
            System.out.println("Drug updated successfuly");
    }
    public void selectAllDrugs(){
        System.out.println(drugsArrayList);
    }
    public void searchDrugsById(){
        System.out.println("Please put the id of drug");
        int searchDr = scan.nextInt();
        System.out.println(drugsArrayList.get(searchDr - 1));
    }
    public void deleteDrugs(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(drugsArrayList);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Please put the id to remove a drug");
        int removeDr = scan.nextInt();
        drugsArrayList.remove(removeDr - 1);
        System.out.println("Drug removed successfuly !");
    }
}
