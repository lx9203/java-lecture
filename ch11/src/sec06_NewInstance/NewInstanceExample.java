package sec06_NewInstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		Class clazz = null;
		long time = System.currentTimeMillis();

		try {
			if (time % 2 == 0)
				clazz = Class.forName("sec06_NewInstance.SendAction");
			else
				clazz = Class.forName("sec06_NewInstance.ReceiveAction");

			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
