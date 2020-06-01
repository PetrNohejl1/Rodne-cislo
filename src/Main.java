import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String rc = "030424/0134";
		
		Pattern p = Pattern.compile("([0-9]{2})([0-9]{2})([0-9]{2})/[0-9]{4}");
		
		Matcher m = p.matcher(rc);
		if(m.matches()) {
			System.out.println("Valid");
		
			System.out.println("20"+m.group(1));
			System.out.println(m.group(2)+" - Duben");
			System.out.println(m.group(3)+ ".Den");
		}
		else {
			System.out.println("Unvallid");
		}
	}

}
