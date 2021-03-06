/**
 * Ejercicio 2 de Excepciones
 *
 * Programa de prueba.
 *
 * @author Pablo
 */
package practicas.excepciones.E02;

public class E02Prueba {
  public static void main(String[] args) {
    E02Excepciones garfield = new E02Excepciones("macho");
    E02Excepciones lisa = new E02Excepciones("lisa");
    E02Excepciones tom = new E02Excepciones("macho");

    try {
      E02Excepciones gatito = garfield.apareaCon(tom);
      gatito.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      e.printStackTrace();
    }
  }
}
