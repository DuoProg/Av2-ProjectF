
package av2.project;


public class Hygiene extends Products{
    
    Hygiene(){
        
    }
    
    Hygiene(byte productType,String manufacturer,String productName,String otherType,String weight,float price) {
        setProductType(productType);
        setManufacturer(manufacturer);
        setProductName(productName);
        setOtherType(otherType);
        setWeight(weight);
        setPrice(price);
        setSerialNumber(generateSerialNumber());
        
      
    }
    
}
