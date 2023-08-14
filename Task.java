public class Task  implements Runnable {
    
    private int n;
    
    Task(int n) {
        this.n = n;
    }
    
    public synchronized void run() { 
        if (checarNum(n)) {
            System.out.println("O número " + n + " é primo.");
        } else {
            System.out.println("O número " + n + " não é primo.");
        }
    }
    // N é um numero primo , caso ele não seja divisivel por nenhum numero entre 2 e a sua raiz quadrada(n).
    // N é primo, quando elepode ser divisivel apenas por ele mesmo e 1.
    public static boolean checarNum(int n){
        if ((n == 0) || (n == 1)){
            return(false); // 0 E 1 NÃO SÃO PRIMOS
        } else {
            int i, fim;
            fim = (int)Math.sqrt(n);
            for(i=2; i<=fim; i++) {
                if ((n % i) == 0)
                   return(false); 
            } 
        }
            return(true);
    }
}
        
         

