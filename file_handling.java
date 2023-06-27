import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_hand {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option=0;
        System.out.println("File Handling Operations");
        try {
            do {
                System.out.println("********************************************************************************");
                System.out.println("1. Create file\n2. Write into File\n3. File information\n4. Read from file\n5. Delete File\n6. Copy from file\n7. Word count\n8. Append from file\n9. Exit");
                System.out.println("Choose an option: ");
                // scanner.next();
                option = scanner.nextInt();
                System.out.println("********************************************************************************");
                switch (option) {
                    case 1:
                        createFile();
                        break;
                    case 2:
                        System.out.print("Enter a String: ");
                        scanner.nextLine();
                        String inputString = scanner.nextLine();
                        writeToFile(inputString);
                        break;
                    case 3:
                        showFileInfo();
                        break;
                    case 4:
                        readFromFile();
                        break;
                    case 5:
                        deleteFile();
                        break;
                    case 6:
                        copyFile();
                        break;
                    case 7:
                        countWords();
                        break;
                    case 8:
                        appendinfile();
                        break;
                    default:
                        System.out.println("Goodbye");
                        System.exit(1);
                }
            } while (option != 9);
        } catch(Exception o) {
            System.out.println("error "+o);
        }
        scanner.close();
    }
    // file creating function
    static void createFile() throws IOException {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");

        String fileName = sca.nextLine();

        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("New file is created");
        } else {
            System.out.println("The file already exists");
        }
    }
    // write data in user specified file
    static void writeToFile(String str) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");
        String fileName = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(str);

        System.out.println("Writing successful");
        fileWriter.close();

    }
    // display information of file
    static void showFileInfo() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            // Getting file name
            System.out.println("The name of the file is: " + file.getName());

            // Getting path of the file
            System.out.println("The absolute path of the file is: " + file.getAbsolutePath());

            // Checking whether the file is writable or not
            System.out.println("Is file writable?: " + file.canWrite());

            // Checking whether the file is readable or not
            System.out.println("Is file readable?: " + file.canRead());

            // Getting the length of the file in bytes
            System.out.println("The size of the file in bytes is: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }

    }
    // display data of file
    static void readFromFile() throws IOException {
        String content = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            content += fileScanner.nextLine() + "\n";
        }
        System.out.print("Content of file "+fileName+" is: ");
        System.out.println(content);
        fileScanner.close();
        
    }
    // deletes a file
    static void deleteFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

    static void copyFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source file name with extension: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Enter the destination file name with extension: ");
        String destinationFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        if (sourceFile.exists()) {
            Scanner sourceScanner = new Scanner(sourceFile);
            FileWriter destinationWriter = new FileWriter(destinationFile);

            while (sourceScanner.hasNextLine()) {
                String line = sourceScanner.nextLine();
                destinationWriter.write(line + "\n");
            }

            System.out.println("File copied successfully.");
            sourceScanner.close();
            destinationWriter.close();
        } else {
            System.out.println("Source file does not exist.");
        }

    }

    static void countWords() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name with extension: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                wordCount++;
            }
            System.out.println("Number of words in the file: " + wordCount);
            fileScanner.close();
        } else {
            System.out.println("The file does not exist.");
        }
    }

    static void appendinfile()  throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        String content = "";
        System.out.print("Enter the source file name with extension: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);

        String content2 = "";
        System.out.print("Enter the destination file name with extension: ");
        String fileName2 = scanner.nextLine();
        File file2 = new File(fileName2);
        Scanner fileScanner2 = new Scanner(file2);
        
        while (fileScanner2.hasNextLine()) {
            content += fileScanner2.nextLine();
        }
        while (fileScanner.hasNextLine()) {
            content += fileScanner.nextLine();
        }
        // writeToFile(content);
        FileWriter fw = new FileWriter(file2);
        fw.write(content);
        fw.close();
        System.out.println("Append Successful");
    }
}
