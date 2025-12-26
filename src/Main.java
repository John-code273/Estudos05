void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira os dados do produto");
    System.out.print("nome: ");
    String nome = sc.nextLine();
    System.out.print("preço: ");
    double preco = sc.nextDouble();
    System.out.println("já Há quantidade no estoque?");
    boolean s = sc.nextBoolean();

    if (s){
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        Produto produto = new Produto(nome,preco,quantidade);
        System.out.println("dados do produto: "+ produto);
        System.out.print("adicione mais quanidade do produto: ");
        int add = sc.nextInt();

        produto.adicionar(add);
        System.out.println("dados do produto: "+produto);
        System.out.print("remova quanidade do produto: ");
        int rem = sc.nextInt();

        produto.remover(rem);
        System.out.println("dados do produto: "+produto);
        System.exit(0);
    }
        Produto produto = new Produto(nome, preco);
    System.out.println("dados do produto: "+ produto);
    System.out.print("adicione mais quanidade do produto: ");
    int add = sc.nextInt();

    produto.adicionar(add);
    System.out.println("dados do produto: "+produto);
    System.out.print("remova quanidade do produto: ");
    int rem = sc.nextInt();

    produto.remover(rem);
    System.out.println("dados do produto: "+produto);

}
