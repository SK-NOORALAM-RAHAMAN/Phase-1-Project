package Simplilearn.MiniProjectPhase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {

	private static void displayFiles(String path) {
		// TODO Auto-generated method stub
		File f = new File(path);
		File filename[] = f.listFiles();
		for (File ff : filename) {
			System.out.println(ff.getName());
		}

	}

	private static void searchFile(String fileName, String path) {
		// TODO Auto-generated method stub
		File f = new File(path);
		File filenames[] = f.listFiles();
		int flag = 0;
		for (File ff : filenames) {
			if (ff.getName().equals(fileName)) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}

		}

		if (flag == 1) {
			System.out.println("File Found.");
		} else {
			System.out.println("File Not Found");
		}

	}

	private static void deleteFile(String fileName, String path) {
		// TODO Auto-generated method stub
		String finalfile = path + fileName;
		File file = new File(finalfile);
		Boolean b = file.delete();
		if (b) {
			System.out.println("File Deleted Succesfully");

		} else {

			System.out.println("File Not Found ");
		}

	}

	private static void addFile(String fileName, String path) throws IOException {
		// TODO Auto-generated method stub

		String finalname = path + fileName;
		System.out.println(finalname);
		// create a file
		File f = new File(finalname);
		boolean b = f.createNewFile();
		if (b != true) {
			System.out.println("File Already Exist");
		} else {
			System.out.println("File Created Succesfully");

		}

	}

//	Main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\sajid\\eclipse-workspace\\Main\\src\\Simplilearn\\MiniProjectPhase1\\Files\\";
		boolean appRun = true;
		int key = 0;

		while (appRun) {
//			Main menu
			System.out.println("-----Welcome to LockedMe.com-----");
			System.out.println("Devloped by: SK NOORALAM RAHAMAN ");
			System.out.println("Enter: 1- Retrive files in Ascending order");
			System.out.println("Enter: 2- Business level Operation MENU");
			System.out.println("Enter: 3- EXIT from the app. ");
			Scanner ip = new Scanner(System.in);
			key = ip.nextInt();

			switch (key) {
			case 1:

				displayFiles(path);
				break;
			case 2:

				boolean control = true;
				while (control) {
//					Business level Operation MENU
					System.out.println(" Enter: 1- to Add new file|| 2- to Delete file"
							+ "|| 3- to Search file|| 4- to go to Main menu .");

					key = ip.nextInt();
					String fileName = "";

					switch (key) {
					case 1:
						System.out.println("Enter the file name to Create a new file: ");
						fileName = ip.next();
						addFile(fileName, path);
						break;
					case 2:
						System.out.println("Enter the file name to Delete the file: ");
						fileName = ip.next();
						deleteFile(fileName, path);
						break;
					case 3:
						System.out.println("Enter the file name to Search the file: ");
						fileName = ip.next();
						searchFile(fileName, path);
						break;
					case 4:
						control = false;
						break;
					default:
						System.out.println("Incorrect Input, Try again !! ");
						break;
					}
				}
				break;

			case 3:
				appRun = false;
				System.out.println("Exiting you from the app....");
				break;

			default:
				System.out.println("Incorrect Input, Try again !! \n");
				break;
			}

		}

	}

}
