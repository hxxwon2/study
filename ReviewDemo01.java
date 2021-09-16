import java.util.Scanner;
//v0.6
public class ReviewDemo01 {
    public static void main(String[] args) {
        //소수 :1과 자기자신외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;

        int k=2;
        while(k<number){
            if(number % k ==0){
                isPrime = false;
                break;//첫 번째 약수가 발견되면 for문 탈출(입력한 숫자가 소수일때는 영향x)
            }
            k++;
        }

        System.out.println(number + (isPrime ? "은(는) 소수!" : "은(는) 소수가 아닙니다."));
    }
}