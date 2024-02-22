public class Pizza {
    private int price;
    private Boolean veg;
    private int extracheeseprice=80;
    private int extratoppingsprice=80;
    private int takeawayprice=30;
    private int basepizzaprice;
    private Boolean extracheese=false;
    private Boolean extratoppings=false;
    private Boolean takeawayopted=false;


    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=120;
        }
        else{
            this.price=200;
        }
        basepizzaprice=this.price;
    }
    public void extracheese(){
        this.price +=extracheeseprice;
        extracheese=true;
    }
    public void extratoppings(){
        this.price +=extratoppingsprice;
        extratoppings=true;
    }
    public void takeaway(){
        this.price +=takeawayprice;
        takeawayopted=true;
    }
    public void getbill(){
        String order="\nBase price of Pizza:"+basepizzaprice;
        if(extracheese){
            order +="\nExtra cheese price"+extracheeseprice;
        }
        if(extratoppings){
            order +="\nExtra toppings prize"+extratoppingsprice;
        }
        if(takeawayopted){
            order+="\nTake away charges"+takeawayprice;
        }
        System.out.println("Famous Pizza's \nBILL"+order+"\nTotal:"+price+"\n****THANK YOU**** \n****VISIT AGAIN****");
    }
}
