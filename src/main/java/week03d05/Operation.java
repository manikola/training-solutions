package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String s) {
        String[] parts = s.split("\\+");
        leftOperand = Integer.parseInt(parts[0]);
        rightOperand = Integer.parseInt(parts[1]);
    }

    public int getResult() {
        return (leftOperand + rightOperand);
    }
        public static void main(String[] args) {
        Operation operation = new Operation("33+43");
      System.out.println(operation.getResult());

        }

    }


