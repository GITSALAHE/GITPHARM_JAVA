package com.pharm.app;

import java.util.Scanner;
import com.pharm.controllers.PharmacienController;
import com.pharm.controllers.DrugsControllers;
import com.pharm.controllers.ClientController;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PharmacienController pharm = new PharmacienController();
        DrugsControllers drug = new DrugsControllers();
        ClientController client  = new ClientController();
        Boolean out = true;
        Boolean back = true;
        while (out) {
            System.out.println("+-------------------------+ :");
            System.out.println("|    WELCOME TO GITPHARM    |");
            System.out.println("+-------------------------+ :");
            System.out.println("1\t  pharmacist management");
            System.out.println("2\t  DRUGS management");
            System.out.println("3\t  Customer management");
            System.out.println("4\t  Exit");

            System.out.println("\nPlease put your choice :");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    while (back) {
                        System.out.println("1\t  create pharmacist");
                        System.out.println("2\t  update pharmacist");
                        System.out.println("3\t  show all pharmacists");
                        System.out.println("4\t  search a pharmacist");
                        System.out.println("5\t  remove a pharmacist");
                        System.out.println("6\t  Exit");
                        System.out.println("\nPlease put your choice :");
                        int input1 = scanner.nextInt();
                        switch (input1) {
                            case 1:
                                pharm.addPharmacien();
                                break;

                            case 2:
                                pharm.updatePharmacien();
                                break;

                            case 3:
                                pharm.selectAllPharmacien();
                                break;

                            case 4:
                                pharm.searchPharmacienById();
                                break;

                            case 5:
                                pharm.deletePharmacien();
                                break;

                            case 6:
                                back = false;
                                break;

                            default:
                                System.out.println("Oups error was found");
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean back1 = true;
                    while (back1) {
                        System.out.println("1\t  create drug");
                        System.out.println("2\t  update drug");
                        System.out.println("3\t  show all drug");
                        System.out.println("4\t  search a drug");
                        System.out.println("5\t  remove a drug");
                        System.out.println("6\t  Exit");
                        System.out.println("\nPlease put your choice :");
                        int input2 = scanner.nextInt();
                        switch (input2) {
                            case 1:
                                drug.addDrugs();
                                break;
                            case 2:
                                drug.updateDrugs();
                                break;
                            case 3:
                                drug.selectAllDrugs();
                                break;
                            case 4:
                                drug.searchDrugsById();
                                break;
                            case 5:
                                drug.deleteDrugs();
                                break;
                            case 6:
                                back1 = false;
                                break;
                            default:
                                System.out.println("Oups error was found");
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean back2 = true;
                    while (back2) {
                        System.out.println("1\t  create client");
                        System.out.println("2\t  update client");
                        System.out.println("3\t  show all client");
                        System.out.println("4\t  search a client");
                        System.out.println("5\t  remove a client");
                        System.out.println("6\t  show the favourite client");
                        System.out.println("7\t  Exit");
                        System.out.println("\nPlease put your choice :");
                        int clientInput = scanner.nextInt();
                        switch (clientInput) {
                            case 1:
                                client.addClient();
                                break;
                            case 2:
                            client.updateClient();
                                break;
                            case 3:
                            client.selectAllClients();
                                break;
                            case 4:
                                client.searchCLientById();
                            break;
                            case 5: 
                                client.deleteClient();
                            break;
                            case 6:
                                client.loyalClient();
                            break;
                            case 7:
                                back2=false;
                            break;
                            default:
                            System.out.println("Oups error was found");
                                break;
                        }
                    }
                    break;
                    case 4: 
                    System.out.println("********************* Exit *********************");
					System.out.println("************  GITPHARM BY GITSALAH *********************");
					System.exit(0);
                    break;
                default:
                System.out.println("Oups error was found");
                    break;
            }
        }
        scanner.close();
    }
}
