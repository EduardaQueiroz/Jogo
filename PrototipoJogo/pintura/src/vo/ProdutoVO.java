package vo;

public class ProdutoVO {

	private String nome;
	private double preco;
	private String marca;
	
	public ProdutoVO(EstoqueVO estoque) {
		
	}
	
	public ProdutoVO(String nome, double preco, String marca, EstoqueVO estoque) {
		estoque.produto.nome = nome;
		estoque.produto.marca = marca;
		estoque.produto.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	
}
