
package av2.project;


public class SoundBox extends Eletronics {
    
    private byte station;
    
    byte increaseStation;
    byte decreaseStation;
    byte selectedStation;
    
    private String[] stationNames = {null,"Rádio Recife FM(97.5 FM)",
        "Rádio CBN Recife(105.7 FM)","Rádio Nova Brasil FM(94.3 FM)",
        "Rádio Clube FMC(99.1 FM)","Rádio Mix FM Recife(103.1 FM)",
        "Rádio Transamérica Pop(92.7FM)","Rádio Nova FM(104.9 FM)",
        "Rádio Jovem Pan FM Recife(95.9 FM)"};

    
    SoundBox() {
        
    }
    
    public SoundBox(byte productType,String productName,String manufacturer, float price, String color, String size) {
        super(productType,productName,manufacturer, price, color, size);
    }

    
    @Override
    public String findNameOption(byte station){
        for (i = 0; i< stationNames.length; i++){
            if(this.station == i){
                return stationNames[i];
            }
        }
        return "ERROR";
    }
    
    
    @Override
    public void turnOn(){
        if(getSwitchedOn() == false){
            setSwitchedOn(true);
            setVolume((short)30);
            station = 1;
            System.out.println("\nO aparelho ligou");
        }else{
            System.out.println("\nO aparelho já está ligado");
        }
        
    }
    
    @Override
    public void statusVerification(){
        if(getSwitchedOn() == true){
            System.out.println("\nO aparelho está ligado na estação "+ findNameOption(station) +" e no volume "+ getVolume());
        }else{
            System.out.println("\nO aparelho está desligado");
        }
    }
    
        
    public void stationUp(byte increaseStation){
        if(getSwitchedOn() == true){
            if(this.station <= 8){ 
                this.station += increaseStation;
                    if(this.station > 8){
                        this.station -= 8;
                        increaseStation = this.station;
                        this.station = 0;
                        this.station += increaseStation;
                        System.out.println("\nA estação agora é: " +findNameOption(this.station));
                    }else{
                        System.out.println("\nA estação agora é: " +findNameOption(this.station));
                    }
            }else{
                station = 1;
                System.out.println("\nA estação agora é: " +findNameOption(station)); 
            }
            
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\nDeseja liga-lo?\n 1- Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(this.station <= 8){ 
                            this.station += increaseStation;
                                if(this.station > 8){
                                    this.station -= 8;
                                    increaseStation = this.station;
                                    this.station = 0;
                                    this.station += increaseStation;
                                    System.out.println("\nA estação agora é: " +findNameOption(this.station));
                                }else{
                                    System.out.println("\nA estação agora é: " +findNameOption(this.station));
                                }
                        }else{
                            station = 1;
                            System.out.println("\nA estação agora é: " +findNameOption(station)); 
                        }
                    
                }else{
                    System.out.println("\nVoltando");
                }
        }
    }
    
    public void stationDown(byte decreaseStation){
        if(getSwitchedOn() == true){
            if(this.station >= 1){ 
                this.station -= decreaseStation;
                    if(this.station == 0){
                        this.station = 8;
                        System.out.println("\nA estação agora é: " +findNameOption(this.station));
                        
                    }else if(this.station < 0){
                        this.station *= -1;
                        decreaseStation = this.station;
                        this.station = 8;
                        this.station -= decreaseStation;
                        input.nextLine();
                        System.out.println("\nA estação agora é: " +findNameOption(this.station));
                    } 
            }else{
                station = 8;
                System.out.println("\nA estação agora é: " +findNameOption(station));
            }
            
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n Deseja liga-lo?\n 1- Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(this.station >= 1){ 
                            this.station -= decreaseStation;
                                if(this.station == 0){
                                    this.station = 8;
                                    System.out.println("\nA estação agora é: " +findNameOption(this.station));
                        
                                }else if(this.station < 0){
                                    this.station *= -1;
                                    decreaseStation = this.station;
                                    this.station = 8;
                                    this.station -= decreaseStation;
                                    System.out.println("\nA estação agora é: " +findNameOption(this.station));
                                } 
                        }else{
                            station = 8;
                            System.out.println("\nA estação agora é: " +findNameOption(station));
                        }
                }else{
                    System.out.println("\nVoltando");
                }
        }
    }
    
    public void selectStation(byte selectedStation){
        if(getSwitchedOn() == true){
            if(selectedStation > 0 && selectedStation < 9){
                station = selectedStation;
                System.out.println("\nA estação agora é: " +findNameOption(station));
            }else{
                System.out.println("\nEstação indísponivel");
            }
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n Deseja liga-lo?\n 1- Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                        if(selectedStation > 0 && selectedStation < 9){
                            station = selectedStation;
                            System.out.println("\nA estação agora é: " +findNameOption(station));
                        }else{
                            System.out.println("\nEstação indísponivel");
                        }
                }else{
                    System.out.println("\nVoltando");
                }
        }
    }
    
}
