package xupt.se.ttms.model;

public class Play {

    private int id=0      ;
    private String name="" ;
    private String Kind="";
    private int Length=0;
    private int TicketPrice=0; //���

    public Play(){
        id = 0;
    }
    public Play(int ID, String name, String kind, int length, int ticketPrice){
        id = ID;
        this.name=name;
        this.Kind = kind;
        this.Length = length;
        TicketPrice = ticketPrice;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setID(int ID){
        this.id=ID;
    }

    public int getID(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setKind(String count){
        this.Kind=count;
    }

    public String getKind(){
        return Kind;
    }
    public void setLength(int length){
        this.Length=length;
    }

    public int getLength(){
        return Length;
    }

    public void setTicketPrice(int intro){
        this.TicketPrice=intro;
    }

    public int getTicketPrice(){
        return TicketPrice;
    }

}
