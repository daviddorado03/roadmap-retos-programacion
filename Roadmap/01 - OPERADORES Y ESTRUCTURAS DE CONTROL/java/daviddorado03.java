public class daviddorado03 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("Aritmeticos");
        System.out.println("Suma: " + x + y);
        System.out.println("Resta: " + (x - y));
        System.out.println("Division: " + (y/x));
        System.out.println("Multiplicacion: " + (x * y));
        System.out.println("Modulo: " + (y%x));
        System.out.println("Division:  " + (y/x));
        System.out.println("----------------");

        System.out.println("Comparacion");
        System.out.println("Igualdad: "+(x==y));
        System.out.println("Desigualdad: " + (x!=y));
        System.out.println("Mayor que: " +(x>y));
        System.out.println("Mayor o igual que: " +(x>=y));
        System.out.println("Menor que: " +(x<y));
        System.out.println("Menor o igual que: " +(x<=y));
        System.out.println("----------------");

        System.out.println("Logicos");
        boolean cierto = true;
        boolean falso = false;
        System.out.println("OR: " + (cierto||falso));
        System.out.println("AND: " + (cierto&&falso));
        System.out.println("NOT:" + !cierto);
        System.out.println("----------------");

        System.out.println("Asignacion");
        double a = 10;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 1;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 1;
        System.out.println("----------------");

        System.out.println(x++);
        System.out.println(x--);

        System.out.println("----------------");
        for(int i = 10; i <= 55; i++){
            if ((i!=16) && ((i%2)==0) && ((i%3)!=0)) {
                System.out.println(i);
            }
        }
    }
}
