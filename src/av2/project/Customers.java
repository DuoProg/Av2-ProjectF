
package av2.project;

import java.util.Scanner;


public class Customers {
    
   
    private String name;         
    private String userName;     
    private String password;     
    private long phoneNumber;    
    private byte age;            
    private long cpf;             
    private int cep;
    private String state; 
    private String city;
    private String neighborhood;
    private String road;
    private short roadNumber;
    private String additionalData;
    private int numberCard;
    private int expiredDate;
    private int securityCode;
    
    Scanner typed = new Scanner(System.in);
   
    
    
    
    Customers(){
        
       
        
    }
    
    Customers(String name){
       
        setName(name);
        
    }
    
    
    
    public String getName(){
        return name;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
 
    public long getPhoneNumber(){
        return phoneNumber;
    }

    public byte getAge(){
        return age;
    }

    public long getCpf(){
        return cpf;
    }
    
    public int getCep(){
        return cep;
    }
    
    public String getState(){
        return state;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getNeighborhood(){
        return neighborhood;
    }
    
    public String getRoad(){
        return road;
    }
    
    public short getRoadNumber(){
        return roadNumber;
    }
    
    public String getAdditionalData(){
        return additionalData;
    }
    
    public int getNumberCard(){
        return numberCard;
    }
    
    public int getExpiredDate(){
        return expiredDate;
    }
    
    public int getSecurityCode(){
        return securityCode;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    
    public void setRoad(String road) {
        this.road = road;
    }
    
    public void setRoadNumber(short roadNumber){
        this.roadNumber = roadNumber;
    }
    
    public void setAdditionalData (String additionalData){
        this.additionalData = additionalData;
    }
    
    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }
    
    public void setExpiredDate(int expiredDate) {
        this.expiredDate = expiredDate;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    

    public void registration(){
        
             
            System.out.println("\nCadastro de Usuários"); 
            System.out.println("\nNome");
             setName(typed.nextLine());                         
            System.out.println("\nNome de Usuário: ");
             setUserName(typed.nextLine());                     
            System.out.println("\nSenha: ");
             setPassword(typed.nextLine());
            System.out.println("\nNúmero do telefone: ");
             setPhoneNumber(typed.nextLong());                  
            System.out.println("\nIdade: ");
             setAge(typed.nextByte());                          
            System.out.println("\nCPF: ");
             setCpf(typed.nextLong());                          
            System.out.println("\nCEP: ");
             setCep(typed.nextInt());
             typed.nextLine();
            System.out.println("\nEstado: ");
             setState(typed.nextLine());
            System.out.println("\nCidade: ");
             setCity(typed.nextLine());
            System.out.println("\nBairro: ");
             setNeighborhood(typed.nextLine());
            System.out.println("\nRua: ");
             setRoad(typed.nextLine());
            System.out.println("\nNúmero da Rua: ");
             setRoadNumber(typed.nextShort());
            System.out.println("\nComplemento: ");
             setAdditionalData(typed.nextLine());
            typed.nextLine();
            System.out.println("\n Usuário Cadastrado.");
        
    }
    
    public void showMainMenu(){
        System.out.println("\nSeja bem-vindo à APSMart\n");
        System.out.println(" Digite o respectivo número para a opção que deseja:");
        System.out.println("\n 1-Cadastro\n 2-Catálogo dos Produtos\n 3-Testar Eletrônicos\n"
                + " 4-Menu de Compra\n 5-Carrinho APSMart\n 6-Sair");
        System.out.print("\nOpção: ");
    }

    public void registrationCard() {
            
            System.out.println("\nDigite o número do Cartão: ");
            setNumberCard(typed.nextInt());
            System.out.println("\nDigite a data de expiração do Cartão: ");
            setExpiredDate(typed.nextInt());
            System.out.println("\nDigite o código de seguraça do Cartão: ");
            setSecurityCode(typed.nextInt());
    }
    
    
}
