
package av2.project;

import java.util.Random;
import java.util.Scanner;


public abstract class Products {
    
    
    private String manufacturer;
    private String otherType;
    private String productName;
    private String serialNumber;
    private String weight;
    private byte productType;
    private float price;
    
    private byte option;
    private String[] optionNames;
    
    
    
    String[] manufacturers = new String[32];
    String[] serialNumbers = new String[32];
    
    
    Scanner input = new Scanner(System.in);
    byte good;      
    byte bad;       
    byte mad;       
    
    
    int i;
    int k;
    
    
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public String getOtherType(){
        return otherType;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public String getSerialNumber(){
        return serialNumber;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public byte getProductType(){
        return productType;
    }
    
    public float getPrice(){
        return price;
    }
    

 
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public void setOtherType(String otherType){
      this.otherType = otherType;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
        
    public void setProductType(byte productType){
        this.productType = productType;
    }
    
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public void setWeight(String weight){
      this.weight = weight;
    }

    public void setPrice(float price){
        this.price = price;
    }
    
    
   
    public String generateSerialNumber(){
        
        for( i = 0; i<manufacturers.length; i++){
           
          
            if((manufacturers[i] == null ? this.getManufacturer() != null :     
                    !manufacturers[i].equals(this.getManufacturer())) &&
                    (serialNumbers[i] == null ? this.getSerialNumber() != null :
                    !serialNumbers[i].equals(this.getSerialNumber()))){
                
                String code = "0123456789";                                     
                Random random = new Random();                                   
                String serialCode = "";
                int index;
                for( k = 0; k < 9; k++ ) {
                    index = random.nextInt( code.length() );
                    serialCode += code.substring( index, index + 1 );
                    setSerialNumber(serialCode);
                }
                manufacturers[i] = this.getManufacturer();
                serialNumbers[i] = this.getSerialNumber();
                
                return getSerialNumber();
                
            }else if((manufacturers[i] == null ? this.getManufacturer() == null :
                    manufacturers[i].equals(this.getManufacturer())) && 
                    (serialNumbers[i] == null ? this.getSerialNumber() == null :
                    serialNumbers[i].equals(this.getSerialNumber()))){
                
                this.setSerialNumber(serialNumbers[i]);
                
                return getSerialNumber();
            }
            
        }
        
       return "ERR";
       
    }
    
    public void avaliableProducts(){
        System.out.println("\n\n"+ getProductName());
        System.out.println("\nFabricante: " + manufacturer + "\nTipo: " + otherType
                + "\nCodigo de Barras: " + generateSerialNumber() + "\nPreço: R$" + price);
    }
    
    
    public String findNameOption(byte option){
        for (i = 0; i <optionNames.length; i++){
            if(this.option == i){
                return optionNames[i];
            }
        }
        return "ERROR";
    }
    
    

}
