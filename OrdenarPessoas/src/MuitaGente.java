public class MuitaGente {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adcionarPessoa("Matheus", 19, 1.74);
        pessoas.adcionarPessoa("Suehtam", 91, 47.1);
        pessoas.adcionarPessoa("joao", 21, 1.5);
        pessoas.adcionarPessoa("Henrique", 12, 1.4);
        pessoas.adcionarPessoa("Ana", 18, 1.67);
        pessoas.adcionarPessoa("Alice", 30, 1.6);
        pessoas.adcionarPessoa("Carlos", 15, 1.9);
        pessoas.adcionarPessoa("Ze", 13, 1.34);

        System.out.println(pessoas.ordenarPorAltura());
    }
}
