package AulaAnnotation;

public class DeprecatedTeste {
    void visualizar(){
        java.lang.Object System;
        System.out.println("Método Visualização");
    }
        /*
            @deprecated replaced by display()
         */
    @Deprecated
    void exibir(){
        System.out.println("Mostrando que o método exibir é Deprecated");
    }
}
