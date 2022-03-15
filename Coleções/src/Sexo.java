import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sexo {


    Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        {
            System.out.println("Masculino");
            List<String> masculino = new ArrayList<String>();
            masculino.add("João da Silva");
            masculino.add("Antonio Sousa");
            masculino.add("Alexandre");
            System.out.println(masculino);
            System.out.println("");
        }
        Scanner s = new Scanner(System.in);


            {
                System.out.println("Feminino");
                List<String> feminino = new ArrayList<String>();
                feminino.add("Marli Tereza");
                feminino.add("Juliana Alves");
                feminino.add("Lúcia Ferreira");
                Collections.sort(feminino);
                System.out.println(feminino);
                System.out.println("");
            }
        }
    }



