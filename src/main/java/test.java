public class test {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            int a = dG(i);
            System.out.println(a);
        }

    }
    public static int dG(int a){
        int b = 1;
                if(a<=2){
                    return b;
                }else{
                    return dG(a-2)+dG(a-1);
                }
    }
}
