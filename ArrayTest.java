    import java.util.Random;
    public class ArrayTest
 {

     public static void main(String[] args)
     {

        Random y = new Random();
        final int x=10;
        int []array=new int[x];
        for(int i=0;i<x;i++)
        {
            array[i] = y.nextInt(10);

        }
        System.out.println( );
        for(int i=0;i<x;i=i+2)
        {
            System.out.print(array[i]+" "  );

        }
        System.out.println( );
        for(int i=0;i<x;i++)
        {
            if(array[i]%2==0) {
                System.out.print(array[i] +" " );
            }
        }
        System.out.println( );
        for(int i=x-1;i>=0;i--)
        {
            System.out.print(array[i]+" "  );

        }
        System.out.println( );
        System.out.print(array[0]+ " " +array[x-1]);



    }
}




