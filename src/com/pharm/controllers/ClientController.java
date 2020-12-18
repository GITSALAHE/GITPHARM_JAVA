package com.pharm.controllers;

import com.pharm.models.Client;
import java.util.ArrayList;
import java.util.Scanner;
public class ClientController {

    Client client;
    Scanner scan;
    ArrayList<Client> clientArrayList = new ArrayList<Client>();

    public ClientController() {
        scan = new Scanner(System.in);
        client = new Client();
    }

    public void addClient() {
        int id = clientArrayList.size() + 1;
        client.setId(id);
        System.out.println("first name :");
        client.setFirstName(scan.next());
        System.out.println("Last name : ");
        client.setLastName(scan.next());
        System.out.println("email :");
        client.setEmail(scan.next());
        System.out.println("Phone number");
        client.setTelephone(scan.next());
        int countPurchase = 1;
        client.setCountPurchase(countPurchase);
        clientArrayList.add(client);
        System.out.println("client added successfuly with id " + id);
    }
    public void updateClient(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(clientArrayList);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("put the id want to update it");

        int idUpdate = scan.nextInt();
        System.out.println("first name :");
        client.setFirstName(scan.next());
        System.out.println("Last name : ");
        client.setLastName(scan.next());
        System.out.println("email :");
        client.setEmail(scan.next());
        System.out.println("Phone number");
        client.setTelephone(scan.next());
        System.out.println("number purchase");
        client.setCountPurchase(scan.nextInt());
        clientArrayList.set(idUpdate - 1, client);
        System.out.println("the client updated successfuly");
    }
    public void deleteClient() {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(clientArrayList);
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("put the id want to remove it");
            int idRemove = scan.nextInt();
            clientArrayList.remove(idRemove - 1);
            System.out.println("client removed successfuly");
    }
    public void  selectAllClients(){
        System.out.println(clientArrayList);
    }
    public void searchCLientById(){
            System.out.println("put the id of client");
            int idSearch = scan.nextInt();
            System.out.println(clientArrayList.get(idSearch - 1));
    }
    public void loyalClient(){
        System.out.format("%10s %10s %10s %10s %10s %10s", "id", "first Name", "last name", "Phone number", "email",
                "number purchase\n");

        for (int i = 0; i < clientArrayList.size(); i++) {
            if (clientArrayList.get(i).getCountPurchase() >= 3) {

                System.out.format("%10s %10s %10s %10s %10s %10s", clientArrayList.get(i).getId(),
                        clientArrayList.get(i).getFirstName(), clientArrayList.get(i).getLastName(),
                        clientArrayList.get(i).getTelephone(), clientArrayList.get(i).getEmail(),
                        clientArrayList.get(i).getCountPurchase());
                System.out.println();
            }
        }
    }
}
