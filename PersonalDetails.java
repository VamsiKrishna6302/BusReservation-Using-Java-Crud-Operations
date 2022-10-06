public class PersonalDetails implements Comparable<PersonalDetails>{
    public int seat_no;
    public String name;
    public String  address;
    public long phno;

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public PersonalDetails(int seat_no, String name, String address, long phno) {
        this.seat_no = seat_no;
        this.name = name;
        this.address = address;
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "Confirmed Ticket{" +
                "seat_no=" + seat_no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phno=" + phno +
                '}';
    }

    @Override
    public int compareTo(PersonalDetails o) {
        if(seat_no==o.seat_no) {
            return 0;
        }
        else if(seat_no>o.seat_no){
            return 1;
        }else{
            return -1;
        }
    }
}
