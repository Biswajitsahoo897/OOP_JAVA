package Day_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpperToLower {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        String res="";
        for (int i = 0; i <name.length(); i++) {
            char ch=name.charAt(i);
            if(ch>='A'&&ch<='Z'){
                res+=(char)(ch+32);
            }
            else{
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
