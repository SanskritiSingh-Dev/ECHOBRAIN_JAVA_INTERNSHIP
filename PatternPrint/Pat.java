public class Pat {
    public static void main(String[] args) {
        int n = 5;
        int c = 1;
        char ch = 'a';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    if(c%2 == 1){
                        System.out.print(ch++ + " ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                c++;
            }
            System.out.println();
        }
    }
}
