package pharmacie;

import java.util.ArrayList;
import java.util.Scanner;


public class main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean out = true;
		ArrayList<Pharmacien> pharmacienArrayList = new ArrayList<Pharmacien>();
		ArrayList<Drugs> drugsArrayList = new ArrayList<Drugs>();
		ArrayList<Client> clientArrayList = new ArrayList<Client>();
		while(out) {
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
				boolean back1 = true;
				while(back1) {
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
						int id = pharmacienArrayList.size() + 1;
						System.out.println("First Name");
						String firstName = scanner.next();
						System.out.println("Last Name");
						String lastName = scanner.next();
						System.out.println("email");
						String email = scanner.next();
						System.out.println("phone number");
						String telephone = scanner.next();
						Pharmacien pharmacien = new Pharmacien(id, firstName, lastName, email, telephone);
						
						pharmacienArrayList.add(pharmacien);
						System.out.println("Pharamciste added successfuly with ID "+id);
						break;
					case 2:
						
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println(pharmacienArrayList);
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("please choose an id to update it");
						int idUpdate = scanner.nextInt();
						System.out.println("First Name");
						firstName = scanner.next();
						System.out.println("Last Name");
						lastName = scanner.next();
						System.out.println("email");
						email = scanner.next();
						System.out.println("phone number");
						telephone = scanner.next();
						Pharmacien pharmacienUpdate = new Pharmacien(idUpdate, firstName, lastName, email, telephone);
						pharmacienArrayList.set(idUpdate - 1, pharmacienUpdate);
						System.out.println("Pharamciste updated successfuly with ID "+idUpdate);
						break;
					case 3:
						System.out.println(pharmacienArrayList);
						break;
					case 4:
						System.out.println("Please put the id of pharmacist");
						int searchPh = scanner.nextInt();
						System.out.println(pharmacienArrayList.get(searchPh - 1));
						break;
					case 5:
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println(pharmacienArrayList);
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("Please put the id to remove a pharmacist");
						int removePh = scanner.nextInt();
						pharmacienArrayList.remove(removePh - 1);
						System.out.println("Pharmaciste removed successfuly !");
					case 6:
						back1 = false;
						out = true;
						break;
					default:
						System.out.println("Oups error was found");
						
					}
				}
				break;
				case 2:
					boolean back2 = true;
					while(back2) {
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
							int id = drugsArrayList.size() + 1;
							System.out.println("Name drug");
							String nameDrug = scanner.next();
							System.out.println("description :");
							String desc = scanner.next();
							System.out.println("price : ");
							float price = scanner.nextFloat();
							Drugs drugs = new Drugs(id, nameDrug, desc, price);
							drugsArrayList.add(drugs);
							System.out.println("Drug added successfuly with id " +id);
							break;
						case 2:
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println(drugsArrayList);
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("please choose an id to update it");
							int idUpdate = scanner.nextInt();
							System.out.println("Name drug");
							nameDrug = scanner.next();
							System.out.println("description :");
							desc = scanner.next();
							System.out.println("price : ");
							price = scanner.nextFloat();
							Drugs drugsUpdate = new Drugs(idUpdate, nameDrug, desc, price);
							drugsArrayList.set(idUpdate - 1, drugsUpdate);
							System.out.println("Drug updated successfuly");
						break;
						case 3:
							System.out.println(drugsArrayList);
							break;
						case 4:
							System.out.println("Please put the id of drug");
							int searchDr = scanner.nextInt();
							System.out.println(drugsArrayList.get(searchDr - 1));
							break;
						case 5:
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println(drugsArrayList);
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("Please put the id to remove a drug");
							int removeDr = scanner.nextInt();
							drugsArrayList.remove(removeDr - 1);
							System.out.println("Drug removed successfuly !");
							break;
						case 6:
							back2 = false;
							out = true;
							break;
						default:
							System.out.println("Oups error was found");
							
						}
					}
			break;
				case 3:
					boolean back3 = true;
					while(back3) {
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
							int id = clientArrayList.size() + 1;
							System.out.println("first name :");
							String firstName = scanner.next();
							System.out.println("Last name : ");
							String lastName = scanner.next();
							System.out.println("email :");
							String email = scanner.next();
							System.out.println("Phone number");
							String telephone = scanner.next();
							int countPurchase = 0;
							Client client = new Client(id, firstName, lastName, email, telephone, countPurchase);
							clientArrayList.add(client);
							System.out.println("client added successfuly with id "+ id);
							break;
							
						case 2:
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println(clientArrayList);
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("put the id want to update it");
						
							int idUpdate = scanner.nextInt();
							System.out.println("first name :");
							firstName = scanner.next();
							System.out.println("Last name : ");
							lastName = scanner.next();
							System.out.println("email :");
							email = scanner.next();
							System.out.println("Phone number");
							telephone = scanner.next();
							System.out.println("number purchase");
							countPurchase = scanner.nextInt();
							Client clientUpdate = new Client(idUpdate, firstName, lastName, email, telephone, countPurchase);
							clientArrayList.set(idUpdate - 1, clientUpdate);
							System.out.println("the client updated successfuly");
							break;
							
						case 3:
							System.out.println(clientArrayList);
							break;
							
						case 4:
							System.out.println("put the id of client");
							int idSearch = scanner.nextInt();
							System.out.println(clientArrayList.get(idSearch - 1));
							break;
							
						case 5:
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println(clientArrayList);
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("put the id want to remove it");
							int idRemove = scanner.nextInt();
							clientArrayList.remove(idRemove);
							System.out.println("client removed successfuly");
							break;
							
						case 6:
							for(int i = 0;i < clientArrayList.size(); i++) {
								if(clientArrayList.get(i).getCountPurchase() >= 3) {
									System.out.format("%10s %10s %10s %10s %10s %10s",
											clientArrayList.get(i).getId(), clientArrayList.get(i).getFirstName(),
											clientArrayList.get(i).getLastName(), clientArrayList.get(i).getTelephone(),
											clientArrayList.get(i).getEmail(), clientArrayList.get(i).getCountPurchase());
									System.out.println();
								}
							}
						break;
							
						case 7:
							back3 = false;
							out = true;
						break;
						
						
						default:
							System.out.println("error was found");
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
				System.out.print("error was found");
				break;
			}
		}
	}

}
