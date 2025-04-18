import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Event {
    private String eventname;
    private double ticketprice;
    private String description;
    private Category category;
    private int eventid;
    private LocalTime time;
    private Room room;

    public Event(String eventname, double ticketprice, String description,Category category,int eventid,LocalTime time,Room room){
        this.category=category;
        this.eventname=eventname;
        this.time=time;
        this.room=room;
        this.ticketprice=ticketprice;
        this.description=description;
        this.eventid=eventid;
    }
    public void updatevent(String eventname, double ticketprice, String description,Category category,int eventid,LocalTime time,Room room) {
        this.category = category;
        this.eventname = eventname;
        this.time = time;
        this.room = room;
        this.ticketprice = ticketprice;
        this.description = description;
        this.eventid = eventid;
    }
    public void createvent(String eventname, double ticketprice, String description,Category category,int eventid,LocalTime time,Room room){
        System.out.println("Enter event name: ");
        Scanner name = new Scanner(System.in);
        eventname=name.next();
        System.out.println("Enter ticketprice: ");
        Scanner price = new Scanner(System.in);
        ticketprice=price.nextDouble();
        System.out.println("Enter description: ");
        Scanner desc = new Scanner(System.in);
        description=desc.next();
        System.out.println("Available categories: " );
        for(int i = 0; i< Database.categories.size();i++){
            System.out.println((i+1)+":"+Database.categories.get(i));
        }
        System.out.println("Choose category: ");
        Scanner catselect = new Scanner(System.in);
        int catchoice = catselect.nextInt();
        Category category1 = Database.categories.get(catchoice-1);
        System.out.println("Enter ticket price: ");
        Scanner priceselect= new Scanner(System.in);
        Double price1 = priceselect.nextDouble();
        System.out.println("Available rooms:  ");
        List<Room> availablerooms=Database.rooms.stream().filter(r->r.isAvailable(time)).toList();
        for (int j=0;j<availablerooms.size();j++){
            System.out.println((j+1)+":"+availablerooms.get(j));
        }
        System.out.println("Choose room: ");
        Scanner roomchoice = new Scanner(System.in);

        Event event = new Event(eventname,ticketprice,description,category,eventid,time,room);
        if (organizer.createevent(event)){
            System.out.println("Event created successfully!");
            Database.events.add(event);
        }else{
            System.out.println("Couldnt create event!");
        }
    }
    public void register
}