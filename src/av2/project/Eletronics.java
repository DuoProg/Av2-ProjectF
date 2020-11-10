
package av2.project;

import java.util.Random;


public class Eletronics extends Products{
    
    
    private String color;
    private String size;
    private short volume;
    
    private boolean switchedOn;
    
    short increaseVolume;
    short decreaseVolume;
    short selectedVolume;
    
    
    Eletronics(){
        
    }
    

    Eletronics(byte productType,String productName,String manufacturer,float price,String color,String size){
        setProductType(productType);
        setProductName(productName);
        setManufacturer(manufacturer);   
        setPrice(price);
        setColor(color);
        setSize(size);
        setSerialNumber(generateSerialNumber());
    }
    
    
    
    public String getColor(){            
        return color;
    }
    
    public String getSize(){
        return size;
    }
    
    public short getVolume(){
        return volume;
    }
    
    public boolean getSwitchedOn(){
        return switchedOn;
    }
    
    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public void setVolume(short volume){
        this.volume = volume;
    }
    
    public void setSwitchedOn(boolean switchedOn){
        this.switchedOn = switchedOn;
    }
    
    
    @Override
    public String generateSerialNumber(){
        String code = "ABCDEFGHIJKLMNOPQRSTUVYWXZ0123456789";
 
        Random random = new Random();
 
        String serialCode = "";
        int index;
        for( i = 0; i < 9; i++ ) {
            index = random.nextInt( code.length() );
            serialCode += code.substring( index, index + 1 );
            setSerialNumber(serialCode);
        }
        return getSerialNumber();
    }
    
    
    public void turnOn(){
        if(switchedOn == false){
            switchedOn = true;
            volume = 30;
            System.out.println("\nO aparelho ligou");
        }else{
            System.out.println("\nO aparelho já está ligado");
        }
        
    }
    
    
    public void turnOff(){
        if(switchedOn == true){
            switchedOn = false;
            System.out.println("\nO aparelho desligou");
        }else{
            System.out.println("\nO aparelho já está desligado!");
        }
    }
    
    
    public void statusVerification(){
        if(switchedOn == true){
            System.out.println("\nO aparelho está ligado no volume "+ volume);
        }else{
            System.out.println("\nO aparelho está desligado");
        }
            
       
    }
    
    
    public void volumeUp(short increaseVolume){
        if(switchedOn == true){
            if(this.volume < 100){
                this.volume += increaseVolume;
                    if(this.volume >= 100){
                        System.out.println("\nO aparelho está no maximo");
                        this.volume = 100;
                        System.out.println("\nO volume agora está em "+ this.volume);
                    }else{
                        System.out.println("\nO volume agora está em "+ this.volume);
                    }
                
            }else{
                System.out.println("\nO aparelho está no maximo.");
                
            }
            
        }else if(switchedOn == false){
            System.out.println("\nAparelho desligado.\n Deseja liga-lo?\n  1-Sim\n  2-Não\n");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                    if(this.volume < 100){
                        this.volume += increaseVolume;
                            if(this.volume >= 100){
                                System.out.println("\nO aparelho está no maximo");
                                this.volume = 100;
                                System.out.println("\nO volume agora está em "+ this.volume);
                            }else{
                                System.out.println("\nO volume agora está em "+ this.volume);
                            }
                    }else{
                        System.out.println("\nO aparelho está no maximo.");
                        
                    }
                    
                }else{
                    System.out.println("\nVoltando");
                }
                   
        }
    }
    
    
    public void volumeDown(short decreaseVolume){
        if(switchedOn == true){
            if(this.volume > 0){
                this.volume -= decreaseVolume;
                    if(this.volume <= 0){
                        System.out.println("\nO aparelho está sem som");
                        this.volume = 0;
                        System.out.println("\nO volume agora está em "+ this.volume);
                    }else{
                        System.out.println("\nO volume agora está em "+ this.volume);
                    }
            }else{
                System.out.println("\nO aparelho esta sem som");
            }
            
       }else if(switchedOn == false){
            System.out.println("\nAparelho desligado.\n Deseja liga-lo?\n  1-Sim\n  2-Não\n");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(this.volume > 0){
                            this.volume -= decreaseVolume;
                                if(this.volume <= 0){
                                    System.out.println("\nO aparelho está sem som");
                                    this.volume = 0;
                                    System.out.println("\nO volume agora está em "+ this.volume);
                                }else{
                                    System.out.println("\nO volume agora está em "+ this.volume);
                                }
                        }else{
                            System.out.println("\nO aparelho esta sem som");
                        }
                }else{
                    System.out.println("\nVoltando");
                }
                   
        }
    }
    
    
    public void selectVolume(short selectedVolume){
        if(switchedOn == true){
            if(selectedVolume >=0 && selectedVolume <=100){
                this.volume = selectedVolume;
                System.out.println("\nO volume agora é: " +this.volume);
            }else{
                System.out.println("\nVolume excedido do limite");
            }
        }else if(switchedOn == false){
            System.out.println("\nAparelho está desligado.\n\n Deseja liga-lo?\n\n 1-Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(selectedVolume >=0 && selectedVolume <=100){
                            this.volume = selectedVolume;
                            System.out.println("\nO volume agora é: " +this.volume);
                        }else{
                            System.out.println("\nVolume excedido do limite");
                        }
                }else{
                    System.out.println("\nVoltando");
                }
        }
    }
    
    
    @Override
    public void avaliableProducts(){
        System.out.println("\n\n"+ getProductName());
        System.out.println("\nFabricante: "+ getManufacturer() +
                "\nCor: "+ color + "\nTamanho: "+ size + 
                "\nNúmero de Serie: " + getSerialNumber() +
                "\nPreço: R$"+ getPrice());
    }
    
}
