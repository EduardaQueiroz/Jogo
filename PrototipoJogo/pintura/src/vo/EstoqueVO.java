package vo;

public class EstoqueVO {
	
	ProdutoVO produto; //RAM

	public EstoqueVO() {
		super();
		produto = new ProdutoVO(this);
	}
	
	

}
