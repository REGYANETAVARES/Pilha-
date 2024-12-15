/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilhainvertida;


  public class PilhaInvertida {

    public static void main(String[] args) {
        // Exemplo de string para teste
        String frase = "ESTE EXERCICIO E MUITO FACIL";

        // Invertendo cada palavra
        String resultado = inverterPalavras(frase);

        // Exibindo o resultado
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + resultado);
    }

    // Método para inverter cada palavra de uma frase usando a classe Pilha
    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" "); // Separa a frase em palavras
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Pilha<Character> pilha = new Pilha<>();

            // Empilha os caracteres da palavra
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            // Desempilha os caracteres na ordem invertida
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            // Adiciona um espaço após cada palavra (exceto a última)
            resultado.append(" ");
        }

        // Remove o último espaço extra e retorna o resultado
        return resultado.toString().trim();
    }
}
