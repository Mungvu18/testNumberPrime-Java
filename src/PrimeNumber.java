import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần kiểm tra");
        int number = sc.nextInt();
        if(number<2){
            System.out.println(number+" Không phải số nguyên tố");
        } else if(number==2){
            System.out.println(number+" là số nguyên tố");
        }
        else {
        System.out.println(test1(number));
        }
    }

    public static String test(int number) {
        String read = "";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return read = "Không phải số nguyên tố";
            }
               return read = "là số nguyên tố";
            }
        return read;
    }
    public static String test1(int number){
        String Prime ="";
        int i = 2;
        while (i<number){
            if(number%i==0){
                return Prime ="không phải số nguyên tô";
            }
            i--;
            return Prime ="là số nguyên tố";
        }
        return Prime;
    }
}
