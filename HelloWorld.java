
// Hmm something weird with the NetBeans version, couldn't get it to work in terminal.
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ok must be double quotes:
        // System.out.println("Hello you world!" + args[0]);

        int[] nums = new int[500000];
        long start = System.currentTimeMillis();
        // Ok must be double quotes:
        System.out.println("Hello you dark world!");
        for (int i=0; i < 500; i++) {
            for (int j=0; j < 1000; j++) {
                nums[i] = i;
                System.out.print(i);
            }
//            System.out.println(" ");
        }
        long end = System.currentTimeMillis();

        System.out.println("   ");
        System.out.print(end - start);
    }

}
