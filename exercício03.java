import java.util.Scanner;

class Exercicio03 {
    Scanner leitor2 = new Scanner(System.in);
    private int N;
    private int QA;
    private int QC;

    public Exercicio03(int N) {
        this.N = N;
    }

    public void executarMaquininha() {
        String[] Comandos = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o comando: ");
            Comandos[i] = leitor2.nextLine();
        }
        boolean maquinaligada = false;
        int cafe_servido = 0;
        int cafe_feito = 0;
        int quantidade_cafe_feito_agua;
        int quantidade_cafe_feito_po;
        for (int j = 0; j < N; j++) {
            if (Comandos[j].equals("L")) {
                maquinaligada = true;
                System.out.println("MAQUINA LIGADA!!");
            } else if (Comandos[j].equals("D")) {
                if (maquinaligada) {
                    maquinaligada = false;
                    System.out.println("MAQUINA DESLIGADA!!");
                } else {
                    System.out.println("MAQUINA AINDA NÃO LIGADA!!");
                }
            } else if (Comandos[j].contains(" ")) {
                String[] partes = Comandos[j].split(" ");
                String comando = partes[0];
                int valor = Integer.parseInt(partes[1]);     
                AbastecerMaquina(comando, valor);   
            } else if (Comandos[j].equals("C")) {
                if (maquinaligada) {
                    System.out.println("TENTA FAZER CAFÉ!!");
                    if (QA > 0 && QC > 0)
                    {
                        quantidade_cafe_feito_agua = QA / 100;
                        quantidade_cafe_feito_po = QC - (20 * quantidade_cafe_feito_agua);
                        if (quantidade_cafe_feito_agua == 0 && quantidade_cafe_feito_po != 0){
                            cafe_feito = quantidade_cafe_feito_agua;
                            System.out.println("ERRO! Quantidade de aguá insuficiente, a quantidade de café restante é " + quantidade_cafe_feito_po + " g.");
                        }else if (quantidade_cafe_feito_agua == 0 && quantidade_cafe_feito_po == 0){
                            cafe_feito = quantidade_cafe_feito_agua;
                            System.out.println("ERRO! Ingredientes Insuficientes");
                        }else{
                            cafe_feito = quantidade_cafe_feito_agua;
                            QA -= cafe_feito * 100;
                            QC -= cafe_feito * 20;
                            System.out.println("Café feito " + cafe_feito + " xícaras");
                        }
                    }else {
                        System.out.println("ERRO! Ingredientes Insuficientes");
                    }
                } else {
                    System.out.println("ERRO! MÁQUINA DESLIGADA!");
                }
                cafe_servido = cafe_feito;
                System.out.println("Total de cafés: "+ cafe_servido);
            }
        } 
        leitor2.close();
    }

    public void AbastecerMaquina(String comando, int valor){
        if(valor > 1000) System.out.println("Valor acima da Capacidade permitida!!");
            else{
                if (comando.equals("A")) {
                    if (QA >= 1000){
                        System.out.println("Capacidade Máxima Atingida!!");
                    }else{
                        if(QA + valor >= 1000){
                            QA = 1000;
                            System.out.println("Capacidade maxima atingida!! Agua excedente descartada.");
                        }else{
                            QA += valor;
                        }
                    }
                }else if (comando.equals("G")) {
                    if (QC >= 500){
                        System.out.println("Capacidade Máxima Atingida!!");
                    }
                    else {
                        if(QC + valor >= 500){
                            QC = 500;
                            System.out.println("Capacidade maxima atingida!! Cafe excedente descartada.");
                        }else{
                            QC += valor;
                        }
                    }
            }
        }
     }
}

class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("A quantidade de comandos a executar: ");
        int N = leitor.nextInt();
        leitor.nextLine();

        Exercicio03 maquina = new Exercicio03(N);
        maquina.executarMaquininha();

        leitor.close();
    }
}