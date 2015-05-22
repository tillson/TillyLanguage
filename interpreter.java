import java.io.*;

class Main {
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("specify a file");
            System.exit(0);
            return;
        }
        String fileName = args[0];
        String line = null;
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                if (line.contains("f")) {
                    for (int i = 0; i <= 100; i++) {
                        // I can take up alll the space I need.
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println("FizzBuzz");
                        } else if (i % 3 == 0) {
                            System.out.println("Fizz");
                        } else if (i % 5 == 0) {
                            System.out.println("Buzz");
                        } else {
                            System.out.println(i);
                        }
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }

}
