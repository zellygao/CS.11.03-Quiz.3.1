public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if(grade>=90){
            return 'A';
        }
        else if(grade>=80){
            return 'B';
        }
        else if(grade>=70){
            return 'C';
        }
        else if(grade>=60){
            return 'D';
        }
        else if(grade>=50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz (int number){
        if(number%15==0){
            return "fizzbuzz";
        }
        else if(number%5==0){
            return "buzz";
        }
        else if(number%3==0){
            return "fizz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack (String string){
        if(string.length()<2){
            return string;
        }
        else{
            String add = string.substring(0,2);
            return add + string + add;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne (int a, int b, int c){
        if(a+b==c || b+c==a || c+a==b){
            return true;
        }
        return false;
    }

    // Question 5 - endUp

    public static String endUp (String string){
        if(string.length()<=3){
            return string.toUpperCase();
        }
        else{
            String back = string.substring(string.length()-3, string.length());
            String front = string.substring(0,string.length()-3);
            return front + back.toUpperCase();
        }
    }

}
