class Main {
  public static void main(String[] args) {
    Punto a=new Punto(0,0,0,0);
    Punto b=new Punto(0,0,0,0); 
    System.out.print(" primer punto:");
    a.leer();
    System.out.print("segundo punto:");
    b.leer();
    System.out.print("A");
    a.imprimir();
    a.origen();
    System.out.print("B");
    b.imprimir();
    b.origen();
    System.out.print("distacia entre puntos: ");
    a.distancia(a,b);
    System.out.println("desplazamiento de a ");
    a.horizon();
    a.vert();
    a.diag(b);
    System.out.println("desplazamineto de b");
    b.horizon();
    b.vert();
    b.diag(b);
    System.out.print("A");
    a.imprimir();
    a.origen();
    System.out.print("B");
    b.imprimir();
    b.origen();
    System.out.print("distacia entre  puntos: ");
    a.distancia(a,b);
    Linea l=new Linea();
    System.out.print("Linea:");
    l.lectura();
    System.out.print("Longitud Linea: ");
    l.longitud();
    System.out.print("desplazamiento Linea");
    System.out.println("");
    l.Loghor();
    l.Longver();
    l.Longdiag();
    l.impresion();
    System.out.print("Longitud final Linea: ");
    l.longitud();
  }
}
