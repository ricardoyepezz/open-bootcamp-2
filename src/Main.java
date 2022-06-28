public class Main {
    public static void main(String[] args) {
        // if - else if - else ------------------------------------
        int numeroIf = 1;

        if (numeroIf >0){
            System.out.println("la variable numeroIf es Positiva");
        } else if (numeroIf <0){
            System.out.println("la variable numeroIf es Negativa");
        } else {
            System.out.println("la variable numeroIf es 0");
        }
        // while ----------------------------------------------------
        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("la variable numeroWhile ahora es: " + numeroWhile);
        }
        // do-while -----------------------------------------------------
        int numeroDoWhile = 3;

        do {
            numeroDoWhile++;
            System.out.println("la variable numeroDoWhile ahora es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //for-------------------------------------------------------------
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //switch ----------------------------------------------------------
        String estacion = "otoño";
        switch (estacion) {
            case "verano":
                System.out.println("es verano!");
                break;
            case "invierno":
                System.out.println("es invierno!");
                break;
            case "otoño":
                System.out.println("es otoño!");
                break;
            case "primavera":
                System.out.println("es primavera!");
                break;
            default:
                System.out.println("no es una estación valida!");
        }

    }
}