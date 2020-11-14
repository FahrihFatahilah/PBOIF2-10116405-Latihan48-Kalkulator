package Kalkulator;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program kalkulator
 */
public class kalkulatorMain {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        System.out.printf("VALUE 1 = %.1f\n",kalkulator.getValue1());
        System.out.printf("VALUE 2 = %.1f\n",kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.printf("Result Add is = %.1f\n",kalkulator.add(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.printf("Result Minus is = %.1f\n",kalkulator.minus(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.printf("Result Multiplication is = %.1f\n",kalkulator.multiplication(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.printf("Result division is = %.1f\n",kalkulator.division(kalkulator.getValue1(),kalkulator.getValue2()));
    }
    
}
