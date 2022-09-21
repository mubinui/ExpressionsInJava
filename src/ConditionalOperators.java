public class ConditionalOperators {
    public static void main(String[] args) {
        // conditional operators in java
        // boolean_expression ? expression1 : expression2
        // output = expression1 if boolean_expression is true
        //          expression2 if boolean_expression is false
        // if (boolean_expression): expression1;
        // else expression2 ;

        int a = 10;
        int b = 16;
        int output = (a<b)? a+b : a-b;
        System.out.println(output);
    }
}
