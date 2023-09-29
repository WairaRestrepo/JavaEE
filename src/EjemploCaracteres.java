public class EjemploCaracteres {
    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;           // Compila!
        System.out.println(valor);

       // valor = valor + 1;         // No compila!
        //System.out.println(valor);

        valor = (char) (valor + 1);     // Compila!
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);

        //  el número 2020 aparece al final de la oración, esto se debe a que Java convierte automáticamente el número a String

        palabra = palabra + 2020;
        System.out.println(palabra);
    }
}
