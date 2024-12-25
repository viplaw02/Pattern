public class J {
    public static void main(String[] args) {
        int num=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=num;k--){
             System.out.print("*");
            }
            System.out.println();
            num=num+2;
        }
    }
}
