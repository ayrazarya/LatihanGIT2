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
    }

    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double calculateAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }
 }
