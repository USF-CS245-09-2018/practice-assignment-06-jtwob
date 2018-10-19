public class Assert{
	public static void not_false(boolean exp){
		if(!exp){
			throw new IllegalArgumentException();
		}
	}
}