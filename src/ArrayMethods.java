public class ArrayMethods {
    public void whateverMethod(){
        int[] values = new int[10000];
        int counter = 1;
        for (int i=0 ; i<values.length; i++) {
            values[i] = counter;
            counter++;
        }
        System.out.println(values);
    }
}
