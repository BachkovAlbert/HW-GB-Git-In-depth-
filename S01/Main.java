package S01;

public class Main {
    public static void main(String[] args) {
        double[] arr1 = {10, 21, 55, 73, 81};
        double[] arr2 = {5, 1, 15, 10, 11};
        Methods array = new Methods(arr1, arr2);
        System.out.print("arr1[i] - arr2[i] = "); 
        array.arrayDifference();
        System.out.print("arr1[i] / arr2[i] = ");
        array.arrayQuotient();
        }
    }