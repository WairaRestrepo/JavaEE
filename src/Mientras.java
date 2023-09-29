public class Mientras {
    public static void main(String[] args) {
        int i = 0;
        int suma = 0;

        while (i <= 10) {
            //int total = 0; se inicializa cada vez que ingrese al while
            System.out.println (i);
            suma = suma + i;

            /* i = i + 1;
            i += 3;*/
            i++;
        }
        System.out.println ("la suma total es:  "+ suma);
    }
}
