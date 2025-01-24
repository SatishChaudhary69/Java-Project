public class TestArray {
    static void min(int array[]) {
        int min = array[0];
        for(int i =1; i<array.length;i++) {
            if(min>array[i])
                min = array[i];
        }
        System.out.println(min);
    }
    public static void main(String []args) {
        int a[] = {33,3,4,5};
        min(a);
    }
}