class Funcionario {
    String nome;
    int salario;
    String dataadmissao;
}

class Departamento {
    String nome;
    Funcionario funcionarios[] = new Funcionario[100];
}

class Empresa {
    String nome;
    String CNPJ;
    Departamento departamentos[] = new Departamento[10];

    public void CriaEmpresa(String name, String cnpj){
        this.nome = name;
        this.CNPJ = cnpj;
    }

    public void CadastrarDepartamento(String name){
        Departamento dep = new Departamento();
        dep.nome = name;
        for (int i = 0; i < 10; i++) {
            if (this.departamentos[i] == null){
                this.departamentos[i] = dep;
                i=10;
            }
        }
    }

    public void CadastrarFuncionario(Departamento dep, String name, String data, int sal){
        Funcionario func = new Funcionario();
        func.nome = name;
        func.dataadmissao = data;
        func.salario = sal;
        for (int i = 0; i < 100; i++) {
            if (dep.funcionarios[i] == null){
                dep.funcionarios[i] = func;
                i=100;
            }
        }
    }

    public void Aumento(Departamento dep){
        for (int i = 0; i < 100; i++) {
            if (dep.funcionarios[i] != null) {
                dep.funcionarios[i].salario += dep.funcionarios[i].salario / 10;
            }
        }
    }

    public void Transferir(Departamento depPosse, Departamento depPega) {
        depPega.funcionarios[0] = depPosse.funcionarios[0];
        depPosse.funcionarios[0] = null;
    }
}

public class Pessoa {
    public static void main(String[] args) {

        Empresa emp = new Empresa();
        emp.CriaEmpresa("CEFET","123456");
        emp.CadastrarDepartamento("T.I");
        emp.CadastrarDepartamento("R.H");
        emp.CadastrarFuncionario(emp.departamentos[0],"zeus","12/12/12",100);
        emp.Aumento(emp.departamentos[0]);
        emp.Transferir(emp.departamentos[0],emp.departamentos[1]);
    }
}
