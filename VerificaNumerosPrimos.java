public class VerificaNumerosPrimos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java VerificaNumerosPrimos <lista-de-numeros>");
            return;
        }

        for (String arg : args) {
            int n = Integer.parseInt(arg);
            Task checarNum = new Task(n);
            Thread thread = new Thread(checarNum);
            thread.start();
        }
    }
}