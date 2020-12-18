package com.pharm.controllers;
import com.pharm.models.Pharmacien;
import java.util.ArrayList;
import java.util.Scanner;
public class PharmacienController {
    ArrayList<Pharmacien> pharmacienArrayList; 
    Scanner scan;
    Pharmacien pharm;
    public PharmacienController(){
        scan =  new Scanner(System.in);
        pharmacienArrayList = new ArrayList<Pharmacien>();
        pharm = new Pharmacien();
    }
    public void addPharmacien(){
       
        int idScanned = pharmacienArrayList.size() + 1;
        pharm.setId(idScanned);
        System.out.println("First Name");
        pharm.setFirstName(scan.nextLine());
        System.out.println("Last Name");
        pharm.setLastName(scan.nextLine());
        System.out.println("email");
        pharm.setEmail(scan.nextLine());
        System.out.println("phone number");
        pharm.setTelephone(scan.nextLine());
        pharmacienArrayList.add(pharm);
        System.out.println("phamarcist added successfuly");
    }
    public void updatePharmacien(){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(pharmacienArrayList);
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("please choose an id to update it");
            int idUpdate = scan.nextInt();
            System.out.println("First Name");
            pharm.setFirstName(scan.next());
            System.out.println("Last Name");
            pharm.setLastName(scan.next());
            System.out.println("email");
            pharm.setEmail(scan.next());
            System.out.println("phone number");
            pharm.setTelephone(scan.next());
            pharmacienArrayList.set(idUpdate - 1, pharm);
            System.out.println("Pharamciste updated successfuly with ID "+idUpdate);
    }
    public void selectAllPharmacien(){
        System.out.println(pharmacienArrayList);
    }
    public void searchPharmacienById(){
        System.out.println("Please put the id of pharmacist");
        int searchPh = scan.nextInt();
        System.out.println(pharmacienArrayList.get(searchPh - 1));
						
    }
    public void deletePharmacien(){
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(pharmacienArrayList);
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Please put the id to remove a pharmacist");
            int removePh = scan.nextInt();
            pharmacienArrayList.remove(removePh - 1);
            System.out.println("Pharmaciste removed successfuly !");
    }
}
