package Exercise_Oc03;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산자> ");
		String opCode = scan.nextLine();
		System.out.print("첫번째 피연산자> ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.print("두번째 피연산자> ");
		int y = Integer.parseInt(scan.nextLine());

		switch (opCode) {
		case "+":
			Add add = new Add();
			add.setValue(x, y);
			System.out.println("결과 = " + add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(x, y);
			System.out.println("결과 = " + sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(x, y);
			System.out.println("결과 = " + mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(x, y);
			System.out.println("결과 = " + div.calculate());
			break;
		default:
			System.out.println("+, -, *, / 값중의 하나만 입력하세요");
		}
		scan.close();

	}
}
