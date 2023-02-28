public class funcoverload {
    static float myfunction(int[] numbers){
        int sum = 0;
        float mean;
        float size = numbers.length;
        for(int i = 0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        mean = sum/size;
        return mean;
    }

    static float myfunction(int a, int b){
        return (a+b)/2;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        float x = myfunction(a);
        float y = myfunction(1,6);
        System.out.println(x);
        System.out.println(y);
    }
}
