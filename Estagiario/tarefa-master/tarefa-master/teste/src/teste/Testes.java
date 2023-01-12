package teste;

public class Testes {
public static void main(String[] args) {
        
        Cliente[] clientes = new Cliente[3]; // instanciando a classe Cliente 
        
        for(int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente(); // criando objeto 
        }
        
        clientes[0].nome = "Jackson ";  // poupulando a primeira  objeto 
               
        clientes[1].nome = "Victor ";  // poupulando a segunda posição do objeto 
        
        clientes[2].nome = "Fabricio "; 
        
        for(Cliente c : clientes) {
            System.out.println(c.nome); // forEach para a leitura.
        }
        
        
    }
        
}


