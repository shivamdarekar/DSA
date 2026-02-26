
public class NotDuplicate {

    public static void approach1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void approach2(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }
        System.out.print(ans);
    } //if multiple single num it not work

    public static void main(String args[]) {
        int num[] = {1, 3, 4, 6, 4, 3, 1};
        //approach1(num);
        approach2(num);
    }
}
