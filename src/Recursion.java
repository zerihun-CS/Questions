public class Recursion {
    public static void main(String[] args) {
//        You want to calculate the final amount of an investment after
//        a certain number
//        of years, taking into account an annual interest rate.
//        The initial investment amount is $1000, and the interest rate is 5%
//                per annum. Write a Java program that uses recursion
//        to calculate the final amount of the investment after a given
//        number of years.
//        Implement the calculateInvestment method, which takes in the principal
//        amount, interest rate, and number of years as parameters.
//                The method should return the final amount after
//        the specified number of years.
    }



static int summation(int number){

        if(number > 0 ){

           return number + summation(number-1);
        }
        else{

            return 0;
        }



}

    

}
