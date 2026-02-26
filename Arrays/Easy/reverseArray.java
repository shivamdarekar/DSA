//array ko reverse karne ke liye ham elements ko swap karenge like last swap with first goes on...

public class reverseArray{

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        } 
    };

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,12};
        reverse(numbers);
        
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    } 
};    

//time complexity = n
//space complexity = 1

//reverse karne ke liye aur ek array banao ussme reverse loop lagao
//main array ke saaare element reverse mai store karo then copy 2nd array in main array
//in this case saare array mai travel karna padta hai baar baar time aur space complexity zyada lagti hai
//thats why swap is better option....