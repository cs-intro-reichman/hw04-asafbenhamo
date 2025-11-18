public class Primes {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a==0 || a==1 || a<0) System.out.println(0);;
            
        System.out.println(2);
        int c=0;
        for (int i =3 ; i<a; i++){
        for(int j =2 ; j<i; j++){
         if (i%j!=0) c++;
        }
        if(c== i-2) System.out.println(i);
        }

    }
}
