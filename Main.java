import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Ola Mundo!");
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; //incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // dá a ch o valor Z
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoChar);
        System.out.println("Valor do tipoDouble = " + tipoDouble );
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        // Demonstra sequências de escape em strings.
        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tFirs\n");

        // Demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // um valor booleano pode controlar a instrução if
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10; // dá a count um valor inicial igual a 10
        char chr = 'X'; // inicializa chr com a letra X
        float f = 1.2F; // f é inicializada com 1,2

        // Demonstra a inicialização dinâmica.
        double raio = 39, altura = 52;

        // inicializa volume dinamicamente
        double volume = 3.1416 * raio * raio * altura;
        System.out.println("\nVolume is " + volume +"\n");

        // Demonstra o escopo de bloco.
        int m; // conhecida pelo código dentro de main()
        m = 10;
        if(m == 10) { // inicia novo escopo
            int n = 20; // conhecida apenas nesse bloco
            // tanto m quanto n são conhecidas aqui.
            System.out.println("m and n: " + m + " " + n);
            System.out.println("m quatro vezes é = " + n * 2); }
        for(int i = 0; i < 4; i++) {
            int j = 1; // y será inicializada sempre que entrarmos no bloco
            System.out.println("j is: " + j); // essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " + j);
        }



    }
    }
