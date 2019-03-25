package OC01;

import java.util.*;

public class Login {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Login Id : ");
		String idInput = scanner.nextLine();
		System.out.print("Password : ");
		String pwInput = scanner.nextLine();
		scanner.close();
		try {
			login(idInput, pwInput);
		} catch (InvalidLoginIdException e) {
			System.out.println(e.getMessage());
		} catch (IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String idInput, String pwInput)
			throws InvalidLoginIdException, IncorrectPasswordException {
		String[] loginIds = new String[] { "abcde", "fghij", "klmno", "pqrst", "uvwxyz" };
		String[] passwords = new String[] { "abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12" };

		int index = -1;
		for (int i = 0; i < loginIds.length; i++) {
			if (loginIds[i].equals(idInput)) {
				index = i;
				break;
			}
		}

		if (index < 0)
			throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
		if (!passwords[index].equals(pwInput))
			throw new IncorrectPasswordException("패스워드를 잘못 입력하였습니다.");
		else
			System.out.println("로그인 성공");
	}

}
