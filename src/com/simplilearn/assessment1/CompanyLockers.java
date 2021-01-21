package com.simplilearn.assessment1;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompanyLockers {
	String filePresence;
	int a = 0;
	int x;

	void fileSearch() throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to be searched.. ");
		String name = scan.nextLine();
		findFile(name, new File("C:\\temp\\"));
	}

	public void findFile(String name, File file1) throws IOException {

		File[] list = file1.listFiles();
		if (list != null) {

			for (File file2 : list) {
				String loc = "C:\\temp\\";
				loc = loc + name;
				File finaLoc = new File(loc);
				if ((finaLoc.compareTo(file2)) == 0) {
					this.a = 1;
				}

			}
			if (a == 1) {
				System.out.println("File Found");
				this.a = 0;
			} else {
				System.out.println("File not Found");
			}

		}

	}

	void fileNameDisp() {

		File fileDir = new File("C:\\temp\\");
		if (fileDir.isDirectory()) {
			List<String> listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting the file names in ascending order");
			System.out.println(" ");
			for (String s : listFile) {
				System.out.println("\t \t" + s);
				this.filePresence = s;
			}
		} else {
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}
		if (filePresence == null) {
			System.out.println("No files found");
		}

	}

	void delteFile() {
		try {
			String pp = "C:\\temp\\";
			System.out.println("enter file name to delete");

			Scanner destFile = new Scanner(System.in);
			String x = destFile.nextLine();

			File file = new File(pp + x);
			if (file.toString().equals(file.toString())) {
				Files.delete(Paths.get(pp + x));
				System.out.println(x + "   file deleted");
			}

		} catch (NoSuchFileException e) {
			System.out.println("No such file/directory exists");

		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
		}

		// System.out.println("Deletion successful.");
	}

	void fileCreate() {
		String paath = "C:\\temp\\";
		Scanner sc = new Scanner(System.in); // object of Scanner class
		System.out.println(" ");
		System.out.print("Enter the file name: ");
		String x = sc.nextLine();
		Path path = Paths.get(paath + x);

		try {
			Path p = Files.createFile(path); // creates file at specified location
			System.out.println("File Created at Path: " + p);
		} catch (IOException e) {
			System.out.println(" ");
			System.out.println("File exists");
			System.out.println(" ");
			System.out.println("enter a different name");
			fileCreate();

		}
	}

	void mainMenu() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"=====================================================================================================");
		System.out.println(
				"|+|                              Welcome To LockedMe.com                                         |+|");
		System.out.println(
				"|+|" + "                                                                                              "
						+ "|+|");
		System.out.println(
				"|+|" + "                    				Developer: Dileep Lukose                         |+|");
		System.out.println(
				"=====================================================================================================");

	}

	void mainMenuDisplay() {
		System.out.println("");
		System.out.println("		Please select the corresponding number from the following OPTIONS");
		System.out.println("");
		System.out.println("		1. Display files in Ascending order from the directory ");
		System.out.println("		2. File Operations");
		System.out.println("		3. Close the Application ");
		System.out.println(" ");
	}

	void subDisplay() {
		System.out.println(" ");
		System.out.println("	Select from the following Options");
		System.out.println("	1. Add File to Root Directory");
		System.out.println("	2. Delete a File ");

		System.out.println("	3. Search a file from Directory");

		System.out.println("	4. Go to Main Menu");
		System.out.println(" ");
	}

	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("		Please Select From Options: ");
		System.out.print(" ");
		if (scan.hasNextInt()) {
			x = scan.nextInt();

		} else {
			warning();
			getInput();

		}
	}

	void mainProcess() throws IOException {
		switch (x) {
		case 1:

			fileNameDisp();
			String[] menu = null;
			main(menu);

		case 2:
			subProcess();

			break;
		case 3:
			exitpgm();
			break;
		default:
			System.out.println(" ");
			System.out.println(" ");
			warning();
			String[] menu2 = null;
			main(menu2);
		}

	}

	void subProcess() throws IOException {
		subDisplay();
		getInput();
		switch (x) {
		case 1:

			fileCreate();
			subProcess();

		case 2:

			delteFile();
			subProcess();
		case 3:

			fileSearch();
			subProcess();
		case 4:
			String[] menu = null;
			main(menu);
			break;
		default:
			warning();
			subProcess();

		}

	}

	void exitpgm() {
		System.out.println(" ");
		System.out.println("			Thank you for using the service!!!");
		java.lang.System.exit(0);
	}

	void warning() {
		System.out.println(" ");
		System.out.println("<<<<<<<<<<Invalid Selection>>>>>>>>>>>>>");
		System.out.println(" ");
		System.out.println("----------Please TRY AGAIN------------");
		System.out.println(" ");
	}

	public static void main(String[] args) throws IOException {
		CompanyLockers disp = new CompanyLockers();
		disp.mainMenu();
		disp.mainMenuDisplay();
		disp.getInput();
		disp.mainProcess();
		disp.exitpgm();

	}

}
