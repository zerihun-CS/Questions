import java.util.ArrayList;
import java.util.Arrays;

public class CustomArray {

    int [] storage = new int[5];
    int index = 0;



    void put(int number){

        if(index < storage.length) {
            storage[index] = number;
            index++;

        }

        else{
            int [] newArray = new int[storage.length];
            System.arraycopy(storage,0,newArray,0,newArray.length);

            storage = new int[newArray.length*2];

            System.arraycopy(newArray,0,storage,0,newArray.length);
            storage[index] = number;
            index++;



        }
    }


    int get(int index){

        return storage[index];

    }


    boolean contains(int number){

        for (int single_number: storage){

            if(number == single_number)return  true;


        }
        return false;
    }



    void print(){

        System.out.println(Arrays.toString(storage));
    }


    // isEmpty
    // toString
    //update
    // index remove




}
