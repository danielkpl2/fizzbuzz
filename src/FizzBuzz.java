public class FizzBuzz {
    public static void main(String[] args){
        int limit=0;
        if(args.length != 0){
            try {
                limit = Integer.parseInt(args[0]);
            }catch(java.lang.NumberFormatException e){
                System.out.println("must be a number");
                System.exit(0);
            }
        }else{
            limit = 100;
        }
        for(int i = 1; i <= limit; i++){
            System.out.println(fizzbuzz(limit)[i]);
        }

    }

    public static String[] fizzbuzz(int limit){
        String[] a = new String[limit+1];
        for(int i = 1; i <= limit; i++){
            if(i % 15 == 0){
                a[i] = "FizzBuzz";
            }else if(i % 5 == 0){
                a[i] = "Buzz";
            }else if(i % 3 == 0){
                a[i] = "Fizz";
            }else{
                a[i] = String.format("%s",i);
            }
        }
        return a;
    }

}


