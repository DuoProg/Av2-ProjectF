
package av2.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Av2Project {

    private static Scanner support;



	private static void showBackQtd() {
        System.out.println("\nVocÃª ja comprou esse item,"
        + "caso queria mudar a quantidade comprada,"
        + "volte pro Menu Inicial e aperte na "
        + "OpÃ§Ã£o 5 (Carrinho APSMart");
    }
    
    
   
    public static void main(String[] args) {
       
        ArrayList<Customers> users = new ArrayList<>();
        ArrayList<Customers> usersCard = new ArrayList<>();
        ArrayList<Cart> userCart = new ArrayList<>();
    
        Cart userProducts = new Cart();
        Customers user = new Customers();              
        Customers userCard = new Customers();
        
 
        Cart cartExample = new Cart();
        Customers userExample = new Customers();
        Tv tvExample = new Tv();
        SoundBox soundBoxExample = new SoundBox();
        SmartPhone smartPhoneExample = new SmartPhone();
        
        
        
        
        try (Scanner keyboard = new Scanner(System.in)) {
			support = new Scanner(System.in);
			byte choice;        
			byte alternative;   
			byte option;             
			
			String dd;
			byte c;
			byte o;
			byte u;
			short v;
			int l;
			float t = 0;
			int x = 1;
			int y = 3;
			x = y++;
			System.out.println("X = " + x);
			System.out.println("y = " + y);
			
			int i;
			byte k;
			
   
			Tv sony = new Tv((byte)1,"Smart TV LED 50\" Sony KDL","Sony",1899.99f,"Azul","1130 x 900 cmÂ²");
			Tv lg = new Tv((byte)2,"Smart TV OLED 65\" Ultra HD 4k","LG",13999.99f,"Roxa","1449 x 831 cmÂ²");
			SoundBox jbl = new SoundBox((byte)3,"JBL GO 2","JBL",239.99f,"Verde Oliva","8.6 x 7.12 cmÂ²");
			SoundBox harmanKardon = new SoundBox((byte)4,"Onyx Studio 5","harman/kardon",1899.99f,"Amarelo Mostarda","8.4 x 6.24 cmÂ²");
			SmartPhone lenovo = new SmartPhone((byte)5,"Smartphone Lenovo Vibe B","Lenovo",399.99f,"Vermelho Vinho","14.5 x 7.6 cmÂ²");
			SmartPhone samsung = new SmartPhone((byte)6,"Samsung Galaxy S10","Samsung",4999.99f,"Rosa Choque","15.8 x 8.8 cmÂ²");
			Foods urbano = new Foods((byte)7,"Urbano","FeijÃ£o Carioca - Urbano","FeijÃ£o Carioca","1 Kg",9.99f);
			Foods camil = new Foods((byte)8,"Camil","FeijÃ£o Preto - Camil","FeijÃ£o Preto","1 Kg",6.99f);
			Foods brotoLegal = new Foods((byte)9,"Broto Legal","Arroz Branco GrÃ£o-Longo - Broto Legal","Arroz Branco GrÃ£o-Longo","5 Kg",13.99f);
			Foods tioJoÃ£o = new Foods((byte)10,"Tio JoÃ£o","Arroz Integral - Tio JoÃ£o","Arroz Integral","0,5 Kg",5.99f);
			Foods sadia = new Foods((byte)11,"Sadia","FilÃ© de Frango - Sadia","FilÃ© de Frango","1 Kg",9.99f);
			Foods aurora = new Foods((byte)12,"Aurora","LinguiÃ§a de Porco - Aurora","LinguiÃ§a de Calabresa - Enroladinha","0,8 Kg",9.99f);
			Hygiene colgate = new Hygiene((byte)13,"Colgate","Colgate Total 12 Professional Gengiva Saudavel","Creme Dental - Colgate","0.07 Kg",5.99f);
			Hygiene sensodyne = new Hygiene((byte)14,"Sensodyne","Sensodyne Pro-Esmalte","Creme Dental - Sensodyne","0.05 Kg",9.99f);
			Hygiene elseve = new Hygiene((byte)15,"Elseve","Shampoo Loreal Elseve Arginina Resist X3","Shampoo Fortificador - Elseve","400 mL",18.99f);
			Hygiene clear = new Hygiene((byte)16,"Clear","Shampoo Clear Men Anticaspa Ice Cool Menthol","Shampoo Anti-Caspa - Clear Men","200 mL",12.99f);
			Hygiene dove = new Hygiene((byte)17,"Dove","Dove Cremoso","Sabonete - Dove","0.09 Kg",2.99f);
			Hygiene protex = new Hygiene((byte)18,"Protex","Protex Limpeza Profunda","Sabonete - Protex","0.09 Kg",2.99f);
			
			
			do{
			    
			    userExample.showMainMenu();
			    choice = keyboard.nextByte();
			    
			    
			    switch (choice) {
			        case 1:
			            user.registration();      
			            users.add(user);          
			            user = new Customers();   
			            break;
			            
			        case 2:
			            
			            sony.avaliableProducts();
			            lg.avaliableProducts();
			            jbl.avaliableProducts();
			            harmanKardon.avaliableProducts();
			            lenovo.avaliableProducts();
			            samsung.avaliableProducts();
			            urbano.avaliableProducts();
			            camil.avaliableProducts();
			            brotoLegal.avaliableProducts();
			            tioJoÃ£o.avaliableProducts();
			            sadia.avaliableProducts();
			            aurora.avaliableProducts();
			            colgate.avaliableProducts();
			            sensodyne.avaliableProducts();
			            elseve.avaliableProducts();
			            clear.avaliableProducts();
			            dove.avaliableProducts();
			            protex.avaliableProducts();
			            System.out.println("\nDigite 0 para continuar!");
			            keyboard.next();
			            break;
			            
			        case 3:
			            do{
			                
			                System.out.println("\nBem vindo ao menu para testar nosso produtos da Ã�rea de EletrÃ´nicos");
			                System.out.println(" \nDigite o respectivo nÃºmero para a opÃ§Ã£o que deseja:");
			                System.out.println("\n 1-TV\n 2-SoundBox\n 3-SmartPhone\n 4-Sair");
			                System.out.print("\nOpÃ§Ã£o: ");
			                alternative = keyboard.nextByte();
			                
			                switch(alternative){
			                    
			                    case 1:
			                        do{
			                            
			                            System.out.println("\nMenu da TV:");
			                            System.out.println("\n O que deseja testar?");
			                            System.out.println("\n 1-Ligar\n 2-Desligar\n "
			                                    + "3-Verificar o status da TV\n "
			                                    + "4-Selecionar o volume\n "
			                                    + "5-Aumentar Volume\n 6-Diminuir Volume\n "
			                                    + "7-Selecionar o canal\n 8-Canal Superior\n "
			                                    + "9-Canal Inferior\n 10-Sair");                                       
			                            System.out.print("\nOpÃ§Ã£o: ");
			                            option = keyboard.nextByte();
			                            
			                            switch(option){
			                                
			                                case 1:
			                                    tvExample.turnOn();
			                                    continue;
			                            
			                                case 2:
			                                    tvExample.turnOff();
			                                    continue;
			                                    
			                                case 3:
			                                    tvExample.statusVerification();
			                                    continue;
			                            
			                                case 4:
			                                    System.out.print("\n Digite o volume que deseja: ");
			                                    v = keyboard.nextShort();
			                                    tvExample.selectVolume(v);
			                                    continue;
			                            
			                                case 5:
			                                    System.out.print("\n Digite quanto quer aumentar o volume: ");
			                                    tvExample.increaseVolume = keyboard.nextShort();
			                                    tvExample.volumeUp(tvExample.increaseVolume);
			                                    continue;
			                            
			                                case 6:
			                                    System.out.print("\n Digite quanto quer diminuir o volume: ");
			                                    tvExample.decreaseVolume = keyboard.nextShort();
			                                    tvExample.volumeDown(tvExample.decreaseVolume);
			                                    continue;
			                            
			                                case 7:
			                                    System.out.println("\n Qual o canal que deseja?");
			                                    System.out.println("(1-Rede Globo,2-RecordTV,3-RedeTv!,"
			                                            + "4-Band,5-Tv Cultura,6-SBT,7-Canal Futura,"
			                                            + "8-Rede 21,9-SportTv,10-Netflix)");
			                                    System.out.print("\nOpÃ§Ã£o: ");
			                                    c = keyboard.nextByte();
			                                    tvExample.selectChannel(c);
			                                    continue;
			                            
			                                case 8:
			                                    System.out.print("\n Digite quanto deseja subir o canal: ");
			                                    tvExample.increaseChannel = keyboard.nextByte();
			                                    tvExample.channelUp(tvExample.increaseChannel);
			                                    continue;
			                            
			                                case 9:
			                                    System.out.print("\n Digite quanto deseja descer o canal: ");
			                                    tvExample.decreaseChannel = keyboard.nextByte();
			                                    tvExample.channelDown(tvExample.decreaseChannel);
			                                    continue;
			                            
			                                case 10:
			                                    break;
			                            
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                    continue;
			                                    
			                            }
			                            break;
			                            
			                        }while(option != 10);
			                        
			                        break;
			                        
			                    case 2:
			                        do{
			                            
			                            System.out.println("\nMenu da SoundBox:");
			                            System.out.println("\n O que deseja testar?");
			                            System.out.println("\n 1-Ligar\n 2-Desligar\n "
			                                    + "3-Verificar o status da SoundBox\n"
			                                    + " 4-Selecionar o volume\n 5-Aumentar Volume\n "
			                                    + "6-Diminuir Volume\n"+ " 7-Selecionar a estaÃ§Ã£o\n"
			                                    + " 8-EstaÃ§Ã£o Superior\n 9-EstaÃ§Ã£o Inferior\n 10-Sair");
			                            System.out.print("\nOpÃ§Ã£o: ");
			                            option = keyboard.nextByte();
			                    
			                            switch(option){
			                        
			                                case 1:
			                                    soundBoxExample.turnOn();
			                                    continue;
			                            
			                                case 2:
			                                    soundBoxExample.turnOff();
			                                    continue;
			                            
			                                case 3:
			                                    soundBoxExample.statusVerification();
			                                    continue;
			                            
			                                case 4:
			                                    System.out.print("\n Digite qual volume deseja: ");
			                                    v = keyboard.nextShort();
			                                    soundBoxExample.selectVolume(v);
			                                    continue;
			                            
			                                case 5:
			                                    System.out.print("\n Digite quanto quer aumentar o volume: ");
			                                    soundBoxExample.increaseVolume = keyboard.nextShort();
			                                    soundBoxExample.volumeUp(soundBoxExample.increaseVolume);
			                                    continue;
			                            
			                                case 6:
			                                    System.out.print("\n Digite quanto quer diminuir o volume: ");
			                                    soundBoxExample.decreaseVolume = keyboard.nextShort();
			                                    soundBoxExample.volumeDown(soundBoxExample.decreaseVolume);
			                                    continue;
			                            
			                                case 7:
			                                    System.out.println("\n Qual a estaÃ§Ã£o deseja?");
			                                    System.out.println("(1-RÃ¡dio Recife FM(97.5 FM),"
			                                            + "2-RÃ¡dio CBN Recife(105.7 FM),"
			                                            + "3-RÃ¡dio Nova Brasil FM(94.3 FM),"
			                                            + "4-RÃ¡dio Clube FMC(99.1 FM),"
			                                            + "5-RÃ¡dio Mix FM Recife(103.1 FM),"
			                                            + "6-RÃ¡dio TransamÃ©rica Pop(92.7FM),"
			                                            + "7-RÃ¡dio Nova FM(104.9 FM),"
			                                            + "8-RÃ¡dio Jovem Pan FM Recife(95.9 FM))");
			                                    System.out.print("\nOpÃ§Ã£o: ");
			                                    c = keyboard.nextByte();
			                                    soundBoxExample.selectStation(c);
			                                    continue;
			                            
			                                case 8:
			                                    System.out.print("\n Digite em quanto deseja subir a estaÃ§Ã£o: ");
			                                    soundBoxExample.increaseStation = keyboard.nextByte();
			                                    soundBoxExample.stationUp(soundBoxExample.increaseStation);
			                                    continue;
			                            
			                                case 9:
			                                    System.out.print("\n Digite quanto deseja descer a estaÃ§Ã£o: ");
			                                    soundBoxExample.decreaseStation = keyboard.nextByte();
			                                    soundBoxExample.stationDown(soundBoxExample.decreaseStation);
			                                    continue;
			                            
			                                case 10:
			                                    break;
			                            
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                    continue;
			                            } 
			                            break;
			                            
			                        }while(option != 10);
			                        
			                        break;
			                        
			                    case 3:
			                        do{
			                            
			                            System.out.println("\nMenu do Smartphone:");
			                            System.out.println("\n O que deseja testar?");
			                            System.out.println("\n 1-Ligar\n 2-Desligar\n "
			                                    + "3-Verificar o status do SmartPhone\n "
			                                    + "4-Selecionar o volume\n 5-Aumentar Volume\n "
			                                    + "6-Diminuir Volume\n 7-Fazer Chamada\n 8-Sair");
			                            System.out.print("\nOpÃ§Ã£o: ");
			                            option = keyboard.nextByte();
			                    
			                            switch(option){
			                                
			                                case 1:
			                                    smartPhoneExample.turnOn();
			                                    continue;
			                            
			                                case 2:
			                                    smartPhoneExample.turnOff();
			                                    continue;
			                            
			                                case 3:
			                                    smartPhoneExample.statusVerification();
			                                    continue;
			                            
			                                case 4:
			                                    System.out.print("\n Digite o volume que deseja: ");
			                                    v = keyboard.nextShort();
			                                    smartPhoneExample.selectVolume(v);
			                                    continue;
			                            
			                                case 5:
			                                    System.out.print("\n Digite em quanto quer aumentar o volume: ");
			                                    smartPhoneExample.increaseVolume = keyboard.nextShort();
			                                    smartPhoneExample.volumeUp(smartPhoneExample.increaseVolume);
			                                    continue;
			                            
			                                case 6:
			                                    System.out.print("\n Digite em quanto quer diminuir o volume: ");
			                                    smartPhoneExample.decreaseVolume = keyboard.nextShort();
			                                    smartPhoneExample.volumeDown(smartPhoneExample.decreaseVolume);
			                                    continue;
			                            
			                                case 7:
			                                    System.out.println("\n Digite o nÃºmero desejado para a ligaÃ§Ã£o: \n"
			                                            + "(00)00000-0000[Celular] ou (11)1111-1111[Telefone]");
			                                    System.out.print("\nNÃºmero: ");
			                                    dd = support.nextLine();
			                                    smartPhoneExample.makeCall(dd);
			                                    continue;
			                                    
			                                    
			                                case 8:
			                                    break;
			                            
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                    continue;
			                                    
			                            }
			                            break;
			                            
			                        }while(option != 8);
			                        break;
			                        
			                    case 4:
			                        break;
			                        
			                    default:
			                        System.out.println("\nOpÃ§Ã£o indisponÃ­vel");
			                        break;
			                }
			                
			            }while(alternative != 4);
			            break;
			        case 4:
			            
			            
			            keyboard.nextLine();
			            System.out.println("\nLogin");
			            System.out.print("\nNome de UsuÃ¡rio: ");
			            String login = keyboard.nextLine();
			            System.out.print("\nSenha: ");
			            String keyPassword = keyboard.nextLine();
			            if (users.isEmpty()) {
			                System.out.println("\nUsuÃ¡rio NÃ£o Encontrado");
			                System.out.println("\nDeseja Cadastrar-se? (1- Sim, 2- NÃ£o)");
			                System.out.print("\nOpÃ§Ã£o: ");
			                l = keyboard.nextInt();
			                switch(l){
			                    
			                    case 1:
			                        user.registration();      
			                        users.add(user);          
			                        user = new Customers();   
			                        break;
			                        
			                    case 2:
			                        break;
			                        
			                    default:
			                        System.out.println("OpÃ§Ã£o Inexistente");
			                        break;
			                }break;
			                
			            }else{
			                i=0;
			                while(i<users.size()){
			                    if(users.get(i).getUserName().compareTo(login) != 0){                                    
			                        System.out.println("\nUsuÃ¡rio nÃ£o foi encontrado!");
			                        i++;
			                    }else{
			                        if(users.get(i).getPassword().compareTo(keyPassword) != 0){                             
			                            System.out.println("\nSenha Incorreta!");
			                            i++;
			                        }else{
			                            System.out.println("\nBem vindo de volta, " + users.get(i).getName() + "\n");
			                            System.out.println("Menu de Compra");
			                            System.out.println("\n 1-EletrÃ´nicos\n 2-Alimentos\n 3-Higiene\n 4-Sair");
			                            System.out.print("\nOpÃ§Ã£o: ");
			                            choice = keyboard.nextByte();
			                            
			                            
			                            switch(choice){
			                            
			                                case 1:do{
			                                   
			                                        System.out.println("\nMenu de EletrÃ´nicos");
			                                        System.out.println("\n 1-Tv\n 2-Smartphone\n 3-Caixa de Som\n 4-Sair");
			                                        System.out.print("\nOpÃ§Ã£o: ");
			                                        alternative = keyboard.nextByte();
			                                        
			                                        switch(alternative){
			                                            
			                                            case 1:
			                                                
			                                                do{
			                                                     System.out.println("\nMenu de Compra de TV");
			                                                    System.out.println("\n 1-Smart TV LED 50 Sony KDL \n "
			                                                            + "2-Smart TV OLED 65 Ultra HD 4k\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(sony);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != sony.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(sony);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }

			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(lg);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != lg.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(lg);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                        default:
			                                                    }
			                                                    break;
			                                                    
			                                                }while(option != 3);
			                                                continue;
			                                            case 2:
			                                                do{
			                                                    System.out.println("\nMenu de Compra do SmartPhone");
			                                                    System.out.println("\n 1-Smartphone Lenovo Vibe B\n"
			                                                            + " 2-Samsung Galaxy S10\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(lenovo);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != lenovo.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(lenovo);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                            case 2:
			                                                            
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(samsung);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != samsung.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(samsung);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                            
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                            continue;
			                                                    }
			                                                    break;
			                                                    
			                                                }while(option != 3);
			                                                continue;
			                                            case 3:
			                                                do{
			                                                    System.out.println("\nMenu de Compra da Caixa de Som");
			                                                    System.out.println("\n 1-JBL GO 2\n "
			                                                            + "2-Onyx Studio 5\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            
			                                                           if(userCart.isEmpty()){ 
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(jbl);
			                                                                userProducts = new Cart();
			                                                           }
			                                                           else if(userCart.size()<10){
			                                                                
			                                                                    if(userCart.get(i).getCodProducts() != jbl.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(jbl);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            
			                                                           
			                                                        case 2:
			                                                            
			                                                             if(userCart.isEmpty()) {
			                                                              userCart.add(userProducts);
			                                                                userProducts.cartRegistration(harmanKardon);
			                                                                userProducts = new Cart();
			                                                             }
			                                                             else if(userCart.size()<10){
			                                                                
			                                                                    if(userCart.get(i).getCodProducts() != harmanKardon.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(harmanKardon);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                        
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                             
			                                                             
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                            continue;
			                                                    }
			                                                    break;
			                                                    
			                                                }while(option != 3);
			                                                
			                                                break;
			                                            case 4:
			                                                break;
			                                            default:
			                                                System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                                break;
			                                        }
			                                        
			                                        }while(alternative != 4);
			                                         break;
			                                    
			                                case 2:
			                                    do{
			                                        System.out.println("\nMenu de Alimentos:");
			                                        System.out.println("\n 1-FeijÃ£o\n 2-Arroz\n 3-Carne\n 4-Sair");
			                                        System.out.print("\nOpÃ§Ã£o: ");
			                                        alternative = keyboard.nextByte();
			                                        
			                                        switch(alternative){
			                                            
			                                            case 1:
			                                                do{
			                                                    System.out.println("\nMenu de Compra de FeijÃ£o");
			                                                    System.out.println("\n 1-FeijÃ£o Carioca Urbano\n"
			                                                            + " 2-FeijÃ£o Preto Camil\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(urbano);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != urbano.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(urbano);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(camil);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != camil.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(camil);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                                            break;
			                                                            
			                                                    }break;
			                                                }while(option != 3);
			                                                continue;
			                                            case 2:
			                                                do{
			                                                    System.out.println("\nMenu de Compra de Arroz");
			                                                    System.out.println("\n 1-Arroz Branco GrÃ£o-Longo Broto Legal\n"
			                                                            + " 2-Arroz Integral Tio JoÃ£o\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte(); 
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(brotoLegal);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != brotoLegal.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(brotoLegal);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(tioJoÃ£o);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != tioJoÃ£o.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(tioJoÃ£o);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                    }break;
			                                                    
			                                                }while(option != 3);
			                                                 break;
			                                            case 3:
			                                                do{
			                                                    System.out.println("\nMenu de Compra");
			                                                    System.out.println("\n 1-FilÃ© de Frango Sadia\n"
			                                                            + " 2-LinguiÃ§a de Porco Aurora\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(sadia);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != sadia.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(sadia);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(aurora);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != aurora.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(aurora);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                    }break;
			                                                    
			                                                }while(option != 3);
			                                                 break;
			                                case 4:
			                                    break;
			                                    
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o Incorreta");
			                                    break;
			                                    }
			                                        
			                            }while(alternative != 4);
			                            break;
			                    case 3:
			                          do{
			                                        System.out.println("\nMenu de Alimentos:");
			                                        System.out.println("\n 1-Pasta de dente\n 2-Shampoo\n 3-Sabonete\n 4-Sair");
			                                        System.out.print("\nOpÃ§Ã£o: ");
			                                        alternative = keyboard.nextByte();
			                                        
			                                        switch(alternative){
			                                            
			                                            case 1:
			                                                do{
			                                                    System.out.println("\nMenu de Compra de Pasta de dente");
			                                                    System.out.println("\n 1-Colgate Total 12 Professional Gengiva Saudavel\n"
			                                                            + " 2-Sensodyne Pro-Esmalte\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(colgate);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != colgate.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(colgate);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(sensodyne);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != sensodyne.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(sensodyne);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                                                            break;
			                                                            
			                                                    }break;
			                                                }while(option != 3);
			                                                continue;
			                                                
			                                            case 2:
			                                                do{
			                                                    System.out.println("\nMenu de Compra de Shampo");
			                                                    System.out.println("\n 1-Shampoo Loreal Elseve Arginina Resist X3\n"
			                                                            + " 2-Shampoo Clear Men Anticaspa Ice Cool Menthol\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte(); 
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(elseve);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != elseve.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(elseve);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(clear);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != clear.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(clear);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                    }break;
			                                                    
			                                                }while(option != 3);
			                                                 break;
			                                            case 3:
			                                                do{
			                                                    System.out.println("\nMenu de Compra de Sabonete");
			                                                    System.out.println("\n 1-Dove Cremoso\n"
			                                                            + " 2-Protex Limpeza Profunda\n 3-Sair");
			                                                    System.out.print("\nOpÃ§Ã£o: ");
			                                                    option = keyboard.nextByte();
			                                                    
			                                                    switch(option){
			                                                        
			                                                        case 1:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(dove);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != dove.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(dove);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 2:
			                                                            if(userCart.isEmpty()){
			                                                                userCart.add(userProducts);
			                                                                userProducts.cartRegistration(protex);
			                                                                userProducts = new Cart();
			                                                                break;
			                                                                
			                                                            }else if(userCart.size()<10){
			                                                                for(i=0;i<userCart.size();i++){
			                                                                    if(userCart.get(i).getCodProducts() != protex.getProductType()){
			                                                                        userCart.add(userProducts);
			                                                                        userProducts.cartRegistration(protex);
			                                                                        userProducts = new Cart();
			                                                                        break;
			                                                                    
			                                                                    }else{
			                                                                        showBackQtd();
			                                                                        break;
			                                                                    }
			                                                                }break;
			                                                                
			                                                            }else{
			                                                                System.out.println("\nCarrinho Cheio");
			                                                                break;
			                                                            }
			                                                        case 3:
			                                                            break;
			                                                            
			                                                        default:
			                                                            System.out.println("\nOpÃ§Ã£o Inexistente");
			                                                    }break;
			                                                    
			                                                }while(option != 3);
			                                                break;
			                                case 4:
			                                    break;
			                                    
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o Incorreta");
			                                    break;
			                                    }
			                                        
			                            }while(alternative != 4);
			                            break;         
			                        
			                                    
			                    case 4:
			                                    
			                        break;
			                                    
			                    default:
			                                    
			                        System.out.println("\nOpÃ§Ã£o Incorreta");
			                        break;
			                    
			                    }break;
			                
			                }break;
			                        
			            }break;
			                    
			        }break;
			            
			        }
			        case 5:
			            
			            do{
			                System.out.println("\nMenu do Carrinho:");
			                System.out.println("\n 1-Ver Carrinho\n 2-Alterar Quantidade\n"
			                        + " 3-Remover Produtos\n 4-Finalizar Compra\n 5-Sair");
			                System.out.print("\nOpÃ§Ã£o: ");
			                choice = keyboard.nextByte();
			                
			                switch(choice){
			                    
			                    case 1:
			                        
			                        for(i = 0;i < userCart.size();i++){
			                            userCart.get(i).showCartProducts();
			                            userCart.get(i).setRealPrice(userCart.get(i).plusNewPrice());
			                            t += userCart.get(i).getRealPrice();  
			                        }
			                        cartExample.allPriceBrazil(t);
			                        cartExample.setAllPrice(t);
			                        t = 0;
			                        break;
			                        
			                    case 2:
			                        u = 1;
			                        System.out.println("\nDe qual produto deseja mudar a quantidade?\n");
			                        for(i = 0; i <userCart.size(); i++){
			                            System.out.println("OpÃ§Ã£o "+ u +": "+ userCart.get(i).getProducts() +
			                                    "    \nQuantidade: "+ userCart.get(i).getQtd() +"\n");
			                            u++;
			                        }
			                        System.out.print("\nOpÃ§Ã£o: ");
			                        o = keyboard.nextByte();
			                        o -= 1;
			                        
			                            if( o > userCart.size()){
			                                System.out.println("\nOpÃ§Ã£o Incorreta");
			                                
			                            }else if(o < userCart.size()){
			                                System.out.println("\nDigite a quantidade desejada para o Produto "+ userCart.get(o).getProducts());
			                                System.out.print("\nQuantidade: ");
			                                userCart.get(o).setQtd(keyboard.nextByte());
			                                
			                            }else{
			                               break;
			                               
			                            }
			                        break;
			                         
			                    case 3:
			                        u = 1;
			                        System.out.println("\nQual produto deseja remover do Carrinho?\n");
			                        for(i = 0;i < userCart.size();i++){
			                            System.out.println("OpÃ§Ã£o "+ u +": "+ userCart.get(i).getProducts() +
			                                    "    \nQuantidade: "+ userCart.get(i).getQtd() +"\n");
			                            u++;
			                        }
			                        System.out.print("\nOpÃ§Ã£o: ");
			                        o = keyboard.nextByte();
			                        o -= 1;
			                        
			                            if( o > userCart.size()){
			                                System.out.println("\nOpÃ§Ã£o Incorreta");
			                                
			                            }else if(o < userCart.size()){
			                                userCart.remove(o);
			                                
			                            }else{
			                                break;
			                            }
			                        break;  
			                        
			                    case 4:
			                        u = 1;
			                        System.out.println("\n Carrinho:");
			                        for(i = 0;i < userCart.size();i++){
			                            System.out.println("\nOpÃ§Ã£o "+ u);
			                            userCart.get(i).showCartProducts();
			                            userCart.get(i).setRealPrice(userCart.get(i).plusNewPrice());
			                            t += userCart.get(i).getRealPrice();
			                            u++;
			                        }
			                        System.out.println("\nFrete GrÃ¡tis");
			                        cartExample.allPriceBrazil(t);
			                        cartExample.setAllPrice(t);
			                        t=0;
			                        System.out.println("\nDeseja Continuar?\n( 1-Sim  2- NÃ£o)");
			                        System.out.print("\nOpÃ§Ã£o: ");
			                        choice = keyboard.nextByte();
			                        
			                            switch(choice){
			                                
			                                case 1:
			                                    System.out.println("\nComo deseja realizar o Pagamento?");
			                                    System.out.println(" (1-Boleto 2-CartÃ£o)");
			                                    System.out.print("\nOpÃ§Ã£o: ");
			                                    alternative = keyboard.nextByte();
			                                    
			                                    switch(alternative){
			                                        
			                                        case 1:
			                                            k = 0;
			                                            u = 1;
			                                            System.out.print("\nNome: "+ users.get(k).getName());
			                                            System.out.print("\nNumero de Telefone: "+ users.get(k).getPhoneNumber());
			                                            System.out.print("\nCPF: "+ users.get(k).getCpf());
			                                            System.out.println("\nEnviar para:");
			                                            System.out.println(users.get(k).getRoad() +"\n"+
			                                                    users.get(k).getAdditionalData() +" - "+
			                                                    users.get(k).getCity() +" - "+
			                                                    users.get(k).getState());
			                                            if(userCart.isEmpty()){
			                                                System.out.println("\nCarrinho Vazio!");
			                                            }else{
			                                                for(i = 0;i < userCart.size();i++){
			                                                System.out.println("Produto "+ u +": "+ userCart.get(i).getProducts() +
			                                                        "    Quantidade: "+ userCart.get(i).getQtd() +"\n");
			                                                u++;
			                                            }
			                                            System.out.println("\nFrete GrÃ¡tis");
			                                            System.out.println("Total: R$"+ cartExample.getAllPrice());
			                                            System.out.println("\nDigite 0 para continuar!");
			                                            keyboard.next();
			                                            userCart.removeAll(userCart);
			                                            break;
			                                            }
			                                            break;
			                                            
			                                        case 2:
			                                            
			                                            userCard.registrationCard();      
			                                            usersCard.add(userCard);         
			                                            userCard = new Customers();   
			                                            
			                                            k = 0;
			                                            u = 1;
			                                            if(users.isEmpty()){
			                                                System.out.println("\nNÃ£o a usÃºarios cadastrado");
			                                                break;
			                                            }else{
			                                            System.out.print("\nNome: "+ users.get(k).getName());
			                                            System.out.print("\nNumero de Telefone: "+ users.get(k).getPhoneNumber());
			                                            System.out.print("\nCPF: "+ users.get(k).getCpf());
			                                            System.out.println("\nEnviar para:");
			                                            System.out.println(users.get(k).getRoad() +"\n"+
			                                                    users.get(k).getAdditionalData() +" - "+
			                                                    users.get(k).getCity() +" - "+
			                                                    users.get(k).getState());
			                                            System.out.println("\nCartÃ£o de Credito: ");
			                                            System.out.print("\nNÃºmero : "+ usersCard.get(k).getNumberCard() +"  "
			                                            + "Data de expiraÃ§Ã£o: "+ usersCard.get(k).getExpiredDate() + "  "
			                                            + "CÃ³digo de seguranÃ§a: "+ usersCard.get(k).getSecurityCode()+"\n");
			                                            }
			                                            if(userCart.isEmpty()){
			                                                System.out.println("\nCarrinho Vazio!");
			                                                System.out.println("\nDigite 0 para continuar!");
			                                                keyboard.next();
			                                            }
			                                            else{
			                                                
			                                                for(i = 0;i < userCart.size();i++){
			                                                    System.out.println("Produto "+ u +": "+ userCart.get(i).getProducts() +
			                                                            "    Quantidade: "+ userCart.get(i).getQtd() +"\n");
			                                                    u++;
			                                            }
			                                            System.out.println("\nFrete GrÃ¡tis");
			                                            System.out.println("Total: R$"+ cartExample.getAllPrice());
			                                            System.out.println("\nDigite 0 para continuar!");
			                                            keyboard.next();
			                                            userCart.removeAll(userCart);
			                                            break;
			                                            }
			                                            break;
			                        
			                                        case 3:
			                                            break;
			                                            
			                                        default:
			                                            System.out.println("\nOpÃ§Ã£o Incorreta");
			                                    }
			                                case 2:
			                                    break;
			                                default:
			                                    System.out.println("\nOpÃ§Ã£o Incorreta");
			                                    break;
			                            }
			                        
			                    case 5:
			                        break;
			                        
			                    default:
			                        System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			                        break;
			                }
			                
			            }while(choice != 5);
			            break;
			        case 6:
			            break;
			        default:
			            System.out.println("\nOpÃ§Ã£o nÃ£o existe");
			    }
			    
			}while(choice != 6);
		}
    }    
}