import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressFinder {
    public static void main(String[] args) {
        try {
            // Get the localhost
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local host IP Address : " + localhost.getHostAddress());

            // Get all Ip Address associated with the localhost
            InetAddress[] allLocalAddresses = InetAddress.getAllByName(localhost.getCanonicalHostName());
            System.out.println("All IP Addresses associated with Localhost :");

            for (InetAddress address : allLocalAddresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}