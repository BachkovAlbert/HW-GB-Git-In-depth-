package S01;

public class Methods {
    private double[] arr1;
    private double[] arr2;
    private double[] arrResult;

    public Methods(double[] arr1, double[] arr2) {
        // try {
            if (arr1 == null || arr2 == null) {throw new RuntimeException("!Один или два массива - null!");}
            this.arr1 = arr1;
            this.arr2 = arr2;
            if (arr1.length == 0 || arr2.length == 0) {throw new RuntimeException("!Один или два массива - пустые!");}
            if (arr1.length != arr2.length) {throw new RuntimeException("!Массивы разной длины!");}
            arrResult = new double [arr1.length];
        // }
        // catch (Exception e){System.out.print(e.getMessage() + "\nИзмените массив.");}
    }

    public void arrayDifference() {
        // try{
            for (int i = 0; i < arr1.length; i++) {arrResult[i] = arr1[i] - arr2[i];}
        // }
        // catch (Exception e){System.out.print(e.getMessage() + "\nИзмените массив.");}
        printResult();
    }

    public void arrayQuotient(){
        // try{           
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) {throw new RuntimeException("!Деление на ноль!");}
                arrResult[i] = arr1[i] / arr2[i];
           }
        // }
        // catch (Exception e){System.out.print(e.getMessage() + "\nИзмените массив.");}
        printResult();
    }

    private void printResult() {
        System.out.print("[");
        for (int i = 0; i < arrResult.length - 1; i++) {
            System.out.print(arrResult[i] + ", ");
        }
        System.out.println(arrResult[arrResult.length-1] + "]");
    }
}