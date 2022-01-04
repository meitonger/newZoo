public class ZooKeeper implements InfoReader {

    private String keeperName;
    private byte phoneNumber;
    private String email;

    public ZooKeeper() {

    }

    public String getName() {
        return keeperName;
    }

    public void setName(String keeperName) {
        this.keeperName = keeperName;
    }

    public byte getNumber() {
        return phoneNumber;
    }

    public void setNumber(byte phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void information() {
        System.out.println("Zookeeper information " + this.getName() + this.getNumber() + this.getEmail());
    }
}
