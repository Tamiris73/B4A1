import java.util.Scanner;

class Funcionario{
    private String Nome;
    private int DataAdmissao;
    private int Salario;
    public int i, Qtd = 114, Qtdd = 11;
    public String Matriz[][] = {{"Admin", "RH", "Diretoria", "Publicidade", "AC", "TI", "Design", "Enfermagem", "Cozinha", "Higienização", "Psicologia"}, {"Jaum", "Pedro", "Isis", "Carlos", "Roberto", "Olavo", "Lazaro", "Maria", "Humberto", "Mônica", "Maria" , "João" , "Ana" , "Mario" , "Miguel" , "Lucas" , "Arthur" , "Gabriel" , "Davi" , "Júlia" , "Guilherme" , "Matheus" , "Alice" , "Gustavo" , "Rafael" , "Laura" , "Enzo" , "Beatriz" , "Manuela" , "Felipe" , "Mariana" , "Sophia" , "Isabella" , "Nicolas" , "Sofia" , "Bernardo" , "Daniel" , "Luiza" , "Vinícius" , "Luíz" , "Giovanna" , "Isabela" , "Gabriela" , "Lara" , "Leonardo" , "Letícia" , "Samuel" , "Eduardo" , "Vitor" , "Henrique" , "Lívia" , "Anna" , "Victor" , "Valentina" , "Rafaela" , "Isadora" , "Heitor" , "Murilo" , "Pietro" , "Caio" , "Jaum", "Pedro", "Isis", "Carlos", "Roberto", "Olavo", "Lazaro", "Maria", "Humberto", "Mônica", "Maria" , "João" , "Ana" , "Mario" , "Miguel" , "Lucas" , "Arthur" , "Gabriel" , "Davi" , "Júlia" , "Guilherme" , "Matheus" , "Alice" , "Gustavo" , "Rafael" , "Laura" , "Enzo" , "Beatriz" , "Manuela" , "Felipe" , "Mariana" , "Sophia" , "Isabella" , "Nicolas" , "Sofia" , "Bernardo" , "Daniel" , "Luiza" , "Vinícius" , "Luíz" , "Giovanna" , "Isabela" , "Gabriela" , "Lara" , "Leonardo" , "Letícia" , "Samuel" , "Eduardo" , "Vitor" , "Henrique", "Ilma" }};
    public int MatrizInt[][] = {{0,1,0,1,2,3,4,5}, {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9}};
    
    Scanner input = new Scanner ( System.in );
    
    public void Inicializa(String N, int DA, int S){
        System.out.println(" ");
        
        while(this.Qtd > 100 || this.Qtd < 1){
            System.out.println("Quantas pessoas terão nesta empresa? (Máximo de 100)");
            String q = input.next();
            DA = Integer.parseInt(q);
            this.Qtd = DA;
        }
        
        System.out.println(" ");
        
        for(i = 1; i <= Qtd; i++){
            System.out.println("Informe o nome do funcionario: ");
            N = input.next();
            this.Nome = N;
            Matriz[0][i] = this.Nome;
        }
        
        for(i = 0; i <= Qtd; i++){
            System.out.println(" ");
            System.out.println("Informe a data de admissão do funcionário: ");
            String Year = input.next();
            DA = Integer.parseInt(Year);
            this.DataAdmissao = DA;
            MatrizInt[0][i] = this.DataAdmissao;
        }
            
        for(i = 0; i <= Qtd; i++){
            System.out.println(" ");
            System.out.println("Informe a sua altura: ");
            String Alt = input.next();
            S = Integer.parseInt(Alt);
            this.Salario = S; 
            MatrizInt[1][i] = this.Salario;
        }
        
            
    }
    


    public void Imprimir(){
        for(i = 1; i < Qtd; i++){
            System.out.println(" " + Matriz[i][0] + " ");
        }    
    	System.out.println("");
    	for(i = 1; i < Qtd; i++){
            System.out.println(" " + Matriz[0][i] + " ");
        }  
        System.out.println("");
        for(i = 1; i < Qtd; i++){
            System.out.println(" " + Matriz[1][i] + " ");
        }  
    	System.out.println("");
    
    }

//Sets
    public void setNome(){
        this.Nome = this.Nome;
    }
    
    public void setData(){
        this.DataAdmissao = this.DataAdmissao;
    }
    
    public void setAltura(){
        this.Salario = this.Salario;
    }


    
//Gets  
    public String getNome(){
        return Nome;
    }
    
    public int getData(){
        return DataAdmissao;
    }
    
    public int getSalario(){
        return Salario;
    }
    
}





public class Main
{
	public static void main(String[] args) {
		Funcionario F = new Funcionario();
		F.Inicializa("a", 2, 2);
		F.Imprimir();
	}
}


