package ParkingSystem;
import java.util.ArrayList;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.util.Map;
import java.util.Properties;
public class ParkingSystem implements IParking {
	private int mBig;
    private int mMedium;
    private int mSmall;

    public ParkingSystem(int big, int medium, int small) {
        this.mBig = big;
        this.mMedium = medium;
        this.mSmall = small;
    }

    public boolean addCar(int carType) {
        if(carType==1){
           if(mBig>0){
               mBig--;
               return true;
           }
        }
        if(carType==2){
            if(mMedium>0){
                mMedium--;
                return true;
            }
        }
        if(carType==3){
            if(mSmall>0){
            mSmall--;
            return true;}
        }

        return false;
    }

    public void print() {
        System.out.println("输入要输出的内容即可");
    }
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < args.length; i++) {
            IParking.planParing.add(Integer.parseInt(args[i]));
        }
        IParams iparams = IParking.parse();
        ParkingSystem parkingSystem = new ParkingSystem(iparams.getBig(), iparams.getMedium(), iparams.getSmall());
        parkingSystem.print();
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
	}

}
