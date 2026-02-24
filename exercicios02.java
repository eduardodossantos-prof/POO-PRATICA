class exercicios02{
    private String nome;
    private int cpf;
    private int senha;
    private int Confirmar_Senha;

    public exercicios02(String nome, int cpf, int senha, int Confirmar_Senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.Confirmar_Senha = Confirmar_Senha;
    }   

    public String getnome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }

    public int getsenha(){
        return senha;
    }

    public boolean Confirmar_Senha(){
        if (senha == Confirmar_Senha){
            return true;
        }
        else{
            return false;
        }
    }
}

class Main{
    public static void main(String[] args) {
        exercicios02 aluno1 = new exercicios02("Eduardo dos Santos", 8888, 1234, 1234);   
        System.out.println("DADOS DO CADASTRO DO ALUNO");
        System.out.println("Nome do Aluno: " + aluno1.getnome());
        System.out.println("CPF: " + aluno1.getCpf());
        System.out.println("Senha: " + aluno1.getsenha());
        if(aluno1.Confirmar_Senha() == true){
            System.out.println("Senha Confirmada (true/false): " + aluno1.Confirmar_Senha());
        }else{
            System.out.println("Senha Confirmada (true/false): " + aluno1.Confirmar_Senha());
        }    
        System.out.println("----------------------------------------------------------------");
        System.out.println("CADASTRO REALIZADO COM SUCESSO");
    }
}