public class linearSearch {

    public static int searching(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {5,10,15,20,30,45,50};
        System.out.println(numbers.length);
        int key = 45;
        int index = searching(numbers, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Index of key is: "+ index);
        }
    }
}

//time complexity of linear search = O(n)
//because agar element array mai exist nahi karta phir bhi array n time element ko last tak search karega
//linearSearch time complexity proportinal to loop.