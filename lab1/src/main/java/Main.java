public class Main {
    public static void  main(String argv[]) {
        int a = 0;
        ManagerException e = new ManagerException();
        try {
            a = a/0;
        }
        catch (Exception ex) {
            System.out.println(e.isCritical(ex));

        }
//        System.out.println("ghjklkjh");
    }
}
