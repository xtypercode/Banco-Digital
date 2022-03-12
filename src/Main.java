import com.dio.banco.*;

public class Main {
    public static void main(String[] args){
        Cliente cl1 = new Cliente("José", "Pinto", "002");
        Conta cp1 = new ContaPoupanca(
                "98213",
                cl1,
                2500d,
                300d
        );


        Cliente cl2 = new Cliente("Maria", "da Silva", "003");
        Conta cc2 = new ContaCorrente(
                "32466",
                cl2,
                530d,
                200d
        );

        Banco b1 = new Banco("Atlântico");
        b1.registrarConta(cp1);

        Banco b2 = new Banco("BAI");
        b2.registrarConta(cc2);


        if(!cp1.deposito(1000)){
            System.out.println("Operação negada!");
        }

        if(!cp1.transferir(cc2, 150.9)){
            System.out.println("Operação negada!");
        }

        if(!cc2.saque(500)){
            System.out.println("Operação negada!");
        }

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(cp1.extrato());
        System.out.println(cc2.extrato());



    }
}
