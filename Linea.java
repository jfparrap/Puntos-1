public class Linea{
  private  Punto c;
  private  Punto d;

  public Linea(){
    c=new Punto(0,0,0,0);
    d=new Punto(0,0,0,0);
  }
  
  public void setc(Punto c){
    this.c=c;
  }

  public Punto getc(){
    return this.c;
  }

  public void lectura(){
    c.leer();
    d.leer();
  }
  public void impresion(){
    c.imprimir();
    d.imprimir();
  }
  public void longitud(){
    c.distancia(c,d); 
  }
  public void Loghor(){
    c.horizon();
    d.horizon();
  }
  public void Longver(){
    c.vert();
    d.vert();
  }
  public void Longdiag(){
    c.diag(d);
    d.diag(d);
  } 
}