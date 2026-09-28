public class CalculatorTest {
    public static void main(String [] args){
        Calculator calculator = new Calculator();
        int sum = calculator.add(3, 5);
        System.out.println(sum);

        Calculator calculator2 = new Calculator();
        double total2 = calculator2.add(2.5, 3.5);
        System.out.println(total2);

        Calculator calculator3 = new Calculator();
        int Sum = calculator3.add(7, 5, 9);
        System.out.println(Sum);

        Calculator calculator4 = new Calculator();
        String sentence = calculator4.add("I live", "in New Jersey.");
        System.out.println(sentence);
    }
}
