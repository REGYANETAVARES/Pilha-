/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhainvertida;

/**
 *
 * @author REGYANE
 */
// Classe para representar uma pilha genérica
class Pilha<T> {
    private java.util.ArrayList<T> elementos;

    public Pilha() {
        elementos = new java.util.ArrayList<>();
    }

    // Adiciona um elemento no topo da pilha
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // Remove e retorna o elemento no topo da pilha
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Retorna o elemento no topo da pilha sem removê-lo
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return elementos.get(elementos.size() - 1);
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
