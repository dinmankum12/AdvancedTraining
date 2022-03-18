package com.dinesh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CricketerCrudDemo {
	public static void main(String[] args) throws Exception {
		
		int choice = -1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DBConnection con = new DBConnection();
		
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY ALL");
			System.out.println("3. SEARCH BY PID");
			System.out.println("4. SEARCH BY PRICE");
			System.out.println("5. UPDATE");
			System.out.println("6. DELETE");
			
			System.out.println("0. EXIT");
			System.out.print("Enter your choice : ");
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
		
			case 1:
				
				System.out.println("---------------------------------------------");
				System.out.println("Enter how many product you want to insert :");
				System.out.println("---------------------------------------------");
				int n = Integer.parseInt(br.readLine());
				
				for(int i=1;i<=n;i++) {
				
				System.out.println("---------------------------------------------");
				System.out.println("Enter product pid : ");
				String pid = br.readLine();
				System.out.println("---------------------------------------------");
				
				System.out.println("---------------------------------------------");
				
				System.out.print("Enter product name : ");
				String pname = br.readLine();
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				System.out.print("Enter product price : ");
				int price = Integer.parseInt(br.readLine());
				System.out.println("---------------------------------------------");
				
				con.insert(pid, pname, price);
				}
				System.out.println("---------------------------------------------");
				System.out.println("Inserted successfully..");
				System.out.println("---------------------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------------------");
				System.out.println("DETAILS OF CRICKETER :");
				con.display();
				System.out.println("---------------------------------------------");
				break;
				
			case 3:
				System.out.println("---------------------------------------------");
				System.out.println("Enter product id to search : ");
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				String pid = br.readLine();
				System.out.println("---------------------------------------------");
				con.searchByPid(pid);
				System.out.println("---------------------------------------------");
				break;
				
			case 4:
				System.out.println("---------------------------------------------");
				System.out.println("Enter product price to search : ");
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				int price = Integer.parseInt(br.readLine());
				System.out.println("---------------------------------------------");
				con.searchByPrice(price);
				System.out.println("---------------------------------------------");
				break;
//			
			case 5:
				System.out.println("---------------------------------------------");
				System.out.println("Enter product id to update : ");
				 pid = br.readLine();
				 System.out.println("---------------------------------------------");
				 System.out.println("---------------------------------------------");
				System.out.println("Enter new product name : ");
				String pname = br.readLine();
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				System.out.println("Enter new product price : ");
				 price = Integer.parseInt(br.readLine());
				 System.out.println("---------------------------------------------");
				 System.out.println("---------------------------------------------");
				con.update(pid, pname, price);
				System.out.println("---------------------------------------------");
				break;
//				
			case 6:
				
				System.out.println("---------------------------------------------");
				System.out.println("Enter product id to delete : ");
				System.out.println("---------------------------------------------");
				System.out.println("---------------------------------------------");
				 pid = br.readLine();
				 con.delete(pid);
				 System.out.println("---------------------------------------------");
				break;
					
			case 0:
				System.out.println("---------------------------------------------");
				con.close();
				System.out.println("Thanks..");
				System.out.println("---------------------------------------------");
				break;
				
			}
			
		}while(choice!=0);
	
		}
}
