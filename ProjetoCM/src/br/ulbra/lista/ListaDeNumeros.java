
package br.ulbra.lista;
    import java.util.ArrayList;
    import java.util.Collections;
    import javax.swing.JOptionPane;

public class ListaDeNumeros {

    public ArrayList<Integer> numeros;

    public ListaDeNumeros() {
        numeros = new ArrayList<>();
    }

    public void salvar(int numero) {
        numeros.add(numero);
        JOptionPane.showMessageDialog(null, numero + " Salvo com sucesso!");
    }

    public String getNumero() {
        String lista = "LISTA DE NUMEROS \n";

        if (!numeros.isEmpty()) {
            for (int i = 0; i < numeros.size(); i++) {
                lista += (i + 1) + "-" + numeros.get(i) + "\n";
            }
        } else {
            lista = "Lista Encontra-se Vazia!";
        }
        return lista;
    }

    public void excluir(int indice) {
        indice = indice - 1;

        if (!numeros.isEmpty()) {
            if (indice >= 0 && indice < numeros.size()) {
                numeros.remove(indice);
                JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia, impossivel excluir!");
        }
    }

    public void alterar(int indice, int novoNumero) {
        indice = indice - 1;

        if (!numeros.isEmpty()) {
            if (indice >= 0 && indice < numeros.size()) {
                numeros.set(indice, novoNumero);
                JOptionPane.showMessageDialog(null, "Registro removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia, impossivel excluir!");
        }
    }

    public int buscar(int elemento) {
        boolean achou = false; 
        int i = 0;
        int n = 0;
        if (!numeros.isEmpty()) {
            while (i < numeros.size() && !achou) {
                if (elemento == numeros.get(i)) {
                    n = elemento;
                   achou=true;
                }else{
                    i++;
                }
            }//fim loop
        }
            if (!achou) {
                JOptionPane.showMessageDialog(null, " Valor não existe na lista!");
            }
            return n;
            
        }
    
    public double calcularMedia() {
    double soma = 0;
    if (!numeros.isEmpty()) {
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível calcular a média!");
        return 0;
    }
}

public int getmaximo() {
    if (!numeros.isEmpty()) {
        int max = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }
        return max;
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível encontrar o número máximo!");
        return 0;
    }
}

public int getminimo() {
    if (!numeros.isEmpty()) {
        int min = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) < min) {
                min = numeros.get(i);
            }
        }
        return min;
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível encontrar o número mínimo!");
        return 0;
    }
}

public void ordenar() {
    if (!numeros.isEmpty()) {
        Collections.sort(numeros);
        JOptionPane.showMessageDialog(null, "Lista ordenada com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Lista vazia, impossível ordenar!");
    }
}
   public String getlistarimpares() {
    String pares = "Números Pares:\n";

    for (int num : numeros) {
        if (num % 2 == 0) {
            pares += num + "\n";
        }
    }

    return pares;
}

public String getlistarpares() {
    String impares = "Números Ímpares:\n";

    for (int num : numeros) {
        if (num % 2 != 0) {
            impares += num + "\n";
        }
    }

    return impares;
}

public void atualizar(ArrayList<Integer> novaLista) {
    numeros = novaLista;
    JOptionPane.showMessageDialog(null, "Lista atualizada com sucesso!");
}

}
