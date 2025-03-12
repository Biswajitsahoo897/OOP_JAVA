package Day_10;

public class NameEncoding {
    public static void main(String[] args) {
        String Name = "BISWAJIT SAHOO"; 
        String nEncoding = "";
        int diff;

        for (int i = 0, j = Name.length() - 1; i < j;/*Condition*/i++, j--){
            diff = Math.abs(Name.charAt(i) - Name.charAt(j)); //logic
            nEncoding += diff; //THIS IS THE ENCODING
        }

        //if length is odd, handle middle character
        if (Name.length()%2==1) {
            int mid = Name.length()/2;
            nEncoding+=(Name.charAt(mid)-65)-Name.length();
        }

        System.out.println("Encoded Value: " + nEncoding);
    }
}

// Encoding Steps:
// B (66) - T (84) = -18
// I (73) - I (73) = 0
// S (83) - J (74) = 9
// W (87) - A (65) = 22