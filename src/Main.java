import padroes.*;

public class Main {
    public static void main(String[] args) {

       ProfissionalComissao representante = new ProfissionalComissao(
                "Giovanna",
                "22/07/2018",
                "098.250.261-53",
                2002,
                2_300.00);


        System.out.println(representante);
        System.out.println(representante.calculaRemuneracao(0.5));

        ProfissionalSalario gerente = new ProfissionalSalario(
                "Ruan",
                "22/03/1991",
                "069.580.581-25",
                2022,
                8_300.00);


        System.out.println(gerente);


    }
}
