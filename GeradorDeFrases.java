package UseACabeça;

public class GeradorDeFrases {
    public static void main(String[] args) {

        String[] ListaPalavras1 = {"habilidades", "comunicação", "voz ativa","soluções de problemas"};

        String[] ListaPalavras2 = {"IOT", "Nuvem nativo", "microserviços", "Serviços Orientados"};

        String[] ListaPalavras3 = {"Framework", "Repositorio", "Biblioteca", "rest api"};

        int OneLength = ListaPalavras1.length;
        int TwoLength = ListaPalavras2.length;
        int ThreeLength = ListaPalavras3.length;

        java.util.Random RandomGenerator = new java.util.Random();
        int aleatorio1 = RandomGenerator.nextInt(OneLength);
        int aleatorio2 = RandomGenerator.nextInt(TwoLength);
        int aleatorio3 = RandomGenerator.nextInt(ThreeLength);

        String Frase = ListaPalavras1[aleatorio1] + " , " +
          ListaPalavras2[aleatorio2] + " e " + ListaPalavras3[aleatorio3];

        System.out.println("Precisamos de " + Frase);
    }
}
