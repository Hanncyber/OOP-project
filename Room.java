import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Room {

        private int roomid;
        private String roomname;
        private int capacity;
        private List<LocalTime> availabletimes;
        private List<LocalTime> bookedtimes;

        public Room(int roomid,int capacity,String roomname){
            this.roomid=roomid;
            this.capacity=capacity;
            this.roomname=roomname;
            this.availabletimes=new ArrayList<>();
            this.bookedtimes=new ArrayList<>();
        }
        public void Addavailabletime(LocalTime time){
            availabletimes.add(time);
        }
        public boolean isAvailable(LocalTime time){
            return availabletimes.contains(time);
        }
        public void createroom(int roomid,int capacity,String roomname,LocalTime time){
            if(availabletimes.contains(time)){
                availabletimes.remove(time);
                bookedtimes.add(time);
                System.out.println("Enter room id: ");
                Scanner idchoose = new Scanner(System.in);
                roomid=idchoose.nextInt();
                System.out.println("Enter room name: ");
                Scanner namechoose = new Scanner(System.in);
                roomname=namechoose.next();
                System.out.println("Enter room capacity: ");
                Scanner capchoose = new Scanner(System.in);
                capacity=capchoose.nextInt();
                System.out.println("Enter time: ");
                Scanner timechoose = new Scanner(System.in);
                time= LocalTime.parse(timechoose.next());
            }
            else{
                System.out.println("Time isnt available, please try again");
                return;
            }
        }
}
