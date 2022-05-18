package  com.revature.rectangle;

public class Area {

        public boolean isLessThan(Rec a, Rec b) {
            if(a.area() < b.area()) {
                return true;
            }
            return false;
        }

    }

