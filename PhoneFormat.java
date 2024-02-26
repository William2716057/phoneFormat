public class PhoneFormat {
	public static String formatPhoneNumber(int[] phone) {
		StringBuilder sb = new StringBuilder();
		//append brackets and first three numbers
		sb.append("(").append(phone[0]).append(phone[1]).append(phone[2]).append(") ");
		//append next three numbers and hyphen
		sb .append(phone[3]).append(phone[4]).append(phone[5]).append("-");
		//append last four numbers
		sb.append(phone[6]).append(phone[7]).append(phone[8]).append(phone[9]);

		return sb.toString();
	}

	public static void main(String[] args) {
	int[] phone = {3,6,8,2,4,5,8,9,0,1};
	String formatted = formatPhoneNumber(phone);
	System.out.println(formatted);
}
}
