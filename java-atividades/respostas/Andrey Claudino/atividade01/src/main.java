public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("Atividade 1");
        ContaBancaria conta = new ContaBancaria("João", "12345", 1000.0);
        conta.exibirSaldo();
        conta.depositar(500.0);
        conta.exibirSaldo();
        conta.sacar(200.0);
        conta.exibirSaldo();
    }

}
