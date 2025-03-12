class hello{
    int value;
    char value_2;
    public static void main(String[] args){
        
        int number=10,number2=110;//these all are local variable 
        //everything is an object in java .

        System.out.println("hello world !!!!!!!!");
        System.out.println("Name:Biswajit Sahoo");
        System.out.println("Reg_no:-2301020238");
        System.out.println("Branch:- CSE(AI&ML)");
        System.out.println("Value of number is "+number+" and number2 is "+number2);
        hello t=new hello();
        System.out.println("Default value of int is "+t.value);
        System.out.println("Default value of char is "+t.value_2);
    }
}
