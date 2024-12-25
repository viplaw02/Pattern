public class I {
    public static void main(String[] args) {
        int num =0;
        for(int i =0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=num;k++){
                System.out.print("*");
            }
            System.out.println();
            num+=2;
        }
    }
}
