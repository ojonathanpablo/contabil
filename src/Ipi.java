public class Ipi extends Pagamentos implements Calculo{
    protected Double aliquota = 5.0;
    protected Double valorDoProduto; 
    protected Double frete;
    protected Double seguro;
    protected Double outrasDespesas;

//CONSTRUTOR---------------------
public Ipi(){}

public Ipi( Double valorDoProduto, Double frete, Double seguro, Double outrasDespesas ){
    
    this.aliquota = aliquota;
    this.valorDoProduto = valorDoProduto;
    this.frete = frete;
    this.seguro = seguro;
    this.outrasDespesas = outrasDespesas;
    }
//GET E SET----------------------
public Double getAliquota(){
    return aliquota;
}
public void setAliquota(Double aliquota){
    this.aliquota = aliquota;
}
//------------------------
public Double getValorDoProduto(){
    return valorDoProduto;
}
public void setValorDoProduto(Double valorDoProduto){
    this.valorDoProduto = valorDoProduto;
}
//-----------------------
public Double getFrete(){
    return frete;
}
public void setFrete(Double frete){
    this.frete = frete;
}
//------------------------
public Double getSeguro(){
    return seguro;
}
public void setSeguro(Double seguro){
    this.seguro = seguro;
}
//------------------------
public Double getOutrasDespesas(){
    return outrasDespesas;
}
public void setOutrasDespesas(Double outrasDespesas){
    this.outrasDespesas = outrasDespesas;
}
 
//METODOS ABSTRACT--------------------------

// valor R$ 90, frete R$
// 10, seguro R$ 5, outras despesas R$ 5;
// alíquota = 5%; IPI = (90 + 10 + 5 + 5) * 5%
// = R$ 5,5.


@Override
    public Double calculoImposto(){
        double total = valorDoProduto + frete + seguro + outrasDespesas;
        total *= aliquota / 100;
        return total;
    }
@Override
    public void descricao(){
        System.out.println("IPI: ");
    }  


}
