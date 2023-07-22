import java.util.Arrays;

public class Main {
        public static void main(String[] args) {


                Student obj1 = new Student();

                obj1.name = "hanna";
                obj1.id = 19998;

                obj1.greet();
                Student obj2 = new Student();
                obj2.name = "abel";
                obj2.id = 3423432;
                obj2.greet();

                obj1.name = "alex";

                obj1.greet();

                Lamp livingRoom = new Lamp();

                livingRoom.turnOn();

                Lamp bedRoom = new Lamp();

                bedRoom.turnoff();



                Flight flightObj1 = new Flight();


                flightObj1.origin = "ET";
                flightObj1.destination = "DUB";

                flightObj1.planeNumber ="A0007 BOING";

                flightObj1.passengerSize(6);


                flightObj1.flightBooking();









                CustomArray arr1 = new CustomArray();

                arr1.put(6);
                arr1.put(7);
                arr1.put(19);
                arr1.put(9);
                arr1.put(92);
                arr1.put(19);

                arr1.put(7);
                arr1.put(19);
                arr1.put(9);
                arr1.put(92);
                arr1.put(19);


                arr1.put(7);
                arr1.put(19);
                arr1.put(9);
                arr1.put(92);
                arr1.put(19);


                arr1.print();


                CustomArray arr2 = new CustomArray();

                arr1.put(7);


        }


        static  String reverseString(String name){
                StringBuilder newName= new StringBuilder(" ");

                for (int i = name.toCharArray().length-1; i > 0; i++) {

                        newName.append(name.toCharArray()[i]);
                }

                return String.valueOf(newName);
        }
        static boolean isNiceArray(int[] arr1){
                        int sum = 0;
                for (int i = 1; i < arr1.length; i++)
                        if(isPrime(arr1[i])) sum+=arr1[i];

                return (arr1[0] == sum);

        }


        static boolean isPrime(int number){
                for (int i = 2; i < number; i++)
                        if(number % i==0) return false;
                return true;


        }



        static int[] makeComplete(int[]arr1){
                for (int i = 0; i < arr1.length; i++) {

                        arr1[i] =    (arr1[i]%2==0)?((i%2==0 && arr1[i]%2==0)?arr1[i]:
                                arr1[i]+1):((i%2!=0 && arr1[i]%2!=0)?arr1[i]:arr1[i]+1);




                }

                return  arr1;


        }
}
