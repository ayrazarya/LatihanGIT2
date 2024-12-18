class Main {
    public static void main(String[] args) {

        
     double a = 10.0;
     double b = 5.0;
     double result = calculateAverage(a, b);
     System.out.println("The average of " + a + " and " + b + " is: " + result);

     double c = 20.0;
     double d = 10.0;
     double result2 = calculateAverage(c, d);
     System.out.println("The average of " + c + " and " + d + " is: " + result2);

     int e = 15;
     int f = 25;
     double result3 = calculateAverage(e, f);
     System.out.println("The average of " + e + " and " + f + " is: " + result3);

     double g = 12.5;
     double h = 27.5;
     double result4 = calculateAverage(g, h);
     System.out.println("The average of " + g + " and " + h + " is: " + result4);

     double i = 10.5;
     double j = 20.5;
     double result5 = calculateAverage(i, j);
     System.out.println("The average of " + i + " and " + j + " is: " + result5);

     double k = 15.75;
     double l = 24.25;
     double result6 = calculateAverage(k, l);
     System.out.println("The average of " + k + " and " + l + " is: " + result6);


    }

    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double calculateAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    public static double calculateAverage(double num1, int num2) {
        return (num1 + num2) / 2.0;
    
    
    }

    public static double calculateAverage(int num1, double num2) {
        return (num1 + num2) / 2.0;
    }
 }
