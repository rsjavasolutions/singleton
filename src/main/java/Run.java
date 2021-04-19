public class Run {
    public static void main(String[] args) {

        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        ClassSingleton classSingleton2 = ClassSingleton.getInstance();

        System.out.println(classSingleton1.getInfo());

    }
}
