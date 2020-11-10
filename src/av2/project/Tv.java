
package av2.project;


public class Tv extends Eletronics{
    
    private byte channel;
    
    byte increaseChannel;
    byte decreaseChannel;
    byte selectedChannel;
    
    
    private String[] channelNames = {null,"Rede Globo","RecordTv","RedeTv!",
        "Band","Tv Cultura","SBT","Canal Futura","Rede 21","SporTv","Netflix"};
    
    
    Tv(){
        
    }
    
    public Tv(byte productType,String productName,String manufacturer, float price, String color, String size) {
        super(productType,productName,manufacturer, price, color, size);
    }

    

    @Override
    public void turnOn(){
        if(getSwitchedOn() == false){
            setSwitchedOn(true);
            setVolume((short)30);
            channel = 1;
            System.out.println("\nO aparelho ligou");
        }else{
            System.out.println("\nO aparelho já está ligado");
        }
        
    }
    
    @Override
    public void statusVerification(){
        if(getSwitchedOn() == true){
            System.out.println("\nO aparelho está ligado no canal "+ findNameOption(channel) +" e no volume "+ getVolume());
        }else{
            System.out.println("\nO aparelho está desligado");
        }
    }
    
    
    @Override
    public String findNameOption(byte channel){
        for (i = 0; i <channelNames.length; i++){
            if(this.channel == i){
                return channelNames[i];
            }
        }
        return "ERROR";
    }
    
    
    public void channelUp(byte increaseChannel){
        if(getSwitchedOn() == true){
            if(this.channel<=10){ 
                this.channel += increaseChannel;
                    if(this.channel > 10){
                        this.channel -= 10;
                        increaseChannel = this.channel;
                        this.channel = 0;
                        this.channel += increaseChannel;
                        System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                    }else{
                        System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                    }
            }else{
                channel = 1;
                System.out.println("\nO canal agora é: " +findNameOption(channel)); 
            }
            
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n Deseja liga-lo?\n 1- Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(this.channel<=10){ 
                            this.channel += increaseChannel;
                                if(this.channel > 10){
                                    this.channel -= 10;
                                    increaseChannel = this.channel;
                                    this.channel = 0;
                                    this.channel += increaseChannel;
                                    System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                                }else{
                                    System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                                }
                        }else{
                            channel = 1;
                            System.out.println("\nO canal agora é: " +findNameOption(channel));
                        }
                    
                }else{
                    System.out.println("\nVoltando");
                }
        }
        
    }
    
    public void channelDown(byte decreaseChannel){
        if(getSwitchedOn() == true){
            if(this.channel >= 1){ 
                this.channel -= decreaseChannel;
                    if(this.channel == 0){
                        this.channel =10;
                        System.out.println("\nO canal agora é: " +findNameOption(this.channel)); 
                    }else if(this.channel<0){
                        this.channel *= -1;
                        decreaseChannel = this.channel;
                        this.channel = 10;
                        this.channel -= decreaseChannel;
                        input.nextLine();
                        System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                    } 
            }else{
                channel = 10;
                System.out.println("\nO canal agora é: " +findNameOption(channel)); 
            }
            
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n Deseja liga-lo?\n 1- Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                    if(this.channel >= 1){ 
                        this.channel -= decreaseChannel;
                            if(this.channel == 0){
                                this.channel = 10;
                                System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                        
                            }else if(this.channel < 0){
                                this.channel *= -1;
                                decreaseChannel = this.channel;
                                this.channel =10;
                                this.channel -= decreaseChannel;
                                System.out.println("\nO canal agora é: " +findNameOption(this.channel));
                            } 
                    }else{
                        channel = 10;
                        System.out.println("\nO canal agora é: " +findNameOption(channel)); 
                    }
                }else{
                    System.out.println("\nVoltando");
                }
        }
        
    }
    
    public void selectChannel(byte selectedChannel){
        if(getSwitchedOn() == true){
            if(selectedChannel >= 1 && selectedChannel <= 10){
                channel = selectedChannel;
                System.out.println("\nO canal agora é: " +findNameOption(channel));
            }else{
                System.out.println("\nCanal indísponivel");
            }
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n\n Deseja liga-lo?\n\n 1-Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                    if(selectedChannel >= 1 && selectedChannel <= 10){
                        channel = selectedChannel;
                        System.out.println("\nO canal agora é: " +findNameOption(channel));
                    }else{
                        System.out.println("\nCanal Indisponível");
                    }
                }else{
                    System.out.println("\nVoltando");
                }
        }
    }
}
