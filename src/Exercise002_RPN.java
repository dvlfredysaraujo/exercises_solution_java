import java.util.Stack;

public class Exercise002_RPN {
    //Evaluate Reverse Polish Notation
    public int solution1(String[] array){
        int returnValue = 0;
        Stack<String> stack = new Stack<>();
        String operators = "+-/*";

        for (String j: array){
            if (!operators.contains(j)){
                stack.push(j);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());

                switch(j){
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                }
            }

        }
        returnValue = Integer.parseInt(stack.pop());
        return returnValue;
    }

    public int solution2(String[] array){
        int returnValue = 0;
        Stack<String> stack = new Stack<>();
        String operators = "+-*/";
        for (String j : array){
            if (!operators.contains(j)){
                stack.push(j);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());

                int index = operators.indexOf(j);

                switch(index){
                    case 0:
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a - b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a * b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }
        returnValue = Integer.parseInt(stack.pop());
        return returnValue;
    }

    public static void main(String[] args){
        String[] array = {"1","2","+","3", "*"};
        Exercise002_RPN exercise002Rpn = new Exercise002_RPN();

        int rpn = exercise002Rpn.solution1(array);
        System.out.println("Solution 1: "+ rpn);
        System.out.println("");
        rpn = exercise002Rpn.solution2(array);
        System.out.println("Solution 2: "+ rpn);
    }
}
