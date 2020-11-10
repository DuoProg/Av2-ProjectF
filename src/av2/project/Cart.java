
package av2.project;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Cart extends Products {

    private String products;
    private String manufacturerProducts;
    private byte qtd;
    private byte codProducts;
    Products selection;
    private float newPrice;
    private float realPrice;
    private float allPrice;
    
    
     ArrayList<Products> produtos = new ArrayList<Products>();
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    float p = 0;
    
    
    
    Cart() {
        
    }
    
    
    public byte getCodProducts(){
        return codProducts;
    }
    
    public String getProducts(){
        return products;
    }
    
    public String getManufacturerProducts(){
        return manufacturerProducts;
    }
    
    public byte getQtd(){
        return qtd;
    }
    
    public float getRealPrice(){
        return realPrice;
    }
    
    public float getAllPrice(){
        return allPrice;
    }
    
    
    //Metodos SET
    public void setCodProducts(byte codProducts){
        this.codProducts = codProducts;
    }
    
    public void setProducts(String products) {
        this.products = products;        
    }
    
    public void setManufacturerProducts(String manufacturerProducts){
        this.manufacturerProducts = manufacturerProducts;
    }
   
    public void setQtd(byte qtd){
       this.qtd = qtd;
    }
    
    public void setRealPrice(float realPrice){
        this.realPrice = realPrice;
    }
    
    public void setAllPrice(float allPrice){
        this.allPrice = allPrice;
    }
    
    
    public void cartRegistration(Products selection){
        System.out.println("\nQual a quantidade que deseja?");
        System.out.print("\nOpção: ");
        setQtd(input.nextByte());
        setProducts(selection.getProductName());
        setCodProducts(selection.getProductType());
        setPrice(selection.getPrice());
        
    }
    
    public void showCartProducts(){
        newPrice = 0;
        System.out.println("\n"+ getProducts());
        System.out.println("Quantidade: "+ getQtd());
        newPrice += (getQtd() * getPrice());
        System.out.println("Preço : R$ "+ df.format(newPrice));
        
        
    }
    
    public float plusNewPrice(){
        return this.newPrice;
    }
    
    
    public void allPriceBrazil(float p){
        System.out.println("\nTotal: R$ "+ df.format(p));
    }
}
