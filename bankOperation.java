package refresherPractice;

import java.util.Scanner;

public class bankOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int N = a.nextInt();
        String o = b.nextLine();
        a.close();
        b.close();
        char t = o.charAt(0);
        String y = o.substring(2,(o.length()));
        int X = Integer.parseInt(y);
        if(t=='1')
        {
            System.out.println(N+X);
        }
        else if(t=='2')
        {
            if(N>X)
            {
                System.out.println(N-X);
            }
        }
	}
}
