# JanAssessment1
Project Details
Project: LockedMe.com
An interactive application which can be used for file manipulations. Project implemented using Java which has the following capabilities
-	Application can display all the files present in a directory
-	File Operations
Adding a File to the given directory
User can delete a file from the directory
User can search a file from the directory
User can return to Main menu
-	Exit the application 
Note: Provide the directory link in the relevant fields in the below format
C:\Users\Dileep\Desktop\java  prgms\
Developer Details
Dileep Lukose:  Full Stack Java developer
Company:  Company Lockers Pvt. Ltd

Algorithm used
java.util.Collections.sort() method is used for Sorting the files in ascending order which is present in java.util.Collections class.
Files.createFile() method from the Java NIO package is used for creating a file when user selects add a file option.
The delete() method of java.nio.file is used to delete the user specified file if present.
Linear search algorithm is used to search a particular file from the directory using for each loop listFiles. The listFiles() method is a part of File class. The function returns an array of Files denoting the files in a given abstract pathname if the path name is a directory else returns null.
Exceptions are handled in all scenarios.
Invalid inputs are handled by prompting user to provide the input again with an error message.
All the functionalities are implemented as methods inside the main class. The complete functionality is achieved by different method calls. 


Sprint 1:
•	Overall system design
•	Creating the GitHub repository 
•	Design and Development of the following:
o	Welcome Screen 
o	LockedMe.com and developer details
o	main menu with options
o	File sorting in ascending order
o	Application exit




Sprint 2:
•	File operations design and development
•	Sub menu development
•	Development of Adding a user specified file
•	Development of deleting a user specified file
•	Handling exceptions and invalid inputs from user




Sprint 3:
•	Search file functionality development
•	Back to main menu
•	Testing the system
•	Pushing the code to GitHub

GitHub repository Link
https://github.com/lukosed/JanAssessment1

future Enhancements
The application can be used to extend its services to sort the files in the user defined way(Ascending/descending). Also, files created can modified to accept the user defined values in place of an empty file.

