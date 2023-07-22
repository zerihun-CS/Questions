public class MethodOverLoading {

    public static void main(String[] args) {


        System.out.println(factorial(4));
    }


    static int add(int x , int y ){

        return (x+y);
    }

    static double add(double x , double y ){

        return (x+y);
    }


    static int factorial(int number){

        if(number > 1 )
        return  number * (factorial(number-1));

        else
            return 1;


    }
}
