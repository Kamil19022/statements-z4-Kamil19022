import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long i = sc.nextLong();
        long sum = 0, psum =0,nsum=0,pcount=0,ncount=0;
        double pavg = 0.0, navg = 0.0;

        do {
            long r = i % 10;
            sum += r;

            if (r % 2 ==0){
                psum +=r;
                pcount++;
            }else {
                nsum += r;
                ncount++;
            }

            i /= 10;
        }while(i>0);

        if (pcount >0)
            pavg=psum/pcount;
        if (ncount >0)
            navg= nsum / ncount;

        System.out.println(sum);
        System.out.println(pavg+ ":" + navg);

        sc.close();

    }
}
