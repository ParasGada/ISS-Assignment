public class VolatileKeyword {
	private static volatile int MY_INT = 0;

	public static void main(String[] args)
	{
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {
		public void run()
		{
			int local_value = MY_INT;
			while (local_value < 5) {
				if (local_value != MY_INT) {
					System.out.println("Variable value changed to:"+MY_INT);
					local_value = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		public void run()
		{
			int local_value = MY_INT;
			while (MY_INT < 5) {
				System.out.println("Increasing variable value in ChangeMaker to:"+(local_value+1));
				MY_INT = ++local_value;
				try {
					Thread.sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
