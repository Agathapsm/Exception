import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){
           Produto p = new Produto();
            System.out.println("Digite o id do produto");
            int id = sc.nextInt();
           p.setDescricao("Produto em estoque");
           System.out.println(p);
       } catch (MyException | ArithmeticException |InputMismatchException e) {
           System.out.println("!!ERRO!! "+e.getMessage());
       }


    }
}