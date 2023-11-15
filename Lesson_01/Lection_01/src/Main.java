public class Main {
    public static void main(String[] args) {
        System.out.printf("Результат операции: %s \n",
                Calculator.calculation(2,2,'+')); //Результат операции: 4
        System.out.printf("Результат операции: %s \n",
                Calculator.calculation(2,1,'-')); // Результат операции: 1
        System.out.printf("Результат операции: %s \n",
                Calculator.calculation(2,3,'*')); // Результат операции: 6
        System.out.printf("Результат операции: %s \n",
                Calculator.calculation(8,2,'/')); // Результат операции: 4
    }
}


