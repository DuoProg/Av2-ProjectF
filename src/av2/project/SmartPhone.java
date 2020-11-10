
package av2.project;


public class SmartPhone extends Eletronics{
   
    private String ddNumber;
    private String firstNumber;
    private String lastNumber;
    private String completeNumber;
    
    private String unformattedNumber;
    
    private byte auto = 0;
    
    private byte vol = 0;
    private short v;
    
    byte close = 0;
    byte a = 3;
    

    public SmartPhone(byte productType,String productName,String manufacturer, float price, String color, String size) {
        super(productType,productName,manufacturer, price, color, size);
    }

    SmartPhone() {
        
    }
    
    
    public void cellPhoneFormat(String completeNumber){
        ddNumber = completeNumber.substring(0,2);
        firstNumber = completeNumber.substring(2,7);
        lastNumber = completeNumber.substring(7,11);
    }
    
    public void phoneFormat(String completeNumber){
        ddNumber = completeNumber.substring(0,2);
        firstNumber = completeNumber.substring(2,6);
        lastNumber = completeNumber.substring(6,10);
    }
    
    
    public void callMenu(String completeNumber){
        
            do{
                System.out.println("\nLigando para (" +ddNumber+ ")" +firstNumber+ "-" +lastNumber);
                System.out.println("(As opções marcadas com * só estão disponíveis"
                        + " depois na compra do aparelho)");
                System.out.println("\n 1-Adicionar Contato*\n 2-Modo Espera*\n 3-Mudo\n"
                        + " 4-Gravar*\n 5-Teclado*\n 6-Autofalante\n 7-Sair\n\n"
                        + "(Depois de "+ a +" acões a chamada é realizada)");
                a -= 1;
                System.out.println("\nOpção: ");
                good = input.nextByte();
                    
                    switch(good){
                        
                        case 1:
                            System.out.println("\nIndisponível");
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 2: 
                            System.out.println("\nIndisponível");
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 3:
                            if(vol == 0){
                                setVolume((short)0);
                                statusVerification();
                                vol += 1;
                            }else{
                                System.out.println("\nQual volume deseja?");
                                v = input.nextShort();
                                selectVolume(v);
                                statusVerification();
                                vol -= 1;
                            }
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 4:
                            System.out.println("\nIndisponível");
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 5:
                            System.out.println("\nIndisponível");
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 6:
                            if(auto == 0){
                                System.out.println("\nAutofalante ligado");
                                auto += 1;
                            }else{
                                System.out.println("\nAutofalante desligado");
                                auto -= 1;
                            }
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                        case 7:
                            break;
                            
                        default:
                            System.out.println("\nOpção não encontrada");
                            if(close < 2){
                                close += 1;
                            }else{
                                System.out.println("\nChamada realizada com sucesso\n");
                                a = 3;
                                close = 0;
                                break;
                            }
                            continue;
                            
                    }
                break;
            }while(good!=7);
    }
    
    public void makeCall(String unformattedNumber){
        if(getSwitchedOn() == true){
            completeNumber = unformattedNumber;
                if(completeNumber.length() < 10){
                    System.out.println("\n Número desconhecido");
                }
                else if(completeNumber.length() == 10){
                    phoneFormat(completeNumber);
                    callMenu(completeNumber);
                
                }else if(completeNumber.length() == 11){
                    cellPhoneFormat(completeNumber);
                    callMenu(completeNumber);
                        
                }else{
                    System.out.println("\n Número desconhecido");
                }
        }else if(getSwitchedOn() == false){
            System.out.println("\nAparelho está desligado.\n\n Deseja liga-lo?\n\n 1-Sim\n 2-Não");
            good = input.nextByte();
                if(good == 1){
                    turnOn();
                    completeNumber = unformattedNumber;
                        if(completeNumber.length() < 10){
                            System.out.println("\n Número desconhecido");
                        }
                        else if(completeNumber.length() == 10){
                            phoneFormat(completeNumber);
                            callMenu(completeNumber);
                
                        }else if(completeNumber.length() == 11){
                            cellPhoneFormat(completeNumber);
                            callMenu(completeNumber);
                        
                        }else{
                            System.out.println("\n Número desconhecido");
                        }
                    
                        }else{
                            System.out.println("\nVoltando");
                        }
        }
    }
}
