
public class Produto {
	String nome;
	double preco;
	
	void exibirDados() {
		System.out.println("Nome do produto: " + nome);
		System.out.println(
				String.format("Preço do produto: R$ %.2f ", preco));
		
	}
	
	void aplicarDesconto(double desconto) {
		double valorDesconto = preco * (desconto / 100);
		double precoComDesconto = preco - valorDesconto;
		System.out.println("Desconto aplicado: " + desconto + "%");
		System.out.println(
				String.format("Novo preço: R$ %.2f ", precoComDesconto));
	}
}
