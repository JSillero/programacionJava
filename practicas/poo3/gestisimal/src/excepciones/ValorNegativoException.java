package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se asigna un valor negativo a una variable que no debe tomarlo
 */
public class ValorNegativoException extends Exception {
  public ValorNegativoException(String msg) {
    super(msg);
  }
}
